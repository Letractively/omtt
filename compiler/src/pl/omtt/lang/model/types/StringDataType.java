package pl.omtt.lang.model.types;

public class StringDataType extends ScalarType implements IType {
	public StringDataType() {
		super(String.class);
	}

	@Override
	public boolean isSingleData() {
		return !isSequence();
	}
	
	@Override
	public String singleToString() {
		return "Data";
	}
}
