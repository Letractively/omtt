package pl.omtt.compiler.reporting;

import java.net.URI;
import java.net.URISyntaxException;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;

import pl.omtt.lang.model.types.TypeException;

public abstract class AbstractProblemCollector implements IProblemCollector {

	int fProblemLevel = NO_PROBLEMS;

	public void reportError(URI uri, String message) {
		collect(Problem.fromMessage(Problem.ERROR, uri, message));
	}
	
	public void reportError(String path, Exception e) {
		URI uri = null;
		try {
			uri = new URI(path);
		} catch (URISyntaxException urie) {
			urie.printStackTrace();
			return;
		}
		reportError(uri, e);
	}

	public void reportError(URI uri, Exception e) {
		report(Problem.fromException(Problem.ERROR, uri, e));
	}

	public void reportError(String path, TypeException e) {
		URI uri = null;
		try {
			uri = new URI(path);
		} catch (URISyntaxException urie) {
			urie.printStackTrace();
			return;
		}
		reportError(uri, e);
	}

	public void reportError(URI uri, TypeException e) {
		report(Problem.fromTypeException(Problem.ERROR, uri, e));
	}

	@Override
	public void reportError(URI uri, RecognitionException e, String message) {
		report(Problem.fromRecognitionException(Problem.ERROR, uri, e, message));
	}

	@Override
	public void reportError(URI uri, RecognitionException e) {
		reportError(uri, e, e.getMessage());
	}

	@Override
	public void reportError(String path, RecognitionException e, String message) {
		URI uri = null;
		try {
			uri = new URI(path);
		} catch (URISyntaxException urie) {
			urie.printStackTrace();
			return;
		}
		reportError(uri, e, message);
	}

	@Override
	public void reportError(URI uri, CommonToken token, String message) {
		report(Problem.fromCommonToken(Problem.ERROR, uri, message, token));
	}

	protected void report(Problem problem) {
		if (fProblemLevel > problem.fType)
			fProblemLevel = problem.fType;
		collect(problem);
	}

	public boolean errors() {
		return fProblemLevel <= Problem.ERROR;
	}

	abstract protected void collect(Problem problem);

	final static int NO_PROBLEMS = 0xffff;
}
