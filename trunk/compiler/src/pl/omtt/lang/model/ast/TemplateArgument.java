package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.GenericType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypePointer;
import pl.omtt.lang.symboltable.ISymbolTableParticipant;
import pl.omtt.lang.symboltable.Symbol;
import pl.omtt.lang.symboltable.SymbolTable;

public class TemplateArgument extends CommonNode implements
		ISymbolTableParticipant, IVisitable {
	IType fArgumentType;
	Symbol fSymbol;

	public TemplateArgument(int token) {
		super(new CommonToken(token, "argument"));
	}

	public String getArgumentName() {
		return getChild(0).getText();
	}

	public IType getArgumentType() {
		return fArgumentType;
	}

	public Symbol getSymbol() {
		return fSymbol;
	}

	public boolean isArgumentOptional() {
		return getFirstChildWithType(OmttParser.TILDE) != null;
	}

	private void setArgumentType(SymbolTable ST) throws TypeException {
		if (getTypeNode() != null)
			fArgumentType = ((TypeReference) getTypeNode()).get(ST);
		else
			fArgumentType = new TypePointer(new GenericType());
		if (getFirstChildWithType(OmttParser.OP_MULTIPLY) != null)
			fArgumentType.setSequence();
	}

	public TypeReference getTypeNode() {
		return (TypeReference) getFirstChildWithType(OmttParser.CLASS_ID);
	}

	@Override
	public void takeSymbolTable(SymbolTable ST) throws TypeException {
		try {
			setArgumentType(ST);
			fSymbol = new Symbol(getArgumentName(), getArgumentType());
			ST.put(fSymbol);
		} catch (TypeException e) {
			fSymbol = new Symbol(getArgumentName(), new ErrorType());
			ST.put(fSymbol);
			throw e;
		}
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "argument " + getArgumentName() + "=" + getArgumentType();
	}
}
