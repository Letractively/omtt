package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;

public class ModuleDeclaration extends CommonNode implements IVisitable {
	public ModuleDeclaration(int token_type, Token token) {
		super(token);
	}

	public String getModuleId () {
		String pkgName = getPackageName();
		if (pkgName == null)
			pkgName = "local";
		return pkgName + "." + getModuleName();
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
	
	public void accept (IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("module ");
		if (getPackageName() != null)
			buf.append(getPackageName());
		else
			buf.append("local");
		buf.append(".").append(getModuleName());
		
		return buf.toString();
	}
}
