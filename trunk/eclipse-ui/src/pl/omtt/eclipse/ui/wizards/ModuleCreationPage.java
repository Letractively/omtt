package pl.omtt.eclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import pl.omtt.core.Constants;

public class ModuleCreationPage extends WizardNewFileCreationPage {

	public ModuleCreationPage(IStructuredSelection selection) {
		super("Create OMTT module", selection);
		setFileExtension(Constants.OMTT_FILE_EXTENSION);
	}
}
