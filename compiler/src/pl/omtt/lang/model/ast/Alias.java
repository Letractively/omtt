package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.ForceSymbolTableRecalculatingException;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class Alias extends CommonNode implements IExpression, IVisitable {
	IType fType;
	
	public Alias (Token token) {
		super (token);
	}

	public IExpression getContent () {
		return (IExpression) getChild(0);
	}
	
	public String getName () {
		return getChild(1).getText();
	}
	
	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable)
			throws TypeException, ForceSymbolTableRecalculatingException {
		fType = getContent().getExpressionType().dup();
		fType.setName(getName());
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
