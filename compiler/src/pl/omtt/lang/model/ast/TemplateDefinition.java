package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.compiler.reporting.Problem;
import pl.omtt.lang.analyze.ForceSymbolTableRecalculatingException;
import pl.omtt.lang.analyze.ISymbolTableDualParticipant;
import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.MultiSymbol;
import pl.omtt.lang.analyze.SemanticException;
import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.GenericType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypePointer;
import pl.omtt.lang.model.types.TypeUnifier;
import pl.omtt.lang.model.types.FunctionType.Argument;

public class TemplateDefinition extends CommonNode implements
		ISymbolTableOwner, ISymbolTableDualParticipant, IExpression, IVisitable {
	IType fType;
	Symbol fSymbol;
	Symbol fItSymbol;

	private boolean fForceSequenceReturn = false;

	public TemplateDefinition(Token token) {
		super(token);
	}

	public TemplateDefinition(int token) {
		super(new CommonToken(token));
	}

	public boolean isContext() {
		return fItSymbol != null;
	}

	public boolean isFunction() {
		return isContext() || getArgumentsCount() > 0;
	}

	public TemplateArgument getArgument(int i) {
		return (TemplateArgument) getArgumentsNode().getChild(i);
	}

	public int getArgumentsCount() {
		if (getArgumentsNode() == null)
			return 0;
		else 
			return getArgumentsNode().getChildCount();
	}

	public Ident getTemplateNameIdent() {
		try {
			return (Ident) getChild(0);
		} catch (Exception e) {
			return null;
		}
	}

	public CommonToken getTemplateNameToken() {
		try {
			return (CommonToken) getTemplateNameIdent().getToken();
		} catch (Exception e) {
			return null;
		}
	}

	public String getTemplateName() {
		Ident ident = getTemplateNameIdent();
		if (ident == null)
			return null;
		else
			return ident.getName();
	}

	public Symbol getSymbol() {
		return fSymbol;
	}

	public Symbol getItSymbol() {
		return fItSymbol;
	}

	@Override
	public void takeSymbolTable(SymbolTable ST) throws SemanticException {
		IType returnType;
		if (getReturnsTypeNode() != null) {
			returnType = getReturnsTypeNode().get(ST);
			if (returnType == null)
				returnType = ErrorType.instance();
		} else if (getBodyNode() instanceof Data) {
			returnType = new StringDataType();
		} else {
			returnType = new TypePointer(new GenericType());
			if (fForceSequenceReturn)
				returnType.setSequence();
		}

		Tree args = getArgumentsNode();
		Tree contextnode = getContextNode();
		if ((args == null || args.getChildCount() == 0) && contextnode == null) {
			fType = returnType;
		} else {
			FunctionType type = new FunctionType();
			type.setNotNull();

			if (contextnode != null) {
				IType contexttype = ((TypeReference) contextnode.getChild(0))
						.get(ST);
				if (contexttype == null)
					contexttype = ErrorType.instance();
				fItSymbol = new Symbol(Symbol.IT, contexttype);
				ST.put(fItSymbol);
				ST.setAlias(fItSymbol, Symbol.CONTEXT);
				type.putArgument(Symbol.IT, contexttype, false);
				type.setContext(true);
			}

			if (!(args == null))
				for (int i = 0; i < getArgumentsCount(); i++) {
					final TemplateArgument arg = getArgument(i);
					final String argname = arg.getArgumentName();
					final boolean argoptional = arg.isArgumentOptional();
					final IType argtype = arg.getArgumentType();
					try {
						type.putArgument(argname, argtype, argoptional);
					} catch (TypeException e) {
						e.setCauseObject(arg);
						fType = ErrorType.instance();
						try {
							setSymbol(ST);
						} catch (TypeException sse) {
						}
						throw e;
					}
				}
			type.setReturnType(returnType);
			fType = type;
		}
		setSymbol(ST);
	}

	private void setSymbol(SymbolTable ST) throws SemanticException {
		fSymbol = new Symbol(getTemplateName(), fType);
		Symbol covering = ST.getParent().find(getTemplateName(), false);

		if (isContext()) {
			final MultiSymbol ms;
			if (covering != null) {
				if (!(covering instanceof MultiSymbol))
					throw new TypeException(getTemplateNameToken(),
							"single-template " + getTemplateName()
									+ " was defined yet");
				ms = (MultiSymbol) covering;
			} else {
				ms = new MultiSymbol(getTemplateName(), (FunctionType) fSymbol
						.getType());
				ST.getParent().put(ms);
			}
			try {
				ms.addParticipant(fSymbol);
			} catch (TypeException e) {
				e.setCauseObject(getTemplateNameToken());
				throw e;
			}
		} else {
			ST.getParent().put(fSymbol);
			if (getParent() instanceof Program && covering != null) {
				throw new SemanticException(getTemplateNameIdent().getToken(),
						"template with name " + getTemplateName()
								+ " was declared yet and will not be exported",
						Problem.WARNING);
			}
		}
	}

	public Tree getContextNode() {
		return getFirstChildWithType(OmttParser.ARGUMENT);
	}

	public IExpression getContextWhereNode () {
		Tree context = getContextNode();
		if (context != null)
			return (IExpression)context.getChild(1);
		else
			return null;
	}

	@Override
	public Tree[] getTreePrecedingParticipatingST() {
		return new Tree[] {getArgumentsNode()};
	}

	@Override
	public Tree[] getTreeFollowingParticipatingST() {
		return new Tree[] {getContextNode(), getChild(getChildCount() - 1)};
	}

	public Tree getArgumentsNode() {
		return getFirstChildWithType(OmttParser.ARGUMENTS);
	}

	public TypeReference getReturnsTypeNode() {
		Tree returnsNode = getFirstChildWithType(OmttParser.RETURNS);
		if (returnsNode == null)
			return null;
		else
			return (TypeReference) returnsNode.getChild(0);
	}

	public IExpression getBodyNode() {
		return (IExpression) getChild(getChildCount() - 1);
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable)
			throws TypeException, ForceSymbolTableRecalculatingException {
		getTemplateNameIdent().setExpressionType(symbolTable);

		IType bodyType = getBodyNode().getExpressionType();
		IType returnType;
		if (fType instanceof FunctionType)
			returnType = ((FunctionType) fType).getReturnType();
		else
			returnType = fType;

		if (bodyType.isSequence() && !returnType.isSequence()
				&& getReturnsTypeNode() == null) {
			fForceSequenceReturn = true;
			throw new ForceSymbolTableRecalculatingException();
		}

		try {
			if (returnType.isFrozen())
				TypeUnifier.unifyLe(returnType, bodyType);
			else
				TypeUnifier.unifyEq(returnType, bodyType);
		} catch (TypeException e) {
			e.setCauseObject(getBodyNode());
			throw e;
		} finally {
			if (getParent() instanceof Program)
				fType.freeze();
		}
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(getTemplateName());
		if (fType == null) {
		} else if (fType.isFunction()) {
			FunctionType funtype = (FunctionType) fType;
			for (int i = 0; i < funtype.getArgumentLength(); i++) {
				Argument a = funtype.getArgument(i);
				buf.append(" ");
				if (a == null || a.type == null) {
					buf.append("<error>");
					continue;
				}
				if (a.optional)
					buf.append("~");
				if (isContext() && i == 0) {
					buf.append("[").append(a.type).append("]");
				} else {
					buf.append(a.name);
					if (a.type.isGeneral() && !a.type.isGeneric()) {
						if (a.type.isSequence())
							buf.append("*");
					} else {
						buf.append(".").append(a.type);
					}
				}
			}
			buf.append(" : ").append(
					((FunctionType) fType.getEffectiveLowerBound())
							.getReturnType());
		} else {
			buf.append(" : ").append(fType);
		}
		return buf.toString();
	}
}
