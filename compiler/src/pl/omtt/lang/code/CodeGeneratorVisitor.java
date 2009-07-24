package pl.omtt.lang.code;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import pl.omtt.core.Constants;
import pl.omtt.core.OmttLoader;
import pl.omtt.lang.model.AbstractTreeWalker;
import pl.omtt.lang.model.ast.*;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NullType;
import pl.omtt.lang.model.types.NumericType;
import pl.omtt.lang.model.types.ScalarType;
import pl.omtt.lang.model.types.FunctionType.Argument;
import pl.omtt.lang.symboltable.BaseSymbolTable;
import pl.omtt.lang.symboltable.Symbol;
import pl.omtt.lang.symboltable.SymbolTable;

public class CodeGeneratorVisitor extends AbstractTreeWalker {
	final JavaTypesAdapter fTypeAdapter = new JavaTypesAdapter();
	final CodeBuffer fBuffer = new CodeBuffer(fTypeAdapter);

	// document attributes
	URI fOmttSourceURI;
	String fModuleName, fPackageName;
	BaseSymbolTable fBaseSymbolTable;

	// helper maps
	final Map<Symbol, String> fFunctionIterfaceNames = new HashMap<Symbol, String>();
	final Map<Symbol, String> fSymbolLocalNames = new HashMap<Symbol, String>();
	final Set<String> fVariableIsMethod = new HashSet<String>();

	public CodeGeneratorVisitor(URI omttSourceURI) {
		fOmttSourceURI = omttSourceURI;
	}

	protected IType single(IType type) {
		final IType dup = type.dup();
		dup.unsetSequence();
		return dup;
	}

	protected String condition(IExpression expr) {
		final String var = fBuffer.getVariable(expr);
		final IType type = expr.getExpressionType();

		final StringBuffer buf = new StringBuffer();
		if (!type.isNotNull())
			buf.append(var).append(" != null && ");

		if (type.isSequence())
			buf.append("!").append(var).append(".isEmpty()");
		else if (type.isBoolean())
			buf.append(var);
		else
			buf.append("!").append(var).append(".equals(false)");
		return buf.toString();
	}

	/**
	 * <u>Caution:</u> no null checking is done.
	 * 
	 * @param var
	 *            casting variable name
	 * @param sourceType
	 *            source type
	 * @param targetType
	 *            target type
	 * @return string representing <code>var</code> casted from
	 *         <code>sourceType</code> to <code>targetType</code>
	 */
	protected String cast(String var, IType sourceType, IType targetType) {
		if (sourceType.getEffectiveLowerBound() instanceof NullType) {
			return "null";
		}

		if (targetType.isSequence() && !sourceType.isSequence()) {
			// wrap single into sequence
			final String tempvar = fBuffer.getTemporaryVariable();
			fBuffer.putl("List %s = new ArrayList();", tempvar);
			final String castedvar = cast(var, sourceType, single(targetType));
			fBuffer.putl("if (%s != null) %s.add(%s);", castedvar, tempvar,
					castedvar);
			return tempvar;
		} else if (!targetType.isSequence() && sourceType.isSequence()) {
			if (targetType.isBoolean()) {
				return var + ".isEmpty()";
			}
			// TODO: extract single from sequence
			throw new CodeGenerationError("[1] unimplemented cast");
		} else if (targetType.isSequence() && sourceType.isSequence()) {
			if (targetType.isFunction()) {
				throw new CodeGenerationError("[2] unimplemented cast: "
						+ sourceType + " ~~> " + targetType);
			}
			if (sourceType.essentiallyEquals(targetType))
				return var;

			StringBuffer buf = new StringBuffer();
			final boolean retObject = targetType.isGeneral();
			if (!retObject)
				buf.append("(Collection<").append(
						fTypeAdapter.getSingle(targetType)).append(">)(");
			buf.append("(Collection)(").append(var).append(")");
			if (!retObject)
				buf.append(")");
			return buf.toString();
		} else {
			// both single
			StringBuffer buf = new StringBuffer();
			if (sourceType.isFunction() && targetType.isFunction()) {
				if (fTypeAdapter.get(sourceType).equals(
						fTypeAdapter.get(targetType)))
					return var;
				return instantiateFunction(var + ".run", sourceType, targetType);
			} else if (sourceType.getEffectiveLowerBound().essentiallyEquals(
					targetType.getEffectiveLowerBound())) {
				return var;
			} else if (String.class.equals(targetType.getAssociatedClass())) {
				buf.append(var).append(".toString()");
			} else if (targetType.isNumeric() && sourceType.isNumeric()) {
				buf.append("new ").append(fTypeAdapter.get(targetType));
				buf.append("(").append(var).append(")");
			} else if (sourceType.isSubtypeOf(targetType
					.getEffectiveLowerBound())) {
				return var;
			} else if (targetType.isNumeric()) {
				if (((NumericType) targetType.getEffectiveLowerBound())
						.isReal())
					return String.format(
							"new Double(((Number)%s).doubleValue())", var);
				else
					return String.format("(Integer)%s", var);
			} else if (targetType.isBoolean()) {
				if (sourceType.isBoolean())
					return var;
				else
					// not-null non-boolean always evaluates to true
					return "Boolean.TRUE";
			} else {
				buf.append("(").append(fTypeAdapter.get(targetType))
						.append(")");
				buf.append(var);
			}
			return buf.toString();
		}
	}

	protected String instantiateFunction(String call, IType sourceType,
			IType targetType) {
		FunctionType sourcef = (FunctionType) sourceType
				.getEffectiveLowerBound();
		FunctionType targetf = (FunctionType) targetType
				.getEffectiveLowerBound();

		final String targetJType = jtype(targetType);

		final String instvar = fBuffer.getTemporaryVariable();
		fBuffer.putl("final %s %s = new %s () {", targetJType, instvar,
				targetJType);
		fBuffer.incIndentitation();
		final String sigtemplate = signatureTemplate(targetf);
		fBuffer.putl(sigtemplate + " {", "run");
		fBuffer.incIndentitation();

		StringBuffer buf = new StringBuffer();
		buf.append(call).append("(");
		if (targetf.getReturnType().isSingleData())
			buf.append(fBuffer.getCurrentBuffer()).append(", ");
		for (int i = 0; i < targetf.getArguments().size(); i++) {
			Argument sourcearg = sourcef.getArguments().get(i);
			Argument targetarg = targetf.getArguments().get(i);
			String argname = targetarg.name;
			if (argname == null)
				argname = "arg" + i;
			buf.append(cast(argname, targetarg.type, sourcearg.type));
			if (i < targetf.getArguments().size() - 1)
				buf.append(", ");
		}
		buf.append(")");
		if (targetf.getReturnType().isSingleData())
			fBuffer.putl("%s;", buf.toString());
		else
			fBuffer.putl("return %s;", cast(buf.toString(), sourcef
					.getReturnType(), targetf.getReturnType()));

		fBuffer.subIndentitation();
		fBuffer.putl("}");
		fBuffer.subIndentitation();
		fBuffer.putl("};");
		return instvar;
	}

	protected String cast(IExpression node, IType targetType) {
		return cast(fBuffer.getSafeReference(node), node.getExpressionType(),
				targetType);
	}

	protected String collection(IType type) {
		final String var = fBuffer.getTemporaryVariable();
		fBuffer.putl("final List<%s> %s = new ArrayList<%s>();",
				jtype(single(type)), var, jtype(single(type)));
		return var;
	}

	protected String retrbuffer() {
		final String var = fBuffer.popBuffer();
		return "(" + var + ".length() == 0 ? null : " + var + ".toString())";
	}

	protected String checkNull(String var, IType type) {
		if (type.isSequence())
			return var + ".isEmpty()";
		else
			return var + " == null";
	}

	protected String checkNotNull(String var, IType type) {
		if (type.isSequence())
			return "!" + var + ".isEmpty()";
		else
			return var + " != null";
	}

	protected void declareAlias(IExpression e) {
		if (!(e instanceof CommonSelectorNode))
			return;
		CommonSelectorNode snode = (CommonSelectorNode) e;
		if (snode.getAliasSymbol() != null)
			fSymbolLocalNames.put(snode.getAliasSymbol(), fBuffer
					.getVariable(snode));
	}

	protected String jtype(IType type) {
		/*
		 * if (type.isFunction()) { FunctionType funtype = (FunctionType)
		 * type.getEffectiveLowerBound(); if
		 * (!fTypeAdapter.containsFunction(funtype)) signatureTemplate(funtype);
		 * }
		 */
		return fTypeAdapter.get(type);
	}

	protected String jsingletype(IType type) {
		return jtype(single(type));
	}

	public void visit(Program program) {
		fBaseSymbolTable = program.getSymbolTable();
		ModuleDeclaration md = program.getModuleDeclaration();

		if (md != null)
			fPackageName = Constants.OMTT_TEMPLATE_PACKAGE + "."
					+ md.getPackageName();
		else
			fPackageName = Constants.OMTT_TEMPLATE_PACKAGE + ".local";
		fBuffer.putl("package %s;\n", fPackageName);

		fBuffer.putl("import java.util.*;\n");
		fBuffer.putl("import pl.omtt.core.annotations.OmttModule;");
		fBuffer.putl("import pl.omtt.core.stdlib.*;");
		fBuffer.putl("import pl.omtt.core.functions.*;");
		apply(program.getImportsNode());
		fBuffer.putnl();

		if (md != null)
			fModuleName = md.getModuleName();
		fModuleName = fModuleName.substring(0, 1).toUpperCase()
				+ fModuleName.substring(1);

		fBuffer.putl("@OmttModule");
		fBuffer.putl("public class %s {", fModuleName);

		fBuffer.incIndentitation();
		applyChildren(TemplateDefinition.class);
		fBuffer.putSpace("methods");
		fBuffer.putSpace("interfaces");
		fBuffer.chop(1);
		fBuffer.subIndentitation();

		fBuffer.putl("}");
	}

	public void visit(ModuleDeclaration node) {
		fBuffer.putl("package %s;", node.getPackageName());
	}

	public void visit(ImportDeclaration node) {
		fBuffer.putl("import %s;", node.getImportingClasses());
	}

	private void visitFunction(TemplateDefinition def, FunctionType type) {
		IType rettype = type.getReturnType();
		final boolean inner = !(def.getParent() instanceof Program);
		final boolean flushBuffer = rettype.isSingleData();

		final String stemplate = signatureTemplate(type);

		if (inner) {
			final String var = fBuffer.getTemporaryVariable();
			final String jtype = fTypeAdapter.get(type);
			fSymbolLocalNames.put(def.getSymbol(), var);
			fBuffer.putl("final %s %s = new %s () {", jtype, var, jtype);
			fBuffer.incIndentitation();

			fBuffer.putl(stemplate + " {", "run");
		} else {
			fBuffer.putl("@Type(\"%s\")", def.getExpressionType().toString());
			fBuffer.putl("static " + stemplate + " {", def.getTemplateName());
		}
		fBuffer.pushBuffer("$buffer");
		fBuffer.incIndentitation();

		for (int i = 0; i < def.getArgumentsCount(); i++) {
			final TemplateArgument ta = def.getArgument(i);
			fSymbolLocalNames.put(ta.getSymbol(), ta.getArgumentName());
		}
		final IExpression body = def.getBodyNode();
		apply(body);
		if (!flushBuffer) {
			fBuffer.putl("return %s;", fBuffer.getReference(body));
		}

		fBuffer.subIndentitation();
		fBuffer.popBuffer();

		if (!inner) {
			fBuffer.putl("}\n");
		} else {
			fBuffer.putl("}");
			fBuffer.subIndentitation();
			fBuffer.putl("};");
		}
	}

	/*
	 * private String functionInterfaceName(Symbol s) { if
	 * (fFunctionIterfaceNames.containsKey(s)) return
	 * fFunctionIterfaceNames.get(s); String ifname = "IFunction" +
	 * s.getName().substring(0, 1).toUpperCase() + s.getName().substring(1) +
	 * fBuffer.getTemporaryVariable(); fFunctionIterfaceNames.put(s, ifname);
	 * return ifname; }
	 */
	private String signatureTemplate(FunctionType ftype) {
		IType rettype = ftype.getReturnType();

		StringBuffer sig = new StringBuffer();
		sig.append("public ");
		if (rettype.isSingleData())
			sig.append("void");
		else
			sig.append(jtype(rettype));

		sig.append(" %s (");

		if (rettype.isSingleData())
			sig.append("final TextBuffer $buffer, ");
		for (int i = 0; i < ftype.getArguments().size(); i++) {
			Argument a = ftype.getArguments().get(i);

			if (a.optional)
				sig.append("@Optional ");
			if (a.name != null)
				sig.append("@Name(\"").append(a.name).append("\") ");

			sig.append("final ");
			sig.append(jtype(a.type)).append(" ");
			if (a.name == null)
				sig.append("arg").append(i).append(", ");
			else
				sig.append(a.name).append(", ");
		}
		sig.delete(sig.length() - 2, sig.length());
		sig.append(")");

		setFunctionSignature(ftype, sig.toString());

		return sig.toString();
	}

	private void setFunctionSignature(FunctionType ftype, String stemplate) {
		/*
		 * if (fTypeAdapter.containsFunction((FunctionType) single(ftype)))
		 * return; String ifname = "IFunctionSignature" +
		 * fBuffer.getTemporaryVariable();
		 * fTypeAdapter.putFunction((FunctionType) single(ftype), ifname);
		 * 
		 * fBuffer.activate(ifname); fBuffer.setIndentitation(1);
		 * fBuffer.putl("public interface %s {", ifname);
		 * fBuffer.incIndentitation(); fBuffer.putl("%s;",
		 * String.format(stemplate, "run")); fBuffer.subIndentitation();
		 * fBuffer.putl("}\n"); fBuffer.flush("interfaces");
		 */}

	private void visitVariable(TemplateDefinition def, IType type) {
		fBuffer.putl("final %s %s = %s;", jtype(type), def.getTemplateName(),
				exprapply(def.getBodyNode()));
	}

	public void visit(TemplateDefinition def) {
		IType type = def.getExpressionType();
		IType efftype = type.getEffectiveLowerBound();

		if (efftype instanceof FunctionType && !type.isSequence()) {
			visitFunction(def, (FunctionType) efftype);
		} else {
			visitVariable(def, type);
		}
	}

	public void visit(LambdaExpression lambda) {
		FunctionType funtype = (FunctionType) lambda.getExpressionType();
		final String sigtemplate = signatureTemplate(funtype);
		final String jtype = jtype(lambda.getExpressionType());
		final String var = fBuffer.getTemporaryVariable();

		fBuffer.putl("// %s", lambda.toString());
		fBuffer.putl("final %s %s = new %s () {", jtype, var, jtype);
		fBuffer.incIndentitation();
		fBuffer.putl(sigtemplate + " {", "run");
		fBuffer.incIndentitation();
		apply(lambda.getBodyNode());
		if (!lambda.getBodyNode().getExpressionType().isSingleData())
			fBuffer.putl("return %s;", cast(lambda.getBodyNode(), funtype
					.getReturnType()));
		fBuffer.subIndentitation();
		fBuffer.putl("}");
		fBuffer.subIndentitation();
		fBuffer.putl("};");

		fBuffer.putVariable(lambda, var);
	}

	public void visit(Data data) {
		if (data.getChildCount() > 0)
			for (Object child : data.getChildren())
				if (child instanceof IExpression) {
					IExpression expr = (IExpression) child;
					apply(expr);
					if (expr.getExpressionType().isSingleData())
						continue;
					fBuffer.putData("%s", fBuffer.getReference(expr));
				}
	}

	public void visit(Literal literal) {
		fBuffer.putVariable(literal, fTypeAdapter.getLiteral(literal));
	}

	public void visit(Range range) {
		apply();
		final IType type = range.getExpressionType();
		fBuffer.putExpression(range, "%s", fTypeAdapter.getInstance(type));

		final IType lefttype = range.getLeftNode().getExpressionType();
		final IType righttype = range.getRightNode().getExpressionType();
		final String leftvar = fBuffer.getSafeReference(range.getLeftNode());
		final String rightvar = fBuffer.getSafeReference(range.getRightNode());

		String nullcheck = "";
		if (!lefttype.isNotNull())
			nullcheck += leftvar + " != null";
		if (!righttype.isNotNull())
			nullcheck += (!lefttype.isNotNull() ? " || " : "") + rightvar
					+ " != null";
		if (nullcheck.length() > 0) {
			fBuffer.putl("if (%s) {", nullcheck);
			fBuffer.incIndentitation();
		}

		final String ivar = fBuffer.getTemporaryVariable();
		fBuffer.putl("if (%s > %s)", leftvar, rightvar);
		fBuffer.putl("\tfor (int %s = %s; %s >= %s; %s--)", ivar, leftvar,
				ivar, rightvar, ivar);
		fBuffer.putl("\t\t%s.add(%s);", fBuffer.getReference(range), ivar);

		fBuffer.putl("else", leftvar, rightvar);
		fBuffer.putl("\tfor (int %s = %s; %s <= %s; %s++)", ivar, leftvar,
				ivar, rightvar, ivar);
		fBuffer.putl("\t\t%s.add(%s);", fBuffer.getReference(range), ivar);

		if (nullcheck.length() > 0) {
			fBuffer.subIndentitation();
			fBuffer.putl("}");
		}
	}

	public void visit(ArithmeticExpression expr) {
		char op = '?';
		switch (expr.getOperation()) {
		case ArithmeticExpression.ADD:
			op = '+';
			break;
		case ArithmeticExpression.SUB:
			op = '-';
			break;
		case ArithmeticExpression.DIV:
			op = '/';
			break;
		case ArithmeticExpression.MUL:
			op = '*';
			break;
		case ArithmeticExpression.MOD:
			op = '%';
			break;
		}

		final IType lefttype = expr.getLeftNode().getExpressionType();
		final IType righttype = expr.getRightNode().getExpressionType();

		if (lefttype.isNull() || righttype.isNull()) {
			fBuffer.putShortExpression(expr, "null");
			return;
		}

		final String leftvar = exprapply(expr.getLeftNode());
		final String rightvar = exprapply(expr.getRightNode());

		StringBuffer buf = new StringBuffer();
		boolean nullcheck = false;
		if (!lefttype.isNotNull()) {
			buf.append(leftvar).append(" == null");
			nullcheck = true;
		}
		if (!righttype.isNotNull()) {
			if (nullcheck)
				buf.append(" || ");
			else
				nullcheck = true;
			buf.append(rightvar).append(" == null");
		}
		if (nullcheck)
			buf.append(" ? null : ");
		buf.append(leftvar).append(" ").append(op).append(" ").append(rightvar);
		fBuffer.putShortExpression(expr, "%s", buf.toString());
	}

	public void visit(ArithmeticMinus expr) {
		final String var = exprapply(expr.getBodyNode());
		fBuffer.putShortExpression(expr, "-%s", var);
	}

	public void visit(final Call call) {
		final IExpression callingNode = call.getCallingNode();
		final IType rettype = call.getExpressionType();
		final IType callrettype = call.getCallingType().getReturnType();
		final boolean flushData = rettype.isSingleData()
				&& !rettype.isSequence();
		final boolean iterate = call.isIterateSequence();

		final StringBuffer argbuf = new StringBuffer();
		for (int i = iterate ? 1 : 0; i < call.getArgumentLength(); i++) {
			apply(call.getArgument(i));
			argbuf.append(callArgument(call, i));
			if (i != call.getArgumentLength() - 1)
				argbuf.append(", ");
		}
		final String argsep = argbuf.length() == 0 ? "" : ", ";

		String callstr = null;
		if (callingNode instanceof Ident) {
			callstr = getDirectMethodName((Ident) callingNode);
			if (callstr == null) {
				Tree t = callingNode;
				final Symbol symbol = ((Ident) callingNode).getSymbol();
				while (t != null) {
					if (t instanceof TemplateDefinition) {
						if (((TemplateDefinition) t).getSymbol().equals(symbol))
							callstr = "run";
						break;
					}
					t = t.getParent();
				}
				if (callstr == null) {
					apply(callingNode);
					callstr = fBuffer.getReference(callingNode) + ".run";
				}
			}
		} else {
			apply(callingNode);
			callstr = "(" + fBuffer.getReference(callingNode) + ").run";
		}
		final String callvar = callstr;

		if (flushData) {
			if (!iterate) {
				fBuffer.putl("%s(%s%s%s);", callvar,
						fBuffer.getCurrentBuffer(), argsep, argbuf);
				return;
			}

			// iterate
			final FunctionArgument a = call.getArgument(0);
			apply(a);
			final String avar = fBuffer.getTemporaryVariable();
			fBuffer.putl("%s %s = %s;",
					fTypeAdapter.get(a.getExpressionType()), avar,
					callArgument(call, 0));
			fBuffer.putl("if(%s != null) %s(%s, %s%s%s);", avar, callvar,
					fBuffer.getCurrentBuffer(), avar, argsep, argbuf);
		} else {
			if (!iterate) {
				final String res = String.format("%s(%s)", callvar, argbuf);
				fBuffer
						.putSafeExpression(call,
								cast(res, callrettype, rettype));
				return;
			}
			new FoldCode(call).fold(new IFoldCodeFragment() {
				@Override
				public String get(String var) {
					var = cast(var, single(call.getBaseNode()
							.getExpressionType()), call.getCallingType()
							.getArguments().get(0).type);
					if (callrettype.isSingleData()) {
						fBuffer.initBuffer();
						fBuffer.putl("%s(%s, %s%s%s);", callvar, fBuffer
								.getCurrentBuffer(), var, argsep, argbuf
								.toString());
						return retrbuffer();

					} else {
						final String res = String.format("%s(%s%s%s)", callvar,
								var, argsep, argbuf.toString());
						return cast(res, callrettype,
								call.isItemSequence() ? rettype
										: single(rettype));
					}
				}
			});
		}
	}

	private String callArgument(Call call, int i) {
		FunctionArgument farg = call.getArgument(i);
		if (farg == null)
			return "null";
		final IType neededType = call.getCallingType().getArguments().get(i)
				.type;
		return cast(farg, neededType);
	}

	public void visit(final Transformation transform) {
		new FoldCode(transform).fold(new IFoldCodeFragment() {
			@Override
			public String get(String var) {
				fSymbolLocalNames.put(transform.getItSymbol(), var);
				return exprapply(transform.getTransformationNode());
			}
		});
	}

	public void visit(Sequence seq) {
		final IType type = seq.getExpressionType();
		if (type.getEffectiveLowerBound() instanceof NullType) {
			fBuffer.putSafeExpression(seq, "null");
			return;
		} else if (!type.isSequence()) {
			apply();
			fBuffer.putShortExpression(seq, "%s", fBuffer.getReference(seq
					.getChild(0)));
			return;
		}

		final String var = collection(type);
		for (int i = 0; i < seq.getChildCount(); i++) {
			IExpression cnode = seq.getChild(i);
			IType ctype = cnode.getExpressionType();

			if (ctype.isSequence())
				fBuffer.putl("%s.addAll(%s);", var, cast(exprapply(cnode),
						ctype, type));
			else
				fBuffer.putl("%s.add(%s);", var, cast(exprapply(cnode), ctype,
						single(type)));
		}
		fBuffer.putShortExpression(seq, var);
	}

	protected String exprapply(IExpression e) {
		if (e.getExpressionType().isSingleData()) {
			fBuffer.initBuffer();
			apply(e);
			fBuffer.putExpression(e, retrbuffer());
		} else {
			apply(e);
		}
		return fBuffer.getVariable(e);
	}

	public void visit(FunctionArgument argument) {
		IExpression target = argument.getTargetNode();
		fBuffer.putSafeExpression(argument, "%s", exprapply(target));
	}

	@Override
	public void visit(Ident ident) {
		String var;
		final Symbol s = ident.getSymbol();
		if (fSymbolLocalNames.containsKey(s))
			var = fSymbolLocalNames.get(s);
		else if (getDirectMethodName(ident) != null)
			var = getDirectMethodName(ident);
		else
			var = ident.getName();

		final IType type = ident.getExpressionType();
		if (type.isFunction()) {
			final SymbolTable ownerST = ident.getSymbol().getParentST();
			if (ownerST.getBase().contains(ident.getSymbol())) {
				var = instantiateFunction(var, type, type);
			}
		} else if (type.isSingleData()) {
			fBuffer.putl("%s.append(%s);", fBuffer.getCurrentBuffer(), var);
			return;
		}
		fBuffer.putVariable(ident, var);
	}

	private String getDirectMethodName(Ident ident) {
		final Symbol s = ident.getSymbol();
		if (!s.getParentST().getBase().getId().equals(fBaseSymbolTable.getId())) {
			final String modcls = OmttLoader.getModuleClassName(s.getParentST()
					.getBase().getId());
			return modcls + "." + ident.getName();
		} else if (s.getParentST() == fBaseSymbolTable) {
			return ident.getName();
		} else {
			return null;
		}
	}

	public void visit(final AtomSelect select) {
		new FoldCode(select).fold(new IFoldCodeFragment() {
			@Override
			public String get(String var) {
				return var;
			}
		});
	}

	public void visit(final PropertySelect select) {
		new FoldCode(select).fold(new IFoldCodeFragment() {
			@Override
			public String get(String var) {
				StringBuffer buf = new StringBuffer();
				final boolean wrapType = select.isMethodNeedsTypeWrapping()
						&& !select.getExpressionType().isSequence();
				if (wrapType)
					buf.append("new ").append(
							fTypeAdapter.get(select.getExpressionType()))
							.append("(");
				buf.append(var).append(".")
						.append(select.getMethod().getName()).append("()");
				if (wrapType)
					buf.append(")");
				return buf.toString();
			}
		});
	}

	public void visit(Block block) {
		apply();
		String expr = fBuffer.getReference(block.getInBody());
		fBuffer.putSafeExpression(block, expr);
	}

	public void visit(IfElse expr) {
		final IType ietype = expr.getExpressionType();
		final boolean data = ietype.isSingleData();

		if (!data)
			fBuffer.initExpression(expr);

		IExpression condition = expr.getConditionNode();
		IExpression ifNode = expr.getIfExpression();
		IExpression elseNode = expr.getElseExpression();

		apply(condition);
		fBuffer.putl("if (%s) {", condition(condition));
		fBuffer.incIndentitation();
		if (!data) {
			exprapply(ifNode);
			fBuffer.assignExpression(expr, "%s;\n", cast(ifNode, expr
					.getExpressionType()));
		} else {
			apply(ifNode);
		}
		fBuffer.subIndentitation();
		fBuffer.putl("}");
		fBuffer.putl("else {");
		fBuffer.incIndentitation();
		if (!data) {
			exprapply(elseNode);
			fBuffer.assignExpression(expr, "%s;\n", cast(elseNode, expr
					.getExpressionType()));
		} else {
			apply(elseNode);
		}
		fBuffer.subIndentitation();
		fBuffer.putl("}");
	}

	public void visit(BooleanExpression bexpr) {
		final IType btype = bexpr.getExpressionType();
		StringBuffer buf = new StringBuffer();

		switch (bexpr.getOperatorType()) {
		case BooleanExpression.TYPE_UNARY_OP:
			final IExpression node = bexpr.getLeftNode();
			final String var = exprapply(node);
			if (bexpr.getOperator() == BooleanExpression.OP_NOT) {
				putNullCheck(buf, var, node.getExpressionType());
				buf.append("Boolean.FALSE.equals(").append(var).append(")");
			} else
				throw new CodeGenerationError();
			break;

		case BooleanExpression.TYPE_BINARY_OP:
			// initialize output variable -> outvar
			fBuffer.initExpression(bexpr);
			final String outvar = fBuffer.getVariable(bexpr);

			final IExpression leftNode = bexpr.getLeftNode();
			final IExpression rightNode = bexpr.getRightNode();
			final IType leftType = leftNode.getExpressionType();
			final IType rightType = rightNode.getExpressionType();

			// evaluate left node
			String leftVar = exprapply(leftNode);
			String rightVar;

			// determine where to check for boolean values
			final IType boolType = ScalarType.fromClass(Boolean.class);
			final boolean checkBool = boolType.isSubtypeOf(btype);
			final boolean leftCheckBool = boolType.isSubtypeOf(leftType);
			final boolean rightCheckBool = boolType.isSubtypeOf(rightType);

			switch (bexpr.getOperator()) {
			case BooleanExpression.OP_AND:
				if (leftCheckBool) {
					fBuffer.putl("if (Boolean.FALSE.equals(%s)) {", leftVar);
					fBuffer.incIndentitation();
					fBuffer.putl("%s = Boolean.FALSE;", outvar);
					fBuffer.subIndentitation();
					fBuffer.putl("}");
					fBuffer.putl("else {");
					fBuffer.incIndentitation();
				}

				rightVar = exprapply(rightNode);

				if (rightCheckBool)
					fBuffer
							.putl(
									"if (Boolean.FALSE.equals(%s)) %s = Boolean.FALSE;",
									rightVar, outvar);
				fBuffer.putl("%sif (%s || %s) %s = null;",
						rightCheckBool ? "else " : "", checkNull(leftVar,
								leftType), checkNull(rightVar, rightType),
						outvar);
				fBuffer.putl("else {");
				fBuffer.incIndentitation();
				fBuffer.putl("%s = %s;", outvar, cast(rightNode, btype));
				fBuffer.subIndentitation();
				fBuffer.putl("}");

				if (leftCheckBool) {
					fBuffer.subIndentitation();
					fBuffer.putl("}");
				}

				return;

			case BooleanExpression.OP_OR:
				if (leftCheckBool)
					fBuffer.putl("if (%s && !%s.equals(Boolean.FALSE)) {",
							checkNotNull(leftVar, leftType), leftVar);
				else
					fBuffer.putl("if (%s) {", checkNotNull(leftVar, leftType),
							leftVar);
				fBuffer.incIndentitation();
				fBuffer.putl("%s = %s;", outvar, cast(leftNode, btype));
				fBuffer.subIndentitation();
				fBuffer.putl("}");
				fBuffer.putl("else {");
				fBuffer.incIndentitation();
				rightVar = exprapply(rightNode);
				if (rightCheckBool)
					fBuffer.putl(
							"if (%s && !%s.equals(Boolean.FALSE)) %s = %s;",
							checkNotNull(rightVar, rightType), rightVar,
							outvar, cast(rightNode, btype));
				else
					fBuffer.putl("if (%s) %s = %s;", checkNotNull(rightVar,
							rightType), outvar, cast(rightNode, btype));
				if (checkBool) {
					fBuffer.putl("else if (%s && %s) %s = null;", checkNull(
							leftVar, leftType), checkNull(rightVar, rightType),
							outvar);
					fBuffer.putl("else %s = Boolean.FALSE;", outvar);
				} else {
					fBuffer.putl("else %s = null;", outvar);
				}
				fBuffer.subIndentitation();
				fBuffer.putl("}");
				return;

			default:
				throw new CodeGenerationError();
			}
			// line cannot be reached

		case BooleanExpression.TYPE_COMPARE:
			final IExpression leftnode = bexpr.getLeftNode();
			final IExpression rightnode = bexpr.getRightNode();
			apply();
			final String leftvar = fBuffer.getVariable(leftnode);
			final String rightvar = fBuffer.getVariable(bexpr.getRightNode());

			putNullCheck(buf, leftvar, rightvar, leftnode.getExpressionType(),
					rightnode.getExpressionType());
			IType lefttype = leftnode.getExpressionType();
			IType righttype = rightnode.getExpressionType();

			final int op = bexpr.getOperator();
			if ((lefttype.isNumeric() && righttype.isNumeric())
					|| (lefttype.isBoolean() && righttype.isBoolean())) {
				buf.append("(").append(fTypeAdapter.getPrimitive(lefttype))
						.append(")");
				buf.append(leftvar).append(" ");
				if (op == BooleanExpression.OP_EQUAL)
					buf.append("==");
				else if (op == BooleanExpression.OP_NOT_EQUAL)
					buf.append("!=");
				else if (op == BooleanExpression.OP_LE)
					buf.append("<");
				else if (op == BooleanExpression.OP_LEQ)
					buf.append("<=");
				else if (op == BooleanExpression.OP_GE)
					buf.append(">");
				else if (op == BooleanExpression.OP_GEQ)
					buf.append(">=");
				buf.append(" (").append(fTypeAdapter.getPrimitive(righttype))
						.append(")");
				buf.append(rightvar);
			} else {
				if (op == BooleanExpression.OP_EQUAL)
					buf.append(leftvar).append(".equals(").append(rightvar)
							.append(")");
				else if (op == BooleanExpression.OP_NOT_EQUAL)
					buf.append("!").append(leftvar).append(".equals(").append(
							rightvar).append(")");
				else {
					if (BooleanExpression.haveComparator(lefttype, righttype))
						buf.append(leftvar).append(".compareTo(").append(
								rightvar).append(")");
					else
						buf.append(rightvar).append(".compareTo(").append(
								leftvar).append(")");

					if (op == BooleanExpression.OP_LE)
						buf.append(" < 0");
					else if (op == BooleanExpression.OP_LEQ)
						buf.append(" <= 0");
					else if (op == BooleanExpression.OP_GE)
						buf.append(" > 0");
					else if (op == BooleanExpression.OP_GEQ)
						buf.append(" >= 0");
				}
			}
			break;

		default:
			throw new CodeGenerationError();
		}

		fBuffer.putShortExpression(bexpr, buf.toString());
	}

	private void putNullCheck(StringBuffer buf, final String var, IType type) {
		if (!type.isNotNull())
			buf.append(checkNull(var, type)).append(" ? null : ");
	}

	private void putNullCheck(StringBuffer buf, final String varA,
			final String varB, IType typeA, IType typeB) {
		boolean nullcheck = false;
		if (!typeA.isNotNull()) {
			buf.append(checkNull(varA, typeA));
			nullcheck = true;
		}
		if (!typeA.isNotNull()) {
			if (nullcheck)
				buf.append(" || ");
			buf.append(checkNull(varB, typeB));
			nullcheck = true;
		}
		if (nullcheck)
			buf.append(" ? null : ");
	}

	protected class FoldCode {
		final IFoldExpression e;
		final IType etype;
		final IExpression base;
		final IType basetype;

		FoldCode(IFoldExpression expr) {
			e = expr;
			etype = e.getExpressionType();
			base = e.getBaseNode();
			basetype = base.getExpressionType();
		}

		/**
		 * Applies type and sequence selectors to non-sequence variable var
		 */
		String select(String var) {
			if (!(e instanceof CommonSelectorNode))
				return var;
			final CommonSelectorNode snode = (CommonSelectorNode) e;
			final Tree typenode = snode.getTypeSelectorNode();
			String cast = null;
			if (typenode != null)
				cast = fTypeAdapter.getSingleReturn(etype);
			final IExpression seqnode = snode.getSequenceSelectorNode();

			if (seqnode == null && cast == null)
				return var;

			String resvar;
			if (cast != null) {
				resvar = fBuffer.getTemporaryVariable();
				fBuffer.putl("%s %s = null;", cast, resvar);
				fBuffer.putl("if(%s instanceof %s) {", var, cast);
				fBuffer.incIndentitation();
				fBuffer.putl("%s = (%s)%s;", resvar, cast, var);
			} else {
				resvar = var;
			}

			if (seqnode != null) {
				fSymbolLocalNames.put(snode.getItSymbol(), resvar);
				apply(seqnode);
				fBuffer.putl("if (!(%s)) %s = null;", condition(seqnode),
						resvar);
			}

			if (cast != null) {
				fBuffer.subIndentitation();
				fBuffer.putl("}");
			}
			return resvar;
		}

		String retrieve(IFoldCodeFragment fragment, String var, String accvar,
				boolean accseq) {
			IType otype;
			if (e instanceof CommonSelectorNode)
				otype = ((CommonSelectorNode) e).getOriginalType();
			else
				otype = etype;
			final String ovar = fBuffer.getTemporaryVariable();

			if (e.isItemSequence()) {
				if (accvar == null) {
					accvar = fBuffer.getTemporaryVariable();
					fBuffer.putl("%s %s = %s;", fTypeAdapter.get(etype),
							accvar, fTypeAdapter.getInstance(etype));
				}

				fBuffer.putl("%s %s = %s;", fTypeAdapter.get(otype), ovar,
						fragment.get(var));
				fBuffer.putl("if(%s) {", checkNotNull(ovar, otype));
				fBuffer.incIndentitation();

				final String itemvar = fBuffer.getTemporaryVariable();
				fBuffer.putl("for(%s %s : %s) {", fTypeAdapter
						.getSingleReturn(otype), itemvar, ovar);
				fBuffer.incIndentitation();

				final String selvar = select(itemvar);
				fBuffer.putl("if(%s) %s.add(%s);", checkNotNull(selvar,
						single(otype)), accvar, selvar);

				fBuffer.subIndentitation();
				fBuffer.putl("}");

				fBuffer.subIndentitation();
				fBuffer.putl("}");
				fBuffer.putl("%s = null;", ovar);

				return accvar;
			} else if (accvar == null) {
				fBuffer.putl("%s %s = %s;", fTypeAdapter.getSingle(otype),
						ovar, fragment.get(var));
				return select(ovar);
			} else {
				fBuffer.putl("%s %s = %s;", fTypeAdapter.getSingle(otype),
						ovar, fragment.get(var));
				final String svar = select(ovar);

				// TODO: otype should be single
				// if (otype.isNotNull())
				// fBuffer.putl("%s.add(%s);", accvar, svar);
				// else
				if (etype.isSingleData())
					fBuffer.putl("if(%s) %s.append(%s);", checkNotNull(svar,
							single(otype)), fBuffer.getCurrentBuffer(), svar);
				else if (accseq)
					fBuffer.putl("if(%s) %s.add(%s);", checkNotNull(svar,
							single(otype)), accvar, svar);
				else
					fBuffer.putl("%s = %s;", accvar, svar);
			}
			return null;
		}

		void fold(IFoldCodeFragment fragment) {
			if (basetype.isSequence()) {
				final String basevar = exprapply(base);

				fBuffer.putExpression(e, fTypeAdapter.getInstance(etype));
				declareAlias(e);
				String evar = fBuffer.getReference(e);
				final String itemvar = fBuffer.getTemporaryVariable();
				final String itemjtype = fTypeAdapter.getSingle(basetype);
				fBuffer.putl("for(final %s %s : %s) {", itemjtype, itemvar,
						basevar);
				fBuffer.incIndentitation();
				retrieve(fragment, itemvar, evar, true);
				fBuffer.subIndentitation();
				fBuffer.putl("}");
			} else {
				fBuffer.putl("// " + e);
				final String basevar = exprapply(base);
				if (etype.isSequence())
					fBuffer.putExpression(e, fTypeAdapter.getInstance(etype));
				else
					fBuffer.initExpression(e);
				final String accvar = fBuffer.getReference(e);
				declareAlias(e);
				fBuffer.putl("if (%s) {", checkNotNull(basevar, basetype));
				fBuffer.incIndentitation();
				retrieve(fragment, basevar, accvar, etype.isSequence());
				fBuffer.subIndentitation();
				fBuffer.putl("}");
				if (!etype.isSequence()) {
					fBuffer.putl("else {");
					fBuffer.putl("\t%s = null;", accvar);
					fBuffer.putl("}");
				}
				fBuffer.putSafeExpression(e, accvar);
			}
		}
	}

	protected interface IFoldCodeFragment {
		public String get(String var);
	}

	public String getCode() {
		return fBuffer.toString();
	}

	public OmttJavaSource getJavaSource() {
		try {
			return new OmttJavaSource(fPackageName, fModuleName, fBuffer
					.toString(), fOmttSourceURI);
		} catch (URISyntaxException e) {
			return null;
		}
	}
}
