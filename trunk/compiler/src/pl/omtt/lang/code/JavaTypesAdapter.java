package pl.omtt.lang.code;

import pl.omtt.lang.model.ast.Literal;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.FunctionType.Argument;

public class JavaTypesAdapter {
	String getInstance(IType type) {
		if (type.isSequence())
			return "new ArrayList<" + getSingle(type) + "> ()";
		else
			return "new " + get(type) + " ()";
	}

	String get(IType type) {
		if (type.isSequence())
			return "Collection<" + getSingle(type) + ">";
		else
			return getSingle(type);
	}

	String getSingle(IType type) {
		if (type.isFunction()) {
			if (type.isSequence())
				type = type.dup().unsetSequence();
			return getFunction((FunctionType) type.getEffectiveLowerBound());
		} else {
			Class<?> cls = type.getAssociatedClass();
			if (cls == null)
				return "Object";
			else
				return cls.getSimpleName();
		}
	}

	private String getFunction(FunctionType ftype) {
		final StringBuffer buf = new StringBuffer();
		final boolean data = ftype.getReturnType().isSingleData();
		if (data)
			buf.append("Data");
		buf.append("Function").append(ftype.getArguments().size());
		buf.append("<");
		if (!data)
			buf.append(get(ftype.getReturnType()));
		for(int i = 0; i < ftype.getArguments().size(); i++) {
			Argument a = ftype.getArgument(i);
			if (i > 0 || !data)
				buf.append(", ");
			buf.append(get(a.getType()));
		}
		buf.append(">");
		return buf.toString();
	}

	String getSingleReturn(IType type) {
		if (type instanceof FunctionType)
			return getSingle(((FunctionType) type).getReturnType());
		else
			return getSingle(type);
	}

	String getReturn(IType type) {
		if (type instanceof FunctionType)
			return get(((FunctionType) type).getReturnType());
		else
			return get(type);
	}

	public String getPrimitive(IType type) {
		Class<?> cls = type.getAssociatedClass();
		if (Boolean.class.equals(cls))
			return "boolean";
		else if (Integer.class.equals(cls))
			return "int";
		else if (Double.class.equals(cls))
			return "double";
		else if (Float.class.equals(cls))
			return "float";
		return null;
	}

	public String getLiteral(Literal literal) {
		final Object o = literal.get();
		if (o instanceof String) {
			String str = (String) o;
			str = str.replace("\n", "\\n");
			str = str.replace("\r", "");
			str = str.replace("\"", "\\\"");
			str = str.replace("\t", "\\t");
			return "\"" + str + "\"";
		} else if (o instanceof Literal.Null) {
			return "null";
		} else {
			return String.valueOf(o);
		}
	}
}
