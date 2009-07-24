package pl.omtt.lang.model.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		a.name = name;
		a.type = type;
		a.optional = optional;
		fArguments.add(a);
	}

	private boolean existsOptionalArgument() {
		for (Argument a : fArguments)
			if (a.optional)
				return true;
		return false;
	}

	public int getArgumentPosition(String targetName) {
		int i;
		for (i = 0; i < fArguments.size(); i++)
			if (targetName.equals(fArguments.get(i).name))
				return i;
		return -1;
	}

	public class Argument {
		public String name;
		public IType type;
		public boolean optional = false;
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
			a.type = freezeArgument(a.type, genericsCount);

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
			if (generics.contains(a.type))
				a.type = ((GenericType) a.type.getEffective()).toLowerBound();
			if (a.type.isFunction())
				((FunctionType) a.type.getEffectiveLowerBound())
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
				if (!ft.fArguments.get(i).type
						.isSubtypeOf(fArguments.get(i).type))
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
				target.putArgument(a.name, createTemplate(a.type, generics),
						a.optional);
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

	@Override
	public String singleToString() {
		StringBuffer buf = new StringBuffer();
		buf.append("(");
		for (Argument a : fArguments) {
			if (a.optional)
				buf.append("~");
			buf.append(a.type).append(" ");
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
			if (a.optional)
				buf.append("~");
			buf.append(a.type.toEssentialString()).append(" ");
		}
		buf.append("-> ").append(fReturnType.toEssentialString());
		buf.append(")");
		return buf.toString();
	}
}
