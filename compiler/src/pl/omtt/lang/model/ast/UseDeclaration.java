package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.symboltable.ISymbolTableParticipant;
import pl.omtt.lang.symboltable.SymbolTable;

public class UseDeclaration extends CommonNode implements IVisitable, ISymbolTableParticipant {
	public String fAlias;

	public UseDeclaration(int token_type, Token token, Token as) {
		this.token = token;
		if (as != null)
			fAlias = as.getText();
	}

	public UseDeclaration(int tokenType, Token token) {
		this(tokenType, token, null);
	}

	public String getUseId () {
		StringBuffer buf = new StringBuffer ();
		Tree idnode = getChild(0);
		for (int i = 0; i < idnode.getChildCount(); i++) {
			if (i > 0)
				buf.append(".");
			buf.append(idnode.getChild(i).toString());
		}
		return buf.toString();
	}

	public String getTargetNs () {
		if (getChildCount() > 1)
			return getChild(1).getText();
		else
			return null;
	}
	
	@Override
	public void takeSymbolTable(SymbolTable symbolTable) throws TypeException {
		symbolTable.getBase().importLibrary(getUseId(), getTargetNs());
	}

	public String toString() {
		return "use " + getUseId();
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
