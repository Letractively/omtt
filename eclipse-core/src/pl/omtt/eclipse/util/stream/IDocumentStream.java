package pl.omtt.eclipse.util.stream;

import org.eclipse.jface.text.IDocument;

import pl.omtt.util.stream.IEnrichedStream;

/**
 * <code>CharStream</code> interface for Eclipse <code>IDocument</code>.
 * 
 * @see org.antlr.runtime.CharStream
 * @see org.eclipse.jface.text.IDocument
 * @author Andrzej Chodor
 */
public interface IDocumentStream extends IEnrichedStream {
	/**
	 * Returns document attached to stream.
	 * 
	 * @return document attached to stream; null if such does not exist.
	 */
	public IDocument getDocument();
}
