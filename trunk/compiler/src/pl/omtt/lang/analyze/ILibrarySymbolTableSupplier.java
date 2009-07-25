package pl.omtt.lang.analyze;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.code.ClassResolver;

public interface ILibrarySymbolTableSupplier {
	SymbolTable get(String id, ClassResolver classResolver)
			throws ModuleNotFoundException;
}
