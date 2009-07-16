package pl.omtt.lang.model.nodes;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.ClassResolver;
import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.GeneralType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.TypeException;

public class TypeReference extends CommonNode implements IVisitable {
	public TypeReference(Token token) {
		super(token);
	}

	public IType get(SymbolTable ST) throws TypeException {
		IType type;
		final String name = token.getText();
		switch (token.getType()) {
		case OmttParser.CLASS_ID:
			ClassResolver cr = ST.getBase().getClassResolver();
			try {
				if ("Integer".equals(name))
					type = NumericType.integerInstance();
				else if ("Real".equals(name))
					type = NumericType.realInstance();
				else {
					Class<?> cls = cr.get(name);
					if (Number.class.isAssignableFrom(cls))
						type = NumericType.fromClass(cls);
					else
						type = ScalarType.fromClass(cls);
				}
			} catch (ClassNotFoundException e) {
				throw new TypeException(this, e.getMessage());
			}
			break;
		default:
			type = new GeneralType();
			break;
		}
		if (getFirstChildWithType(OmttParser.OP_MULTIPLY) != null)
			type.setSequence();
		return type;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}