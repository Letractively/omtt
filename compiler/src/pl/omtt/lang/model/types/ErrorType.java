package pl.omtt.lang.model.types;

public class ErrorType extends CommonType implements IType {
	@Override
	public void freeze() {
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		return false;
	}

	@Override
	public Class<?> getAssociatedClass() {
		return null;
	}

	@Override
	public IType getEffective() {
		return this;
	}

	@Override
	public boolean isError() {
		return true;
	}
	
	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isSingleData() {
		return false;
	}

	@Override
	public boolean isNumeric() {
		return false;
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
	public boolean essentiallyEquals (IType t) {
		return false;
	}
	
	@Override
	String singleToEssentialString() {
		return "_";
	}

	public static IType instance() {
		return INSTANCE;
	}
	
	public final static ErrorType INSTANCE = new ErrorType();
}
