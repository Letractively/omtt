package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.ITextViewerExtension2;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

public class OmttSourceViewerDecorationSupport extends
		SourceViewerDecorationSupport {

	/** Painter for matching regions */
	private RegionPainter fMatchingRegionPainter;
	private IRegionPairMatcher fRegionMatcher;

	private String fMatchingRegionPainterEnableKey;
	private String fMatchingRegionPainterColorKey;

	private ISourceViewer fSourceViewer;
	private IPreferenceStore fPreferenceStore;
	private ISharedTextColors fSharedTextColors;

	public OmttSourceViewerDecorationSupport(ISourceViewer sourceViewer,
			IOverviewRuler overviewRuler, IAnnotationAccess annotationAccess,
			ISharedTextColors sharedTextColors) {
		super(sourceViewer, overviewRuler, annotationAccess, sharedTextColors);
		fSourceViewer = sourceViewer;
		fSharedTextColors = sharedTextColors;
	}

	public void install(IPreferenceStore store) {
		super.install(store);
		fPreferenceStore = store;

		updateTextDecorations();
	}

	private void updateTextDecorations() {
		if (areMatchingRegionShown())
			showMatchingRegion();
		else
			hideMatchingRegion();
	}

	@Override
	public void dispose() {
		super.dispose();
		uninstall();
		updateTextDecorations();
		fMatchingRegionPainter = null;
	}

	public void setRegionPairMatcher(IRegionPairMatcher matcher) {
		fRegionMatcher = matcher;
	}

	/**
	 * Sets the preference keys for the matching region painter.
	 */
	public void setMatchingRegionPainterPreferenceKeys(String enableKey,
			String colorKey) {
		fMatchingRegionPainterEnableKey = enableKey;
		fMatchingRegionPainterColorKey = colorKey;
	}

	@Override
	protected void handlePreferenceStoreChanged(PropertyChangeEvent event) {
		String p = event.getProperty();

		if (fMatchingRegionPainterEnableKey != null
				&& fMatchingRegionPainterEnableKey.equals(p)
				&& fRegionMatcher != null) {
			if (areMatchingRegionShown())
				showMatchingRegion();
			else
				hideMatchingRegion();
		}
	}

	private boolean areMatchingRegionShown() {
		if (fPreferenceStore != null && fMatchingRegionPainterEnableKey != null)
			return fPreferenceStore.getBoolean(fMatchingRegionPainterEnableKey);
		return false;
	}

	private void showMatchingRegion() {
		if (fMatchingRegionPainter == null) {
			if (fSourceViewer instanceof ITextViewerExtension2) {
				fMatchingRegionPainter = new RegionPainter(fSourceViewer,
						fRegionMatcher);
				fMatchingRegionPainter
						.setColor(getColor(fMatchingRegionPainterColorKey));

				((ITextViewerExtension2) fSourceViewer)
						.addPainter(fMatchingRegionPainter);
			}
		}
	}

	private void hideMatchingRegion() {
		if (fMatchingRegionPainter != null) {
			if (fSourceViewer instanceof ITextViewerExtension2) {
				((ITextViewerExtension2) fSourceViewer)
						.removePainter(fMatchingRegionPainter);
				fMatchingRegionPainter.deactivate(true);
				fMatchingRegionPainter.dispose();
				fMatchingRegionPainter = null;
			}
		}
	}

	private Color getColor(String key) {
		if (fPreferenceStore != null) {
			RGB rgb = PreferenceConverter.getColor(fPreferenceStore, key);
			return fSharedTextColors.getColor(rgb);
		}
		return null;
	}
}
