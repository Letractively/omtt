package pl.omtt.lang.model.ast;

import java.lang.reflect.Method;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.BaseSymbolTable;
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

	public Ident(int token) {
		super(new CommonToken(token));
	}

	public String getName() {
		if (getType() == OmttParser.OP_GENERAL)
			return Symbol.CONTEXT;
		else if (getType() == OmttParser.IT)
			return Symbol.IT;
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
		String ns = getNamespace();
		boolean checkContext = true;
		if (NS_SUPER.equals(ns)) {
			st = st.getParent();
			ns = null;
		} else if (NS_LOCAL.equals(ns)) {
			checkContext = false;
			ns = null;
		} else if (NS_GLOBAL.equals(ns)) {
			checkContext = false;
			ns = null;
			st = st.getBase();
		}
		if (ns != null) {
			if (setFromSymbolTableNs(st, ns)) {
				fSource = SOURCE_NS;
				return;
			}
		} else {
			if (setFromSymbolTable(st, false)) {
				fSource = SOURCE_LOCAL;
				return;
			}
			if (checkContext && setFromContextObject(st)) {
				fSource = SOURCE_CONTEXT_OBJECT;
				return;
			}
			SymbolTable pst = st instanceof BaseSymbolTable ? st : st.getParent();
			if (pst != null && setFromSymbolTable(pst, true)) {
				fSource = SOURCE_LOCAL;
				return;
			}
		}
		fType = ErrorType.instance();
		fSource = SOURCE_NONE;
		throw new TypeException(getToken(), "symbol " + getName()
				+ " not found");
	}

	private boolean setFromContextObject(SymbolTable st) {
		fSymbol = st.find(Symbol.CONTEXT);
		if (fSymbol == null)
			return false;
		try {
			fProperty = PropertySelect.findProperty(fSymbol.getType(), getName());
		} catch (TypeException e) {
			return false;
		}		
		if (fProperty == null)
			return false;
		fType = fProperty.type;
		return true;
	}

	private boolean setFromSymbolTable(SymbolTable st, boolean recursively) {
		fSymbol = st.find(getName(), recursively);
		if (fSymbol == null)
			return false;
		fType = fSymbol.getType();
		return true;
	}

	private boolean setFromSymbolTableNs(SymbolTable st, String ns) {
		fSymbol = st.getBase().find(getName(), ns);
		if (fSymbol == null)
			return false;
		fType = fSymbol.getType();
		return true;
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

	public final static String NS_SUPER = "super";
	public final static String NS_LOCAL = "local";
	public final static String NS_GLOBAL = "global";
	
	public final static int SOURCE_NONE = 0;
	public final static int SOURCE_CONTEXT_OBJECT = 1;
	public final static int SOURCE_LOCAL = 2;
	public final static int SOURCE_NS = 3;
}
