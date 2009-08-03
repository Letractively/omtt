package pl.omtt.caller;

import java.lang.reflect.InvocationTargetException;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.OmttLoader;
import pl.omtt.core.TemplateNotFoundException;
import pl.omtt.core.Template;

public class OmttCaller {
	public static Object call(String name, Object... args) {
		try {
			return run(name, args);
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
		} catch (InvocationTargetException e) {
			throw new TemplateCallError(e);
		} catch (SecurityException e) {
			throw new TemplateCallError(e);
		} catch (NoSuchFieldException e) {
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
			SecurityException, NoSuchFieldException {

		Template tpl = new OmttLoader(ClassLoader.getSystemClassLoader())
				.loadTemplate(name);
		return tpl.run(args);
	}
}
