package pl.omtt.lang.analyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.TypeException;

public class BaseSymbolTable extends SymbolTable {
	final String fModuleId;

	ClassResolver fClassResolver;
	Map<String, List<BaseSymbolTable>> fImportedLibraries = new HashMap<String, List<BaseSymbolTable>>();
	ILibrarySymbolTableSupplier fLibrarySTSupplier;

	Set<String> fOuterReferences;

	public BaseSymbolTable(String moduleId, ClassLoader classLoader,
			ILibrarySymbolTableSupplier librarySTSupplier) {
		super();
		fModuleId = moduleId;
		fClassResolver = new ClassResolver(classLoader);
		fLibrarySTSupplier = librarySTSupplier;

		intstallStandardLibraries();
	}

	private List<BaseSymbolTable> ns(String ns) {
		if (!fImportedLibraries.containsKey(ns)) {
			List<BaseSymbolTable> list = new ArrayList<BaseSymbolTable>();
			fImportedLibraries.put(ns, list);
			return list;
		}
		return fImportedLibraries.get(ns);
	}

	private void intstallStandardLibraries() {
		ns(LOCAL_NS).addAll(fLibrarySTSupplier.standardLibraries());
	}

	public String getModuleId() {
		return fModuleId;
	}

	@Override
	public BaseSymbolTable getBase() {
		return this;
	}

	public ClassResolver getClassResolver() {
		return fClassResolver;
	}

	public void collectReferences() {
		fOuterReferences = new HashSet<String>();
	}

	public Set<String> retrieveReferences() {
		Set<String> references = fOuterReferences;
		fOuterReferences = null;
		return references;
	}

	@Override
	public Symbol find(String name, boolean recursively) {
		Symbol s = super.find(name, recursively);
		if (s != null || !recursively)
			return s;
		return find(name, LOCAL_NS);
	}

	public Symbol find(String name, String ns) {
		if (ns != null && !fImportedLibraries.containsKey(ns))
			return null;

		List<BaseSymbolTable> libraries = ns(ns);
		for (int i = libraries.size() - 1; i >= 0; i--) {
			BaseSymbolTable libraryST = libraries.get(i);
			Symbol s = libraryST.find(name);
			if (s != null) {
				if (fOuterReferences != null)
					fOuterReferences.add(libraryST.getModuleId() + "::" + name);
				return s;
			}
		}
		return null;
	}

	public void importLibrary(String id, String ns) throws TypeException {
		final BaseSymbolTable lst;
		id = getLibraryFullId(id);
		if (ns == null)
			ns = LOCAL_NS;
		try {
			lst = fLibrarySTSupplier.get(id, fClassResolver);
			ns(ns).add(lst);
		} catch (ModuleNotFoundException e) {
			throw new TypeException(e.getMessage());
		}

		if (LOCAL_NS.equals(ns))
			for (Symbol s : lst.getSymbols()) {
				if (!(s instanceof MultiSymbol))
					continue;
				if (fOuterReferences != null)
					fOuterReferences.add(id + "::" + s.getName());
				MultiSymbol ms = putMultimethod(s);
				ms.fGrowthPosition = 0;
			}
	}

	public MultiSymbol putMultimethod(Symbol s) throws TypeException {
		if (!(s.getType() instanceof FunctionType))
			throw new TypeException(s.getName()
					+ ": multimethod must be a function");
		final FunctionType ftype = (FunctionType) s.getType();

		if (fSymbolMap.containsKey(s.getName())) {
			Symbol ms = fSymbolMap.get(s.getName());
			if (!(ms instanceof MultiSymbol))
				throw new TypeException(
						s.getName()
								+ " is not compatible with previously declared function from package "
								+ s.getModuleId());
			((MultiSymbol) ms).addParticipant(s);
			return (MultiSymbol) ms;
		} else {
			MultiSymbol ms = new MultiSymbol(s.getName(), ftype);
			put(ms);
			ms.addParticipant(s);
			return ms;
		}
	}

	public String getLibraryFullId(String id) {
		if (id.indexOf('.') < 0)
			id = getPackageId() + "." + id;
		return id;
	}

	private String getPackageId() {
		final int dotpos = fModuleId.lastIndexOf('.');
		if (dotpos < 0)
			return null;
		else
			return fModuleId.substring(0, dotpos);
	}

	final static String LOCAL_NS = "%LOCAL_NS%";
}
