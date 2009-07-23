package pl.omtt.lang.code;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.lang.model.types.*;

public class LibraryBaseSymbolTable extends BaseSymbolTable {
	Class<?> fModuleClass;
	
	public LibraryBaseSymbolTable(String id, ClassLoader classLoader)
			throws TypeException, ModuleNotFoundException {
		super(id, classLoader);
		fModuleClass = getClassResolver().getLibrary(id);
		putModuleSymbols();
	}

	private void putModuleSymbols() {
		for (Method method : fModuleClass.getMethods())
			if (!Object.class.equals(method.getDeclaringClass()))
				putTemplateSymbol(method);
	}

	private void putTemplateSymbol(Method method) {
		IType type;
		try {
			type = typeFromMethod(method);
		} catch (TypeException e) {
			e.printStackTrace();
			return;
		}
		put(new Symbol(method.getName(), type));
		System.err.println("putting " + method.getName() + " of " + type);
	}

	private IType typeFromMethod(Method method) throws TypeException {
		Type rettype = method.getGenericReturnType();
		Type argtypes[] = method.getGenericParameterTypes();
		Annotation[][] argannot = method.getParameterAnnotations();

		if (void.class.equals(rettype) && argtypes.length == 1)
			return new StringDataType();
		else if (argtypes.length == 0)
			return ScalarType.fromType(rettype);

		FunctionType ftype = new FunctionType();
		int i = 0;
		if (void.class.equals(rettype)) {
			ftype.setReturnType(new StringDataType());
			i++;
		} else {
			ftype.setReturnType(typeFromParameter(rettype, method
					.getAnnotations()));
		}
		for (; i < argtypes.length; i++) {
			ftype.putArgument(null, typeFromParameter(argtypes[i], argannot[i]),
					false);
		}
		return ftype;
	}

	private IType typeFromParameter(Type type, Annotation[] annotations) throws TypeException {
		if (Object.class.equals(type))
			return new AnyType();
		return ScalarType.fromType(type);
	}
}
