package pl.omtt.lang.grammar;

import java.util.Stack;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

import pl.omtt.compiler.reporting.IAntlrProblemCollector;
import pl.omtt.util.stream.IEnrichedStream;

public abstract class AbstractOmttLexer extends Lexer {

	private IAntlrProblemCollector fProblems;
	private IEnrichedStream fStream;
	private boolean fErrorsOccured = false;

	int DEBUG = 0;

	public AbstractOmttLexer() {
		super();
	}

	public AbstractOmttLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

		if (input instanceof IEnrichedStream)
			fStream = (IEnrichedStream) input;
		else
			throw new UnsupportedOperationException(
					"Lexer supports only IDocumentStream input.");
	}

	@Override
	public void setCharStream(CharStream input) {
		super.setCharStream(input);
		if (input instanceof IEnrichedStream)
			fStream = (IEnrichedStream) input;
		else
			throw new UnsupportedOperationException(
					"Lexer supports only IDocumentStream input.");
	}

	public void connectProblemContainer(IAntlrProblemCollector problems) {
		fProblems = problems;
	}

	@Override
	public void reportError(RecognitionException e) {
		fErrorsOccured = true;
		if (fProblems != null)
			fProblems.reportError(input.getSourceName(), e, getErrorMessage(e,
					getTokenNames()));
		else
			super.reportError(e);
	}

	abstract public void mTokens() throws RecognitionException;

	final public boolean isDataCharacter(int c) {
		if (c == '%' && fStream != null && fStream.isNewLine())
			return false;
		return c >= 0 && c != '{' && c != '}'
				&& (c != brackets.peek() || (c >= 'a' && c <= 'z'));
	}

	protected int escapeChar(int c) {
		switch (c) {
		case 'n':
			return '\n';
		case 't':
			return '\t';
		case 'b':
			return '\b';
		case 'f':
			return '\f';
		case 'r':
			return '\r';
		case '"':
		case '\'':
		case '\\':
		case '{':
		case '}':
			return c;
		default:
			return -1;
		}
	}

	public final void mFIXED_DATA_CONTENT() throws RecognitionException {
		int la = input.LA(1);
		state.text = "";
		do {
			if (la == '\\') {
				matchAny();
				if (state.failed)
					return;
				la = input.LA(1);
				matchAny();
				if (state.failed)
					return;
				int escChar = escapeChar(la);
				if (escChar < 0)
					reportError(new MismatchedTokenException());
				else
					state.text += (char) escChar;
			} else {
				matchAny();
				if (state.failed)
					return;

				if (la == '\n' || !fStream.isNewLine()) {
					state.text += (char) la;
				}
			}
			la = input.LA(1);
		} while (isDataCharacter(la));

		state.type = getStringLiteralType();
		state.channel = DEFAULT_TOKEN_CHANNEL;
	}

	@Override
	public Token nextToken() {
		while (true) {
			state.token = null;
			state.channel = Token.DEFAULT_CHANNEL;
			state.tokenStartCharIndex = input.index();
			state.tokenStartCharPositionInLine = input.getCharPositionInLine();
			state.tokenStartLine = input.getLine();
			state.text = null;
			if (input.LA(1) == CharStream.EOF) {
				return Token.EOF_TOKEN;
			}
			try {
				int la = input.LA(1);
				if (insideData() && isDataCharacter(la))
					mFIXED_DATA_CONTENT();
				else
					mTokens();

				if (state.token == null) {
					emit();
				} else if (state.token == Token.SKIP_TOKEN) {
					continue;
				}
				return state.token;
			} catch (NoViableAltException nva) {
				reportError(nva);
				recover(nva); // throw out current char and try again
			} catch (RecognitionException re) {
				reportError(re);
				// match() routine has already called recover()
			}
		}
	}

	abstract protected int getStringLiteralType();

	// Hash helper flags
	protected Character dataOnNewline = null;
	protected boolean endOnNewline = false;

	// TODO: public for debugging purposes, temporal
	public Stack<Character> brackets = new Stack<Character>();

	protected boolean insideData() {
		if (brackets.empty())
			return false;
		switch (brackets.peek()) {
		case 'd':
		case '}':
		case '"':
		case 'f':
			return true;
		default:
			return false;
		}
	}

	protected boolean insideData(char bracket) {
		return insideData() && insideBracket(bracket);
	}

	protected boolean insideBracket(char bracket) {
		return !brackets.empty() && brackets.peek() == bracket;
	}

	protected void pushBracket(char bracket) {
		if (DEBUG > 0)
			System.out.println("push: " + bracket + " ("
					+ (brackets.size() + 1) + ")");
		brackets.push(bracket);
	}

	protected char popBracket() throws UnmatchedBracketException {
		if (DEBUG > 0)
			System.out.println("pop: " + brackets.peek() + " ("
					+ (brackets.size() - 1) + ")");
		if (brackets.empty())
			throw new UnmatchedBracketException(input, (char) input.LA(1));
		return brackets.pop();
	}

	protected Character bracket() {
		return brackets.empty() ? null : brackets.peek();
	}

	protected char popBracket(char bracket) throws RecognitionException {
		if (brackets.empty() || bracket != brackets.peek()) {
			// System.out.println(bracket);
			// System.out.println(brackets.empty() ? "empty" : brackets.peek());
			// Proba zdjecia ze stosu nawiasu, ktorego na nim nie ma.
			// Przypomnienie: litera a oznacza nawias tablicy (zapis: '}').
			throw new UnmatchedBracketException(input, bracket == 'a' ? '}'
					: bracket);
		}
		return popBracket();
	}

	public boolean errorsOccured () {
		return fErrorsOccured;
	}
}
