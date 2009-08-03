package pl.omtt.eclipse.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import pl.omtt.eclipse.ui.editor.OmttEditor;

public class ModuleCreationWizard extends Wizard implements INewWizard {

	IWorkbench fWorkbench;
	IStructuredSelection fSelection;
	ModuleCreationPage fMainPage;

	public ModuleCreationWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		fWorkbench = workbench;
		fSelection = selection;
		setWindowTitle("Create OMTT module");
		setNeedsProgressMonitor(false);
	}

	@Override
	public void addPages() {
		fMainPage = new ModuleCreationPage(fSelection);
		addPage(fMainPage);
	}

	@Override
	public boolean performFinish() {
		IFile file = fMainPage.createNewFile();
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, new FileEditorInput(file),
					OmttEditor.EDITOR_ID);
		} catch (PartInitException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
