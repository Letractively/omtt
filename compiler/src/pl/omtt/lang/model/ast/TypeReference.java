package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.ClassResolver;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.AnyType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;

public class TypeReference extends CommonNode implements IVisitable {
	public TypeReference(int tokenId) {
		super(new CommonToken(tokenId, "type reference"));
	}

	public int getKind() {
		return getChild(0).getType();
	}

	public boolean isSequence() {
		return getFirstChildWithType(OmttParser.OP_MULTIPLY) != null;
	}

	public IType get(SymbolTable ST) throws TypeException {
		return get(this, ST);
	}

	protected static IType get(TypeReference typeref, SymbolTable ST)
			throws TypeException {
		IType type;
		switch (typeref.getKind()) {
		case OmttParser.CLASS_ID:
			type = getScalar(typeref.getChild(0), ST);
			break;
		case OmttParser.FUNCTION:
			type = getFunction(typeref.getChild(0), ST);
			break;
		default:
			type = new AnyType();
			break;
		}
		if (typeref.isSequence())
			type.setSequence();
		return type;
	}

	private static IType getFunction(Tree node, SymbolTable ST)
			throws TypeException {
		FunctionType ftype = new FunctionType();
		ftype.setReturnType(get((TypeReference) node.getChild(0), ST));
		for (int i = 1; i < node.getChildCount(); i++) {
			Tree arg = node.getChild(i);
			final boolean optional;
			final String name;
			final TypeReference typeref = (TypeReference) arg.getChild(0);
			if (arg.getChildCount() == 3) {
				optional = arg.getChild(2).getType() == OmttParser.TILDE;
				name = arg.getChild(1).getText();
			} else if (arg.getChildCount() == 2) {
				if (arg.getChild(1).getType() == OmttParser.TILDE) {
					optional = true;
					name = null;
				} else {
					optional = false;
					name = arg.getChild(1).getText();
				}
			} else {
				optional = false;
				name = null;
			}
			ftype.putArgument(name, get(typeref, ST), optional);
		}
		return ftype;
	}

	private static IType getScalar(Tree node, SymbolTable ST)
			throws TypeException {
		IType type;
		final String name = node.getText();
		ClassResolver cr = ST.getBase().getClassResolver();
		try {
			if ("Any".equals(name))
				type = new AnyType();
			else if ("Int".equals(name))
				type = NumericType.integerInstance();
			else if ("Real".equals(name))
				type = NumericType.realInstance();
			else if ("Char".equals(name))
				type = ScalarType.charInstance();
			else if ("Data".equals(name))
				type = new StringDataType();
			else {
				Class<?> cls = cr.get(name);
				if (Number.class.isAssignableFrom(cls))
					type = NumericType.fromClass(cls);
				else
					type = ScalarType.fromClass(cls);
			}
		} catch (ClassNotFoundException e) {
			throw new TypeException(node, e.getMessage());
		}
		return type;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}