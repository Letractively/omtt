package pl.omtt.lang.analyze;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import org.antlr.runtime.tree.Tree;

import pl.omtt.core.ModuleNotFoundException;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.lang.model.types.*;
import pl.omtt.lang.model.types.FunctionType.Argument;
import pl.omtt.lang.util.TypeStringParser;

public class LibrarySymbolTable extends BaseSymbolTable {
	Class<?> fModuleClass;

	public LibrarySymbolTable(String id, ClassLoader classLoader,
			ILibrarySymbolTableSupplier librarySTSupplier)
			throws ModuleNotFoundException {
		super(id, classLoader, librarySTSupplier);
		fModuleClass = getClassResolver().getLibrary(id);
		putModuleSymbols();
	}

	private void putModuleSymbols() {
		for (Method method : fModuleClass.getMethods())
			if (isModuleSymbol(method))
				putTemplateSymbol(method);
		for (Field field : fModuleClass.getFields()) {
			if (isModuleSymbol(field))
				putTemplateSymbol(field);
		}
	}

	private boolean isModuleSymbol(Member member) {
		if (Object.class.equals(member.getDeclaringClass()))
			return false;
		final int modifiers = member.getModifiers();
		if (!Modifier.isPublic(modifiers))
			return false;
		if (!Modifier.isStatic(modifiers))
			return false;
		return true;
	}

	private void putTemplateSymbol(Member method) {
		IType type = null;
		try {
			if (method instanceof Method)
				type = typeFromMethod((Method) method);
			if (method instanceof Field)
				type = typeFromField((Field) method);
		} catch (TypeException e) {
			e.printStackTrace();
			return;
		}
		if (type == null)
			return;
		if (type instanceof FunctionType
				&& ((FunctionType) type).isMultimethod())
			put(new MultiSymbol(method.getName(), (FunctionType) type));
		else
			put(new Symbol(method.getName(), type));
	}

	private IType typeFromField(Field field) {
		try {
			return JavaTypesAdapter.fromType(field.getGenericType());
		} catch (TypeException e) {
			e.printStackTrace();
			return null;
		}
	}

	private IType typeFromMethod(Method method) throws TypeException {
		Type rettype = method.getGenericReturnType();
		Type argtypes[] = method.getGenericParameterTypes();
		Annotation[][] argannot = method.getParameterAnnotations();

		if (void.class.equals(rettype) && argtypes.length == 1)
			return new StringDataType();
		else if (argtypes.length == 0)
			return JavaTypesAdapter.fromType(rettype);

		FunctionType ftype = new FunctionType();
		ftype.setNotNull();
		final int starti;
		if (void.class.equals(rettype)) {
			ftype.setReturnType(new StringDataType());
			starti = 1;
		} else {
			ftype.setReturnType(JavaTypesAdapter.fromType(rettype));
			starti = 0;
		}

		for (int i = starti; i < argtypes.length; i++) {
			String name = null;
			boolean optional = false;

			for (Annotation ann : argannot[i]) {
				if (ofType(ann, Optional.class))
					optional = true;
				if (ofType(ann, Name.class))
					name = getValue(ann);
			}

			ftype.putArgument(name, JavaTypesAdapter.fromType(argtypes[i]),
					optional);
		}

		String typestr = null;
		try {
			for (Annotation ann : method.getAnnotations()) {
				if (ofType(ann, pl.omtt.core.functions.Type.class))
					typestr = getValue(ann);
				if (ofType(ann, pl.omtt.core.annotations.OmttMultimethod.class))
					ftype.setMultimethod();
			}
		} catch (NullPointerException e) {
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
			if (typetree.getType() != TypeStringParser.SCALAR
					&& typetree.getType() != TypeStringParser.GENERIC_VAR)
				throw new Exception(
						"annotated type and method signature not suit");
			Integer iid = null;
			if (typetree.getChildCount() > 1
					&& typetree.getChild(1).getType() == TypeStringParser.GENERIC) {
				iid = Integer.parseInt(typetree.getChild(1).getChild(0)
						.getText());
			} else if (typetree.getType() == TypeStringParser.GENERIC_VAR) {
				iid = typetree.getText().hashCode();
			}
			if (iid != null) {
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

	private static boolean ofType(Annotation a,
			Class<? extends Annotation> clazz) {
		return clazz.getName().equals(a.annotationType().getName());
	}

	private static String getValue(Annotation a) {
		try {
			return (String) a.getClass().getMethod("value").invoke(a);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
