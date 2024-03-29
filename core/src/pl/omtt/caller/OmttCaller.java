package pl.omtt.caller;

import java.lang.reflect.InvocationTargetException;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.OmttLoader;
import pl.omtt.core.TemplateNotFoundException;
import pl.omtt.core.Template;
import pl.omtt.core.stdlib.NoSuitableTemplateException;

public class OmttCaller {
	public static Object call(String name, Object... args) {
		try {
			return run(name, args);
		} catch (InvocationTargetException e) {
			Throwable cause = e.getCause();
			if (cause instanceof NoSuitableTemplateException)
				return null;
			throw new TemplateCallError(cause);
		} catch (ModuleNotFoundException e) {
			throw new TemplateCallError(e);
		} catch (TemplateNotFoundException e) {
			throw new TemplateCallError(e);
		} catch (IllegalArgumentException e) {
			throw new TemplateCallError(e);
		} catch (InstantiationException e) {
			throw new TemplateCallError(e);
		} catch (IllegalAccessException e) {
			throw new TemplateCallError(e);
		} catch (SecurityException e) {
			throw new TemplateCallError(e);
		}
	}

	public static void print (String name, Object... args) {
		System.out.println(call(name, args));
	}
	
	private static Object run(String name, Object... args)
			throws ModuleNotFoundException, TemplateNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			SecurityException {

		Template tpl = new OmttLoader(ClassLoader.getSystemClassLoader())
				.loadTemplate(name);
		return tpl.run(args);
	}
}
