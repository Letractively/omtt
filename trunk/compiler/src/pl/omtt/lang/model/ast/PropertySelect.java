package pl.omtt.lang.model.ast;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.symboltable.ISymbolTableDualParticipant;
import pl.omtt.lang.symboltable.ISymbolTableOwner;
import pl.omtt.lang.symboltable.SymbolTable;

public class PropertySelect extends CommonSelectorNode implements
		IFoldExpression, ISymbolTableOwner, ISymbolTableDualParticipant,
		IVisitable {
	IType fPropertyType;
	Method fMethod;
	boolean fMethodReturnsSequence;
	boolean fMethodNeedsTypeWrapping;

	public PropertySelect(int token) {
		super(new CommonToken(token, "select"));
	}

	public Method getMethod() {
		return fMethod;
	}

	public boolean isMethodReturnsSequence () {
		return fMethodReturnsSequence;
	}

	public boolean isMethodNeedsTypeWrapping () {
		return fMethodNeedsTypeWrapping;
	}

	public boolean isItemSequence() {
		return fMethodReturnsSequence;
	}

	@Override
	protected IType getOriginalType(SymbolTable symbolTable)
			throws TypeException {
		IType base = getBaseNode().getExpressionType().getEffective();
		Class<?> cls;
		if (base instanceof StringDataType)
			cls = String.class;
		else if (base instanceof ScalarType)
			cls = ((ScalarType) base).getAssociatedClass();
		else if (base instanceof ErrorType) {
			return new ErrorType();
		} else
			throw new TypeException(getPropertyNode(), "type " + base
					+ " does not have properties");

		ArrayList<String> possibleNames = new ArrayList<String>();
		String name = getPropertyNode().getText();
		String uppername = name.substring(0, 1).toUpperCase()
				+ name.substring(1);
		possibleNames.add("get" + uppername);
		possibleNames.add("is" + uppername);
		if ("java.lang".equals(cls.getPackage().getName()))
			possibleNames.add(name);

		for (Method method : cls.getMethods())
			if (possibleNames.contains(method.getName())) {
				fMethod = method;
				break;
			}
		if (fMethod == null)
			throw new TypeException(getPropertyNode(), "property " + name
					+ " not found in type " + base.singleToString());
		if (fMethod.getParameterTypes().length > 0)
			throw new TypeException(getPropertyNode(),
					"functional properties are not supported");

		IType type;
		type = ScalarType.fromType(fMethod.getGenericReturnType());

		Class<?> returnClass = fMethod.getReturnType();
		if (returnClass.isPrimitive())
			fMethodNeedsTypeWrapping = true;
		else if (returnClass.isAssignableFrom(Number.class))
			fMethodNeedsTypeWrapping = !NumericType.isSupportedNumber(returnClass);

		if (type.isSequence())
			fMethodReturnsSequence = true;
		if (base.isSequence())
			type.setSequence();
		if (!base.isNotNull())
			type.unsetNotNull();
		return type;
	}

	public IExpression getBaseNode() {
		return (IExpression) getChild(0);
	}

	public Tree getPropertyNode() {
		return getChild(1);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "select " + getPropertyNode().getText() + " of "
				+ getExpressionType();
	}
}
