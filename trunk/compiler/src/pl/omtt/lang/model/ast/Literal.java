package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NullType;
import pl.omtt.lang.model.types.ScalarType;

public class Literal extends CommonNode implements IVisitable, IExpression {
	Object fLiteral;

	public Literal(Token token) {
		super(token);

		switch (token.getType()) {
		case OmttParser.STRING_LITERAL:
			fLiteral = getText();
			break;
		case OmttParser.INT_NUMBER:
			fLiteral = Integer.parseInt(getText());
			break;
		case OmttParser.REAL_NUMBER:
			fLiteral = Double.parseDouble(getText());
			break;
		case OmttParser.NULL:
		case OmttParser.TILDE:
			fLiteral = new Null ();
			break;
		case OmttParser.TRUE:
			fLiteral = Boolean.TRUE;
			break;
		case OmttParser.FALSE:
			fLiteral = Boolean.FALSE;
			break;
		}
	}

	@Override
	public IType getExpressionType () {
		if (fLiteral instanceof Null)
			return new NullType ();
		else
			return ScalarType.fromClass(fLiteral.getClass()).setNotNull();
	}
	
	@Override
	public void setExpressionType(SymbolTable symbolArray) {
		// expression type is based on fLiteral class
	}

	public Object get() {
		return fLiteral;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		String literal = fLiteral.toString().replace("\n", "\\n");
		if (fLiteral instanceof String)
			literal = "\"" + literal + "\"";
		return "literal of " + getExpressionType().toString();// + ": " + literal;
	}
	
	public class Null {
		@Override
		public String toString () {
			return "Null";
		}
	}
}
