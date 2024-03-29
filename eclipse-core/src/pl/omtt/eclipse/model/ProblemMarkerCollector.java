package pl.omtt.eclipse.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import pl.omtt.compiler.reporting.AbstractProblemCollector;
import pl.omtt.compiler.reporting.Problem;
import pl.omtt.core.Debugging;

public class ProblemMarkerCollector extends AbstractProblemCollector {
	public ProblemMarkerCollector() {
		super();
	}

	/**
	 * @see AbstractProblemCollector#collect(Problem)
	 */
	@Override
	protected void collect(Problem problem) {
		createMarker(problem);
		if (Debugging.DEBUG > 0)
			System.err.println(problem);
	}

	private void createMarker(Problem problem) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root
				.getFileForLocation(new Path(problem.getPath()));
		if (resource == null)
			return;

		IMarker marker;
		try {
			marker = resource.createMarker(OMTT_PROBLEM_MARKER);

			switch (problem.getSeverity()) {
			case Problem.ERROR:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				break;
			case Problem.WARNING:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				break;
			default:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
				break;
			}

			marker.setAttribute(IMarker.CHAR_START, problem.getOffset());
			marker.setAttribute(IMarker.CHAR_END, problem.getOffset()
					+ problem.getLength());
			marker.setAttribute(IMarker.LINE_NUMBER, problem.getLineNumber());
			if (problem.getLineNumber() > 0)
				marker.setAttribute(IMarker.LOCATION, "line "
						+ (problem.getLineNumber()));
			else
				marker.setAttribute(IMarker.LOCATION, "file");
			marker.setAttribute(IMarker.MESSAGE, problem.getMessage());
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}
	}

	public static void deleteProblemMarkers(IResource resource)
			throws CoreException {
		resource.deleteMarkers(OMTT_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
	}

	public final static String OMTT_PROBLEM_MARKER = "pl.omtt.eclipse.markers.problem";

	private static final long serialVersionUID = -8895140839797943574L;
}
