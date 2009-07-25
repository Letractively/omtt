package pl.omtt.compiler.reporting;

import java.net.URI;

import pl.omtt.lang.analyze.SemanticException;

public interface IProblemCollector extends IAntlrProblemCollector {

	public void reportError(URI omttSourceURI, String message);

	public void reportError(String path, Exception e);
	public void reportError(URI path, Exception e);

	public void reportError(String path, SemanticException e);
	public void reportError(URI path, SemanticException e);

	public boolean errors();
	public int numberOfErrors();
}
