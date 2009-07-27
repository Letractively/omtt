package pl.omtt.eclipse.util.stream;

import java.net.URI;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

import pl.omtt.util.stream.EnrichedRawStream;

/**
 * ANTLR-compilant stream of Eclipse IDocument.
 * <p>
 * Stream is raw, what means, that doesn't count number of lines and position in
 * line, returning always 0. Thanks to this, seek complexity is o(1).
 * <p>
 * <u>Warning:</u> stream is <u>not</u> buffered, what means, that modifications
 * of the document are not handled.
 * 
 * @author Andrzej Chodor
 * @see IDocumentStream
 * @see org.antlr.runtime.ANTLRStringStream
 */
public class DocumentRawStream extends EnrichedRawStream implements
		IDocumentStream {

	protected IDocument d;
	protected URI uri;

	public DocumentRawStream(IDocument d) {
		this.d = d;
		reset();
	}

	public DocumentRawStream(IDocument d, Lexer l) {
		this(d);
		this.l = l;
		l.setCharStream(this);
	}

	public void setLocation(URI uri) {
		this.uri = uri;
	}

	@Override
	public IDocument getDocument() {
		return d;
	}

	protected int charAt(int pos) {
		try {
			return d.getChar(pos);
		} catch (BadLocationException e) {
			return CharStream.EOF;
		}
	}

	@Override
	public int size() {
		return d.getLength();
	}

	@Override
	public String substring(int start, int end) {
		try {
			return d.get(start, end - start + 1);
		} catch (BadLocationException e) {
			return null;
		}
	}

	@Override
	public String getSourceName() {
		if (uri == null)
			return "document stream";
		else
			return uri.toString();
	}

	@Override
	protected int getLength() {
		return d.getLength();
	}
}
