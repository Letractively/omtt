package pl.omtt.lang.model.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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

	public static ScalarType fromClass(Class<?> cls) {
		final boolean primitive = cls.isPrimitive();
		if (primitive)
			cls = deprimitive(cls);

		ScalarType type;
		if (Number.class.isAssignableFrom(cls))
			type = NumericType.fromClass(cls);
		else
			type = new ScalarType(cls);
		if (primitive)
			type.setNotNull();
		return type;
	}

	public static ScalarType fromType(Type type) throws TypeException {
		if (type instanceof Class<?>)
			return fromClass((Class<?>) type);

		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;

			Type rawtype = ptype.getRawType();
			if (!(rawtype instanceof Class<?>))
				throw new TypeException("unhandled return type " + rawtype);

			Class<?> rawclass = (Class<?>) rawtype;
			if (Collection.class.isAssignableFrom(rawclass)) {
				Type atype = ptype.getActualTypeArguments()[0];
				if (atype instanceof Class<?>) {
					ScalarType scalar = fromClass((Class<?>) atype);
					scalar.setSequence();
					return scalar;
				} else {
					return fromClass(rawclass);
				}
			} else {
				return fromClass(rawclass);
			}
		}
		return null;
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
		type = type.getEffective();
		if (type instanceof GeneralType)
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
		if (fTypeClass != null)
			return fTypeClass.getSimpleName();
		else
			return "<unknown type>";
	}
}
