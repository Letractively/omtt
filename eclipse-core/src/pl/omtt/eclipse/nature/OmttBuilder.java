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
import pl.omtt.core.Debugging;
import pl.omtt.eclipse.model.OmttModelManager;
import pl.omtt.eclipse.model.OmttProjectModel;
import pl.omtt.eclipse.model.ProblemMarkerCollector;
import pl.omtt.lang.model.ast.Program;

public class OmttBuilder extends IncrementalProjectBuilder {
	Set<IResource> fCompileQueue = new HashSet<IResource>();

	@Override
	@SuppressWarnings("rawtypes")
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
			System.gc();
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
		monitor.beginTask("OMTT project rebuild", IProgressMonitor.UNKNOWN);

		getProjectModel().startRebuild();
		Set<IResource> compiled = null;
		try {
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
			compiled = compile(monitor);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("--- THIS IS BUG, please report");
		} finally {
			getProjectModel().finishRebuild(compiled);
		}
		monitor.done();
		return true;
	}

	private Set<IResource> compile(IProgressMonitor monitor) {
		final OmttProjectModel model = getProjectModel();
		if (Debugging.DEBUG > 0)
			System.err.println("\n\nRunning compilation");

		Set<IResource> compiled = new HashSet<IResource>();
		while (!fCompileQueue.isEmpty() && !monitor.isCanceled()) {
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

			if (Debugging.DEBUG > 0)
				System.err.println("compiling...");
			OmttCompilationTask task = model.getCompilationTask(uris);
			task.setCollectLibraryReferences(true);
			task.setProblemCollector(new ProblemMarkerCollector());
			task.setCompilationProgressHandler(new CompilationProgressHandler(
					monitor));

			try {
				task.compile();
			} catch (Throwable e) {
				e.printStackTrace();
				return compiled;
			}
			refreshTemplateBuildDirectory();
			if (Debugging.DEBUG > 0)
				System.err.println("done");

			for (IResource resource : turn) {
				final URI uri = resource.getLocationURI();
				final Program program = task.getTree(uri);

				if (Debugging.DEBUG > 0)
					System.err.println(resource + ": " + program);
				Set<IResource> affected = model.update(resource, program,
						monitor, task.isBroken(uri));
				if (affected != null)
					fCompileQueue.addAll(affected);
			}

			Iterator<IResource> itor = fCompileQueue.iterator();
			while (itor.hasNext()) {
				if (turn.contains(itor.next()))
					itor.remove();
			}
			compiled.addAll(turn);
		}

		return compiled;
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
		if (Debugging.DEBUG > 0)
			System.err.println("deleting " + buildFile);
		if (buildFile != null)
			try {
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
			if (Debugging.DEBUG > 0)
				System.err.println("refreshing " + bdir);
			if (bdir != null)
				bdir.refreshLocal(IResource.DEPTH_ONE, null);
			else
				return false;
			IPath templateBuildDir = buildDir.addTrailingSeparator().append(
					Constants.OMTT_TEMPLATE_PACKAGE);
			IResource tdir = getProject().getWorkspace().getRoot().findMember(
					templateBuildDir);
			if (Debugging.DEBUG > 0)
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
