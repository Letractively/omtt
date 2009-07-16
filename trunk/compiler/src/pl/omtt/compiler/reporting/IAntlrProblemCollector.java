package pl.omtt.compiler.reporting;

import java.net.URI;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;

public interface IAntlrProblemCollector {
	public void reportError(URI uri, RecognitionException e);
	public void reportError(URI uri, RecognitionException e, String message);

	public void reportError(URI path, CommonToken token, String message);

	public void reportError(String path, RecognitionException e, String message);
}
