package pl.omtt.lang.model.types;

import java.util.HashMap;
import java.util.Map;

import pl.omtt.lang.model.types.FunctionType.Argument;

public class TypeUnifier {
	public static void unifyEq(IType typeA, IType typeB) throws TypeException {
		unify(typeA, typeB, false);
	}

	public static void unifyLe(IType typeA, IType typeB) throws TypeException {
		unify(typeA, typeB, true);
	}

	private static void unify(IType typeA, IType typeB, boolean le)
			throws TypeException {
		System.out.println("[tu] " + typeA.toDiagnosticString()
				+ (le ? " < " : " == ") + typeB.toDiagnosticString());
		if (typeA == null || typeB == null)
			return;

		if (le && !typeA.isFrozen()) {
			throw new TypeException(
					"le-unification of flexible types is not supported");
		} else if (le && typeB.isSubtypeOf(typeA) && !typeB.isFunction()) {
			// everything is done:)
		} else if (!typeA.isFrozen() && !typeB.isFrozen()) {
			if (typeA.isFunction() && typeB.isFunction()) {
				unifyFunctions(typeA, typeB, false, null);
				return;
			} else if (typeB.getEffective().isSubtypeOf(typeA.getEffective())) {
				unifyAtom(typeB, typeA);
				return;
			} else if (typeA.getEffective().isSubtypeOf(typeB.getEffective())) {
				unifyAtom(typeA, typeB);
				return;
			}
			throw new TypeException("using " + typeB + " as " + typeA + " [1]");
		} else if (typeA.isFrozen() && typeB.isFrozen()) {
			if (!le
					&& !typeA.getEffective().essentiallyEquals(
							typeB.getEffective()))
				throw new TypeException("using " + typeB + " as " + typeA
						+ " [2]");
			else if (le
					&& !typeB.getEffective().isSubtypeOf(typeA.getEffective()))
				throw new TypeException("using " + typeB + " as " + typeA
						+ " [3]");
			else if (typeA.getEffective() instanceof FunctionType) {
				unifyFunctions(typeA, typeB, le, null);
			}
		} else {
			if (typeB.isFrozen()) {
				// swap types, can appear only when le==false
				IType temp = typeA;
				typeA = typeB;
				typeB = temp;
			}

			if (typeA.getEffective() instanceof FunctionType) {
				unifyFunctions(typeA, typeB, le, null);
			} else {
				if (typeA.isSubtypeOf(typeB.getEffective()))
					unifyAtom(typeA, typeB);
				else
					throw new TypeException("using " + typeB + " as " + typeA
							+ " [6]");
			}

			if (!le)
				typeB.freeze();
		}
	}

	private static void unifyFunctions(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> freeVarsMap) throws TypeException {
		if (le && !typeB.isFunction()
				&& !(typeB.isGeneral() && typeB instanceof FlexibleType))
			throw new TypeException("using " + typeB + " as " + typeA + " [5]");
		else if (!typeA.isFunction()) {
			// TODO
			throw new TypeException("unimplemented [1]");
		}
		System.out.println("[fu] " + typeA + " ~ " + typeB);
		FunctionType funA = (FunctionType) typeA.getEffective();
		if (!typeB.isFunction()) {
			if (!(typeB instanceof FlexibleType) || !typeB.isGeneral()
					|| typeB.isFrozen())
				throw new TypeException("unimplemented [2]");
			FunctionType funtype = new FunctionType();
			for (int i = 0; i < funA.getArguments().size(); i++)
				funtype.putArgument(null, new FlexibleType(), false);
			unifyAtom(funtype, typeB);
		}
		FunctionType funB = (FunctionType) typeB.getEffective();

		if (funA.fArguments.size() != funB.fArguments.size())
			throw new TypeException("using " + funA + " as " + funB + " [4]");

		if (freeVarsMap == null) {
			freeVarsMap = new HashMap<Integer, IType>();
		}

		unifyReturnType(funA.getReturnType(), funB.getReturnType(), le,
				freeVarsMap);
		for (int i = 0; i < funA.fArguments.size(); i++) {
			Argument argA = funA.fArguments.get(i);
			Argument argB = funB.fArguments.get(i);
			unifyArgument(argA, argB, le, freeVarsMap);
		}
		System.out.println("[fu] after: " + typeA + " ~ " + typeB);
	}

	private static void unifyArgument(Argument argA, Argument argB, boolean le,
			Map<Integer, IType> freeVarsMap) throws TypeException {
		if ((!le && argA.fOptional ^ argB.fOptional)
				|| (le && !argA.fOptional && argB.fOptional))
			throw new TypeException("cannot use "
					+ (argA.fOptional ? "optional" : "obligatory")
					+ " argument as an "
					+ (argB.fOptional ? "optional" : "obligatory") + " one");

		unifyArgumentType(argA.getType(), argB.getType(), le, freeVarsMap, true);
	}

	private static void unifyReturnType(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> freeVarsMap) throws TypeException {
		unifyArgumentType(typeA, typeB, le, freeVarsMap, false);
	}

	private static void unifyArgumentType(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> freeVarsMap, boolean isArgument)
			throws TypeException {
		if ((typeA.isGeneral() && typeA.isFrozen())
				|| (typeB.isGeneral() && typeB.isFrozen())) {
			if (typeA.isGeneral() && typeA.isFrozen()) {
				if (freeVarsMap.containsKey(iid(typeA))) {
					IType match = freeVarsMap.get(iid(typeA));
					// TODO: what if reverse?
					if (match.isFrozen()) {
						unify(match, typeB, le);
					} else {
						unifyEq(match, typeB);
					}
				} else {
					freeVarsMap.put(iid(typeA), typeB);
				}
			}
			if (typeB.isGeneral() && typeB.isFrozen()) {
				if (freeVarsMap.containsKey(iid(typeB))) {
					IType match = freeVarsMap.get(iid(typeB));
					// TODO: what if reverse?
					if (match.isFrozen()) {
						unify(typeA, match, le);
					} else {
						unifyEq(typeA, match);
					}
				} else {
					freeVarsMap.put(iid(typeB), typeB);
				}
			}
		} else {
			if (typeA.isFunction()) {
				unifyFunctions(typeB, typeA, le, freeVarsMap);
			} else {
				if (isArgument || !typeB.isFrozen())
					unify(typeA, typeB, le);
				else
					unify(typeB, typeA, le);
			}
		}
	}

	private static int iid(IType type) {
		return ((GeneralType) type.getEffective()).getInstanceId();
	}

	private static void unifyAtom(IType base, IType toUnify) {
		if (toUnify instanceof FlexibleType) {
			FlexibleType root = (FlexibleType) toUnify;
			while (root.fInnerType instanceof FlexibleType)
				root = (FlexibleType) root.fInnerType;
			root.fInnerType = base;
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
			for (cls = clsA; !cls.equals(String.class); cls = superclass(cls))
				if (isSuperclass(cls, clsB))
					break;

			if (cls.equals(Object.class))
				return preserveAttributes(new GeneralType(), typeA, typeB);
			else
				return preserveAttributes(ScalarType.fromClass(cls), typeA,
						typeB);
		}

		return preserveAttributes(new GeneralType(), typeA, typeB);
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
		if (base.equals(String.class))
			return true;
		else if (base.equals(Float.class)
				&& Integer.class.isAssignableFrom(superclass))
			return true;
		else
			return base.isAssignableFrom(superclass);
	}
}
