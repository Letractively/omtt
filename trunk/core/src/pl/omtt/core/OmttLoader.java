package pl.omtt.core;

import java.lang.reflect.Method;

public class OmttLoader {
	final ClassLoader fClassLoader;

	public OmttLoader(ClassLoader classLoader) {
		fClassLoader = classLoader;
	}

	public Class<?> loadModuleClass(String id) throws ModuleNotFoundException {
		try {
			return fClassLoader.loadClass(getModuleClassName(id));
		} catch (ClassNotFoundException e) {
			throw new ModuleNotFoundException("module " + id + " not found");
		}
	}

	public Template loadTemplate(String id) throws TemplateNotFoundException,
			ModuleNotFoundException {
		int dotpos = id.lastIndexOf('.');
		if (dotpos < 0)
			throw new TemplateNotFoundException(
					"wrong template id, module name must be passed: " + id);

		String name = id.substring(dotpos + 1);
		Class<?> module = loadModuleClass(id.substring(0, dotpos));

		for (Method method : module.getMethods())
			if (method.getName().equals(name)) {
				return new Template(method, module);
			}

		throw new TemplateNotFoundException("template " + id + " not found");
	}

	public static String getModuleClassName(String id) {
		String pkgname, modname;
		int dotpos = id.lastIndexOf('.');
		if (dotpos > 0) {
			pkgname = id.substring(0, dotpos);
			modname = id.substring(dotpos + 1);
		} else {
			pkgname = Constants.OMTT_LOCAL_PACKAGE;
			modname = id;
		}
		final String className = modname.substring(0, 1).toUpperCase()
				+ modname.substring(1);

		if (Constants.OMTT_STDLIB_PREFIX.equals(pkgname))
			return Constants.OMTT_STDLIB_PACKAGE + "." + className;
		else
			return Constants.OMTT_TEMPLATE_PACKAGE + "." + pkgname + "."
					+ className;
	}

	public class Template {
		final public Method method;
		final public Class<?> module;

		protected Template(Method method, Class<?> module) {
			this.method = method;
			this.module = module;
		}
	}
}
