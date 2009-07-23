package pl.omtt.lang.model.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import pl.omtt.core.funproto.Function;

public abstract class CommonType implements IType, Cloneable {
	boolean fSequence = false;
	boolean fNotNull = false;

	public static IType fromType(Type type) throws TypeException {
		if (Object.class.equals(type))
			return new AnyType ();
		if (type instanceof Class<?>)
			return ScalarType.fromClass((Class<?>) type);

		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;

			Type rawtype = ptype.getRawType();
			if (!(rawtype instanceof Class<?>))
				throw new TypeException("unhandled return type " + rawtype);

			Class<?> rawclass = (Class<?>) rawtype;
			if (Collection.class.isAssignableFrom(rawclass)) {
				Type atype = ptype.getActualTypeArguments()[0];
				IType itemtype = fromType(atype);
				itemtype.setSequence();
				return itemtype;
			} else if (Function.class.isAssignableFrom(rawclass)) {
				return FunctionType.fromParameterizedType(ptype);
			} else {
				return ScalarType.fromClass(rawclass);
			}
		}
		return null;
	}

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
		return toEssentialString().hashCode();
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
