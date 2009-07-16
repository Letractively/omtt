package pl.omtt.eclipse.model;

import java.util.ArrayList;
import java.util.List;

public class Type {
	Class<?> fType;
	List<Class<?>> fArgumentTypes;
	List<String> fArgumentNames;

	public Type () {
	}

	public Type (Class<?> type) {
		fType = type;
	}
	
	public Type (Class<?> type, List<Class<?>> argumentTypes, List<String> argumentNames) {
		fType = type;
		fArgumentTypes = argumentTypes;
		fArgumentNames = argumentNames;
	}
	
	public void setType (Class<?> type) {
		fType = type;
	}
	
	public Class<?> getArgumentType (int i) {
		return fArgumentTypes.get(i);
	}
	
	public String getArgumentName (int i) {
		return fArgumentNames.get(i);
	}

	public int getArgumentIndex (String name) {
		for (int i = 0; i < fArgumentNames.size(); i++)
			if (name.equals(fArgumentNames.get(i)))
				return i;
		return -1;
	}

	public void addArgument (Class<?> type, String name) {
		if (fArgumentTypes == null) {
			fArgumentTypes = new ArrayList<Class<?>> ();
			fArgumentNames = new ArrayList<String> ();
		}

		fArgumentTypes.add(type);
		fArgumentNames.add(name);
	}
	
	public void addArgument (Class<?> type) {
		addArgument(type, null);
	}
	
	public boolean isScalar () {
		return fArgumentTypes.isEmpty();
	}

	public boolean isFunction () {
		return !isScalar();
	}

	public int getArgumentCount () {
		return fArgumentTypes.size();
	}

	public boolean returnsStringData () {
		return String.class.isAssignableFrom(fType);
	}
}
