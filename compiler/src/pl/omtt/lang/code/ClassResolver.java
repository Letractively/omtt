package pl.omtt.lang.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.omtt.core.Constants;

public class ClassResolver {
	Map<String, Class<?>> fClassMap = new HashMap<String, Class<?>>();
	List<String> fPackages = new ArrayList<String>();

	ClassLoader fLoader;

	public ClassResolver(ClassLoader classLoader) {
		fLoader = classLoader;
		fPackages.add("java.lang");
	}

	public Class<?> get(String name) throws ClassNotFoundException {
		if (fClassMap.containsKey(name))
			return fClassMap.get(name);

		for (String apackage : fPackages)
			try {
				return fLoader.loadClass(apackage + "." + name);
			} catch (ClassNotFoundException e) {
			}
		throw new ClassNotFoundException("class '" + name + "' not found");
	}

	public void putClass (String className) throws ClassNotFoundException {
		Class<?> aclass = fLoader.loadClass(className);
		fClassMap.put(aclass.getSimpleName(), aclass);
	}
	
	public void putPackage (String packageName) throws ClassNotFoundException {
		fPackages.add(packageName);
	}

	public Class<?> getLibrary(String id) throws ClassNotFoundException {
		return fLoader.loadClass(Constants.OMTT_TEMPLATE_PACKAGE + "." + id);
	}
}
