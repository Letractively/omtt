package pl.omtt.compiler.reporting;

public class PrintProblemCollector extends AbstractProblemCollector {
	@Override
	protected void collect(Problem problem) {
		System.err.println(problem);
	}
}
