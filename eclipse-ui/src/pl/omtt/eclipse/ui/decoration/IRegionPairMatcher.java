package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

public interface IRegionPairMatcher {
	public IRegion match(IDocument document, int offset);
}
