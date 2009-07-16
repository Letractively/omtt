package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPaintPositionManager;
import org.eclipse.jface.text.IPainter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewerExtension5;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Paints rectangles over matching regions (may be larger than 1 character).
 * 
 * <p>
 * This code is based on <code>MatchingCharacterPainter</code>.
 * 
 * @see MatchingCharacterPainterMatchingCharacterPainter
 */
public class RegionPainter implements IPainter, PaintListener {

	private boolean fIsActive = false;
	protected ISourceViewer fSourceViewer;
	protected StyledText fTextWidget;
	protected IPaintPositionManager fPaintPositionManager;
	protected IRegionPairMatcher fMatcher;
	protected Position fMatchPosition = new Position(0, 0);
	protected Color fColor;

	public RegionPainter(ISourceViewer sourceViewer, IRegionPairMatcher matcher) {
		fSourceViewer = sourceViewer;
		fMatcher = matcher;
		fTextWidget = sourceViewer.getTextWidget();
	}

	public void setColor(Color color) {
		fColor = color;
	}

	@Override
	public void deactivate(boolean redraw) {
		if (fIsActive) {
			fIsActive = false;
			fTextWidget.removePaintListener(this);
			if (fPaintPositionManager != null)
				fPaintPositionManager.unmanagePosition(fMatchPosition);
			if (redraw)
				handleDrawRequest(null);
		}
	}

	@Override
	public void dispose() {
		fMatcher = null;
		fColor = null;
		fTextWidget = null;
	}

	@Override
	public void paintControl(PaintEvent event) {
		if (fTextWidget != null)
			handleDrawRequest(event.gc);
	}

	@Override
	public void paint(int reason) {
		IDocument document = fSourceViewer.getDocument();
		if (document == null) {
			deactivate(false);
			return;
		}

		Point selection = fSourceViewer.getSelectedRange();
		if (selection.y > 0) {
			deactivate(true);
			return;
		}

		IRegion match = fMatcher.match(document, selection.x);
		if (match == null) {
			deactivate(true);
			return;
		}

		if (fIsActive) {
			if (reason == IPainter.CONFIGURATION) {
				handleDrawRequest(null);
				return;
			}

			if (match.getOffset() == fMatchPosition.offset
					&& match.getLength() == fMatchPosition.length)
				return;

			handleDrawRequest(null);
			setUpMatch(match);
			handleDrawRequest(null);
		} else {
			fIsActive = true;
			setUpMatch(match);

			fTextWidget.addPaintListener(this);
			fPaintPositionManager.managePosition(fMatchPosition);
			handleDrawRequest(null);
		}
	}

	private void setUpMatch(IRegion match) {
		fMatchPosition.isDeleted = false;
		fMatchPosition.offset = match.getOffset();
		fMatchPosition.length = match.getLength();
	}

	@Override
	public void setPositionManager(IPaintPositionManager paintPositionManager) {
		fPaintPositionManager = paintPositionManager;
	}

	private void handleDrawRequest(GC gc) {
		if (fMatchPosition.isDeleted)
			return;

		int offset = fMatchPosition.offset;
		int length = fMatchPosition.length;
		if (length < 1)
			return;

		if (fSourceViewer instanceof ITextViewerExtension5) {
			ITextViewerExtension5 extension = (ITextViewerExtension5) fSourceViewer;
			IRegion widgetRange = extension.modelRange2WidgetRange(new Region(
					offset, length));
			if (widgetRange == null)
				return;

			try {
				IDocument doc = fSourceViewer.getDocument();
				int startLine = doc.getLineOfOffset(offset);
				int endLine = doc.getLineOfOffset(offset + length);
				if (extension.modelLine2WidgetLine(startLine) == -1
						|| extension.modelLine2WidgetLine(endLine) == -1)
					return;
			} catch (BadLocationException e) {
				return;
			}

			offset = widgetRange.getOffset();
			length = widgetRange.getLength();
		} else {
			IRegion region = fSourceViewer.getVisibleRegion();
			if (region.getOffset() > offset
					|| region.getOffset() + region.getLength() < offset
							+ length)
				return;
			offset -= region.getOffset();
		}

		draw(gc, offset, length);
	}

	private void draw(GC gc, int offset, int length) {
		if (gc != null) {
			gc.setForeground(fColor);

			Rectangle bounds;
			if (length > 0) {
				bounds = fTextWidget.getTextBounds(offset, offset + length - 1);
			} else {
				Point loc = fTextWidget.getLocationAtOffset(offset);
				bounds = new Rectangle(loc.x, loc.y, 1, fTextWidget
						.getLineHeight(offset));
			}

			gc.drawRectangle(bounds.x, bounds.y, bounds.width - 1,
					bounds.height - 1);
		} else {
			fTextWidget.redrawRange(offset, length, true);
		}
	}
}
