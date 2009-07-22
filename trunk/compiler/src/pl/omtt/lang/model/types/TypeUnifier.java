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

	private static void unifyFunctions(IType typeA, IType typeB, boolean le)
			throws TypeException {
		System.out.println("[fu] " + typeA + " ~ " + typeB);

		if (!typeA.isFunction() || !typeB.isFunction())
			throw new TypeException("unimplemented [1]");

		FunctionType funA = (FunctionType) typeA.getEffective();
		FunctionType funB = (FunctionType) typeB.getEffective();

		for (int i = 0; i < funA.fArguments.size(); i++) {
			unifyFree(funB.getArgument(i).getType(), funA.getArgument(i)
					.getType(), le);
		}
		unifyFree(funA.getReturnType(), funB.getReturnType(), le);

		System.out.println("[fu] after: " + typeA + " ~ " + typeB);
	}

	private static void unifyFree(IType typeA, IType typeB, boolean le)
			throws TypeException {
		System.out.println("[ua] " + typeA + " ~ " + typeB);

		if (!le || typeA.isGeneric())
			unifyEq(typeA, typeB);
		else
			unifyLe(typeA, typeB);
	}

	@SuppressWarnings("unused")
	private static void _unifyFunctions(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> genericMap) throws TypeException {
		System.out.println("[fu] " + typeA + " ~ " + typeB);
		if (le && !typeB.isFunction()
				&& !(typeB.isGeneric() && typeB instanceof GenericType))
			throw new TypeException("using " + typeA + " as " + typeB + " [5]");
		else if (!typeA.isFunction()) {
			if (typeB.isSubtypeOf(typeA)) {
				if (le)
					return;
				else {
					System.out.println("unimplemented [1]");
					throw new TypeException("unimplemented [1]");
				}
			} else
				throw new TypeException("using " + typeA + " as " + typeB
						+ " [7]");
		}

		FunctionType funA = (FunctionType) typeA.getEffective();
		if (!typeB.isFunction()) {
			if (!(typeB instanceof GenericType) || !typeB.isGeneric()
					|| typeB.isFrozen())
				throw new TypeException("unimplemented [2]");
			FunctionType funtype = new FunctionType();
			for (int i = 0; i < funA.getArguments().size(); i++)
				funtype.putArgument(null, new GenericType(), false);
			unifyAtom(funtype, typeB, le);
		}
		FunctionType funB = (FunctionType) typeB.getEffective();

		if (funA.fArguments.size() != funB.fArguments.size())
			throw new TypeException("using " + funA + " as " + funB + " [4]");

		if (genericMap == null) {
			genericMap = new HashMap<Integer, IType>();
		}

		for (int i = 0; i < funA.fArguments.size(); i++) {
			Argument argA = funA.fArguments.get(i);
			Argument argB = funB.fArguments.get(i);
			unifyArgument(argA, argB, le, genericMap);
		}
		unifyReturnType(funA.getReturnType(), funB.getReturnType(), le,
				genericMap);
		System.out.println("[fu] after: " + typeA + " ~ " + typeB);
	}

	private static void unifyArgument(Argument argA, Argument argB, boolean le,
			Map<Integer, IType> genericMap) throws TypeException {
		if ((!le && argA.fOptional ^ argB.fOptional)
				|| (le && !argA.fOptional && argB.fOptional))
			throw new TypeException("cannot use "
					+ (argA.fOptional ? "optional" : "obligatory")
					+ " argument as an "
					+ (argB.fOptional ? "optional" : "obligatory") + " one");

		unifyArgumentType(argB.getType(), argA.getType(), le, genericMap);
	}

	private static void updategenericMap(IType typeA, IType typeB,
			Map<Integer, IType> genericMap) {
		if (typeB.isGeneric()) {
			System.out.println("- " + iid(typeB) + " --> " + typeA);
			int iid = ((GenericType) typeB.getEffective()).getInstanceId();
			if (genericMap.containsKey(typeB)) {
				IType match = genericMap.get(typeB);
			}

		}
		if (typeA.isGeneric()) {
			System.out.println("+ " + iid(typeA) + " --> " + typeB);
			int iid = ((GenericType) typeA.getEffective()).getInstanceId();

		}
	}

	private static void unifyReturnType(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> genericMap) throws TypeException {
		unifyArgumentType(typeA, typeB, le, genericMap);
	}

	private static void unifyArgumentType(IType typeA, IType typeB, boolean le,
			Map<Integer, IType> genericMap) throws TypeException {
		updategenericMap(typeA, typeB, genericMap);
		if (!typeA.isFrozen()) {
			if (typeB.isFunction())
				_unifyFunctions(typeA, typeB, false, genericMap);
			else
				unifyEq(typeA, typeB);
		} else {
			if (typeB.isFunction())
				_unifyFunctions(typeA, typeB, le, genericMap);
			else
				unify(typeA, typeB, le);
		}
	}

	private static int iid(IType type) {
		return ((GenericType) type.getEffective()).getInstanceId();
	}

	private static void unifyAtom(IType base, IType toUnify, boolean le) {
		if (toUnify instanceof TypePointer) {
			TypePointer root = (TypePointer) toUnify;
			while (root.fPointer instanceof TypePointer)
				root = (TypePointer) root.fPointer;
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
			for (cls = clsA; !cls.equals(String.class); cls = superclass(cls))
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
		if (base.equals(String.class))
			return true;
		else if (base.equals(Float.class)
				&& Integer.class.isAssignableFrom(superclass))
			return true;
		else
			return base.isAssignableFrom(superclass);
	}
}
