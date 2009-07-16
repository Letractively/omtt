package pl.omtt.lang.code;

import pl.omtt.lang.model.types.TypeException;

public class BaseSymbolTable extends SymbolTable {
	ClassResolver fClassResolver;

	public BaseSymbolTable(ClassLoader fClassLoader) {
		super();
		fClassResolver = new ClassResolver(fClassLoader);
	}

	@Override
	public BaseSymbolTable getBase() {
		return this;
	}

	public ClassResolver getClassResolver() {
		return fClassResolver;
	}

	public void importLibrary(String id, String namespace) throws TypeException {
		try {
			Class<?> library = getClassResolver().getLibrary(id);
			System.err.println(library);
		} catch (ClassNotFoundException e) {
			throw new TypeException ("module " + id + " not found");
		}
	}
}
