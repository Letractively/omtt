package pl.omtt.eclipse.model;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import pl.omtt.compiler.OmttCompilationTask;
import pl.omtt.compiler.OmttCompiler;
import pl.omtt.core.Constants;
import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.ast.Program;

public class OmttProjectModel {
	IProject fProject;
	Set<IResource> fCompileQueue = new HashSet<IResource>();

	ComponentReferenceContainer fComponentReferences;
	Map<IResource, SymbolTable> fSymbolTables = new HashMap<IResource, SymbolTable>();

	public OmttProjectModel(IProject project) {
		fProject = project;
		fComponentReferences = new ComponentReferenceContainer(fProject);
	}

	synchronized public boolean rebuild(IProgressMonitor monitor) {
		try {
			clear();
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		RebuildCollectVisitor visitor = new RebuildCollectVisitor();
		try {
			fProject.accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return rebuild(visitor.fOmttAdded, null, null, monitor);
	}

	private void clear() throws CoreException {
		deleteOmttMarkers(fProject);
		fComponentReferences.clear();
	}

	synchronized public boolean rebuild(IResourceDelta delta,
			IProgressMonitor monitor) {
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
				add(resource);

		if (changed != null)
			for (IResource resource : changed)
				update(resource);

		if (deleted != null)
			for (IResource resource : deleted)
				delete(resource);

		compile();
		return true;
	}

	private void compile() {
		refreshTemplateBuildDirectory();
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
			Set<IResource> compiled = fCompileQueue;
			fCompileQueue = new HashSet<IResource>();

			System.err.println("compiling...");
			OmttCompilationTask task = getTask(uris);
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

			for (IResource resource : compiled) {
				final URI uri = resource.getLocationURI();

				final Program program = task.getTree(uri);
				System.err.println(resource + ": " + program);
				final BaseSymbolTable st = program.getSymbolTable();
				final Set<String> references;
				if (st == null)
					references = null;
				else
					references = st.retrieveReferences();
				System.err.println(resource + ": " + references);

				final String oldid = getResourceId(resource);
				final String newid = program.getModuleDeclaration()
						.getModuleId();

				if (oldid == null && newid == null) {
					continue;
				} else if (oldid == null) {
					setResourceId(resource, newid);
					fComponentReferences.updateReferences(resource, references);
					fSymbolTables.put(resource, st);
				} else if (newid == null) {
					setResourceId(resource, null);
					fComponentReferences.updateReferences(resource, null);
					fSymbolTables.remove(resource);
				} else if (!oldid.equals(newid)) {
					setResourceId(resource, newid);
					fComponentReferences.updateReferences(resource, null);
					updateSymbolTable(resource, null);
					fComponentReferences.updateReferences(resource, references);
					updateSymbolTable(resource, st);
				} else {
					fComponentReferences.updateReferences(resource, references);
					updateSymbolTable(resource, st);
				}
			}

			Iterator<IResource> itor = fCompileQueue.iterator();
			while (itor.hasNext()) {
				if (compiled.contains(itor.next()))
					itor.remove();
			}
		}
		System.err.println("[ref] " + fComponentReferences.fReferences);
	}

	private String getResourceId(IResource resource) {
		try {
			IMarker[] markers = resource.findMarkers(OMTT_COMPONENT_ID_MARKER,
					false, IResource.DEPTH_INFINITE);
			if (markers.length > 0) {
				return (String) markers[0].getAttribute(IMarker.TEXT);
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	private void setResourceId(IResource resource, String newid) {
		try {
			if (newid == null)
				resource.deleteMarkers(OMTT_COMPONENT_ID_MARKER, false,
						IResource.DEPTH_INFINITE);
			else {
				IMarker[] markers = resource.findMarkers(
						OMTT_COMPONENT_ID_MARKER, false,
						IResource.DEPTH_INFINITE);
				IMarker marker;
				if (markers.length > 0) {
					marker = markers[0];
				} else {
					marker = resource.createMarker(OMTT_COMPONENT_ID_MARKER);
				}
				marker.setAttribute(IMarker.TEXT, newid);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void deleteBuildFile(IResource resource) {
		IPath buildDir = getBuildDirectory();
		if (buildDir == null)
			return;

		String id = getResourceId(resource);
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
		IResource buildFile = fProject.getWorkspace().getRoot().findMember(
				buildFilePath);
		System.err.println("deleting " + buildFile);
		if (buildFile != null)
			try {
				buildFile.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
	}

	private IPath getBuildDirectory() {
		try {
			return getJavaProject().getOutputLocation();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void refreshTemplateBuildDirectory() {
		IPath buildDir = getBuildDirectory();
		if (buildDir == null)
			return;
		try {
			IResource bdir = fProject.getWorkspace().getRoot().findMember(
					buildDir);
			System.err.println("refreshing " + bdir);
			if (bdir != null)
				bdir.refreshLocal(IResource.DEPTH_ONE, null);
			IPath templateBuildDir = buildDir.addTrailingSeparator().append(
					Constants.OMTT_TEMPLATE_PACKAGE);
			IResource tdir = fProject.getWorkspace().getRoot().findMember(
					templateBuildDir);
			System.err.println("refreshing " + tdir);
			if (tdir != null)
				tdir.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void add(IResource resource) {
		fCompileQueue.add(resource);
	}

	private void update(IResource resource) {
		fCompileQueue.add(resource);
	}

	private void delete(IResource resource) {
		fSymbolTables.remove(resource);
		fComponentReferences.updateReferences(resource, null);
		try {
			deleteOmttMarkers(resource);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void deleteOmttMarkers(IResource resource) throws CoreException {
		ProblemMarkerCollector.deleteProblemMarkers(resource);
		resource.deleteMarkers(OMTT_COMPONENT_ID_MARKER, true,
				IResource.DEPTH_INFINITE);
	}

	private void updateSymbolTable(IResource resource, SymbolTable newST) {
		final String id = getResourceId(resource);
		SymbolTable oldST = fSymbolTables.get(resource);
		for (IResource affected : fComponentReferences.getAffected(id, oldST,
				newST)) {
			fCompileQueue.add(affected);
		}
		fSymbolTables.put(resource, newST);
	}

	private OmttCompilationTask getTask(List<URI> sources) {
		IJavaProject jproject = getJavaProject();
		if (jproject == null)
			return null;

		URI target;
		List<URI> classPath = new ArrayList<URI>();
		final String basePath = fProject.getWorkspace().getRoot()
				.getLocationURI().toString();
		try {
			String targetRelativeDir = jproject.getOutputLocation().toFile()
					.toURI().getRawSchemeSpecificPart();
			if (!targetRelativeDir.endsWith("/"))
				targetRelativeDir += "/";
			target = new URI(basePath + targetRelativeDir);
			for (IClasspathEntry cpentry : jproject.getRawClasspath())
				if (cpentry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
					classPath.add(cpentry.getPath().toFile().toURI());
				}
		} catch (JavaModelException e) {
			e.printStackTrace();
			return null;
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}

		OmttCompiler c = OmttModelManager.getOmttModelManager()
				.getOmttCompiler();
		return c.getTask(sources, target, classPath);
	}

	protected IJavaProject getJavaProject() {
		return getJavaProject(fProject);
	}

	public static IJavaProject getJavaProject(IProject project) {
		IJavaProject jproject;
		try {
			if (project.hasNature(JavaCore.NATURE_ID))
				jproject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
			else
				return null;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
		return jproject;
	}

	final String OMTT_COMPONENT_ID_MARKER = "pl.omtt.eclipse.markers.componentid";
}
