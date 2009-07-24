package pl.omtt.lang.symboltable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.antlr.runtime.tree.Tree;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.lang.model.types.*;
import pl.omtt.lang.model.types.FunctionType.Argument;
import pl.omtt.lang.util.TypeStringParser;

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
					name = ((Name) ann).value();
			}

			ftype.putArgument(name, CommonType.fromType(argtypes[i]), optional);
		}

		String typestr;
		try {
			typestr = method.getAnnotation(pl.omtt.core.functions.Type.class)
					.value();
		} catch (NullPointerException e) {
			typestr = null;
		}

		if (typestr != null) {
			try {
				Tree typetree = TypeStringParser.parse(typestr);
				reconcile(ftype, typetree);
			} catch (Exception e) {
				e.printStackTrace();
				return ftype;
			}
		}

		ftype.freeze();
		return ftype;
	}

	private IType reconcile(IType type, Tree typetree) throws Exception {
		if (type.isGeneric()) {
			throw new UnsupportedOperationException();
		} else if (!type.isFunction()) {
			if (typetree.getType() != TypeStringParser.SCALAR)
				throw new Exception(
						"annotated type and method signature not suit");
			if (typetree.getChildCount() > 1
					&& typetree.getChild(1).getType() == TypeStringParser.GENERIC) {
				int iid = Integer.parseInt(typetree.getChild(1).getChild(0)
						.getText());
				GenericType gtype = new GenericType(type, iid);
				TypeUnifier.preserveAttributes(gtype, type);
				return gtype;
			}
		} else {
			if (typetree.getType() != TypeStringParser.FUNCTION)
				throw new Exception(
						"annotated type and method signature not suit");
			FunctionType ftype = (FunctionType) type;
			ftype.setReturnType(reconcile(ftype.getReturnType(), typetree
					.getChild(0)));
			for (int i = 1; i < typetree.getChildCount(); i++) {
				Argument a = ftype.getArgument(i - 1);
				Tree argtree = typetree.getChild(i);
				if (argtree.getChildCount() > 1
						&& argtree.getChild(1).getType() == TypeStringParser.OPTIONAL)
					a.optional = true;
				a.type = reconcile(a.type, argtree.getChild(0));
			}
		}
		return type;
	}
}
