package pl.omtt.lang.model.nodes;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.FlexibleType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class Call extends CommonNode implements IFoldExpression, IVisitable {
	IType fType;
	FunctionType fCallingType;
	boolean fIterateSequence;

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
		return getChildCount() - 1;
	}

	public FunctionArgument getArgument(int i) {
		return (FunctionArgument) getChild(i + 1);
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		IType callType = getCallingNode().getExpressionType();

		FunctionType declaredType = new FunctionType();
		for (int i = 0; i < getArgumentLength(); i++) {
			FunctionArgument arg = getArgument(i);
			IType type = arg.getExpressionType().dup();
			declaredType.putArgument(arg.getTargetName(), type);
		}
		if (callType.getEffective() instanceof FunctionType) {
			fCallingType = (FunctionType) callType.getEffective();
			if (isIterateSequence()) {
				if (fCallingType.getArguments().get(0).getType().isSequence())
					fIterateSequence = false;
				else
					declaredType.getArguments().get(0).getType()
							.unsetSequence();
			}
		}

		try {
			if (callType.isFrozen())
				TypeUnifier.unifyLe(callType, declaredType);
			else
				TypeUnifier.unifyEq(callType, declaredType);
			fCallingType = (FunctionType) callType.getEffective();
		} catch (TypeException e) {
			if (fCallingType != null) {
				IType returnType = fCallingType.getReturnType();
				fType = new FlexibleType();
				TypeUnifier.unifyEq(fType, returnType);
				if (sequenceOnOutput())
					fType.setSequence();
			} else {
				fType = new ErrorType();
			}
			e.setCauseObject(fIterateSequence ? getCallingNode() : this);
			throw e;
		}

		fType = declaredType.getReturnType();
		if (sequenceOnOutput())
			fType.setSequence();
		if (fCallingType.getReturnType().isNotNull()
				&& (!isIterateSequence() || getArgument(0).getExpressionType()
						.isNotNull()))
			fType.setNotNull();
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
