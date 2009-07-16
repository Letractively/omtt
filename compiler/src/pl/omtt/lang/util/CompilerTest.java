package pl.omtt.lang.util;

import java.util.ArrayList;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CompilerTest {
	public static void main(String[] args) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<JavaFileObject>();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				diagnosticsCollector, null, null);
		String path = "/home/endrju/.workspace/OMTT Editor/src/org/ot/lang/tools/";
		List<String> files = new ArrayList<String>();
		files.add(path + "ClassA.java");
		Iterable<? extends JavaFileObject> fileObjects = fileManager
				.getJavaFileObjectsFromStrings(files);
		CompilationTask task = compiler.getTask(null, fileManager, diagnosticsCollector,
				null, null, fileObjects);
		Boolean result = task.call();
		List<Diagnostic<? extends JavaFileObject>> diagnostics = diagnosticsCollector
				.getDiagnostics();
		for (Diagnostic<? extends JavaFileObject> d : diagnostics) {
			System.err.println(d);
		}
		if (result == true) {
			System.out.println("Compilation has succeeded");
		} else {
			System.out.println("Compilation fails.");
		}
	}
}
