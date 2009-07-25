package pl.omtt.lang.model.types;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.SemanticException;

public class TypeException extends SemanticException {
	public TypeException(String message) {
		super(message);
	}

	public TypeException(Token token, String message) {
		super(token, message);
	}

	public TypeException(Tree base, String message) {
		super(base, message);
	}

	public TypeException(Throwable e) {
		super(e);
	}

	private static final long serialVersionUID = 5566135107387791533L;
}
