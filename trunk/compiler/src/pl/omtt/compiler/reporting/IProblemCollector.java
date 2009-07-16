package pl.omtt.compiler.reporting;

import java.net.URI;

import pl.omtt.lang.model.types.TypeException;

public interface IProblemCollector extends IAntlrProblemCollector {

	public void reportError(URI omttSourceURI, String message);

	public void reportError(String path, Exception e);
	public void reportError(URI path, Exception e);

	public void reportError(String path, TypeException e);
	public void reportError(URI path, TypeException e);

	public boolean errors();
}
