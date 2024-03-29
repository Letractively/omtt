package pl.omtt.lang.analyze;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
	SymbolTable fParent;
	Map<String, Symbol> fSymbolMap = new HashMap<String, Symbol>();

	public SymbolTable() {
	}

	public SymbolTable(SymbolTable parent) {
		fParent = parent;
	}

	public SymbolTable createChildTable() {
		return new SymbolTable(this);
	}

	public Symbol find(String name) {
		return find(name, true);
	}
	
	public Symbol find(String name, boolean recursive) {
		if (fSymbolMap.containsKey(name)) {
			Symbol s = fSymbolMap.get(name);
			s.fReferenceCount++;
			return s;
		} else if (recursive && fParent != null) {
			return fParent.find(name, true);
		} else {
			return null;
		}
	}

	public void put(Symbol s) {
		fSymbolMap.put(s.getName(), s);
		s.fSTOwner = this;
	}

	public void setAlias(Symbol symbol, String alias) {
		fSymbolMap.put(alias, symbol);
	}

	public boolean contains (Symbol s) {
		return fSymbolMap.containsValue(s);
	}

	public Collection<Symbol> getSymbols() {
		return fSymbolMap.values();
	}

	public SymbolTable getParent () {
		return fParent;
	}

	public BaseSymbolTable getBase () {
		return getParent().getBase();
	}

	public String getModuleId() {
		return getBase().getModuleId();
	}
}
