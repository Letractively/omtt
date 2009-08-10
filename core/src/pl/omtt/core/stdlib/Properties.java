package pl.omtt.core.stdlib;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import pl.omtt.core.annotations.OmttModule;

@OmttModule
public class Properties {
	public static Object $(Object object, String property) {
		return retrieveProperty(object, property, false);
	}
	
	@SuppressWarnings("unchecked")
	public static Collection<Object> $seq(Object object, String property) {
		return (Collection)retrieveProperty(object, property, true);
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> $attrs(Object o) {
		List<String> attrs = new ArrayList<String>();
		if (o instanceof Map) {
			for (Object key : ((Map) o).keySet())
				if (key instanceof String)
					attrs.add((String)key);
		} else {
			for (Method m : o.getClass().getMethods()) {
				if (Object.class.equals(m.getDeclaringClass()))
					continue;
				if (m.getParameterTypes().length > 0)
					continue;
				final int modifiers = m.getModifiers();
				if (!Modifier.isPublic(modifiers)) 
					continue;
				final String name = m.getName();
				if (name.startsWith("get") && name.length() > 3)
					attrs.add(name.substring(3,4).toLowerCase() + name.substring(4));
				else if (name.startsWith("is") && name.length() > 4)
					attrs.add(name.substring(2,3).toLowerCase() + name.substring(3));
			}
		}
		return attrs;
	}
	
	@SuppressWarnings("unchecked")
	private static Object retrieveProperty(Object o, String property,
			boolean collection) {
		if (o == null || property == null)
			return null;
		
		Object res;
		if (o instanceof Map) {
			res = ((Map) o).get(property);
		} else {
			Method m = reflectPropertyMethod(o, property);
			if (m == null)
				res = null;
			try {
				res = m.invoke(o);
			} catch (Throwable e) {
				res = null;
			}
		}
		if (collection) {
			if (res instanceof Collection)
				return res;
			else {
				List list = new ArrayList();
				if (res == null)
					return list;
				else {
					list.add(res);
					return list;
				}
			}
		} else {
			if (res == null || res instanceof Collection)
				return null;
			else
				return res;
		}
	}

	private static Method reflectPropertyMethod(Object o, String name) {
		Class<?> clazz = o.getClass();
		String ufirst = name.substring(0,1).toUpperCase() + name.substring(1);
		try {
			return clazz.getMethod("get" + ufirst);
		} catch (Throwable e) {
		}
		try {
			return clazz.getMethod("is" + ufirst);
		} catch (Throwable e) {
		}
		return null;
	}
}
