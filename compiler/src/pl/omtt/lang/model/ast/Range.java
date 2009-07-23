package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;
import pl.omtt.lang.symboltable.SymbolTable;

public class Range extends CommonNode implements IExpression, IVisitable {
	IType fType;

	public Range(Token token) {
		super(token);
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	public IExpression getLeftNode() {
		return (IExpression) getChild(0);
	}

	public IExpression getRightNode() {
		return (IExpression) getChild(1);
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		fType = NumericType.integerInstance();
		fType.setSequence();

		IType lefttype, righttype;
		lefttype = getLeftNode().getExpressionType();
		righttype = getRightNode().getExpressionType();

		if (lefttype.isSequence() || righttype.isSequence())
			throw new TypeException(lefttype.isSequence() ? getLeftNode()
					: getRightNode(), "range is undefined for sequences");

		try {
			TypeUnifier.unifyLe(NumericType.integerInstance(), lefttype);
		} catch (TypeException e) {
			e.setCauseObject(getLeftNode());
			throw e;
		}

		try {
			TypeUnifier.unifyLe(NumericType.integerInstance(), righttype);
		} catch (TypeException e) {
			e.setCauseObject(getRightNode());
			throw e;
		}
	}

	@Override
	public String toString() {
		return "range of " + getExpressionType();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public final static int ADD = 0;
	public final static int SUB = 1;
	public final static int MUL = 2;
	public final static int DIV = 3;
	public final static int MOD = 4;
}
