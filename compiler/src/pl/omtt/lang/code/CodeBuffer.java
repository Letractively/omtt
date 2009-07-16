package pl.omtt.lang.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import pl.omtt.lang.model.ast.IExpression;

public class CodeBuffer {
	JavaTypesAdapter fTypeAdapter;

	Map<IExpression, String> fExpressionVariable = new HashMap<IExpression, String>();
	Map<IExpression, String> fExpressionCode = new HashMap<IExpression, String>();
	Map<IExpression, Boolean> fExpressionSafe = new HashMap<IExpression, Boolean>();

	Stack<String> fBufferStack = new Stack<String>();
	int fTemporaryCount = 0;

	Space fSpace = new Space();
	Map<String, Space> fSpaceMap = new HashMap<String, Space>();
	Stack<Space> fActiveSpaceStack = new Stack<Space>();

	public CodeBuffer(JavaTypesAdapter typeAdapter) {
		fTypeAdapter = typeAdapter;
	}

	public CodeBuffer put(String format, Object... args) {
		fSpace.fBuffer.append(String.format(format, args));
		return this;
	}

	public CodeBuffer putl(String format, Object... args) {
		putnl(format, args);
		fSpace.fBuffer.append('\n');
		return this;
	}

	public CodeBuffer putnl(String format, Object... args) {
		putIndentitation();
		fSpace.fBuffer.append(String.format(format, args));
		return this;
	}

	public CodeBuffer putnl() {
		fSpace.fBuffer.append('\n');
		return this;
	}

	public CodeBuffer putIndentitation() {
		for (int i = 0; i < fSpace.fIndentitation; i++)
			fSpace.fBuffer.append("    ");
		return this;
	}

	private String getTemporaryVariable(int index) {
		return "$t" + index;
	}

	private String getTemporaryVariable(IExpression node) {
		return fExpressionVariable.get(node);
	}

	private String putTemporaryVariable(IExpression node) {
		final String var = getTemporaryVariable();
		fExpressionVariable.put(node, var);
		fSpace.fBuffer.append(fTypeAdapter.get(node.getExpressionType())).append(' ').append(var);
		return var;
	}

	public String getTemporaryVariable () {
		return getTemporaryVariable(fTemporaryCount++);
	}
	
	public CodeBuffer putExpression(IExpression node, String format,
			Object... args) {
		putIndentitation();
		putTemporaryVariable(node);
		fSpace.fBuffer.append(" = ").append(String.format(format, args))
				.append(";\n");
		return this;
	}

	public CodeBuffer putShortExpression(IExpression node, String format,
			Object... args) {
		fExpressionCode.put(node, args.length > 0 ? String.format(format, args)
				: format);
		return this;
	}

	public CodeBuffer putSafeExpression(IExpression node, String format,
			Object... args) {
		fExpressionCode.put(node, args.length > 0 ? String.format(format, args)
				: format);
		fExpressionSafe.put(node, true);
		return this;
	}

	public CodeBuffer putVariable(IExpression node, String var) {
		fExpressionVariable.put(node, var);
		fExpressionSafe.put(node, true);
		return this;
	}

	public CodeBuffer initExpression(IExpression node) {
		putIndentitation();
		putTemporaryVariable(node);
		fSpace.fBuffer.append(";\n");
		return this;
	}

	public CodeBuffer assignExpression(IExpression node, String format,
			Object... args) {
		putIndentitation();
		fSpace.fBuffer.append(getTemporaryVariable(node)).append(" = ").append(
				String.format(format, args));
		return this;
	}

	public String getReference(IExpression node) {
		if (fExpressionVariable.containsKey(node))
			return getTemporaryVariable(node);
		else
			return fExpressionCode.get(node);
	}

	public String getReference(Object object) {
		if (object instanceof IExpression)
			return getReference((IExpression) object);
		else
			return null;
	}

	public String getSafeReference(IExpression node) {
		if (fExpressionVariable.containsKey(node))
			return getTemporaryVariable(node);
		else if (fExpressionSafe.containsKey(node))
			return fExpressionCode.get(node);
		else
			return '(' + fExpressionCode.get(node) + ')';
	}

	public String getSafeReference(Object object) {
		if (object instanceof IExpression)
			return getSafeReference((IExpression) object);
		else
			return null;
	}

	public String getVariable(IExpression node) {
		if (fExpressionCode.containsKey(node)) {
			putExpression(node, "%s", fExpressionCode.get(node));
			fExpressionCode.remove(node);
		}		
		return getTemporaryVariable(node);
	}

	public CodeBuffer pushBuffer(String name) {
		fBufferStack.push(name);
		return this;
	}

	public String popBuffer() {
		return fBufferStack.pop();
	}

	public CodeBuffer initBuffer() {
		String bufferName = "$buf" + (fTemporaryCount++);
		putl("TextBuffer %s = new TextBuffer ();", bufferName);
		pushBuffer(bufferName);
		return this;
	}

	public String getCurrentBuffer() {
		return fBufferStack.peek();
	}

	public CodeBuffer putData(String format, Object... args) {
		StringBuffer formatBuffer = new StringBuffer();
		formatBuffer.append(getCurrentBuffer());
		formatBuffer.append(".append(");
		formatBuffer.append(format);
		formatBuffer.append(");");
		putl(formatBuffer.toString(), args);
		return this;
	}

	/*
	 * Space operations
	 */
	protected class Space {
		StringBuffer fBuffer;
		String fName;
		int fIndentitation = 0;

		public Space() {
			fBuffer = new StringBuffer();
		}

		public Space(String name) {
			fBuffer = new StringBuffer();
			fName = name;
		}

		public Space(String name, int indentitation) {
			fBuffer = new StringBuffer();
			fName = name;
			fIndentitation = indentitation;
		}
	}

	protected Space getSpace(String name) {
		if (!fSpaceMap.containsKey(name)) {
			fSpaceMap.put(name, new Space(name, fSpace.fIndentitation));
		}
		return fSpaceMap.get(name);
	}

	public void activate(String space) {
		Space newSpace = getSpace(space);
		fActiveSpaceStack.push(fSpace);
		fSpace = newSpace;
	}

	public void deactivate() {
		fSpace = fActiveSpaceStack.pop();
	}

	public void flush(String targetSpace) {
		getSpace(targetSpace).fBuffer.append(fSpace.fBuffer);
		fSpaceMap.remove(fSpace.fName);
		deactivate();
	}

	public void putSpace(String space) {
		if (fSpaceMap.containsKey(space))
			fSpace.fBuffer.append(fSpaceMap.get(space).fBuffer);
	}

	public String getSpaceName() {
		return fSpace.fName;
	}

	/*
	 * Pretty-formatting tools.
	 */
	public CodeBuffer incIndentitation() {
		fSpace.fIndentitation++;
		return this;
	}

	public CodeBuffer subIndentitation() {
		fSpace.fIndentitation--;
		return this;
	}

	public CodeBuffer setIndentitation(int indentitation) {
		fSpace.fIndentitation = indentitation;
		return this;
	}

	public CodeBuffer chop(int n) {
		int length = fSpace.fBuffer.length();
		fSpace.fBuffer.delete(length - n, length);
		return this;
	}

	/*
	 * String retrieving.
	 */
	public String getString() {
		return fSpace.fBuffer.toString();
	}

	public String toString() {
		return getString();
	}
}
