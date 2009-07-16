package pl.omtt.eclipse.ui.outline;

import org.antlr.runtime.CommonToken;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import pl.omtt.eclipse.model.IDocumentModelListener;
import pl.omtt.eclipse.model.OmttDocumentModel;
import pl.omtt.eclipse.ui.editor.OmttEditor;
import pl.omtt.lang.model.nodes.TemplateDefinition;

public class OmttContentOutlinePage extends ContentOutlinePage implements
		ISelectionChangedListener, IDocumentModelListener {
	OmttEditor fEditor;
	OmttDocumentModel fDocumentModel;

	public OmttContentOutlinePage(OmttEditor editor) {
		super();
		fEditor = editor;
	}

	public void setDocumentModel (OmttDocumentModel model) {
		if (fDocumentModel != null) {
			fDocumentModel.removeDocumentModelListener(this);
		}

		fDocumentModel = model;
		update();
		fDocumentModel.addDocumentModelListener(this);
	}

	@Override
	public void documentModelChanged(boolean persistent) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				update();
			}
		});
	}

	protected void update() {
		OmttDocumentModel model = fEditor.getOmttDocumentModel();
		if (model == null || model.getDocumentTree() == null)
			return;

		TreeViewer tv = getTreeViewer();
		if (tv != null) {
			synchronized (tv) {
				tv.setSelection(TreeSelection.EMPTY);
				tv.setInput(model.getDocumentTree());
			}
		}
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer tv = getTreeViewer();
		tv.setContentProvider(new OmttOutlineContentProvider());
		tv.setLabelProvider(new OmttOutlineLabelProvider());
		tv.addSelectionChangedListener(this);
		update();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof TreeSelection) {
			TreeSelection selection = (TreeSelection) event.getSelection();

			if (selection.isEmpty()) {
				// fEditor.resetHighlightRange();
				return;
			}

			Object object = selection.getFirstElement();
			if (object instanceof TemplateDefinition) {
				TemplateDefinition node = (TemplateDefinition) object;
				CommonToken token = (CommonToken) node.getTemplateNameToken();
				if (token == null)
					return;
				int start = token.getStartIndex();
				int length = token.getStopIndex() - start + 1;
				try {
					fEditor.selectAndReveal(start, length);
					// fEditor.setHighlightRange(start, length, true);
				} catch (IllegalArgumentException e) {
					// fEditor.resetHighlightRange();
				}
			}
		}
	}
	
	@Override
	public void dispose () {
		super.dispose();
		if (fDocumentModel != null)
			fDocumentModel.removeDocumentModelListener(this);
	}
}
