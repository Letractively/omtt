package pl.omtt.lang.symboltable;

import java.util.ArrayList;
import java.util.List;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.code.ClassResolver;
import pl.omtt.lang.model.types.TypeException;

public class BaseSymbolTable extends SymbolTable {
	final String fId;

	ClassResolver fClassResolver;
	List<SymbolTable> fImportedLibraries = new ArrayList<SymbolTable>();

	public BaseSymbolTable(String id, ClassLoader classLoader) {
		super();
		fId = id;
		fClassResolver = new ClassResolver(classLoader);
	}

	public String getId () {
		return fId;
	}
	
	@Override
	public BaseSymbolTable getBase() {
		return this;
	}

	public ClassResolver getClassResolver() {
		return fClassResolver;
	}

	@Override
	public Symbol find (String name) {
		Symbol s = super.find(name);
		if (s != null)
			return s;
		for(int i = fImportedLibraries.size() - 1; i >= 0; i--) {
			s = fImportedLibraries.get(i).find(name);
			if (s != null)
				return s;
		}
		return null;
	}
	
	public void importLibrary(String id, String namespace) throws TypeException {
		try {
			fImportedLibraries.add(new LibraryBaseSymbolTable(id,
					fClassResolver.getClassLoader()));
		} catch (ModuleNotFoundException e) {
			e.printStackTrace();
		}
	}
}
