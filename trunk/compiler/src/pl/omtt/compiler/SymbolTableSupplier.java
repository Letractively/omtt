package pl.omtt.compiler;

import java.util.HashMap;
import java.util.Map;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.ILibrarySymbolTableSupplier;
import pl.omtt.lang.analyze.LibrarySymbolTable;
import pl.omtt.lang.code.ClassResolver;

public class SymbolTableSupplier implements ILibrarySymbolTableSupplier {
	Map<String, BaseSymbolTable> fSymbolTables = new HashMap<String, BaseSymbolTable>();
	ClassLoader fClassLoader;

	public SymbolTableSupplier(ClassLoader classLoader) {
		fClassLoader = classLoader;
	}

	@Override
	public BaseSymbolTable get(String id, ClassResolver classResolver)
			throws ModuleNotFoundException {
		if (!fSymbolTables.containsKey(id)) {
			LibrarySymbolTable lst = new LibrarySymbolTable(id, fClassLoader,
					this);
			fSymbolTables.put(id, lst);
			return lst;
		}
		return fSymbolTables.get(id);
	}

	public void put(String moduleId, BaseSymbolTable symbolTable) {
		fSymbolTables.put(moduleId, symbolTable);
	}

}
