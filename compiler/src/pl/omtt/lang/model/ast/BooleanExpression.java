package pl.omtt.lang.model.ast;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class BooleanExpression extends CommonNode implements IExpression,
		IVisitable {
	IType fType;

	public BooleanExpression(Token token) {
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
		if (getChildCount() > 1)
			return (IExpression) getChild(1);
		else
			return null;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		if (getOperatorType() == TYPE_COMPARE)
			checkCompareTypes();

		if (getOperatorType() == TYPE_BINARY_OP) {
			final IType lefttype = getLeftNode().getExpressionType();
			final IType righttype = getRightNode().getExpressionType();
			fType = TypeUnifier.intersect(lefttype, righttype);
			fType = TypeUnifier.preserveAttributes(fType, lefttype, righttype);
		} else {
			fType = ScalarType.fromClass(Boolean.class);
		}
	}

	private void checkCompareTypes() throws TypeException {
		final int op = getOperator();

		final IType lefttype = getLeftNode().getExpressionType();
		final IType righttype = getRightNode().getExpressionType();

		if (lefttype.isSequence() || righttype.isSequence())
			throw new TypeException(lefttype.isSequence() ? getLeftNode()
					: getRightNode(), "sequences are not comparable");

		// equals method is implemented for any Object
		if (op == OP_EQUAL || op == OP_NOT_EQUAL)
			return;

		// numeric types are always comparable
		if (lefttype.isNumeric() && righttype.isNumeric())
			return;

		if (!haveComparator(lefttype, righttype)
				&& !haveComparator(righttype, lefttype))
			throw new TypeException(this, "types " + lefttype + " and "
					+ righttype + " are not comparable");
	}

	public static boolean haveComparator(IType typeA, IType typeB) {
		final Class<?> clsA = typeA.getAssociatedClass();
		final Class<?> clsB = typeB.getAssociatedClass();

		for (Type gi : clsA.getGenericInterfaces()) {
			if (!(gi instanceof ParameterizedType))
				continue;

			ParameterizedType pt = (ParameterizedType) gi;
			if (!Comparable.class.equals(pt.getRawType()))
				continue;

			for (Type t : pt.getActualTypeArguments())
				if (t instanceof Class<?>
						&& ((Class<?>) t).isAssignableFrom(clsB))
					return true;
		}

		return false;
	}

	public int getOperator() {
		return getType();
	}

	public int getOperatorType() {
		switch (getOperator()) {
		case OP_AND:
		case OP_OR:
			return TYPE_BINARY_OP;

		case OP_NOT:
			return TYPE_UNARY_OP;

		case OP_EQUAL:
		case OP_NOT_EQUAL:
		case OP_LE:
		case OP_LEQ:
		case OP_GE:
		case OP_GEQ:
			return TYPE_COMPARE;

		default:
			return TYPE_UNKNOWN;
		}
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String operatorToString () {
		switch(getOperator()) {
		case OP_AND:
			return "and";
		case OP_OR:
			return "or";
		case OP_NOT:
			return "not";
		case OP_EQUAL:
			return "equal";
		case OP_NOT_EQUAL:
			return "not equal";
		case OP_LE:
			return "le";
		case OP_LEQ:
			return "leq";
		case OP_GE:
			return "ge";
		case OP_GEQ:
			return "geq";
		default:
			return "<unknown: " + getText() + ">";
		}
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		if (getOperatorType() == TYPE_COMPARE)
			buf.append("comparation");
		else if (getOperatorType() == TYPE_UNARY_OP)
			buf.append("unary");
		else if (getOperatorType() == TYPE_BINARY_OP)
			buf.append("binary");
		buf.append(" ").append(operatorToString()).append(" of ").append(fType);
		return buf.toString();
	}

	// operator types
	public final static int TYPE_UNKNOWN = 0;
	public final static int TYPE_COMPARE = 1;
	public final static int TYPE_BINARY_OP = 2;
	public final static int TYPE_UNARY_OP = 3;

	// boolean operators
	public final static int OP_AND = OmttParser.OP_AND;
	public final static int OP_OR = OmttParser.OP_OR;
	public final static int OP_NOT = OmttParser.OP_NOT;

	// compare operators
	public final static int OP_EQUAL = OmttParser.OP_EQUAL;
	public final static int OP_NOT_EQUAL = OmttParser.OP_NOT_EQUAL;
	public final static int OP_LE = OmttParser.OP_LE;
	public final static int OP_LEQ = OmttParser.OP_LEQ;
	public final static int OP_GE = OmttParser.OP_GE;
	public final static int OP_GEQ = OmttParser.OP_GEQ;
}
