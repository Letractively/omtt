package pl.omtt.eclipse.ui.editor;

import org.antlr.runtime.tree.Tree;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.swt.graphics.Point;

import pl.omtt.lang.model.ast.Ident;

public class OmttTextHover implements ITextHover {
	OmttEditor fEditor;

	public OmttTextHover(OmttEditor editor) {
		fEditor = editor;
	}

	protected Tree getTargetNode(ITextViewer textViewer, IRegion region) {
		return fEditor.getOmttDocumentModel().getNodeAnchoredAt(
				region.getOffset(), region.getLength());
	}

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion region) {
		Tree node = getTargetNode(textViewer, region);

		if(node instanceof Ident) {
			Ident ident = (Ident) node;
			return ident.getName() + " of " + ident.getExpressionType();
		}

		return null;
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		Point selection = textViewer.getSelectedRange();
		if (selection.x <= offset && offset < selection.x + selection.y)
			return new Region(selection.x, selection.y);
		return new Region(offset, 0);
	}
}
