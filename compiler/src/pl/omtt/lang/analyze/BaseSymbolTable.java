package pl.omtt.lang.analyze;

import java.util.ArrayList;
import java.util.List;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.code.ClassResolver;
import pl.omtt.lang.model.types.TypeException;

public class BaseSymbolTable extends SymbolTable {
	final String fId;

	ClassResolver fClassResolver;
	List<SymbolTable> fImportedLibraries = new ArrayList<SymbolTable>();
	ILibrarySymbolTableSupplier fLibrarySTSupplier;

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

	@Override
	public Symbol find(String name) {
		Symbol s = super.find(name);
		if (s != null)
			return s;
		for (int i = fImportedLibraries.size() - 1; i >= 0; i--) {
			s = fImportedLibraries.get(i).find(name);
			if (s != null)
				return s;
		}
		return null;
	}

	public void importLibrary(String id, String namespace) throws TypeException {
		if (id.indexOf('.') < 0)
			id = getPackageId() + "." + id;

		try {
			fImportedLibraries.add(fLibrarySTSupplier.get(id, fClassResolver));
		} catch (ModuleNotFoundException e) {
			throw new TypeException(e);
		}
	}

	private String getPackageId() {
		final int dotpos = fId.indexOf('.');
		if (dotpos < 0)
			return null;
		else
			return fId.substring(0, dotpos);
	}
}
