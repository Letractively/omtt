package pl.omtt.caller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


import pl.omtt.core.Constants;
import pl.omtt.core.stdlib.TextBuffer;

public class OmttCaller {
	public String call(String name, Object... args) {
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

	public Object callForObject(String name, Object... args)
			throws ModuleNotFoundException, TemplateNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Template tpl = resolveTemplate(name);
		// Object module = tpl.module.newInstance();

		return invokeTemplate(tpl, args);
	}

	protected Object invokeTemplate(Template tpl, Object... args)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (isVoid(tpl.method.getReturnType())) {
			TextBuffer buf = new TextBuffer ();
			List<Object> arglist = new ArrayList<Object> ();
			arglist.add(buf);
			for (Object arg : args)
				arglist.add(arg);
			tpl.method.invoke(null, arglist.toArray());
			return buf;
		} else {
			System.out.println("invokin" + tpl.method.getReturnType());
			return tpl.method.invoke(null, args);
		}
	}
	
	private boolean isVoid (Class<?> cls) {
		return cls.equals(Void.class) || cls.equals(void.class);
	}

	protected Template resolveTemplate(String name) throws ModuleNotFoundException,
			TemplateNotFoundException {
		int lastDot;
		String pkgName = null, moduleName = null, tplName = name;

		if ((lastDot = name.lastIndexOf('.')) > 0) {
			moduleName = tplName.substring(0, lastDot);
			tplName = tplName.substring(lastDot + 1);

			if ((lastDot = moduleName.lastIndexOf('.')) > 0) {
				pkgName = moduleName.substring(0, lastDot);
				moduleName = moduleName.substring(lastDot + 1);
			} else {
				pkgName = "local";
			}
		}

		String className = Constants.OMTT_TEMPLATE_PACKAGE + ".";
		if (pkgName != null)
			className += pkgName + ".";
		className += upperFirst(moduleName);

		Class<?> module;
		try {
			module = ClassLoader.getSystemClassLoader().loadClass(className);
		} catch (ClassNotFoundException e) {
			throw new ModuleNotFoundException("Module " + moduleName
					+ " not found in package " + pkgName);
		}

		for (Method method : module.getMethods())
			if (method.getName().equals(tplName)) {
				Template tpl = new Template();
				tpl.method = method;
				tpl.module = module;
				return tpl;
			}

		throw new TemplateNotFoundException("Template " + tplName
				+ " not found in module " + pkgName + "." + moduleName);
	}

	private String upperFirst(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	protected class Template {
		Method method;
		Class<?> module;
	}
}
