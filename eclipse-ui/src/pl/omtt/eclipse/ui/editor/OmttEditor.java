package pl.omtt.eclipse.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import pl.omtt.eclipse.ui.IOmttPreferenceConstants;
import pl.omtt.eclipse.ui.OmttUI;
import pl.omtt.eclipse.ui.decoration.OmttFoldingManager;
import pl.omtt.eclipse.ui.decoration.OmttRegionPairMatcher;
import pl.omtt.eclipse.ui.decoration.OmttSourceViewerDecorationSupport;
import pl.omtt.eclipse.ui.document.OmttDocumentModel;
import pl.omtt.eclipse.ui.document.OmttDocumentProvider;
import pl.omtt.eclipse.ui.outline.OmttContentOutlinePage;

public class OmttEditor extends TextEditor {
	OmttColorProvider fColorProvider;
	OmttContentOutlinePage fContentOutlinePage;

	// Projections
	OmttFoldingManager fFoldingManager;

	@Override
	protected void initializeEditor () {
		super.initializeEditor();

		fColorProvider = new OmttColorProvider();
		setPreferenceStore(createCombinedPreferenceStore());
		setDocumentProvider(new OmttDocumentProvider());
		setSourceViewerConfiguration(new OmttSourceViewerConfiguration(this,
				fColorProvider, getPreferenceStore()));
	}
	
	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);

		OmttDocumentModel model = getOmttDocumentModel();
		if (model == null)
			return;

		if (fFoldingManager != null)
			fFoldingManager.setDocumentModel(model);
		if (fContentOutlinePage != null)
			fContentOutlinePage.setDocumentModel(model);
	}

	@Override
	protected void configureSourceViewerDecorationSupport(
			SourceViewerDecorationSupport support) {
		super.configureSourceViewerDecorationSupport(support);

		if (support instanceof OmttSourceViewerDecorationSupport) {
			OmttSourceViewerDecorationSupport omttSupport = (OmttSourceViewerDecorationSupport) support;
			omttSupport.setRegionPairMatcher(new OmttRegionPairMatcher());
			omttSupport.setMatchingRegionPainterPreferenceKeys(
					IOmttPreferenceConstants.MATCHING_BRACKETS,
					IOmttPreferenceConstants.MATCHING_BRACKETS_COLOR);
		}
	}

	/**
	 * @see org.eclipse.ui.texteditor.AbstractDecorationTextEditor#getSourceViewerDecorationSupport(ISourceViewer
	 *      viewer)
	 */
	protected SourceViewerDecorationSupport getSourceViewerDecorationSupport(
			ISourceViewer viewer) {
		if (fSourceViewerDecorationSupport == null) {
			fSourceViewerDecorationSupport = new OmttSourceViewerDecorationSupport(
					viewer, getOverviewRuler(), getAnnotationAccess(),
					getSharedColors());
			configureSourceViewerDecorationSupport(fSourceViewerDecorationSupport);
		}
		return fSourceViewerDecorationSupport;
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
		ProjectionSupport support = new ProjectionSupport(viewer,
				getAnnotationAccess(), getSharedColors());
		support.install();

		fFoldingManager = new OmttFoldingManager(viewer);

		if (getOmttDocumentModel() != null)
			fFoldingManager.setDocumentModel(getOmttDocumentModel());
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler,
				getOverviewRuler(), isOverviewRulerVisible(), styles);

		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);

		return viewer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {
			if (fContentOutlinePage == null) {
				fContentOutlinePage = new OmttContentOutlinePage(this);
				OmttDocumentModel model = getOmttDocumentModel();
				if (model != null)
					fContentOutlinePage.setDocumentModel(model);
			}
			return fContentOutlinePage;
		}
		return super.getAdapter(required);
	}

	private static IPreferenceStore createCombinedPreferenceStore() {
		List<IPreferenceStore> stores = new ArrayList<IPreferenceStore>();

		stores.add(EditorsUI.getPreferenceStore());
		stores.add(PlatformUI.getPreferenceStore());
		stores.add(OmttUI.getDefault().getPreferenceStore());

		return new ChainedPreferenceStore(stores
				.toArray(new IPreferenceStore[stores.size()]));
	}

	@Override
	public void dispose() {
		fColorProvider.dispose();
		super.dispose();
	}

	public OmttDocumentModel getOmttDocumentModel() {
		IDocumentProvider docProvider = getDocumentProvider();
		if (docProvider instanceof OmttDocumentProvider) {
			return ((OmttDocumentProvider) docProvider)
					.getOmttDocumentModel(getEditorInput());
		}
		return null;
	}

	public static final String EDITOR_ID = "pl.omtt.eclipse.ui.editor";
}
