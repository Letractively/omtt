package pl.omtt.caller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import pl.omtt.core.Debugging;
import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.OmttLoader;
import pl.omtt.core.TemplateNotFoundException;
import pl.omtt.core.OmttLoader.Template;
import pl.omtt.core.stdlib.TextBuffer;

public class OmttCaller {
	public static String call(String name, Object... args) {
		try {
			return callForObject(name, args).toString();
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
		}
	}

	public static Object callForObject(String name, Object... args)
			throws ModuleNotFoundException, TemplateNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Template tpl = new OmttLoader(ClassLoader.getSystemClassLoader())
				.loadTemplate(name);
		// Object module = tpl.module.newInstance();

		return invokeTemplate(tpl, args);
	}

	protected static Object invokeTemplate(Template tpl, Object... args)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (isVoid(tpl.method.getReturnType())) {
			TextBuffer buf = new TextBuffer();
			List<Object> arglist = new ArrayList<Object>();
			arglist.add(buf);
			for (Object arg : args)
				arglist.add(arg);
			tpl.method.invoke(null, arglist.toArray());
			return buf;
		} else {
			if (Debugging.DEBUG > 0)
				System.out.println("invokin" + tpl.method.getReturnType());
			return tpl.method.invoke(null, args);
		}
	}

	private static boolean isVoid(Class<?> cls) {
		return cls.equals(Void.class) || cls.equals(void.class);
	}
}
