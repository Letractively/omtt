package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.Symbol;
import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class Ident extends CommonNode implements IExpression, IVisitable {
	Symbol fSymbol;
	IType fType;

	public Ident(int tokenId, Token token) {
		super(token);
	}

	public Ident(Token token) {
		super(token);
	}

	public String getName() {
		if (getType() == OmttParser.OP_GENERAL)
			return "it";
		else
			return getText();
	}

	public String getNamespace() {
		if (getChildCount() > 0)
			return getChild(0).getText();
		else
			return null;
	}

	public Symbol getSymbol() {
		return fSymbol;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		fSymbol = symbolTable.find(getName());
		if (fSymbol == null) {
			fType = new ErrorType();
			throw new TypeException(getToken(), "symbol " + getName()
					+ " not found");
		}

		fType = fSymbol.getType();
	}

	@Override
	public String toString() {
		String ns = getNamespace();
		return "ident " + (ns == null ? "" : ns + "::") + getName() + " of "
				+ getExpressionType();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
