package pl.omtt.lang.model.types;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends CommonType implements IType {
	IType fReturnType;
	List<Argument> fArguments = new ArrayList<Argument>();
	boolean fFrozen = false;

	public FunctionType() {
		fReturnType = new FlexibleType();
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
		if (fFrozen)
			return;

		fReturnType = freezeArgument(fReturnType);
		for (Argument a : fArguments)
			a.fType = freezeArgument(a.fType);

		fFrozen = true;
	}

	public IType freezeArgument(IType type) {
		IType typeCopy = type.getEffective().dup();
		if (typeCopy instanceof FunctionType) {
			typeCopy.freeze();
		}
		TypeUnifier.preserveAttributes(typeCopy, type);
		return typeCopy;
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
		type = type.getEffective();
		if (type instanceof GeneralType) {
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
		return fReturnType.isSingleData();
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
}
