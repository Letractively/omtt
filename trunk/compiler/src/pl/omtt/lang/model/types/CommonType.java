package pl.omtt.lang.model.types;

public abstract class CommonType implements IType, Cloneable {
	boolean fSequence = false;
	boolean fNotNull = false;

	public boolean isSequence() {
		return fSequence;
	}

	public IType setSequence() {
		fSequence = true;
		return this;
	}

	public IType unsetSequence() {
		fSequence = false;
		return null;
	}

	public boolean isNotNull() {
		return fNotNull;
	}

	public boolean isNull() {
		return false;
	}

	public IType setNotNull() {
		fNotNull = true;
		return this;
	}

	public IType unsetNotNull() {
		fNotNull = false;
		return this;
	}

	public IType dup() {
		try {
			return (IType) this.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	public String singleToString() {
		return "<unknown>";
	}

	public boolean essentiallyEquals(IType type) {
		return isSubtypeOf(type) && type.isSubtypeOf(this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	protected int objectHashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		// TODO: do it neatly
		if (o instanceof CommonType) {
			return toString().equals(o.toString());
		}
		return false;
	}

	@Override
	public String toDiagnosticString() {
		if (this instanceof FlexibleType && !this.isFrozen())
			return "flexible(" + singleToString() + ")"
					+ (isSequence() ? "*" : "");
		else
			return singleToString() + (isSequence() ? "*" : "");
	}

	@Override
	public String toString() {
		return singleToString() + (isSequence() ? "*" : "");
	}
}
