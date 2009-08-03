package pl.omtt.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import pl.omtt.core.stdlib.TextBuffer;

public final class Template {
	final public Member method;
	final public Class<?> module;

	protected Template(Member method, Class<?> module) {
		this.method = method;
		this.module = module;
	}

	public Object run(Object... args) throws IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		if (method instanceof Method)
			return runMethod((Method) method, args);
		else if (method instanceof Field)
			return retrieveField((Field) method, args);
		throw new IllegalAccessException(
				"template run failed, this is a BUG, please report");
	}

	private static Object retrieveField(Field field, Object[] args)
			throws IllegalArgumentException, IllegalAccessException {
		if (args.length != 0)
			throw new IllegalArgumentException(
					"calling zero-argument method with " + args.length
							+ " arguments");
		return field.get(null);
	}

	private static Object runMethod(Method method, Object[] args)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (isVoid(method.getReturnType())) {
			TextBuffer buf = new TextBuffer();
			List<Object> arglist = new ArrayList<Object>();
			arglist.add(buf);
			for (Object arg : args)
				arglist.add(arg);
			method.invoke(null, arglist.toArray());
			return buf;
		} else {
			if (Debugging.DEBUG > 0)
				System.out.println("invokin" + method.getReturnType());
			return method.invoke(null, args);
		}
	}

	private static boolean isVoid(Class<?> cls) {
		return cls.equals(Void.class) || cls.equals(void.class);
	}
}
