package pl.omtt.lang.model.types;

public class GenericType extends CommonType implements IType {
	IType fLowerBoundType;
	int fInstanceId;

	public GenericType() {
		this(new AnyType());
	}

	public GenericType(IType lowerBoundType) {
		this(lowerBoundType, 0);
	}

	public GenericType(IType lowerBoundType, int iid) {
		if (iid > 0)
			fInstanceId = iid;
		else
			fInstanceId = objectHashCode();
		fLowerBoundType = lowerBoundType;
		TypeUnifier.preserveAttributes(this, lowerBoundType);
	}

	public int getInstanceId() {
		return fInstanceId;
	}

	@Override
	public IType getEffective() {
		return this;
	}

	public IType toLowerBound() {
		IType lb = fLowerBoundType.dup();
		TypeUnifier.preserveAttributes(lb, this);
		return lb;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		return fLowerBoundType.isSubtypeOf(type);
	}

	@Override
	public Class<?> getAssociatedClass() {
		return fLowerBoundType.getAssociatedClass();
	}

	@Override
	public void freeze() {
		fLowerBoundType.freeze();
	}

	@Override
	public boolean isFrozen() {
		return fLowerBoundType.isFrozen();
	}

	@Override
	public boolean isSingleData() {
		return !isSequence() && fLowerBoundType.isSingleData();
	}

	@Override
	public boolean isBoolean() {
		return fLowerBoundType.isBoolean();
	}

	@Override
	public boolean isNumeric() {
		return fLowerBoundType.isNumeric();
	}

	@Override
	public boolean isNull() {
		return fLowerBoundType.isNull();
	}

	@Override
	public boolean isGeneral() {
		return fLowerBoundType.isGeneral();
	}

	@Override
	public boolean isFunction() {
		return fLowerBoundType.isFunction();
	}

	@Override
	public boolean isGeneric() {
		return true;
	}

	@Override
	public boolean essentiallyEquals(IType t) {
		if (t.getEffective() instanceof GenericType) {
			return fInstanceId == ((GenericType) t.getEffective()).fInstanceId;
		}
		return false;
	}

	public String singleToString() {
		return fLowerBoundType.singleToString() + "[" + getInstanceId() + "]";
	}

	@Override
	String singleToEssentialString() {
		return fLowerBoundType.singleToString();
	}
}
