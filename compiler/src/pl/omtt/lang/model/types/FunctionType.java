package pl.omtt.lang.model.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.omtt.core.funproto.Function;

public class FunctionType extends CommonType implements IType {
	IType fReturnType;
	List<Argument> fArguments = new ArrayList<Argument>();
	boolean fFrozen = false;

	public FunctionType() {
		fReturnType = new TypePointer(new GenericType());
	}

	public IType getReturnType() {
		return fReturnType;
	}

	public void setReturnType(IType returnType) {
		fReturnType = returnType;
	}

	public List<Argument> getArguments() {
		return fArguments;
	}

	public Argument getArgument(int i) {
		return fArguments.get(i);
	}

	public void putArgument(String name, IType type, boolean optional)
			throws TypeException {
		if (fArguments.isEmpty() && optional)
			throw new TypeException("first argument cannot be optional");
		if (!optional && existsOptionalArgument())
			throw new TypeException(
					"optional arguments must follow obligatory ones");

		Argument a = new Argument();
		a.fName = name;
		a.fType = type;
		a.fOptional = optional;
		fArguments.add(a);
	}

	private boolean existsOptionalArgument() {
		for (Argument a : fArguments)
			if (a.isOptional())
				return true;
		return false;
	}

	public int getArgumentPosition(String targetName) {
		int i;
		for (i = 0; i < fArguments.size(); i++)
			if (targetName.equals(fArguments.get(i).fName))
				return i;
		return -1;
	}

	public class Argument {
		String fName;
		IType fType;
		boolean fOptional = false;

		public String getName() {
			return fName;
		}

		public IType getType() {
			return fType;
		}

		public boolean isOptional() {
			return fOptional;
		}
	}

	@Override
	public void freeze() {
		Map<GenericType, Integer> genericsCount = new HashMap<GenericType, Integer>();
		freeze(genericsCount);
		for (GenericType generic : genericsCount.keySet()) {
			if (genericsCount.get(generic) > 1)
				genericsCount.remove(generic);
		}
		removeExcessiveGenerics(genericsCount.keySet());
	}

	private void freeze(Map<GenericType, Integer> genericsCount) {
		if (fFrozen)
			return;

		fReturnType = freezeArgument(fReturnType, genericsCount);
		for (Argument a : fArguments)
			a.fType = freezeArgument(a.fType, genericsCount);

		fFrozen = true;
	}

	public IType freezeArgument(IType type,
			Map<GenericType, Integer> genericsCount) {
		IType typeCopy = type.getEffective().dup();
		if (typeCopy.getEffectiveLowerBound() instanceof FunctionType) {
			((FunctionType) typeCopy.getEffectiveLowerBound())
					.freeze(genericsCount);
		}
		TypeUnifier.preserveAttributes(typeCopy, type);

		if (typeCopy.isGeneric()) {
			GenericType generic = (GenericType) (typeCopy);
			if (genericsCount.containsKey(generic))
				genericsCount.put(generic, genericsCount.get(generic) + 1);
			else
				genericsCount.put(generic, 1);
		}

		return typeCopy;
	}

	private void removeExcessiveGenerics(Set<GenericType> generics) {
		if (generics.contains(fReturnType))
			fReturnType = ((GenericType) fReturnType.getEffective())
					.toLowerBound();
		if (fReturnType.isFunction())
			((FunctionType) fReturnType.getEffectiveLowerBound())
					.removeExcessiveGenerics(generics);
		for (Argument a : fArguments) {
			if (generics.contains(a.fType))
				a.fType = ((GenericType) a.fType.getEffective()).toLowerBound();
			if (a.fType.isFunction())
				((FunctionType) a.fType.getEffectiveLowerBound())
						.removeExcessiveGenerics(generics);
		}
	}

	@Override
	public IType getEffective() {
		return this;
	}

	@Override
	public boolean isFrozen() {
		return fFrozen;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		type = type.getEffectiveLowerBound();
		if (type instanceof AnyType) {
			return true;
		} else if (type instanceof FunctionType) {
			FunctionType ft = (FunctionType) type;
			if (ft.fArguments.size() != fArguments.size())
				return false;
			if (!fReturnType.isSubtypeOf(ft.fReturnType))
				return false;
			for (int i = 0; i < fArguments.size(); i++)
				if (!ft.fArguments.get(i).fType
						.isSubtypeOf(fArguments.get(i).fType))
					return false;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Class<?> getAssociatedClass() {
		return null;
	}

	@Override
	public boolean isGeneral() {
		return false;
	}

	@Override
	public boolean isSingleData() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isNumeric() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return true;
	}

	public FunctionType createTemplate() {
		try {
			return (FunctionType) createTemplate(this,
					new HashMap<Integer, TypePointer>());
		} catch (TypeException e) {
			e.printStackTrace();
			return null;
		}
	}

	private IType createTemplate(IType type, Map<Integer, TypePointer> generics)
			throws TypeException {
		if (!type.isFrozen()) {
			return type;
		} else if (type.isFunction()) {
			FunctionType source = (FunctionType) type.getEffective();
			FunctionType target = new FunctionType();
			for (int i = 0; i < source.getArguments().size(); i++) {
				Argument a = source.getArgument(i);
				target.putArgument(a.getName(), createTemplate(a.getType(),
						generics), a.isOptional());
			}
			target.setReturnType(createTemplate(source.getReturnType(),
					generics));
			return target;
		} else if (type.isGeneric()) {
			GenericType source = (GenericType) type.getEffective();
			int iid = source.getInstanceId();
			if (generics.containsKey(iid)) {
				return new TypePointer(generics.get(iid));
			} else {
				TypePointer ptr = new TypePointer(source);
				generics.put(iid, ptr);
				return ptr;
			}
		} else {
			return type.getEffective();
		}
	}

	static public FunctionType fromParameterizedType(ParameterizedType ptype)
			throws TypeException {
		if (!(ptype.getRawType() instanceof Class<?>)
				|| !Function.class.isAssignableFrom((Class<?>) ptype
						.getRawType()))
			throw new UnsupportedOperationException(
					"FunctionType can be created only from pl.omtt.core.funproto.Function");
		Class<?> rawtype = (Class<?>) ptype.getRawType();
		Type[] params = ptype.getActualTypeArguments();

		FunctionType ftype = new FunctionType();
		int i = 0;
		if (rawtype.getSimpleName().startsWith("Data"))
			ftype.setReturnType(new StringDataType());
		else
			ftype.setReturnType(CommonType.fromType(params[i++]));

		for (; i < params.length; i++)
			ftype.putArgument(null, CommonType.fromType(params[i]), false);

		return ftype;
	}

	@Override
	public String singleToString() {
		StringBuffer buf = new StringBuffer();
		buf.append("(");
		for (Argument a : fArguments) {
			if (a.fOptional)
				buf.append("~");
			buf.append(a.fType).append(" ");
		}
		buf.append("-> ").append(fReturnType);
		buf.append(")");
		return buf.toString();
	}

	@Override
	String singleToEssentialString() {
		StringBuffer buf = new StringBuffer();
		buf.append("(");
		for (Argument a : fArguments) {
			if (a.fOptional)
				buf.append("~");
			buf.append(a.fType.toEssentialString()).append(" ");
		}
		buf.append("-> ").append(fReturnType.toEssentialString());
		buf.append(")");
		return buf.toString();
	}
}
