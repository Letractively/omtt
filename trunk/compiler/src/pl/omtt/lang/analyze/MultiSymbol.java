package pl.omtt.lang.analyze;

import java.util.ArrayList;
import java.util.List;

import pl.omtt.lang.model.types.AnyType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;
import pl.omtt.lang.model.types.FunctionType.Argument;

public class MultiSymbol extends Symbol {
	List<Symbol> fParticipants = new ArrayList<Symbol>();
	int fGrowthPosition = 0;

	public MultiSymbol(String name, FunctionType sampleType) {
		super(name, commonType(sampleType));
	}

	public List<Symbol> getParticipants() {
		return fParticipants;
	}

	public void addParticipant(Symbol s) throws TypeException {
		checkCompliance((FunctionType) s.fType);
		fParticipants.add(fGrowthPosition++, s);
		s.fSTOwner = fSTOwner;
		System.err.println("putting " + s.fType + " => " + getName());
	}

	@Override
	public FunctionType getType() {
		return (FunctionType) super.getType();
	}

	public FunctionType getCommonType() {
		return getType();
	}

	private void checkCompliance(FunctionType ftype) throws TypeException {
		FunctionType ctype = getCommonType();
		if (ctype.getArgumentLength() != ftype.getArgumentLength())
			throw new TypeException(
					"argument count does not match with base of type " + ctype);
		TypeUnifier.unifyEq(ctype.getReturnType(), ftype.getReturnType());
		for (int i = 1; i < ftype.getArgumentLength(); i++) {
			Argument farg = ftype.getArgument(i);
			Argument carg = ctype.getArgument(i);
			if (farg.name == null ^ carg.name == null
					|| (farg.name != null && !farg.name.equals(carg.name))) {
				throw new TypeException("name of argument " + i
						+ " does not match with base (" + carg.name + ")");
			}
			if (farg.optional ^ carg.optional) {
				throw new TypeException("optionality of argument " + i
						+ " does not match with base");
			}
			TypeUnifier.unifyEq(carg.type, farg.type);
		}
	}

	private static FunctionType commonType(FunctionType type) {
		FunctionType dup = (FunctionType) type.deepCopy();
		dup.unsetNotNull();
		Argument context = dup.new Argument();
		context.name = "it";
		context.optional = false;
		context.type = new AnyType();
		dup.setArgument(0, context);
		dup.freeze();
		dup.setNotNull();
		return dup;
	}
}
