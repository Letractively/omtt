package pl.omtt.lang.model.ast;

import java.lang.reflect.Method;

import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.ast.PropertySelect.Property;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class Ident extends CommonNode implements IExpression,
		IPropertySelectExpression, IVisitable {
	IType fType;

	int fSource = SOURCE_NONE;
	Symbol fSymbol;
	Property fProperty;

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

	public int getSource() {
		return fSource;
	}
	
	public Symbol getSymbol() {
		return fSymbol;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable st) throws TypeException {
		try {
			setFromContextObject(st);
		} catch (TypeException e) {
			setFromSymbolTable(st);
		}
	}

	private void setFromContextObject(SymbolTable st) throws TypeException {
		fSymbol = st.find("it");
		if (fSymbol == null) {
			fSource = SOURCE_NONE;
			fType = new ErrorType();
			throw new TypeException("context object not found");
		}
		fProperty = PropertySelect.findProperty(fSymbol.getType(), getName());
		fSource = SOURCE_CONTEXT_OBJECT;
		fType = fProperty.type;
	}

	private void setFromSymbolTable(SymbolTable st) throws TypeException {
		fSymbol = st.find(getName());
		if (fSymbol == null) {
			fSource = SOURCE_NONE;
			fType = new ErrorType();
			throw new TypeException(getToken(), "symbol " + getName()
					+ " not found");
		}
		fSource = SOURCE_LOCAL;
		fType = fSymbol.getType();
	}

	public Method getPropertyMethod() {
		return fProperty.method;
	}

	public boolean isPropertyMethodNeedsTypeWrapping() {
		return fProperty.needsTypeWrapping;
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

	public final static int SOURCE_NONE = 0;
	public final static int SOURCE_CONTEXT_OBJECT = 1;
	public final static int SOURCE_LOCAL = 2;
	public final static int SOURCE_SUPER = 3;
	public final static int SOURCE_GLOBAL = 4;
}
