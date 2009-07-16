package pl.omtt.lang.model.types;

public class FlexibleType extends CommonType implements IType {
	IType fInnerType;
	boolean fFrozen = false;

	public FlexibleType() {
		this(new GeneralType());
	}

	public FlexibleType(IType effectiveType) {
		fInnerType = effectiveType;
		if(effectiveType.isSequence())
			setSequence();
	}

	@Override
	public IType getEffective() {
		if (fInnerType instanceof FlexibleType)
			return ((FlexibleType) fInnerType).getEffective();
		else
			return fInnerType;
	}

	@Override
	public boolean isFrozen() {
		return fFrozen;
	}

	@Override
	public void freeze() {
		fFrozen = true;
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

	/**
	 * Own duplicate method:
	 * clone object must point to the same root FlexibleType
	 */
	@Override
	public IType dup () {
		FlexibleType dup = (FlexibleType)super.dup();
		dup.fInnerType = this;
		return dup;
	}

	@Override
	public boolean essentiallyEquals(IType t) {
		if (t instanceof FlexibleType) {
			IType otype = ((FlexibleType) t).fInnerType;
			return (otype != null && otype == fInnerType)
					|| (otype == null && fInnerType == t)
					|| (fInnerType == null && otype == this);
		}
		return false;
	}

	public String singleToString() {
		return getEffective().singleToString();
	}
}
