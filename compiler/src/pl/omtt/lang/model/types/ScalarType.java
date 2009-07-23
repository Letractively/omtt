package pl.omtt.lang.model.types;

import java.util.Collection;

public class ScalarType extends CommonType implements IType {
	Class<?> fTypeClass;

	protected ScalarType(Class<?> cls) {
		if (Collection.class.isAssignableFrom(cls)) {
			setSequence();
			fTypeClass = Object.class;
		} else {
			fTypeClass = cls;
		}
	}

	public static IType fromClass(Class<?> cls) {
		final boolean primitive = cls.isPrimitive();
		if (primitive)
			cls = deprimitive(cls);

		ScalarType type;
		if (Object.class.equals(cls))
			return new AnyType();
		else if (Number.class.isAssignableFrom(cls))
			type = NumericType.fromClass(cls);
		else
			type = new ScalarType(cls);
		if (primitive)
			type.setNotNull();
		return type;
	}

	public static Class<?> deprimitive(Class<?> type) {
		if (!type.isPrimitive())
			return type;
		else if (type.equals(boolean.class))
			return Boolean.class;
		else if (type.equals(byte.class))
			return Byte.class;
		else if (type.equals(char.class))
			return Character.class;
		else if (type.equals(short.class))
			return Short.class;
		else if (type.equals(int.class))
			return Integer.class;
		else if (type.equals(long.class))
			return Long.class;
		else if (type.equals(float.class))
			return Float.class;
		else if (type.equals(double.class))
			return Double.class;
		else
			return null;
	}

	@Override
	public void freeze() {
	}

	@Override
	public IType getEffective() {
		return this;
	}

	@Override
	public boolean isFrozen() {
		return true;
	}

	@Override
	public boolean isGeneral() {
		return false;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		type = type.getEffectiveLowerBound();
		if (type instanceof AnyType)
			return true;

		Class<?> cls;
		if (type instanceof ScalarType)
			cls = ((ScalarType) type).fTypeClass;
		else
			return false;

		return cls.isAssignableFrom(fTypeClass);
	}

	@Override
	public boolean essentiallyEquals(IType t) {
		if (!(t instanceof ScalarType))
			return false;
		ScalarType st = ((ScalarType) t);
		return st.fTypeClass.equals(fTypeClass);
	}

	@Override
	public Class<?> getAssociatedClass() {
		return fTypeClass;
	}

	@Override
	public boolean isSingleData() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return Boolean.class.isAssignableFrom(fTypeClass);
	}

	@Override
	public boolean isNumeric() {
		return Number.class.isAssignableFrom(fTypeClass);
	}

	@Override
	public String singleToString() {
		if (fTypeClass == null)
			return "<unknown type>";
		else if (Character.class.equals(fTypeClass))
			return "Char";
		else
			return fTypeClass.getSimpleName();
	}

	@Override
	String singleToEssentialString() {
		return "$";
	}
	
	public static IType charInstance() {
		return new ScalarType(Character.class);
	}
}
