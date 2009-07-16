package pl.omtt.compiler.reporting;

import java.net.URI;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;

import pl.omtt.lang.model.nodes.CommonNode;
import pl.omtt.lang.model.types.TypeException;

public class Problem implements Comparable<Problem> {
	public Problem(int type, URI uri, String message, int offset, int length,
			int lineNumber) {
		fType = type;
		fURI = uri;

		fMessage = message;
		fOffset = offset;
		fLength = length;
		fLineNumber = lineNumber;
	}

	int fType;
	URI fURI;

	String fMessage;
	int fOffset;
	int fLength;
	int fLineNumber;

	public int getType() {
		return fType;
	}

	public URI getURI() {
		return fURI;
	}

	public String getPath() {
		return fURI.getPath();
	}

	public String getMessage() {
		return fMessage;
	}

	public int getOffset() {
		return fOffset;
	}

	public int getLength() {
		return fLength;
	}

	public int getLineNumber() {
		return fLineNumber;
	}

	@Override
	public String toString() {
		if (fLineNumber > 0)
			return String.format("%s:%d: %s", getPath(), fLineNumber, fMessage);
		else
			return String.format("%s: %s", getPath(), fMessage);
	}

	@Override
	public int compareTo(Problem p) {
		if (fOffset < p.fOffset)
			return -1;
		else if (fOffset > p.fOffset)
			return 1;

		if (fLength < p.fLength)
			return -1;
		else if (fLength > p.fLength)
			return 1;

		if (fMessage != null && p.fMessage != null) {
			int compareText = fMessage.compareTo(p.fMessage);
			if (compareText != 0)
				return compareText;
		} else if (fMessage == null) {
			return -1;
		} else if (p.fMessage == null) {
			return 1;
		}

		if (fType < p.fType)
			return -1;
		else if (fType > p.fType)
			return 1;

		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Problem)
			return compareTo((Problem) o) == 0;
		return false;
	}

	public static Problem fromMessage(int type, URI uri, String message) {
		return new Problem(type, uri, message, 0, 0, 0);
	}

	public static Problem fromTypeException(int type, URI uri, TypeException e) {
		Object o = e.getCauseObject();
		if (o instanceof CommonToken)
			return fromCommonToken(type, uri, e.getMessage(), (CommonToken) o);
		else if (o instanceof CommonNode)
			return fromCommonNode(type, uri, e.getMessage(), (CommonNode) o);
		else
			return fromMessage(type, uri, e.getMessage());
	}

	public static Problem fromCommonToken(int type, URI uri, String message,
			CommonToken token) {
		return new Problem(type, uri, message, token.getStartIndex(), token
				.getStopIndex()
				- token.getStartIndex() + 1, token.getLine());
	}

	public static Problem fromCommonNode(int type, URI uri, String message,
			CommonNode tree) {
		if (tree.hasSourceInfo()) {
			return new Problem(type, uri, message, tree.getSourceIndex(), tree.getSourceLength(), tree.getSourceLine());
		} else if (tree.getToken() instanceof CommonToken) {
			return fromCommonToken(type, uri, message, (CommonToken) tree
					.getToken());
		}
		else {
			return fromMessage(type, uri, message);
		}
	}

	public static Problem fromException(int type, URI uri, Exception e) {
		return fromMessage(type, uri, e.getMessage());
	}

	public static Problem fromRecognitionException(int type, URI uri,
			RecognitionException e, String message) {
		Problem p;
		if (e.token != null && e.token instanceof CommonToken)
			p = fromCommonToken(type, uri, message, (CommonToken) e.token);
		else if (e.node != null && e.node instanceof CommonNode)
			p = fromCommonNode(type, uri, message, (CommonNode) e.node);
		else {
			p = fromMessage(type, uri, message);
			p.fLineNumber = e.line;
			p.fOffset = e.index;
			p.fLength = 1;
		}
		return p;
	}

	public final static int ERROR = 1;
	public final static int WARNING = 2;
	public final static int INFO = 3;
	public final static int OTHER = 4;
}
