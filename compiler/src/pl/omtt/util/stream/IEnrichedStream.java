package pl.omtt.util.stream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public interface IEnrichedStream extends CharStream {
	/**
	 * @see CharStream#consume()
	 */
	public void consume(int i);

	public void reset();

	/**
	 * Returns <code>true</code> if there were consumed only white space
	 * characters in current line.
	 * 
	 * @return <code>true</code> if there were consumed only white space
	 *         characters in current line; <code>false</false> otherwise.
	 */
	public boolean isNewLine();
	int rewindToLineBegin();


	public Token nextToken();

	/**
	 * @see CharStream#EOF
	 */
	public final static int EOF = CharStream.EOF;
}
