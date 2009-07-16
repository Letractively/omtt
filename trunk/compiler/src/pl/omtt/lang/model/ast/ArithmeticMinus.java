package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class ArithmeticMinus extends CommonNode implements IExpression,
		IVisitable {
	IType fType;

	public ArithmeticMinus(Token token) {
		super(token);
	}
	
	@Override
	public IType getExpressionType() {
		return fType;
	}

	public IExpression getBodyNode () {
		return (IExpression) getChild(0);
	}
	
	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		fType = getBodyNode().getExpressionType();
		if (fType.isSequence()) {
			fType = new ErrorType ();
			throw new TypeException(this, "arithmetic expressions for sequences are not allowed");
		}
		try {
			TypeUnifier.unifyLe(NumericType.realInstance(), fType);
		} catch (TypeException e) {
			e.setCauseObject(this);
		}
	}

	@Override
	public String toString() {
		return "negative of " + getExpressionType();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
