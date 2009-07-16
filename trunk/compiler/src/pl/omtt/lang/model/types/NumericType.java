package pl.omtt.lang.model.types;

public class NumericType extends ScalarType implements IType {
	public enum NumericClass {
		INTEGER, REAL
	};

	NumericClass fNumericClass;

	public NumericType(NumericClass numericClass) {
		super(numericClass == NumericClass.INTEGER ? INTEGER_CLASS : REAL_CLASS);
		fNumericClass = numericClass;
	}

	@Override
	public Class<?> getAssociatedClass() {
		if (fNumericClass == NumericClass.INTEGER)
			return INTEGER_CLASS;
		else
			return REAL_CLASS;
	}

	@Override
	public boolean isNumeric() {
		return true;
	}

	public boolean isInteger() {
		return fNumericClass == NumericClass.INTEGER;
	}

	public boolean isReal() {
		return fNumericClass == NumericClass.REAL;
	}

	@Override
	public boolean isSubtypeOf(IType type) {
		type = type.getEffective();
		if (type instanceof GeneralType)
			return true;
		else if (type instanceof NumericType) {
			if (this.isInteger())
				return true;
			else if (((NumericType) type).isReal())
				return true;
		}
		return super.isSubtypeOf(type);
	}

	public static NumericType fromClass(Class<?> cls) {
		if (!(Number.class.isAssignableFrom(Integer.class)))
			return null;
		if (isIntegerClass(cls))
			return integerInstance();
		else
			return realInstance();
	}

	public static boolean isIntegerClass(Class<?> cls) {
		if (Integer.class.equals(cls) || int.class.equals(cls))
			return true;
		if (Short.class.equals(cls) || short.class.equals(cls))
			return true;
		if (Byte.class.equals(cls) || byte.class.equals(cls))
			return true;
		if (Long.class.equals(cls) || long.class.equals(cls))
			return true;
		return false;
	}

	public static boolean isSupportedNumber(Class<?> returnClass) {
		return returnClass.equals(INTEGER_CLASS)
				|| returnClass.equals(REAL_CLASS);
	}

	public static NumericType integerInstance() {
		return new NumericType(NumericClass.INTEGER);
	}

	public static NumericType realInstance() {
		return new NumericType(NumericClass.REAL);
	}

	@Override
	public String singleToString() {
		if (fNumericClass == NumericClass.INTEGER)
			return "Integer";
		else
			return "Real";
	}

	public final static Class<?> INTEGER_CLASS = Integer.class;
	public final static Class<?> REAL_CLASS = Double.class;
}
