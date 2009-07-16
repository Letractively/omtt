package pl.omtt.lang.model.types;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class TypeException extends Exception {
	Object fCauseObject;
	
	public TypeException(String message) {
		// TODO: remove this constructor!
		super(message);
	}
	
	public TypeException(Token token, String message) {
		super(message);
		fCauseObject = token;
	}
	
	public TypeException(Tree base, String message) {
		super(message);
		fCauseObject = base;
	}
	
	public Object getCauseObject () {
		return fCauseObject;
	}

	public void setCauseObject (Object o) {
		fCauseObject = o;
	}

	private static final long serialVersionUID = 5566135107387791533L;
}
