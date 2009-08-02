package pl.omtt.compiler;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import pl.omtt.core.Constants;
import pl.omtt.lang.analyze.SemanticException;
import pl.omtt.lang.model.ast.ModuleDeclaration;
import pl.omtt.lang.model.ast.Program;
import pl.omtt.lang.model.ast.UseDeclaration;

public class CompilationQueue implements Iterable<URI> {
	List<URI> fQueue = new ArrayList<URI>();
	Map<String, URI> fModules = new HashMap<String, URI>();
	Map<String, Set<String>> fModuleReferences = new HashMap<String, Set<String>>();

	void add(URI uri, Program program) throws SemanticException {
		verifyFileName(uri, program);

		final ModuleDeclaration md = program.getModuleDeclaration();
		if (md == null)
			return;

		String mid = md.getModuleName();
		String pid = md.getPackageName();
		if (pid == null)
			pid = "local";
		final String id = pid + "." + mid;

		fModules.put(id, uri);

		Set<String> references = new HashSet<String>();
		final Tree un = program.getUsesNode();
		if (un != null)
			for (int i = 0; i < un.getChildCount(); i++) {
				UseDeclaration ud = (UseDeclaration) un.getChild(i);
				String uid = ud.getUseId();
				if (uid.lastIndexOf('.') < 0)
					uid = pid + "." + uid;
				references.add(uid);
			}
		fModuleReferences.put(id, references);
	}

	private void verifyFileName(URI source, Program program)
			throws SemanticException {
		ModuleDeclaration md = program.getModuleDeclaration();
		if (md == null)
			return;
		final String filename = new File(source).getName();
		final String expected = md.getModuleName() + "."
				+ Constants.OMTT_FILE_EXTENSION;

		if (!filename.equals(expected))
			throw new SemanticException(md, "module " + md.getModuleName()
					+ " should be in file " + expected);
	}

	void calculate() throws UseCycleException {
		Map<String, Node> graph = buildGraph();

		Stack<Node> freeNodes = new Stack<Node>();
		Iterator<String> itor = graph.keySet().iterator();
		while (itor.hasNext()) {
			final String id = itor.next();
			Node node = getNode(graph, id);
			if (node.referenceCount == 0) {
				freeNodes.add(node);
				itor.remove();
			}
		}

		while (!freeNodes.empty()) {
			Node node = freeNodes.pop();
			fQueue.add(fModules.get(node.id));
			for (String bref : node.backReferences)
				if (graph.containsKey(bref)) {
					Node brefnode = getNode(graph, bref);
					brefnode.referenceCount--;
					if (brefnode.referenceCount == 0) {
						graph.remove(bref);
						freeNodes.add(brefnode);
					}
				}
		}

		if (!graph.isEmpty())
			throwCycleException(graph);
	}

	private Map<String, Node> buildGraph() {
		Map<String, Node> graph = new HashMap<String, Node>();

		for (String mid : fModules.keySet()) {
			Set<String> references = fModuleReferences.get(mid);

			Node mnode = getNode(graph, mid);
			for (String reference : references) {
				if (!fModules.containsKey(reference))
					continue;
				getNode(graph, reference).backReferences.add(mid);
				mnode.referenceCount++;
			}
		}

		return graph;
	}

	private void throwCycleException(Map<String, Node> graph)
			throws UseCycleException {
		Map<String, String> visits = new HashMap<String, String>();
		Stack<String> stack = new Stack<String>();

		final String start = graph.keySet().iterator().next();
		stack.add(start);

		boolean found = false;
		while (!found) {
			String node = stack.pop();
			for (String nb : fModuleReferences.get(node)) {
				if (!visits.containsKey(nb)) {
					visits.put(nb, node);
					stack.push(nb);
				}
				if (start.equals(nb)) {
					found = true;
					break;
				}
			}
		}

		StringBuffer buf = new StringBuffer();
		buf.append("use cycle found: ").append(start);
		String cur = start;
		do {
			cur = visits.get(cur);
			buf.append(" <- ").append(cur);
		} while (!start.equals(cur));
		throw new UseCycleException(fModules.get(start), buf.toString());
	}

	private Node getNode(Map<String, Node> graph, String id) {
		if (!graph.containsKey(id)) {
			Node node = new Node();
			node.id = id;
			node.referenceCount = 0;
			node.backReferences = new HashSet<String>();
			graph.put(id, node);
			return node;
		}
		return graph.get(id);
	}

	private class Node {
		String id;
		int referenceCount;
		Set<String> backReferences;
	}

	@Override
	public CompilationQueueIterator iterator() {
		return new CompilationQueueIterator();
	}

	/* (non-Javadoc)
	 * This iterator does nothing more than standard list iterator.
	 * However, it will... (for example mark errors in queue).
	 */
	public class CompilationQueueIterator implements Iterator<URI> {
		Iterator<URI> fQueueIterator;

		public CompilationQueueIterator() {
			fQueueIterator = fQueue.iterator();
		}

		@Override
		public boolean hasNext() {
			return fQueueIterator.hasNext();
		}

		@Override
		public URI next() {
			URI next = fQueueIterator.next();

			return next;
		}

		@Override
		public void remove() {
			fQueueIterator.remove();
		}
	}
	
	@Override
	public String toString () {
		return fQueue.toString();
	}
}
