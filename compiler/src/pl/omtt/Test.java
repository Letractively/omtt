package pl.omtt;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

import pl.omtt.compiler.OmttCompilationTask;
import pl.omtt.compiler.OmttCompiler;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.PrintTreeVisitor;
import pl.omtt.util.stream.FileEnrichedStream;

public class Test {
	enum ParseComponent {
		LEXER, PARSER, CODE
	};

	static final ParseComponent testComponent = ParseComponent.CODE;

	final static String DIR = "/home/endrju/runtime-EclipseApplication/OMTT%20Example%20Project";
	final static String FILE = DIR + "/templates/sample.omtt";

	public static void main(String[] args) {
		URI source, target, corejar;
		List<URI> classpath = new ArrayList<URI>();
		try {
			source = new URI("file:" + FILE);
			target = new URI("file:bin/");
			corejar = new URI("file:lib/omtt-core.jar");
			classpath.add(corejar);
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return;
		}

		if (testComponent == ParseComponent.LEXER) {
			printTokens(source);
			return;
		}

		OmttCompiler compiler = new OmttCompiler();
		compiler.setEnvorionmentDirectory(DIR + "/bin/");
		OmttCompilationTask task = compiler.getTask(source, target, classpath);

		try {
			if (testComponent == ParseComponent.PARSER)
				task.buildTree();
			else
				task.compile();
		} catch (Exception e) {
			System.out.println("---\nCompilation failed.");
			e.printStackTrace();
		}

		System.out.println("---");
		new PrintTreeVisitor().run(task.getTree(source));

		if (testComponent == ParseComponent.CODE) {
			System.out.println("---");
			System.out.println(task.getJavaCode(source).getCode());
		}
	}

	private static void printTokens(URI uri) {
		Token token;
		OmttLexer lexer = getLexer(uri);
		while ((token = lexer.nextToken()) != Token.EOF_TOKEN) {
			String txt = "Token" + "("
					+ (lexer.brackets.empty() ? "-" : lexer.brackets.peek())
					+ "): " + OmttParser.tokenNames[token.getType()]
					+ ": " + token.getText();

			if (token.getChannel() != OmttParser.HIDDEN)
				System.out.println(txt);
		}
	}

	private static OmttLexer getLexer(URI uri) {
		try {
			CharStream input = new FileEnrichedStream(uri);
			return new OmttLexer(input);
		} catch (FileNotFoundException e) {
			System.err.println(e);
			return null;
		}
	}
}
