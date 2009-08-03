package pl.omtt.lang.model.ast;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.ISymbolTableDualParticipant;
import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.JavaTypesAdapter;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;

public class PropertySelect extends CommonSelectorNode implements
		IFoldExpression, IPropertySelectExpression, ISymbolTableOwner,
		ISymbolTableDualParticipant, IVisitable {
	IType fType;
	Property fProperty;
	boolean fMethodReturnsSequence;

	// IType fPropertyType;
	// Method fMethod;
	// boolean fMethodNeedsTypeWrapping;

	public PropertySelect(int token) {
		super(new CommonToken(token, "select"));
	}

	public PropertySelect(Token token) {
		super(token);
	}

	public Method getPropertyMethod() {
		return fProperty.method;
	}

	public boolean isPropertyMethodReturnsSequence() {
		return fMethodReturnsSequence;
	}

	public boolean isPropertyMethodNeedsTypeWrapping() {
		return fProperty.needsTypeWrapping;
	}

	public boolean isItemSequence() {
		return fMethodReturnsSequence;
	}

	@Override
	protected IType getOriginalType(SymbolTable symbolTable)
			throws TypeException {
		if (getBaseNode() == null || getBaseNode().getExpressionType() == null)
			return ErrorType.instance();

		IType base = getBaseNode().getExpressionType().getEffective();

		try {
			fProperty = findProperty(base, getPropertyNode().getText());
			// make dup() to have always correct property type, not necesary now
			if (fProperty == null) {
				fType = new ErrorType();
				return fType;
			}
			fType = fProperty.type;
		} catch (TypeException e) {
			fType = new ErrorType();
			e.setCauseObject(getPropertyNode());
			throw e;
		}

		if (fType.isSequence())
			fMethodReturnsSequence = true;
		if (base.isSequence())
			fType.setSequence();
		if (!base.isNotNull())
			fType.unsetNotNull();
		return fType;
	}

	protected static Property findProperty(IType base, String name)
			throws TypeException {
		Class<?> cls;
		if (base instanceof StringDataType)
			cls = String.class;
		else if (base instanceof ScalarType)
			cls = ((ScalarType) base).getAssociatedClass();
		else if (base instanceof ErrorType) {
			return null;
		} else
			throw new TypeException("type " + base
					+ " does not have properties");

		ArrayList<String> possibleNames = new ArrayList<String>();
		String uppername = name.substring(0, 1).toUpperCase()
				+ name.substring(1);
		possibleNames.add("get" + uppername);
		possibleNames.add("is" + uppername);
		if ("java.lang".equals(cls.getPackage().getName()))
			possibleNames.add(name);

		Property property = new Property();
		for (Method method : cls.getMethods())
			if (possibleNames.contains(method.getName())) {
				property.method = method;
				break;
			}
		if (property.method == null)
			throw new TypeException("property " + name + " not found in type "
					+ base.singleToString());
		if (property.method.getParameterTypes().length > 0)
			throw new TypeException("functional properties are not supported");

		property.type = JavaTypesAdapter.fromType(property.method
				.getGenericReturnType());

		Class<?> returnClass = property.method.getReturnType();
		if (returnClass.isPrimitive())
			property.needsTypeWrapping = true;
		else if (returnClass.isAssignableFrom(Number.class))
			property.needsTypeWrapping = !NumericType
					.isSupportedNumber(returnClass);
		return property;
	}

	protected static class Property {
		public Method method;
		public IType type;
		public boolean needsTypeWrapping = false;
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
