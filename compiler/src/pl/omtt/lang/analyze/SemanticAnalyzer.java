package pl.omtt.lang.analyze;

import java.net.URI;

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.lang.model.ast.Program;

public class SemanticAnalyzer {
	ClassLoader fClassLoader;
	IProblemCollector fProblemCollector;

	public SemanticAnalyzer(ClassLoader classLoader,
			IProblemCollector problemCollector) {
		fClassLoader = classLoader;
		fProblemCollector = problemCollector;
	}

	public void run(URI source, Program program,
			ILibrarySymbolTableSupplier librarySymbolTableSupplier)
			throws SemanticException {
		createSymbolTable(source, program, librarySymbolTableSupplier);
	}

	private void createSymbolTable(URI source, Program program,
			ILibrarySymbolTableSupplier librarySymbolTableSupplier) {
		SymbolTableCreator symbolTableCreator;
		symbolTableCreator = new SymbolTableCreator(fClassLoader,
				librarySymbolTableSupplier, source, fProblemCollector);
		symbolTableCreator.run(program);
	}

}
