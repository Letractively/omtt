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
		if (fSymbolMap.containsKey(name))
			return fSymbolMap.get(name);
		else if (fParent != null)
			return fParent.find(name);
		else
			return null;
	}

	public Symbol get(String name) {
		return fSymbolMap.get(name);
	}

	public void put(Symbol s) {
		fSymbolMap.put(s.getName(), s);
		s.fSTOwner = this;
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
}
