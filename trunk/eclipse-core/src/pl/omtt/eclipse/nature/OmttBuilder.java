package pl.omtt.eclipse.nature;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;

import pl.omtt.compiler.OmttCompilationTask;
import pl.omtt.core.Constants;
import pl.omtt.eclipse.model.OmttModelManager;
import pl.omtt.eclipse.model.OmttProjectModel;
import pl.omtt.eclipse.model.ProblemMarkerCollector;
import pl.omtt.lang.model.ast.Program;

public class OmttBuilder extends IncrementalProjectBuilder {
	Set<IResource> fCompileQueue = new HashSet<IResource>();

	@Override
	@SuppressWarnings("unchecked")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		boolean result;
		if (kind == FULL_BUILD) {
			result = fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				result = fullBuild(monitor);
			} else {
				result = incrementalBuild(delta, monitor);
			}
		}
		if (!result)
			forgetLastBuiltState();
		return null;
	}

	protected boolean fullBuild(final IProgressMonitor monitor) {
		// TODO: is it really necessary?
		refreshTemplateBuildDirectory();

		try {
			getProjectModel().clear();
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		RebuildCollectVisitor visitor = new RebuildCollectVisitor();
		try {
			getProject().accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return rebuild(visitor.fOmttAdded, null, null, monitor);
	}

	private boolean incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) {
		// TODO: what's wrong - why build folder is sometimes empty?
		// it's a silly workaround
		if (!refreshTemplateBuildDirectory()) {
			return fullBuild(monitor);
		}

		RebuildCollectVisitor visitor = new RebuildCollectVisitor();
		try {
			delta.accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		return rebuild(visitor.fOmttAdded, visitor.fOmttChanged,
				visitor.fOmttRemoved, monitor);
	}

	private boolean rebuild(List<IResource> added, List<IResource> changed,
			List<IResource> deleted, IProgressMonitor monitor) {
		if (added != null)
			for (IResource resource : added)
				fCompileQueue.add(resource);

		if (changed != null)
			for (IResource resource : changed)
				fCompileQueue.add(resource);

		if (deleted != null)
			for (IResource resource : deleted) {
				deleteBuildFile(resource);
				getProjectModel().remove(resource, monitor);
			}

		compile(monitor);
		return true;
	}

	private void compile(IProgressMonitor monitor) {
		final OmttProjectModel model = getProjectModel();
System.err.println("\n\nRunning compilation");
		
		while (!fCompileQueue.isEmpty()) {
			List<URI> uris = new ArrayList<URI>();
			for (IResource resource : fCompileQueue) {
				uris.add(resource.getLocationURI());
				deleteBuildFile(resource);
				try {
					ProblemMarkerCollector.deleteProblemMarkers(resource);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			Set<IResource> turn = fCompileQueue;
			fCompileQueue = new HashSet<IResource>();

			System.err.println("compiling...");
			OmttCompilationTask task = model.getCompilationTask(uris);
			task.setCollectLibraryReferences(true);
			task.setProblemCollector(new ProblemMarkerCollector());
			try {
				task.compile();
			} catch (Throwable e) {
				e.printStackTrace();
				return;
			}
			refreshTemplateBuildDirectory();
			System.err.println("done");

			for (IResource resource : turn) {
				final URI uri = resource.getLocationURI();
				final Program program = task.getTree(uri);

				System.err.println(resource + ": " + program);
				Set<IResource> affected = model.update(resource, program, monitor);
				if (affected != null)
					fCompileQueue.addAll(affected);
			}

			Iterator<IResource> itor = fCompileQueue.iterator();
			while (itor.hasNext()) {
				if (turn.contains(itor.next()))
					itor.remove();
			}
		}
	}

	private void deleteBuildFile(IResource resource) {
		IPath buildDir = getBuildDirectory();
		if (buildDir == null)
			return;

		String id = getProjectModel().getResourceId(resource);
		if (id == null)
			return;
		int dotpos = id.lastIndexOf('.');
		if (dotpos < 0)
			return;
		String path = id.substring(0, dotpos + 1).replace('.', IPath.SEPARATOR)
				+ id.substring(dotpos + 1, dotpos + 2).toUpperCase()
				+ id.substring(dotpos + 2);

		IPath buildFilePath = buildDir.addTrailingSeparator().append(
				Constants.OMTT_TEMPLATE_PACKAGE).addTrailingSeparator().append(
				path).addFileExtension("class");
		IResource buildFile = getProject().getWorkspace().getRoot().findMember(
				buildFilePath);
		System.err.println("deleting " + buildFile);
		if (buildFile != null)
			try {
				System.err.println("deleting " + buildFile);
				buildFile.delete(false, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
	}

	private IPath getBuildDirectory() {
		try {
			return getProjectModel().getJavaProject().getOutputLocation();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean refreshTemplateBuildDirectory() {
		IPath buildDir = getBuildDirectory();
		if (buildDir == null)
			return false;
		try {
			IResource bdir = getProject().getWorkspace().getRoot().findMember(
					buildDir);
			System.err.println("refreshing " + bdir);
			if (bdir != null)
				bdir.refreshLocal(IResource.DEPTH_ONE, null);
			else
				return false;
			IPath templateBuildDir = buildDir.addTrailingSeparator().append(
					Constants.OMTT_TEMPLATE_PACKAGE);
			IResource tdir = getProject().getWorkspace().getRoot().findMember(
					templateBuildDir);
			System.err.println("refreshing " + tdir);
			if (tdir != null)
				tdir.refreshLocal(IResource.DEPTH_INFINITE, null);
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	protected OmttProjectModel getProjectModel() {
		return OmttModelManager.getOmttModelManager().getProjectModel(
				getProject());
	}

	public static final String BUILDER_ID = "pl.omtt.eclipse.builder";
}
