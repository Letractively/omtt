package pl.omtt.compiler;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.JavaCompiler.CompilationTask;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.compiler.reporting.PrintProblemCollector;
import pl.omtt.core.Debugging;
import pl.omtt.lang.analyze.SemanticAnalyzer;
import pl.omtt.lang.analyze.SemanticException;
import pl.omtt.lang.code.CodeGenerationException;
import pl.omtt.lang.code.CodeGenerator;
import pl.omtt.lang.code.OmttJavaSource;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.ast.Program;
import pl.omtt.util.stream.FileEnrichedStream;
import pl.omtt.util.stream.IEnrichedStream;

public class OmttCompilationTask {
	final OmttCompiler fCompiler;
	final List<URI> fSources;
	final URI fTargetPath;
	final List<URI> fClassPath;

	int fState;
	final ClassLoader fClassLoader;
	IProblemCollector fProblemCollector;
	boolean fCollectLibraryReferences;

	final Map<URI, Program> fTrees = new HashMap<URI, Program>();
	final Map<URI, OmttJavaSource> fJavaSources = new HashMap<URI, OmttJavaSource>();

	private Map<URI, IEnrichedStream> fSourceFileStreams;
	private ICompilationProgressHandler fProgressHandler;

	protected OmttCompilationTask(OmttCompiler compiler, List<URI> sources,
			URI targetPath, List<URI> classPath) {
		fCompiler = compiler;
		fSources = sources;
		fTargetPath = targetPath;

		fClassPath = classPath;
		fClassPath.add(fTargetPath);

		fState = STATE_START;
		fClassLoader = new URLClassLoader(getURLArray(classPath));
	}

	private URL[] getURLArray(List<URI> classPath) {
		URL[] urlCP = new URL[classPath.size()];
		for (int i = 0; i < classPath.size(); i++)
			try {
				urlCP[i] = classPath.get(i).toURL();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		return urlCP;
	}

	public void setProblemCollector(IProblemCollector problemCollector) {
		fProblemCollector = problemCollector;
	}

	public void setCompilationProgressHandler(ICompilationProgressHandler handler) {
		fProgressHandler = handler;
	}
	
	public void setCollectLibraryReferences(boolean collectLibraryReferences) {
		fCollectLibraryReferences = collectLibraryReferences;
	}

	/**
	 * Allows for optional supply of input OMTT file stream. When not set,
	 * compiler treats uri as path to the source file.
	 * 
	 * @param uri
	 *            identifier of source
	 * @param stream
	 *            source file stream
	 */
	public void setSourceStream(URI uri, IEnrichedStream stream) {
		if (fSourceFileStreams == null)
			fSourceFileStreams = new HashMap<URI, IEnrichedStream>();
		fSourceFileStreams.put(uri, stream);
	}

	public void compile() {
		compile(STATE_FINISH);
	}

	public void buildTree() {
		compile(STATE_ANALYZE);
	}

	public boolean errors() {
		return fState > STATE_FINISH;
	}

	public Program getTree(URI uri) {
		return fTrees.get(uri);
	}

	public OmttJavaSource getJavaCode(URI uri) {
		return fJavaSources.get(uri);
	}

	protected boolean compile(int level) {
		if (fProblemCollector == null)
			fProblemCollector = new PrintProblemCollector();

		final CompilationQueue queue = new CompilationQueue();
		if(fProgressHandler != null)
			fProgressHandler.handleStage(ICompilationProgressHandler.PARSING);
		for (URI source : fSources) {
			try {
				if(fProgressHandler != null)
					if(!fProgressHandler.handleFile(source))
						return false;
				if (parse(source)) {
					Program program = fTrees.get(source);
					program.setSourceURI(source);
					queue.add(source, program);
				}
			} catch (SemanticException se) {
				fProblemCollector.reportError(source, se);
				fState = STATE_ERROR;
			}
		}
		if (!(verifyState() > STATE_FINISH))
			fState++;

		try {
			queue.calculate();
		} catch (UseCycleException e) {
			fState = STATE_FATAL;
			fProblemCollector.reportError(e.fCauseURI, e);
			return false;
		}

		if(fProgressHandler != null)
			fProgressHandler.handleStage(ICompilationProgressHandler.ANALYSIS);
		SymbolTableSupplier symbolTableSupplier = new SymbolTableSupplier(
				fClassLoader);
		for (URI source : queue) {
			if(fProgressHandler != null)
				if(!fProgressHandler.handleFile(source))
					return false;
			if (level > STATE_TREE)
				if (!analyze(source, symbolTableSupplier))
					continue;
			if (level > STATE_ANALYZE)
				if (!generateCode(source))
					continue;
		}

		if (Debugging.DEBUG > 0)
			System.err.println("compiling: " + fJavaSources.keySet());
		if(fProgressHandler != null)
			fProgressHandler.handleStage(ICompilationProgressHandler.COMPILATION);
		if (level > STATE_JAVA_CODE) {
			compileJava();
			if (verifyState() > STATE_FINISH)
				return false;
		}

		fState = level;
		return true;
	}

	private int verifyState() {
		if (fState <= STATE_FINISH && fProblemCollector.errors())
			fState = STATE_ERROR;
		return fState;
	}

	protected boolean parse(URI uri) {
		// lexing phase
		CharStream input;
		if (fSourceFileStreams != null && fSourceFileStreams.containsKey(uri))
			input = fSourceFileStreams.get(uri);
		else
			try {
				input = new FileEnrichedStream(uri);
			} catch (FileNotFoundException e) {
				fProblemCollector.reportError(uri, e);
				fState = STATE_FATAL;
				return false;
			}
		OmttLexer lexer = new OmttLexer(input);
		lexer.connectProblemContainer(fProblemCollector);

		// parsing phase
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		OmttParser parser = new OmttParser(tokens);
		parser.connectProblemContainer(fProblemCollector);

		try {
			Program tree = parser.parse();
			fTrees.put(uri, tree);
		} catch (RecognitionException e) {
			e.printStackTrace();
			fProblemCollector.reportError(uri, e);
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			fProblemCollector.reportError(uri, e);
			return false;
		}
		return !(lexer.errorsOccured() || parser.errorsOccured());
	}

	protected boolean analyze(URI source,
			SymbolTableSupplier symbolTableSupplier) {
		SemanticAnalyzer analyzer = new SemanticAnalyzer(fClassLoader,
				fProblemCollector);
		analyzer.setCollectLibraryReferences(fCollectLibraryReferences);
		Program program = fTrees.get(source);
		boolean success = analyzer.run(source, program, symbolTableSupplier);
		symbolTableSupplier.put(program.getResourceId(), program
				.getSymbolTable());
		return success;
	}

	protected boolean generateCode(URI source) {
		CodeGenerator codeGenerator = new CodeGenerator(source);
		try {
			codeGenerator.generate(fTrees.get(source));
		} catch (CodeGenerationException e) {
			fProblemCollector.reportError(source, e);
			return false;
		}
		fJavaSources.put(source, codeGenerator.getJavaSource());
		
		if (Debugging.DEBUG > 1) {
			System.out.println("---" + source + ":");
			System.out.println(codeGenerator.getJavaSource().getCode());
			System.out.println();
		}
		
		return true;
	}

	protected boolean compileJava() {
		if (fJavaSources.isEmpty())
			return true;

		JavaCompiler compiler = fCompiler.getJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<JavaFileObject>();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				diagnosticsCollector, null, null);
		final List<String> options = fCompiler.getJavaCompilerOptions(
				fTargetPath, fClassPath);
		CompilationTask task = compiler.getTask(null, fileManager,
				diagnosticsCollector, options, null, fJavaSources.values());
		task.call();

		boolean success = true;
		for (Diagnostic<? extends JavaFileObject> d : diagnosticsCollector
				.getDiagnostics()) {
			if (d.getSource() instanceof OmttJavaSource) {
				URI omttSourceURI = ((OmttJavaSource) d.getSource())
						.getOtSourceURI();
				fProblemCollector.reportError(omttSourceURI, d
						.getMessage(Locale.getDefault()));
			}
			if (d.getKind() == Diagnostic.Kind.ERROR)
				success = false;
		}
		return success;
	}

	public final int STATE_START = 0;
	public final int STATE_TREE = 1;
	public final int STATE_ANALYZE = 2;
	public final int STATE_JAVA_CODE = 3;
	public final int STATE_FINISH = 4;

	public final int STATE_ERROR = 5;
	public final int STATE_FATAL = 6;
}
