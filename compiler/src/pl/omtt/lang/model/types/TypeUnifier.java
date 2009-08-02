package pl.omtt.lang.model.types;

import pl.omtt.core.Debugging;
import pl.omtt.lang.model.types.FunctionType.Argument;

public class TypeUnifier {
	/**
	 * Unifies <code>typeA</code> and <code>typeB</code>, i.e. asserts that
	 * <code>typeA</code> and <code>typeB</code> have <i>essentially</i> the
	 * same types.<br/>
	 * <i>Essentially</i> means that types may differ in sequence or not null
	 * declarations.
	 * 
	 * @param typeA
	 * @param typeB
	 * @throws TypeException
	 * 
	 * @see {@link TypeUnifier#unifyLe(IType, IType)}
	 */
	public static void unifyEq(IType typeA, IType typeB) throws TypeException {
		unify(typeA, typeB, false);
	}

	/**
	 * Inequally unifies <code>typeA</code> and <code>typeB</code>, i.e. asserts
	 * that <code>typeA</code> is <i>essentially</i> a supertype of
	 * <code>typeB</code>.<br/>
	 * <i>Essentially</i> means that types may differ in sequence or not null
	 * declarations.
	 * 
	 * @param typeA
	 * @param typeB
	 * @throws TypeException
	 * 
	 * @see {@link TypeUnifier#unifyEq(IType, IType)}
	 */
	public static void unifyLe(IType typeA, IType typeB) throws TypeException {
		unify(typeA, typeB, true);
	}

	private static void unify(IType typeA, IType typeB, boolean le)
			throws TypeException {
		if (typeA == null || typeB == null)
			return;
		if (Debugging.DEBUG > 0)
			System.out.println("[tu] " + typeA.toDiagnosticString()
					+ (le ? " < " : " == ") + typeB.toDiagnosticString());

		if (typeA.isError() || typeB.isError())
			return;

		if (typeB.isNull())
			return;

		checkSequenceCompliance(typeA, typeB, le);
		if (typeA.isFunction() && typeB.isFunction()) {
			unifyFunctions(typeA, typeB, le);
		} else if (le && !typeA.isFrozen()) {
			throw new TypeException(
					"le-unification of flexible types is not supported");
		} else if (le && typeB.isSubtypeOf(typeA)) {
			// everything is done:)
		} else if (!typeA.isFrozen() && !typeB.isFrozen()) {
			// le == false
			if (typeB.isSubtypeOf(typeA)) {
				unifyAtom(typeB, typeA, false);
				return;
			} else if (typeA.isSubtypeOf(typeB)) {
				unifyAtom(typeA, typeB, false);
				return;
			}
			throw new TypeException("using " + typeB + " as " + typeA + " [1]");
		} else if (typeA.isFrozen() && typeB.isFrozen()) {
			if (!le
					&& !typeA.getEffective().essentiallyEquals(
							typeB.getEffective()))
				throw new TypeException("using " + typeB + " as " + typeA
						+ " [2]");
			else if (le && !typeB.isSubtypeOf(typeA))
				throw new TypeException("using " + typeB + " as " + typeA
						+ " [3]");
		} else {
			if (typeB.isFrozen()) {
				// swap types, can appear only when le==false
				IType temp = typeA;
				typeA = typeB;
				typeB = temp;
			}

			if (typeA.isSubtypeOf(typeB)) {
				unifyAtom(typeA, typeB, le);
			} else {
				throw new TypeException("using " + typeB + " as " + typeA
						+ " [6]");
			}
			if (!le) {
				typeB.freeze();
			}
		}
	}

	private static void checkSequenceCompliance(IType typeA, IType typeB,
			boolean le) throws TypeException {
		if (!le && typeA.isSequence() ^ typeB.isSequence()) {
			throw new TypeException("types " + typeA + " and " + typeB
					+ " cannot be unified");
		}
		if (le & !typeA.isSequence() && typeB.isSequence()) {
			throw new TypeException("using " + typeB + " as " + typeA);
		}
	}

	private static void unifyFunctions(IType typeA, IType typeB, boolean le)
			throws TypeException {
		if (Debugging.DEBUG > 0)
			System.out.println("[fu] " + typeA + (le ? " < " : " = ") + typeB);
		if (!typeA.isFunction() || !typeB.isFunction())
			throw new TypeException("unimplemented [1]");

		FunctionType funA = (FunctionType) typeA.getEffective();
		FunctionType funB = (FunctionType) typeB.getEffective();

		if (funA.getArgumentLength() > funB.getArgumentLength())
			throw new TypeException("cannot use " + typeA + " as " + typeB);

		for (int i = 0; i < funB.fArguments.size(); i++) {
			Argument argB = funB.getArgument(i);
			if (funA.getArgumentLength() <= i) {
				if (le && argB.optional)
					continue;
				else
					throw new TypeException("cannot use " + typeA + " as "
							+ typeB);
			}
			Argument argA = funA.getArgument(i);

			if ((!le && argA.optional ^ argB.optional)
					|| (le && argA.optional && !argB.optional))
				throw new TypeException("cannot use "
						+ (argA.optional ? "optional" : "obligatory")
						+ " argument as an "
						+ (argB.optional ? "optional" : "obligatory") + " one");
			unifyGently(funB.getArgument(i).type, funA.getArgument(i).type, le);
		}
		unifyGently(funA.getReturnType(), funB.getReturnType(), le);

		if (Debugging.DEBUG > 0)
			System.out.println("[fu] after: " + typeA + " ~ " + typeB);
	}

	/**
	 * Unifies types for inequality typeA < typeB even if typeA is not frozen.
	 * In this case, typeA is strictly unifying with typeB as equal.
	 * 
	 * @param typeA
	 * @param typeB
	 * @param le
	 * @throws TypeException
	 */
	private static void unifyGently(IType typeA, IType typeB, boolean le)
			throws TypeException {
		if (!le)
			unifyEq(typeA, typeB);
		else if (!typeA.isFunction() && !typeA.isFrozen()) {
			if (typeA.isSequence() && !typeB.isSequence())
				unifyEq(typeA.dup().unsetSequence(), typeB);
			else
				unifyEq(typeA, typeB);
		} else
			unifyLe(typeA, typeB);
	}

	private static void unifyAtom(IType base, IType toUnify, boolean le) {
		if (toUnify instanceof TypePointer) {
			TypePointer root = ((TypePointer) toUnify).getRoot();
			if (base instanceof TypePointer) {
				base = ((TypePointer) base).getRoot();
				if (base == root)
					return;
			}
			if (le && !base.isGeneric())
				root.fPointer = new GenericType(base);
			else
				root.fPointer = base;
		}
	}

	public static IType intersect(IType typeA, IType typeB) {
		if (typeA.essentiallyEquals(typeB))
			return preserveAttributes(typeA.getEffective().dup(), typeA, typeB);

		IType typeAeff = typeA.getEffective();
		IType typeBeff = typeB = typeB.getEffective();

		if (typeAeff.isSubtypeOf(typeBeff))
			return preserveAttributes(typeBeff.dup(), typeA, typeB);
		else if (typeBeff.isSubtypeOf(typeAeff))
			return preserveAttributes(typeAeff.dup(), typeA, typeB);
		else if ((typeAeff instanceof ScalarType)
				&& (typeBeff instanceof ScalarType)) {
			Class<?> clsA = typeAeff.getAssociatedClass();
			Class<?> clsB = typeBeff.getAssociatedClass();

			Class<?> cls;
			for (cls = clsA; !cls.equals(Object.class); cls = superclass(cls))
				if (isSuperclass(cls, clsB))
					break;

			if (cls.equals(Object.class))
				return preserveAttributes(new AnyType(), typeA, typeB);
			else
				return preserveAttributes(ScalarType.fromClass(cls), typeA,
						typeB);
		}

		return preserveAttributes(new AnyType(), typeA, typeB);
	}

	public static IType preserveAttributes(IType target, IType srcA, IType srcB) {
		if (srcA.isSequence() || srcB.isSequence())
			target.setSequence();
		else
			target.unsetSequence();

		if (srcA.isNotNull() && srcB.isNotNull())
			target.setNotNull();
		else
			target.unsetNotNull();

		return target;
	}

	public static IType preserveAttributes(IType target, IType src) {
		if (src.isSequence())
			target.setSequence();
		else
			target.unsetSequence();

		if (src.isNotNull())
			target.setNotNull();
		else
			target.unsetNotNull();

		return target;
	}

	public static IType unifyOrIntersect(IType typeA, IType typeB) {
		try {
			TypeUnifier.unifyEq(typeA, typeB);
			return preserveAttributes(typeA.dup(), typeA, typeB);
		} catch (TypeException e) {
			return TypeUnifier.intersect(typeA, typeB);
		}
	}

	public static Class<?> superclass(Class<?> cls) {
		if (cls.equals(Integer.class))
			return Float.class;
		else
			return cls.getSuperclass();
	}

	public static boolean isSuperclass(Class<?> base, Class<?> superclass) {
		if (base.equals(NumericType.REAL_CLASS)
				&& NumericType.INTEGER_CLASS.isAssignableFrom(superclass))
			return true;
		else
			return base.isAssignableFrom(superclass);
	}
}
