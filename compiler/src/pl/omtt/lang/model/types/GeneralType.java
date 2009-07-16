package pl.omtt.lang.model.types;

public class GeneralType extends CommonType implements IType {
	int fInstanceId;
	
	public GeneralType () {
		fInstanceId = objectHashCode();
	}

	public int getInstanceId () {
		return fInstanceId;
	}
	
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
		return type.getEffective() instanceof GeneralType;
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
	public String singleToString () {
		return "_";
	}
}
