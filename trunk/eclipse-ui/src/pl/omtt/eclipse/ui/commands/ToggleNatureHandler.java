package pl.omtt.eclipse.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import pl.omtt.eclipse.nature.OmttProjectSetup;

public class ToggleNatureHandler extends AbstractHandler {
	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);

		for (Iterator it = ((IStructuredSelection) selection).iterator(); it
				.hasNext();) {
			Object element = it.next();
			IProject project = null;
			if (element instanceof IProject) {
				project = (IProject) element;
			} else if (element instanceof IAdaptable) {
				project = (IProject) ((IAdaptable) element)
						.getAdapter(IProject.class);
			}
			if (project != null) {
				OmttProjectSetup.toggleNature(project);
			}
		}

		return null;
	}
}
