package pl.omtt.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.omtt.core.Constants;
import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.ClassResolver;
import pl.omtt.lang.analyze.ILibrarySymbolTableSupplier;
import pl.omtt.lang.analyze.LibrarySymbolTable;

public class SymbolTableSupplier implements ILibrarySymbolTableSupplier {
	Map<String, BaseSymbolTable> fSymbolTables = new HashMap<String, BaseSymbolTable>();
	ClassLoader fClassLoader;
	List<BaseSymbolTable> fStdlibsInstances = new ArrayList<BaseSymbolTable>();

	public SymbolTableSupplier(ClassLoader classLoader) {
		fClassLoader = classLoader;
		for (String stdlibModule : Constants.OMTT_STDLIB_MODULES)
			try {
				fStdlibsInstances.add(new LibrarySymbolTable(
						Constants.OMTT_STDLIB_PREFIX + "." + stdlibModule,
						classLoader, this));
			} catch (ModuleNotFoundException e) {
				e.printStackTrace();
			}
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

	@Override
	public Collection<BaseSymbolTable> standardLibraries() {
		return fStdlibsInstances;
	}
}
