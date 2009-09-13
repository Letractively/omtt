package pl.omtt.eclipse.nature;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import pl.omtt.core.Constants;

public class RebuildCollectVisitor implements IResourceVisitor,
		IResourceDeltaVisitor {

	List<IResource> fOmttAdded = new ArrayList<IResource>();
	List<IResource> fOmttChanged = new ArrayList<IResource>();
	List<IResource> fOmttRemoved = new ArrayList<IResource>();

	public boolean visit(IResourceDelta delta) throws CoreException {
		if (isOmttSource(delta.getResource()))
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				fOmttAdded.add(delta.getResource());
				break;
			case IResourceDelta.REMOVED:
				fOmttRemoved.add(delta.getResource());
				break;
			case IResourceDelta.CHANGED:
				fOmttChanged.add(delta.getResource());
				break;
			}
		return true;
	}

	public boolean visit(IResource resource) {
		if (isOmttSource(resource))
			fOmttAdded.add(resource);
		return true;
	}

	protected boolean isOmttSource(IResource resource) {
		if (resource.getType() == IResource.FILE)
			return Constants.OMTT_FILE_EXTENSION.equals(((IFile) resource)
					.getFileExtension());
		else
			return false;
	}
}
