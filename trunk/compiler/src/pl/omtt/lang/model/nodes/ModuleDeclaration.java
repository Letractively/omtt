package pl.omtt.lang.model.nodes;

import org.antlr.runtime.Token;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;

public class ModuleDeclaration extends CommonNode implements IVisitable {
	public ModuleDeclaration(int token_type, Token token) {
		super(token);
	}

	public String getPackageName () {
		StringBuffer buf = new StringBuffer();
		if (getChildCount() < 2)
			return null;
		else
			buf.append(getChild(0).getText());

		for(int i = 1; i < getChildCount() - 1; i++)
			buf.append(".").append(getChild(i).getText());
		return buf.toString();
	}
	
	public String getModuleName () {
		return getChild(getChildCount() - 1).getText();
	}
	
	public String toString() {
		String name = getPackageName();
		if (name == null)
			return "undefined";
		else
			return name;
	}

	public void accept (IVisitor visitor) {
		visitor.visit(this);
	}
}
