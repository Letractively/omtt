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
import pl.omtt.lang.code.CodeGeneratorVisitor;
import pl.omtt.lang.code.OmttJavaSource;
import pl.omtt.lang.code.SymbolTableCreator;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.nodes.Program;
import pl.omtt.util.stream.FileEnrichedStream;

public class OmttCompilationTask {
	final OmttCompiler fCompiler;
	final List<URI> fSources;
	final URI fTargetPath;
	final List<URI> fClassPath;

	int fState;
	final ClassLoader fClassLoader;
	IProblemCollector fProblemCollector;

	final Map<URI, Program> fTrees = new HashMap<URI, Program>();
	final Map<URI, OmttJavaSource> fJavaSources = new HashMap<URI, OmttJavaSource>();

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

	public void compile() {
		compile(STATE_FINISH);
	}

	public void buildTree() {
		compile(STATE_SYMBOL_TABLE);
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

		while (fState < level && fState < STATE_FINISH)
			switch (fState) {
			case STATE_START:
				// parsing
				fState++;
				for (URI source : fSources) {
					parse(source);
					if (fState == STATE_FATAL)
						return false;
				}
				verifyState();
				break;
			case STATE_TREE:
				// creating symbol table
				fState++;
				for (URI source : fSources) {
					buildSymbolTable(source);
					if (fState == STATE_FATAL)
						return false;
				}
				verifyState();
				break;
			case STATE_SYMBOL_TABLE:
				// generating code
				fState++;
				for (URI source : fSources) {
					generateCode(source);
					if (fState == STATE_FATAL)
						return false;
				}
				verifyState();
				break;
			case STATE_JAVA_CODE:
				// compile java to byte code
				compileJava();
				verifyState();
			default:
				fState++;
			}

		return true;
	}

	private void verifyState() {
		if (fState <= STATE_FINISH && fProblemCollector.errors())
			fState = STATE_ERROR;
	}

	protected void parse(URI uri) {
		// lexing phase
		CharStream input;
		try {
			input = new FileEnrichedStream(uri);
		} catch (FileNotFoundException e) {
			fProblemCollector.reportError(uri, e);
			fState = STATE_FATAL;
			return;
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
			fProblemCollector.reportError(uri, e);
			return;
		}
	}

	protected void buildSymbolTable(URI source) {
		SymbolTableCreator stCreator = new SymbolTableCreator(fClassLoader,
				source, fProblemCollector);
		stCreator.run(fTrees.get(source));
	}

	protected void generateCode(URI source) {
		CodeGeneratorVisitor codeGenerator = new CodeGeneratorVisitor(source);
		codeGenerator.run(fTrees.get(source));
		fJavaSources.put(source, codeGenerator.getJavaSource());
	}

	protected void compileJava() {
		if (fJavaSources.isEmpty())
			return;

		JavaCompiler compiler = fCompiler.getJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<JavaFileObject>();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				diagnosticsCollector, null, null);

		final List<String> options = fCompiler.getJavaCompilerOptions(
				fTargetPath, fClassPath);
		CompilationTask task = compiler.getTask(null, fileManager,
				diagnosticsCollector, options, null, fJavaSources.values());
		task.call();

		for (Diagnostic<? extends JavaFileObject> d : diagnosticsCollector
				.getDiagnostics())
			if (d.getSource() instanceof OmttJavaSource) {
				URI omttSourceURI = ((OmttJavaSource) d.getSource())
						.getOtSourceURI();
				fProblemCollector.reportError(omttSourceURI, d.getMessage(Locale
						.getDefault()));
			}
	}

	public final int STATE_START = 0;
	public final int STATE_TREE = 1;
	public final int STATE_SYMBOL_TABLE = 2;
	public final int STATE_JAVA_CODE = 3;
	public final int STATE_FINISH = 4;

	public final int STATE_ERROR = 5;
	public final int STATE_FATAL = 6;
}
