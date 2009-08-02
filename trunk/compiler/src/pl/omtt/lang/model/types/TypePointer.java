package pl.omtt.lang.model.types;

import pl.omtt.core.Debugging;

public class TypePointer extends CommonType implements IType {
	IType fPointer;
	boolean fFrozen = false;

	public TypePointer(IType type) {
		fPointer = type;
		TypeUnifier.preserveAttributes(this, type);
	}

	@Override
	public IType getEffective() {
		return fPointer.getEffective();
	}

	public TypePointer getRoot() {
		TypePointer ptr = this;
		while (ptr.fPointer instanceof TypePointer)
			ptr = (TypePointer) ptr.fPointer;
		return ptr;
	}

	@Override
	public boolean isFrozen() {
		return getRoot().fFrozen;
	}

	@Override
	public void freeze() {
		fFrozen = true;
		getRoot().fFrozen = true;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		return getEffective().isSubtypeOf(type);
	}

	@Override
	public Class<?> getAssociatedClass() {
		return getEffective().getAssociatedClass();
	}

	@Override
	public boolean isSingleData() {
		return !isSequence() && getEffective().isSingleData();
	}

	@Override
	public boolean isBoolean() {
		return getEffective().isBoolean();
	}

	@Override
	public boolean isNumeric() {
		return getEffective().isNumeric();
	}

	@Override
	public boolean isNull() {
		return getEffective().isNull();
	}

	@Override
	public boolean isGeneral() {
		return getEffective().isGeneral();
	}

	@Override
	public boolean isFunction() {
		return getEffective().isFunction();
	}

	@Override
	public boolean isGeneric() {
		return getEffective().isGeneric();
	}

	/**
	 * Own duplicate method: clone object must point to the same root
	 * FlexibleType
	 */
	@Override
	public IType dup() {
		TypePointer dup = (TypePointer) super.dup();
		dup.fPointer = this;
		return dup;
	}

	@Override
	public boolean essentiallyEquals(IType t) {
		t.getEffective().essentiallyEquals(t.getEffective());
		return false;
	}

	public String singleToString() {
		if (Debugging.DEBUG > 1) {
			if (isFrozen())
				return getEffective().singleToString();
			else
				return "flex(" + getEffective().singleToString() + ")";
		} else {
			return getEffective().singleToString();
		}
	}

	@Override
	String singleToEssentialString() {
		return ((CommonType) getEffective()).singleToEssentialString();
	}
}
