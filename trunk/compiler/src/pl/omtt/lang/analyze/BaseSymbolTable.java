package pl.omtt.lang.analyze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.code.ClassResolver;
import pl.omtt.lang.model.types.TypeException;

public class BaseSymbolTable extends SymbolTable {
	final String fId;

	ClassResolver fClassResolver;
	List<BaseSymbolTable> fImportedLibraries = new ArrayList<BaseSymbolTable>();
	ILibrarySymbolTableSupplier fLibrarySTSupplier;
	
	Set<String> fOuterReferences;

	public BaseSymbolTable(String id, ClassLoader classLoader,
			ILibrarySymbolTableSupplier librarySTSupplier) {
		super();
		fId = id;
		fClassResolver = new ClassResolver(classLoader);
		fLibrarySTSupplier = librarySTSupplier;
	}

	public String getId() {
		return fId;
	}

	@Override
	public BaseSymbolTable getBase() {
		return this;
	}

	public ClassResolver getClassResolver() {
		return fClassResolver;
	}

	public void collectReferences () {
		fOuterReferences = new HashSet<String> ();
	}
	
	public Set<String> retrieveReferences () {
		Set<String> references = fOuterReferences;
		fOuterReferences = null;
		return references;
	}
	
	@Override
	public Symbol find(String name) {
		Symbol s = super.find(name);
		if (s != null)
			return s;
		for (int i = fImportedLibraries.size() - 1; i >= 0; i--) {
			BaseSymbolTable libraryST = fImportedLibraries.get(i);
			s = libraryST.find(name);
			if (s != null) {
				if (fOuterReferences != null)
					fOuterReferences.add(libraryST.getId() + "::" + name);
				return s;
			}
		}
		return null;
	}

	public void importLibrary(String id, String namespace) throws TypeException {
		id = getLibraryFullId(id);
		try {
			fImportedLibraries.add(fLibrarySTSupplier.get(id, fClassResolver));
		} catch (ModuleNotFoundException e) {
			throw new TypeException(e);
		}
	}

	public String getLibraryFullId(String id) {
		if (id.indexOf('.') < 0)
			id = getPackageId() + "." + id;
		return id;
	}
	
	private String getPackageId() {
		final int dotpos = fId.lastIndexOf('.');
		if (dotpos < 0)
			return null;
		else
			return fId.substring(0, dotpos);
	}
}
