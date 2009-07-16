package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class ArithmeticExpression extends CommonNode implements IExpression,
		IVisitable {
	IType fType;
	int fOperation;

	public ArithmeticExpression(Token token) {
		super(token);

		switch (token.getType()) {
		case OmttParser.OP_PLUS:
			fOperation = ADD;
			break;
		case OmttParser.OP_MINUS:
			fOperation = SUB;
			break;
		case OmttParser.OP_MULTIPLY:
			fOperation = MUL;
			break;
		case OmttParser.SLASH:
			fOperation = DIV;
			break;
		case OmttParser.OP_MODULO:
			fOperation = MOD;
			break;
		}
	}

	public int getOperation() {
		return fOperation;
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
		IType childA, childB;
		childA = getLeftNode().getExpressionType();
		childB = getRightNode().getExpressionType();

		checkTypes(childA, childB);

		if (fOperation == MOD)
			fType = NumericType.integerInstance();
		else if (isReal(childA) || isReal(childB))
			fType = NumericType.realInstance();
		else
			fType = NumericType.integerInstance();
		fType = TypeUnifier.preserveAttributes(fType, childA, childB);

		try {
			TypeUnifier.unifyLe(fType, childA);
		} catch (TypeException e) {
			e.setCauseObject(getChild(0));
			throw e;
		}
		try {
			TypeUnifier.unifyLe(fType, childB);
		} catch (TypeException e) {
			e.setCauseObject(getChild(1));
			throw e;
		}
		if (!isReal(childA) && !isReal(childB))
			fType = TypeUnifier.preserveAttributes(NumericType
					.integerInstance(), childA, childB);
	}

	private void checkTypes(IType left, IType right) throws TypeException {
		if (left == null || right == null)
			throw new TypeException(this,
					"fatal: child type is null, this error is supposed to be a bug; please report");

		if (left.isSequence())
			throw new TypeException(getLeftNode(),
					"arithmetic operation is undefined for sequences");

		if (right.isSequence())
			throw new TypeException(getRightNode(),
					"arithmetic operation is undefined for sequences");
	}

	private boolean isReal(IType type) {
		if (type instanceof NumericType)
			return ((NumericType) type).isReal();
		else
			return false;
	}

	@Override
	public String toString() {
		return "arithmetic (" + getText() + ") of " + getExpressionType();
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
