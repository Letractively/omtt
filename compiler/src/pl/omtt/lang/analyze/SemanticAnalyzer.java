package pl.omtt.lang.analyze;

import java.net.URI;

import org.antlr.runtime.tree.Tree;

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.lang.model.ast.Program;
import pl.omtt.lang.model.ast.UseDeclaration;

public class SemanticAnalyzer {
	ClassLoader fClassLoader;
	IProblemCollector fProblemCollector;
	boolean fCollectLibraryReferences;

	public SemanticAnalyzer(ClassLoader classLoader,
			IProblemCollector problemCollector) {
		fClassLoader = classLoader;
		fProblemCollector = problemCollector;
	}

	public void setCollectLibraryReferences(boolean collectLibraryReferences) {
		fCollectLibraryReferences = collectLibraryReferences;
	}

	public boolean run(URI source, Program program,
			ILibrarySymbolTableSupplier librarySymbolTableSupplier) {
		return createSymbolTable(source, program, librarySymbolTableSupplier);
	}

	private boolean createSymbolTable(URI source, Program program,
			ILibrarySymbolTableSupplier librarySymbolTableSupplier) {
		SymbolTableCreator symbolTableCreator;
		symbolTableCreator = new SymbolTableCreator(fClassLoader,
				librarySymbolTableSupplier, source, fProblemCollector,
				fCollectLibraryReferences);
		symbolTableCreator.run(program);

		if (fCollectLibraryReferences) {
			Tree usenode = program.getUsesNode();
			BaseSymbolTable st = program.getSymbolTable();
			if (st == null)
				return false;
			if (usenode != null)
				for (int i = 0; i < usenode.getChildCount(); i++) {
					UseDeclaration ud = (UseDeclaration) usenode.getChild(i);
					String libid = st.getLibraryFullId(ud.getUseId());
					st.fOuterReferences.add(libid);
					if (symbolTableCreator.fErrors)
						st.fOuterReferences.add(libid + "::_");
				}
		}
		return !symbolTableCreator.fErrors;
	}
}
