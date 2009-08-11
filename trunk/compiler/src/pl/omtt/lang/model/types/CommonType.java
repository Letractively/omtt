package pl.omtt.lang.model.types;

public abstract class CommonType implements IType, Cloneable {
	boolean fSequence = false;
	boolean fNotNull = false;
	String fName = null;

	public boolean isSequence() {
		return fSequence;
	}

	public IType setSequence() {
		fSequence = true;
		return this;
	}

	public IType unsetSequence() {
		fSequence = false;
		return this;
	}

	public boolean isNotNull() {
		return fNotNull;
	}

	public IType setNotNull() {
		fNotNull = true;
		return this;
	}

	public IType unsetNotNull() {
		fNotNull = false;
		return this;
	}

	public boolean isNull() {
		return false;
	}

	@Override
	public boolean isGeneric() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public String getName () {
		return fName;
	}

	public void setName (String name) {
		fName = name;
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

	public static boolean attributeEquals(IType a, IType b) {
		return !(a.isNull() ^ b.isNull() || a.isSequence() ^ b.isSequence());
	}

	@Override
	public int hashCode() {
		return toEssentialString().hashCode();
	}

	protected int objectHashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof IType) {
			IType t = (IType)o;
			if (!attributeEquals(this, t))
				return false;
			return essentiallyEquals(t);
		}
		return false;
	}

	@Override
	public IType getEffectiveLowerBound () {
		IType type = getEffective();
		if (type.isGeneric())
			type = ((GenericType)type).fLowerBoundType;
		return type;
	}

	@Override
	public String toDiagnosticString() {
		if (this instanceof GenericType && !this.isFrozen())
			return "flexible(" + singleToString() + ")"
					+ (isSequence() ? "*" : "");
		else
			return singleToString() + (isSequence() ? "*" : "");
	}

	public String toEssentialString () {
		return singleToEssentialString() + (isSequence() ? "*" : "");
	}

	abstract String singleToEssentialString ();
	
	@Override
	public String toString() {
		return singleToString() + (isSequence() ? "*" : "");
	}
}
