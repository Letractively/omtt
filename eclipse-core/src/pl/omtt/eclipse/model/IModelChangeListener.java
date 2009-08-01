package pl.omtt.eclipse.model;

import org.eclipse.core.resources.IResource;

public interface IModelChangeListener {
	void notifyChange (IResource resource);
}
