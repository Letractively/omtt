package pl.omtt.lang.code;


import pl.omtt.lang.model.ast.IExpression;
import pl.omtt.lang.model.types.IType;

public class FoldCodeFragment {
	final IExpression fRoot;
	
	final IType fRootType;
	final IType fItemType;

	public FoldCodeFragment(IExpression root, IType itemType) {
		fRoot = root;
		fRootType = root.getExpressionType().getEffective();
		fItemType = itemType.getEffective();
	}
	
	public void flush(CodeBuffer buffer) {
		if (fRootType.isSequence()) {
			
		} else {
			
		}
	}
}
