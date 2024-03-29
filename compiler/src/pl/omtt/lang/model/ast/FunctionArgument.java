package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class FunctionArgument extends CommonNode implements IExpression,
		IVisitable {
	IType fExpressionType;

	public FunctionArgument(int tokenId) {
		super(new CommonToken(tokenId, "argument"));
	}

	public FunctionArgument(Token token) {
		super(token);
	}

	public IExpression getTargetNode() {
		return (IExpression) getChild(0);
	}

	public String getTargetName() {
		if (getChildCount() > 1)
			return getChild(1).getText();
		else
			return null;
	}

	@Override
	public IType getExpressionType() {
		return fExpressionType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		fExpressionType = getTargetNode().getExpressionType().dup();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "argument of " + getExpressionType();
	}
}
