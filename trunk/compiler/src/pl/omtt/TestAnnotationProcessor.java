package pl.omtt;

import javax.annotation.processing.*;
import static  javax.lang.model.SourceVersion.*;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;

import java.util.Set;

@SupportedAnnotationTypes("*")	// Process all annotations
@SupportedSourceVersion(RELEASE_6)
public class TestAnnotationProcessor extends AbstractProcessor {
    public boolean process(Set<? extends TypeElement> annotations,
			   RoundEnvironment roundEnv) {
	if (!roundEnv.processingOver())
	    processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Hello world!");
	return false; // Don't claim any annotations
    }
}
