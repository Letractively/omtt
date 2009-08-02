package pl.omtt.lang.model;

import pl.omtt.lang.model.ast.*;

public interface IVisitor {
	public void visit (Program node);

	public void visit (ModuleDeclaration node);
	public void visit (ImportDeclaration node);
	public void visit (UseDeclaration node);

	public void visit (TemplateDefinition node);
	public void visit (TemplateArgument templateArguments);
	public void visit (Block node);
	public void visit (Call node);
	public void visit (Cast node);
	public void visit (Data node);
	public void visit (IfElse node);
	public void visit (LambdaExpression node);
	public void visit (LambdaMatch lambdaMatch);
	public void visit (Transformation node);
	public void visit (FunctionArgument node);

	public void visit (ArithmeticExpression node);
	public void visit (ArithmeticMinus node);
	public void visit (BooleanExpression node);
	public void visit (Sequence node);
	public void visit (Ident node);
	public void visit (Literal node);
	public void visit (Range range);
	public void visit (AtomSelect atomSelect);
	public void visit (PropertySelect node);

	public void visit(TypeReference node);
}
