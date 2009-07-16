package pl.omtt.lang.model.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;

public class UseDeclaration extends CommonNode implements IVisitable {
	public String as;
	
	public UseDeclaration(int token_type, Token token, Token as) {
		this.token = token;
		this.as = as.getText();
	}

	private List<Class<?>> getTargetClasses() throws ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		ClassLoader loader = ClassLoader.getSystemClassLoader();

		String p = "";

		int i = 0;
		for (i = 0; i < this.getChildCount() - 1; i++)
			p += this.getChild(i).getText() + ".";
		if (this.getChild(i).getText().equals("*"))
			// TODO: package service
			;
		else
			// single class
			classes.add(loader.loadClass(p + this.getChild(i)));

		return classes;
	}

	public String toString() {
		try {
			return getTargetClasses().toString();
		} catch (ClassNotFoundException e) {
			return "not found";
		}
	}

	public void accept (IVisitor visitor) {
		visitor.visit(this);
	}
}
