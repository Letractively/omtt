package pl.omtt.lang.code;

import pl.omtt.lang.model.types.IType;

public class Symbol {
	String fName;
	IType fType;
	
	public Symbol(String name, IType type) {
		fName = name;
		fType = type;
	}

	public String getName () {
		return fName;
	}
	
	public IType getType() {
		return fType;
	}
}
