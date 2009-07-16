package pl.omtt.lang.model.types;

import java.util.HashMap;
import java.util.Map;

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
				funtype.putArgument(null, new FlexibleType());
			unifyAtom(funtype, typeB);
		}
		FunctionType funB = (FunctionType) typeB.getEffective();

		if (funA.fArguments.size() != funB.fArguments.size())
			throw new TypeException("using " + funA + " as " + funB + " [4]");

		if (freeVarsMap == null) {
			freeVarsMap = new HashMap<Integer, IType>();
		}

		unifyArgument(funA.getReturnType(), funB.getReturnType(), le,
				freeVarsMap, false);
		for (int i = 0; i < funA.fArguments.size(); i++) {
			IType argA = funA.fArguments.get(i).fType;
			IType argB = funB.fArguments.get(i).fType;
			unifyArgument(argA, argB, le, freeVarsMap, true);
		}
		System.out.println("[fu] after: " + typeA + " ~ " + typeB);
	}

	private static void unifyArgument(IType argA, IType argB, boolean le,
			Map<Integer, IType> freeVarsMap, boolean argument)
			throws TypeException {
		if ((argA.isGeneral() && argA.isFrozen())
				|| (argB.isGeneral() && argB.isFrozen())) {
			if (argA.isGeneral() && argA.isFrozen()) {
				if (freeVarsMap.containsKey(iid(argA))) {
					IType match = freeVarsMap.get(iid(argA));
					// TODO: what if reverse?
					if (match.isFrozen()) {
						unify(match, argB, le);
					} else {
						unifyEq(match, argB);
					}
				} else {
					freeVarsMap.put(iid(argA), argB);
				}
			}
			if (argB.isGeneral() && argB.isFrozen()) {
				if (freeVarsMap.containsKey(iid(argB))) {
					IType match = freeVarsMap.get(iid(argB));
					// TODO: what if reverse?
					if (match.isFrozen()) {
						unify(argA, match, le);
					} else {
						unifyEq(argA, match);
					}
				} else {
					freeVarsMap.put(iid(argB), argB);
				}
			}
		} else {
			if (argA.isFunction()) {
				unifyFunctions(argB, argA, le, freeVarsMap);
			} else {
				if (argument || !argB.isFrozen())
					unify(argA, argB, le);
				else
					unify(argB, argA, le);
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
