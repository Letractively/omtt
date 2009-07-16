package pl.omtt.lang.grammar;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedTokenException;

public class UnmatchedBracketException extends MismatchedTokenException {
	public UnmatchedBracketException(IntStream input, char bracket) {
		super(0, input);
		this.charPositionInLine --;
		this.c = bracket;
	}

	public String toString () {
		return "Unmatched closing bracket";
	}
	
	private static final long serialVersionUID = 1681398853438499724L;
}
