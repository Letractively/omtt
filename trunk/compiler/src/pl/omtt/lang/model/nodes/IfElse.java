package pl.omtt.lang.model.nodes;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class IfElse extends CommonNode implements IExpression, IVisitable {
	IType fType;

	public IfElse(int token) {
		super(new CommonToken(token, "if-else"));
	}

	public IExpression getConditionNode() {
		return (IExpression) getChild(0);
	}

	public IExpression getIfExpression() {
		return (IExpression) getChild(1);
	}

	public IExpression getElseExpression() {
		if (getChildCount() > 1)
			return (IExpression) getChild(2);
		else
			return null;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		IType iftype = getIfExpression().getExpressionType();
		if (getElseExpression() == null) {
			fType = iftype;
			return;
		}

		IType elsetype = getElseExpression().getExpressionType();
		fType = TypeUnifier.intersect(iftype, elsetype);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "if-else of " + fType;
	}
}
