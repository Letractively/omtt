package pl.omtt.lang.model.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FunctionType extends CommonType implements IType {
	IType fReturnType;
	List<Argument> fArguments = new ArrayList<Argument>();
	boolean fContext = false;
	boolean fFrozen = false;

	public FunctionType() {
		fReturnType = new TypePointer(new GenericType());
	}

	public void setContext(boolean context) {
		fContext = context;
	}

	public boolean isContext() {
		return fContext;
	}

	public IType getReturnType() {
		return fReturnType;
	}

	public void setReturnType(IType returnType) {
		fReturnType = returnType;
	}

	public int getArgumentLength() {
		return fArguments.size();
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
		Map<Integer, Integer> genericsCount = new HashMap<Integer, Integer>();
		freeze(genericsCount);
		Iterator<Map.Entry<Integer, Integer>> itor = genericsCount.entrySet()
				.iterator();
		while (itor.hasNext()) {
			Map.Entry<Integer, Integer> item = itor.next();
			if (item.getValue() > 1)
				itor.remove();
		}
		removeExcessiveGenerics(genericsCount.keySet());
	}

	private void freeze(Map<Integer, Integer> genericsCount) {
		if (fFrozen)
			return;

		fReturnType = freezeArgument(fReturnType, genericsCount);
		for (Argument a : fArguments)
			a.type = freezeArgument(a.type, genericsCount);

		fFrozen = true;
	}

	public IType freezeArgument(IType type, Map<Integer, Integer> genericsCount) {
		IType typeCopy = type.getEffective().dup();
		if (typeCopy.getEffectiveLowerBound() instanceof FunctionType) {
			((FunctionType) typeCopy.getEffectiveLowerBound())
					.freeze(genericsCount);
		}
		TypeUnifier.preserveAttributes(typeCopy, type);

		if (typeCopy.isGeneric()) {
			int iid = ((GenericType) typeCopy).fInstanceId;
			if (genericsCount.containsKey(iid))
				genericsCount.put(iid, genericsCount.get(iid) + 1);
			else
				genericsCount.put(iid, 1);
		}

		return typeCopy;
	}

	private void removeExcessiveGenerics(Set<Integer> generics) {
		if (fReturnType.isGeneric()
				&& generics.contains(((GenericType) fReturnType).fInstanceId))
			fReturnType = ((GenericType) fReturnType.getEffective())
					.toLowerBound();
		if (fReturnType.isFunction())
			((FunctionType) fReturnType.getEffectiveLowerBound())
					.removeExcessiveGenerics(generics);
		for (Argument a : fArguments) {
			if (a.type.isGeneric()
					&& generics.contains(((GenericType) a.type).fInstanceId))
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
			for (int i = 0; i < source.getArgumentLength(); i++) {
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
			TypePointer ptr;
			if (generics.containsKey(iid)) {
				ptr = new TypePointer(generics.get(iid));
			} else {
				GenericType dup = (GenericType) source.dup();
				dup.fInstanceId = dup.objectHashCode();
				ptr = new TypePointer(dup);
				generics.put(iid, ptr);
			}
			TypeUnifier.preserveAttributes(ptr, source);
			return ptr;
		} else {
			return type.getEffective();
		}
	}

	@Override
	public boolean essentiallyEquals(IType t) {
		if (t.getEffective() instanceof FunctionType)
			return equals(this, t.getEffective(),
					new HashMap<Integer, Integer>());
		return false;
	}

	private static boolean equals(IType a, IType b,
			Map<Integer, Integer> generics) {
		a = a.getEffective();
		b = b.getEffective();
		if (a.getEffective() instanceof FunctionType) {
			if (!(b.getEffective() instanceof FunctionType))
				return false;
			if (!CommonType.attributeEquals(a, b))
				return false;
			FunctionType funa = (FunctionType) a;
			FunctionType funb = (FunctionType) b;
			if (funa.getArgumentLength() != funb.getArgumentLength())
				return false;
			if (!equals(funa.getReturnType(), funb.getReturnType(), generics))
				return false;
			for (int i = 0; i < funa.getArgumentLength(); i++)
				if (!equals(funa.getArgument(i).type, funb.getArgument(i).type,
						generics))
					return false;
			return true;
		} else if (a.isGeneric()) {
			if (!b.isGeneric())
				return false;
			if (!CommonType.attributeEquals(a, b))
				return false;
			GenericType ga = (GenericType) a.getEffective();
			GenericType gb = (GenericType) b.getEffective();
			if (!equals(ga.fLowerBoundType, gb.fLowerBoundType, generics))
				return false;
			boolean presenta = generics.containsKey(ga.fInstanceId);
			boolean presentb = generics.containsKey(gb.fInstanceId);
			if (presenta && presentb) {
				return generics.get(ga.fInstanceId) == generics
						.get(gb.fInstanceId);
			} else if (!presenta && !presentb) {
				int id = generics.size();
				generics.put(ga.fInstanceId, id);
				generics.put(gb.fInstanceId, id);
				return true;
			}
			return false;
		} else {
			return a.equals(b);
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
