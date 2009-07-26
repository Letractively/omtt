package pl.omtt.eclipse.nature;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import pl.omtt.eclipse.model.OmttModelManager;
import pl.omtt.eclipse.model.OmttProjectModel;

public class OmttBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "pl.omtt.eclipse.builder";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("unchecked")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		if(!(getProjectModel().rebuild(monitor)))
			forgetLastBuiltState();
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		if(!(getProjectModel().rebuild(delta, monitor)))
			forgetLastBuiltState();
	}

	protected OmttProjectModel getProjectModel() {
		return OmttModelManager.getOmttModelManager().getProjectModel(getProject());
	}
}
