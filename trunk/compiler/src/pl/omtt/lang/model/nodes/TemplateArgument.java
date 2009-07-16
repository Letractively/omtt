package pl.omtt.lang.model.nodes;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.code.ISymbolTableParticipant;
import pl.omtt.lang.code.Symbol;
import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.FlexibleType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class TemplateArgument extends CommonNode implements
		ISymbolTableParticipant, IVisitable {
	IType fArgumentType;

	public TemplateArgument(int token) {
		super(new CommonToken(token, "argument"));
	}

	public String getArgumentName() {
		return getChild(0).getText();
	}

	public IType getArgumentType() {
		return fArgumentType;
	}

	private void setArgumentType(SymbolTable ST) throws TypeException {
		if (getTypeNode() != null) {
			fArgumentType = ((TypeReference) getTypeNode()).get(ST);
		}
		else { 
			fArgumentType = new FlexibleType();
			if (getFirstChildWithType(OmttParser.OP_MULTIPLY) != null)
				fArgumentType.setSequence();
		}
	}

	public TypeReference getTypeNode() {
		return (TypeReference)getFirstChildWithType(OmttParser.CLASS_ID);
	}

	@Override
	public void takeSymbolTable(SymbolTable ST) throws TypeException {
		try {
			setArgumentType(ST);
			ST.put(new Symbol(getArgumentName(), getArgumentType()));
		} catch (TypeException e) {
			ST.put(new Symbol(getArgumentName(), new ErrorType()));
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
