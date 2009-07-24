package pl.omtt.lang.symboltable;

import pl.omtt.lang.model.types.IType;

public class Symbol {
	String fName;
	IType fType;
	SymbolTable fSTOwner;
	
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
	
	public SymbolTable getParentST () {
		return fSTOwner;
	}
}