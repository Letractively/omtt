package pl.omtt.lang.model.types;

public interface IType {
	IType getEffective();

	boolean isSequence ();
	IType setSequence ();
	IType unsetSequence ();

	boolean isNotNull ();
	IType setNotNull ();
	IType unsetNotNull ();
	
	public boolean isFrozen();
	public void freeze();
	
	boolean isSubtypeOf (IType type);
	boolean essentiallyEquals(IType type);

	// content checks
	boolean isSingleData ();
	boolean isBoolean ();
	boolean isNumeric ();	
	boolean isGeneral();
	boolean isNull();

	boolean isFunction();
	
	Class<?> getAssociatedClass ();
	
	IType dup();

	String singleToString();
	String toDiagnosticString();
}
