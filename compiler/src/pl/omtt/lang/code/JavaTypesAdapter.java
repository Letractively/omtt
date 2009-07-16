package pl.omtt.lang.code;

import java.util.HashMap;
import java.util.Map;


import pl.omtt.lang.model.nodes.Literal;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;

public class JavaTypesAdapter {
	Map<FunctionType,String> fFunctionTypes = new HashMap<FunctionType,String>();

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
			if (type.isSequence()) {
				type = type.dup();
				type.unsetSequence();
			}
			return fFunctionTypes.get(type.getEffective());
		} else {
			Class<?> cls = type.getAssociatedClass();
			if (cls == null)
				return "Object";
			else
				return cls.getSimpleName();
		}
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

	public boolean containsFunction (FunctionType ftype) {
		return fFunctionTypes.containsKey(ftype);
	}
	
	public void putFunction (FunctionType ftype, String jtype) {
		fFunctionTypes.put(ftype, jtype);
	}
}
