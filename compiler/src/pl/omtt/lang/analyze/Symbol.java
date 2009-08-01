package pl.omtt.lang.analyze;

import pl.omtt.lang.model.types.IType;

public class Symbol {
	String fName;
	IType fType;
	SymbolTable fSTOwner;
	int fReferenceCount = 0;

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

	/**
	 * @return how many references to the symbol exist
	 */
	public int getReferencesCount () {
		return fReferenceCount;
	}
	
	public final static String CONTEXT = "_";
	public final static String IT = "it";
}
