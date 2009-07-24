package pl.omtt.lang.model.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public class JavaTypesAdapter {
	public static IType fromType(Type type) throws TypeException {
		if (Object.class.equals(type))
			return new AnyType();
		if (type instanceof Class<?>)
			return ScalarType.fromClass((Class<?>) type);

		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;

			Type rawtype = ptype.getRawType();

			if (!(rawtype instanceof Class<?>))
				throw new TypeException("unhandled return type " + rawtype);

			Class<?> rawclass = (Class<?>) rawtype;
			if (isSequence(rawclass)) {
				Type atype = ptype.getActualTypeArguments()[0];
				IType itemtype = fromType(atype);
				itemtype.setSequence();
				return itemtype;
			} else if (isFunction(rawclass)) {
				return functionFromType(ptype);
			} else {
				return ScalarType.fromClass(rawclass);
			}
		}
		return null;
	}

	private static FunctionType functionFromType(ParameterizedType ptype)
			throws TypeException {
		final Class<?> rawtype = (Class<?>) ptype.getRawType();
		final Type[] params = ptype.getActualTypeArguments();

		final FunctionType ftype = new FunctionType();
		int i = 0;
		if (rawtype.getSimpleName().startsWith("Data"))
			ftype.setReturnType(new StringDataType());
		else
			ftype.setReturnType(fromType(params[i++]));

		for (; i < params.length; i++) {
			ftype.putArgument(null, fromType(params[i]), false);
		}

		return ftype;
	}

	public static boolean isSequence(Class<?> clazz) {
		return Collection.class.isAssignableFrom(clazz);
	}

	public static boolean isFunction(Class<?> clazz) {
		for (Class<?> i : clazz.getInterfaces())
			if ("pl.omtt.core.functions.Function".equals(i.getCanonicalName()))
				return true;
		return false;
	}
}
