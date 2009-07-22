package pl.omtt.lang.model.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NullType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class Call extends CommonNode implements IFoldExpression, IVisitable {
	IType fType;
	FunctionType fCallingType;
	FunctionType fEffectiveType;

	boolean fIterateSequence;
	List<FunctionArgument> fArguments;

	public Call(int token, boolean iterateSequence) {
		super(new CommonToken(token, "call"));
		fIterateSequence = iterateSequence;
	}

	public boolean isIterateSequence() {
		return fIterateSequence;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	public FunctionType getCallingType() {
		return fCallingType;
	}

	public IExpression getCallingNode() {
		return (IExpression) getChild(0);
	}

	public int getArgumentLength() {
		return fArguments.size();
	}

	public FunctionArgument getArgument(int i) {
		return fArguments.get(i);
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		IType callingType = getCallingNode().getExpressionType();
		if (!callingType.isFunction()) {
			fCallingType = buildType();
			if (isIterateSequence())
				fCallingType.getArgument(0).getType().unsetSequence();
			fEffectiveType = fCallingType;
			TypeUnifier.unifyEq(fEffectiveType, callingType);
		} else {
			fCallingType = (FunctionType)(callingType.getEffective());
			fEffectiveType = fCallingType.createTemplate();

			FunctionType requestedType = buildType(fEffectiveType).createTemplate(); 
			if (isIterateSequence()) {
				if (fCallingType.getArgument(0).getType().isSequence())
					fIterateSequence = false;
				else
					requestedType.getArgument(0).getType().unsetSequence();
			}

			TypeUnifier.unifyLe(requestedType, fEffectiveType);
		}		

		fType = fEffectiveType.getReturnType().dup();
		if (sequenceOnOutput())
			fType.setSequence();
		if (fEffectiveType.getReturnType().isNotNull()
				&& (!isIterateSequence() || getArgument(0).getExpressionType()
						.isNotNull()))
			fType.setNotNull();
	}

	private FunctionType buildType() throws TypeException {
		FunctionType funtype = new FunctionType();
		fArguments = new ArrayList<FunctionArgument>(getChildCount() - 1);
		for (int i = 1; i < getChildCount(); i++) {
			FunctionArgument arg = (FunctionArgument) getChild(i);
			IType type = arg.getExpressionType().dup();
			if (arg.getTargetName() != null)
				throw new TypeException(arg, "unknown parameter "
						+ arg.getTargetName());
			fArguments.add(arg);
			funtype.putArgument(null, type, false);
		}
		return funtype;
	}

	private FunctionType buildType(FunctionType calltype) throws TypeException {
		FunctionType funtype = new FunctionType();
		final int callArgCount = calltype.getArguments().size();

		fArguments = new ArrayList<FunctionArgument>(callArgCount);
		for (int i = 0; i < callArgCount; i++)
			fArguments.add(null);

		for (int i = 1; i < getChildCount(); i++) {
			FunctionArgument arg = (FunctionArgument) getChild(i);
			int pos;
			if (arg.getTargetName() == null)
				pos = firstFreeArgumentPosition();
			else
				pos = calltype.getArgumentPosition(arg.getTargetName());

			if (pos < 0)
				throw new TypeException(arg, "unknown parameter "
						+ arg.getTargetName());
			else if (pos < fArguments.size() && fArguments.get(pos) != null)
				throw new TypeException(arg, "parameter " + arg.getTargetName()
						+ " was set yet");
			if (pos >= fArguments.size())
				throw new TypeException(arg,
						"excessive argument - called function has only "
								+ fArguments.size() + " argument"
								+ (fArguments.size() == 1 ? "" : "s"));
			fArguments.set(pos, arg);
		}

		for (int i = 0; i < callArgCount; i++) {
			final FunctionArgument arg = fArguments.get(i);
			if (arg == null) {
				funtype.putArgument(null, new NullType(), true);
				if (!calltype.getArgument(i).isOptional())
					throw new TypeException(this, "argument " + (i + 1)
							+ " of called function is obligatory");
			} else {
				funtype.putArgument(null, arg.getExpressionType(), false);
			}
		}
		return funtype;
	}

	private int firstFreeArgumentPosition() {
		int i;
		for (i = 0; i < fArguments.size(); i++)
			if (fArguments.get(i) == null)
				return i;
		return i;
	}

	private boolean sequenceOnOutput() {
		System.err.println();
		if (fCallingType.getReturnType().isSequence())
			return true;
		else if (!getArgument(0).getExpressionType().isSequence()
				|| !isIterateSequence())
			return false;
		else if (isIterateSequence()
				&& fCallingType.getArguments().get(0).getType().isSequence()
				&& !fCallingType.getReturnType().isSequence())
			return false;
		else
			return true;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public IExpression getBaseNode() {
		if (isIterateSequence())
			return getArgument(0);
		else
			return null;
	}

	@Override
	public boolean isItemSequence() {
		return fCallingType.getReturnType().isSequence();
	}

	@Override
	public String toString() {
		return "call of " + fType;
	}
}
