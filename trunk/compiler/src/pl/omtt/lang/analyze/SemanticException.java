package pl.omtt.lang.analyze;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.compiler.reporting.Problem;

public class SemanticException extends Exception {
	Object fCauseObject;
	int fSeverity = Problem.ERROR;

	public SemanticException(Object cause, String message, int severity) {
		this(message);
		fCauseObject = cause;
		fSeverity = severity;
	}

	protected SemanticException(Object cause, String message) {
		this(cause, message, Problem.ERROR);
	}
	
	public SemanticException(Token token, String message) {
		this((Object)token, message);
	}

	public SemanticException(Tree base, String message) {
		this((Object)base, message);
	}

	public SemanticException(String message) {
		super(message);
	}

	public SemanticException(Throwable cause) {
		super(cause);
	}

	public SemanticException(String message, Throwable cause) {
		super(message, cause);
	}

	public Object getCauseObject () {
		return fCauseObject;
	}

	public void setCauseObject (Object o) {
		fCauseObject = o;
	}

	public int getSeverity () {
		return fSeverity;
	}
	
	public void setSeverity (int severity) {
		fSeverity = severity;
	}
	
	private static final long serialVersionUID = -4491948348650581470L;
}
