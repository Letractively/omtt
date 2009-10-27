package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.ClassResolver;
import pl.omtt.lang.analyze.ISymbolTableParticipant;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.TypeException;

public class UseDeclaration extends CommonNode implements
		ISymbolTableParticipant, IVisitable {
	public UseDeclaration(int token_type, Token token) {
		super(token);
	}

	public boolean isImportingPackage() {
		return getFirstChildWithType(OmttParser.OP_GENERAL) != null;
	}

	public String getPackageName() {
		String packageName = "";
		for (int i = 0; i < getChildCount() - 1; i++) {
			packageName += getChild(i).getText();
			if (i < getChildCount() - 2)
				packageName += ".";
		}
		return packageName;
	}

	public String getClassName() {
		String last = getChild(this.getChildCount() - 1).getText();
		if ("*".equals(last))
			return null;
		else
			return last;
	}

	public void addToClassResolver(ClassResolver classResolver)
			throws ClassNotFoundException {
		if (isImportingPackage())
			classResolver.putPackage(getPackageName());
		else
			classResolver.putClass(getPackageName() + "." + getClassName());
	}

	public String getImportingClasses() {
		return getPackageName() + "."
				+ (isImportingPackage() ? "_" : getClassName());
	}

	@Override
	public void takeSymbolTable(SymbolTable symbolTable) throws TypeException {
		try {
			addToClassResolver(symbolTable.getBase().getClassResolver());
		} catch (ClassNotFoundException e) {
			throw new TypeException(this, "class " + e.getMessage() + " not found");
		}
	}

	public String toString() {
		return getImportingClasses();
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
