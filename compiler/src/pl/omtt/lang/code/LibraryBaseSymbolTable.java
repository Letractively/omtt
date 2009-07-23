package pl.omtt.lang.code;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.lang.model.types.*;
import pl.omtt.lang.symboltable.BaseSymbolTable;
import pl.omtt.lang.symboltable.Symbol;

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
		final int starti;
		if (void.class.equals(rettype)) {
			ftype.setReturnType(new StringDataType());
			starti = 1;
		} else {
			ftype.setReturnType(CommonType.fromType(rettype));
			starti = 0;
		}

		for (int i = starti; i < argtypes.length; i++) {
			String name = null;
			boolean optional = false;
			
			for (Annotation ann : argannot[i]) {
				if (Optional.class.equals(ann.annotationType()))
					optional = true;
				if (Name.class.equals(ann.annotationType()))
					name = ((Name)ann).value();
			}			

			ftype.putArgument(name, CommonType.fromType(argtypes[i]), optional);
		}
		
		String typestr;
		try {
			typestr = method.getAnnotation(pl.omtt.core.functions.Type.class).value();
		} catch (NullPointerException e) {
			typestr = null;
		}
		
		if (typestr != null) {
//			TypeStringParser p = new TypeStringParser(typestr);
			System.err.println(typestr);
		}

		return ftype;
	}
}
