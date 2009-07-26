package pl.omtt.lang.model.types;

public class AnyType extends CommonType implements IType {
	@Override
	public void freeze() {
	}

	@Override
	public IType getEffective() {
		return this;
	}

	@Override
	public boolean isFrozen() {
		return true;
	}

	@Override
	public boolean isGeneral() {
		return true;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		type = type.getEffectiveLowerBound();
		return type instanceof AnyType;
	}

	@Override
	public Class<?> getAssociatedClass() {
		return Object.class;
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
	public boolean essentiallyEquals(IType t) {
		return t.getEffective() instanceof AnyType;
		
	}
	
	@Override
	public String singleToString () {
		return "_";
	}

	@Override
	String singleToEssentialString() {
		return "_";
	}
}
