package pl.omtt.lang.analyze;

import pl.omtt.lang.model.types.IType;

public class Symbol {
	String fName;
	IType fType;
	SymbolTable fSTOwner;

	public Symbol(String name, IType type) {
		fName = name;
		fType = type;
	}

	public String getName() {
		return fName;
	}

	public IType getType() {
		return fType;
	}

	public SymbolTable getParentST() {
		return fSTOwner;
	}

	public String getModuleId() {
		return fSTOwner.getModuleId();
	}

	public boolean isGlobal() {
		return getParentST() instanceof BaseSymbolTable;
	}

	public final static String CONTEXT = "_";
	public final static String IT = "it";
}
