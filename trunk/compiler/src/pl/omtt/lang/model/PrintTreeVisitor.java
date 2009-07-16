package pl.omtt.lang.model;

import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.model.ast.Program;

public class PrintTreeVisitor extends AbstractTreeVisitor {

	@Override
	public void visit(Program node) {
		printLines();
		System.out.println("Program");
	}

	@Override
	public void defaultVisit(Tree node) {
		printLines();
		System.out.println(node.toString());
	}

	private void printLines () {
		int depth = getDepth();
		while(depth > 1) {
			System.out.printf("   ");
			depth--;
		}
		if (depth > 0)
			System.out.printf("|- ");
	}
}
