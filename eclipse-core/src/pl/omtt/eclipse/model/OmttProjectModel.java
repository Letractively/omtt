package pl.omtt.eclipse.model;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import pl.omtt.compiler.OmttCompilationTask;
import pl.omtt.compiler.OmttCompiler;
import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.ast.Program;
import pl.omtt.util.stream.IEnrichedStream;

public class OmttProjectModel {
	IProject fProject;

	ComponentReferenceContainer fComponentReferences;
	Map<IResource, SymbolTable> fSymbolTables = new HashMap<IResource, SymbolTable>();

	private Map<IResource,Set<IModelChangeListener>> fModelChangeListeners = new HashMap<IResource, Set<IModelChangeListener>>();

	public OmttProjectModel(IProject project) {
		fProject = project;
		fComponentReferences = new ComponentReferenceContainer(fProject);
	}

	public void clear() throws CoreException {
		deleteOmttMarkers(fProject);
		fComponentReferences.clear();
	}

	public String getResourceId(IResource resource) {
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

	public void setResourceId(IResource resource, String newid) {
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

	private void deleteOmttMarkers(IResource resource) {
		try {
			ProblemMarkerCollector.deleteProblemMarkers(resource);
			resource.deleteMarkers(OMTT_COMPONENT_ID_MARKER, true,
					IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public Set<IResource> add(IResource resource, Program program,
			IProgressMonitor monitor) {
		final BaseSymbolTable st = program.getSymbolTable();
		final String id = program.getResourceId();

		fComponentReferences.updateReferences(resource, references(st));
		putModel(resource, program);
		return fComponentReferences.getAffected(id, null, st);
	}

	public Set<IResource> update(IResource resource, Program program,
			IProgressMonitor monitor) {
		final String oldId = getResourceId(resource);
		final String newId = program.getResourceId();

		if (oldId == null && newId == null)
			return null;
		else if (newId == null)
			return remove(resource, monitor);
		else if (oldId == null)
			return add(resource, program, monitor);

		final SymbolTable oldST = fSymbolTables.get(resource);
		final BaseSymbolTable newST = program.getSymbolTable();
		putModel(resource, program);
		
		Set<IResource> affected;
		if (!oldId.equals(newId)) {
			fComponentReferences.updateReferences(resource, null);
			affected =  fComponentReferences.getAffected(oldId, oldST,
					null);
			fComponentReferences.updateReferences(resource, references(newST));
			affected.addAll(fComponentReferences.getAffected(newId, null,
					newST));
		} else {
			fComponentReferences.updateReferences(resource, references(newST));
			affected = fComponentReferences.getAffected(oldId, oldST,					newST);
		}
		return affected;
	}

	public Set<IResource> remove(IResource resource, IProgressMonitor monitor) {
		final String id = getResourceId(resource);
		final SymbolTable st = fSymbolTables.get(resource);

		fComponentReferences.updateReferences(resource, null);
		dropModel(resource);
		deleteOmttMarkers(resource);
		return fComponentReferences.getAffected(id, st, null);
	}

	private Set<String> references(BaseSymbolTable st) {
		if (st == null)
			return null;
		else
			return st.retrieveReferences();
	}

	private void putModel(IResource resource, Program program) {
		final String id = program.getResourceId();
		fSymbolTables.put(resource, program.getSymbolTable());
		setResourceId(resource, id);
	}

	private void dropModel(IResource resource) {
		fSymbolTables.remove(resource);
		setResourceId(resource, null);
	}

	public Program parse(IResource resource, IEnrichedStream stream,
			IProblemCollector problemCollector) {
		final URI source = resource.getLocationURI();
		OmttCompilationTask task = getCompilationTask(source);
		task.setSourceStream(source, stream);
		if (problemCollector != null)
			task.setProblemCollector(problemCollector);
		task.buildTree();

		return task.getTree(source);
	}

	public OmttCompilationTask getCompilationTask(URI source) {
		List<URI> sources = new ArrayList<URI>();
		sources.add(source);
		return getCompilationTask(sources);
	}

	public OmttCompilationTask getCompilationTask(List<URI> sources) {
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

	public void notifyRebuild(final Set<IResource> compiled) {
		IWorkspaceRunnable notifyAction = new IWorkspaceRunnable() {
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				for (IResource resource : compiled) {
					if (fModelChangeListeners.containsKey(resource)) {
						Set<IModelChangeListener> listeners  = fModelChangeListeners.get(resource);
						for (IModelChangeListener listener : listeners)
							listener.notifyChange(resource);
					}
				}
			}
		};
		try {
			fProject.getWorkspace().run(notifyAction, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void addModelChangeListener (IModelChangeListener listener, IResource resource) {
		if (!fModelChangeListeners.containsKey(resource))
			fModelChangeListeners.put(resource, new HashSet<IModelChangeListener>());
		fModelChangeListeners.get(resource).add(listener);
	}
	
	public void removeModelChangeListener (IModelChangeListener listener, IResource resource) {
		fModelChangeListeners.get(resource).remove(listener);
	}
	
	public IJavaProject getJavaProject() {
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
