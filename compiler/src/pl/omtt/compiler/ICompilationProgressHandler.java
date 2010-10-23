package pl.omtt.compiler;

import java.net.URI;

public interface ICompilationProgressHandler {
	final String PARSING = "parsing";
	final String ANALYSIS = "analyze";
	final String COMPILATION = "compilation";

	void handleStage(String stage);

	boolean handleFile(URI source);
}
