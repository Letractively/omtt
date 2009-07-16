package pl.omtt.eclipse.model;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import pl.omtt.compiler.OmttCompilationTask;
import pl.omtt.compiler.OmttCompiler;

public class OmttProjectModel {
	IProject fProject;

	public OmttProjectModel(IProject project) {
		fProject = project;
	}

	synchronized public boolean rebuild(IProgressMonitor monitor) {
		try {
			ProblemMarkerCollector.deleteProblemMarkers(fProject);
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

		return rebuild(visitor, monitor);
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
		return rebuild(visitor, monitor);
	}

	private boolean rebuild(RebuildCollectVisitor visitor,
			IProgressMonitor monitor) {
		List<URI> sources = new ArrayList<URI>();

		for (IResource resource : visitor.fOmttAdded) {
			sources.add(resource.getLocationURI());
		}

		for (IResource resource : visitor.fOmttChanged) {
			try {
				ProblemMarkerCollector.deleteProblemMarkers(resource);
			} catch (CoreException e) {
				e.printStackTrace();
				return false;
			}
			sources.add(resource.getLocationURI());
		}

		OmttCompilationTask task = getTask(sources);
		task.setProblemCollector(new ProblemMarkerCollector());
		task.compile();

		return true;
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

	private IJavaProject getJavaProject() {
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
}
