package pl.omtt.lang.analyze;

import java.util.Collection;

import pl.omtt.core.ModuleNotFoundException;

public interface ILibrarySymbolTableSupplier {
	BaseSymbolTable get(String id, ClassResolver classResolver)
			throws ModuleNotFoundException;

	Collection<BaseSymbolTable> standardLibraries();
}
