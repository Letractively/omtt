package pl.omtt.lang.code;

import java.util.HashSet;
import java.util.Set;

import pl.omtt.lang.model.ast.Literal;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.FunctionType.Argument;

public class TypesJavaCodeConverter {
	private Set<Class<?>> fUsedClasses = new HashSet<Class<?>>();

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
			else {
				fUsedClasses.add(cls);
				return cls.getName();
			}
		}
	}

	private String getFunction(FunctionType ftype) {
		final StringBuffer buf = new StringBuffer();
		final boolean data = ftype.getReturnType().isSingleData();
		if (data)
			buf.append("Data");
		buf.append("Function").append(ftype.getArgumentLength());
		buf.append("<");
		if (!data)
			buf.append(get(ftype.getReturnType()));
		for(int i = 0; i < ftype.getArgumentLength(); i++) {
			Argument a = ftype.getArgument(i);
			if (i > 0 || !data)
				buf.append(", ");
			buf.append(get(a.type));
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
		else if (Long.class.equals(cls))
			return "long";
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
		} else if (o instanceof Boolean) {
			return "Boolean."+String.valueOf(o).toUpperCase();
		} else if (o instanceof Long) {
			return "Long.valueOf("+String.valueOf(o)+")";
		} else if (o instanceof Double) {
			return "Double.valueOf("+String.valueOf(o)+")";
		} else {
			return String.valueOf(o);
		}
	}

	public Set<Class<?>> getUsedClasses() {
		return fUsedClasses ;
	}
}
