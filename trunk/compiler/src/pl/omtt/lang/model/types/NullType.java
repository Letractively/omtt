package pl.omtt.lang.model.types;

public class NullType extends CommonType implements IType {
	@Override
	public String singleToString () {
		return "<null>";
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
		return false;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		return true;
	}

	@Override
	public Class<?> getAssociatedClass() {
		return null;
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
	public boolean isNull() {
		return true;
	}
}
