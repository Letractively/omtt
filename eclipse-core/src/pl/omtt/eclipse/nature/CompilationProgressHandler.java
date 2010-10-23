package pl.omtt.eclipse.nature;

import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;

import pl.omtt.compiler.ICompilationProgressHandler;

public class CompilationProgressHandler implements ICompilationProgressHandler {
	private IProgressMonitor fMonitor;
	private String fStage;

	public CompilationProgressHandler(IProgressMonitor monitor) {
		fMonitor = monitor;
	}

	@Override
	public boolean handleFile(URI source) {
		if(fMonitor.isCanceled())
			return false;

		fMonitor.subTask(stageName() + " file " + source.getPath());
		return true;
	}

	@Override
	public void handleStage(String stage) {
		fStage = stage;
		fMonitor.subTask(stageName());
	}

	private String stageName() {
		if(ICompilationProgressHandler.PARSING.equals(fStage))
			return "Parsing";
		else if(ICompilationProgressHandler.ANALYSIS.equals(fStage))
			return "Semantic analyzing";
		else if(ICompilationProgressHandler.COMPILATION.equals(fStage))
			return "Compiling";
		else
			return null;
	}
}
