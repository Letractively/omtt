package pl.omtt.eclipse.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;

class ComponentReferenceContainer {
	IProject fProject;

	Map<IResource, Set<String>> fReferences = new HashMap<IResource, Set<String>>();
	Map<String, Set<IResource>> fBackReferences = new HashMap<String, Set<IResource>>();

	public ComponentReferenceContainer(IProject project) {
		fProject = project;
		retrieveMarkers();
	}

	private void retrieveMarkers() {
		try {
			IMarker[] markers = fProject.findMarkers(OMTT_REFERENCE_MARKER,
					true, IResource.DEPTH_INFINITE);
			for (IMarker marker : markers) {
				setReference(marker.getResource(), (String) marker
						.getAttribute(IMarker.TEXT));
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}
	}

	synchronized public void updateReferences(IResource resource,
			Set<String> newReferences) {
		System.err.println("[upd] " + resource + ": " + newReferences);
		Set<String> oldReferences = fReferences.get(resource);
		if (oldReferences != null) {
			for (String target : oldReferences)
				if (newReferences != null && newReferences.contains(target))
					newReferences.remove(target);
				else
					deleteReference(resource, target);
		}
		if (newReferences != null)
			for (String target : newReferences)
				createReference(resource, target);
	}

	private void createReference(IResource from, String to) {
		setReference(from, to);

		try {
			IMarker marker = from.createMarker(OMTT_REFERENCE_MARKER);
			marker.setAttribute(IMarker.TEXT, to);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		System.err.println("[cre] " + to + " <-- " + from);
	}

	private void setReference(IResource from, String to) {
		if (!fReferences.containsKey(from)) {
			Set<String> toset = new HashSet<String>();
			toset.add(to);
			fReferences.put(from, toset);
		} else {
			fReferences.get(from).add(to);
		}
		if (!fBackReferences.containsKey(to)) {
			Set<IResource> fromset = new HashSet<IResource>();
			fromset.add(from);
			fBackReferences.put(to, fromset);
		} else {
			fBackReferences.get(to).add(from);
		}
	}

	private void deleteReference(IResource from, String to) {
		if (fReferences.containsKey(from))
			fReferences.get(from).remove(to);
		if (fBackReferences.containsKey(to))
			fBackReferences.get(to).remove(from);

		try {
			IMarker[] markers = from.findMarkers(OMTT_REFERENCE_MARKER, true,
					IResource.DEPTH_INFINITE);
			for (IMarker marker : markers) {
				if (to.equals(marker.getAttribute(IMarker.TEXT)))
					marker.delete();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		System.err.println("[del] " + to + " <-- " + from);
	}

	synchronized public Set<IResource> getAffected(String id,
			SymbolTable oldST, SymbolTable newST) {
		Set<IResource> affected = new HashSet<IResource>();
		for (String changed : getChangedSymbols(oldST, newST)) {
			changed = id + "::" + changed;
			if (fBackReferences.containsKey(changed))
				affected.addAll(fBackReferences.get(changed));
		}
		System.err.println("[bref] " + id + ": " + fBackReferences.get(id));
		if (fBackReferences.containsKey(id + "::_"))
			affected.addAll(fBackReferences.get(id + "::_"));
		
		// TODO: it's bad workaround -- symbol table should be remembered
		if (oldST == null && fBackReferences.containsKey(id))
			affected.addAll(fBackReferences.get(id));
		return affected;
	}

	private List<String> getChangedSymbols(SymbolTable oldST, SymbolTable newST) {
		List<String> changed = new ArrayList<String>();
		if (oldST != null)
			for (Symbol oldsymbol : oldST.getSymbols()) {
				String name = oldsymbol.getName();
				Symbol newsymbol = newST == null ? null : newST.get(name);
				if (newsymbol == null)
					changed.add(name);
				else if (!oldsymbol.getType().equals(newsymbol.getType()))
					changed.add(name);
			}
		return changed;
	}

	public void clear() {
		fReferences.clear();
		fBackReferences.clear();

		try {
			fProject.deleteMarkers(OMTT_REFERENCE_MARKER, true,
					IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public static String OMTT_REFERENCE_MARKER = "pl.omtt.eclipse.markers.reference";
}
