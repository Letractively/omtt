package pl.omtt.eclipse.model;

import java.util.*;

import org.eclipse.core.resources.IProject;

import pl.omtt.compiler.OmttCompiler;

public class OmttModelManager {
	private static OmttModelManager fModelManager;
	OmttCompiler fOmttCompiler;

	Map<IProject, OmttProjectModel> fProjectModels = new HashMap<IProject, OmttProjectModel>();

	protected OmttModelManager () {
		fOmttCompiler = new OmttCompiler();
	}
	
	public OmttProjectModel getProjectModel (IProject project) {
		if (fProjectModels.containsKey(project))
			return fProjectModels.get(project);
		
		OmttProjectModel projectModel = new OmttProjectModel (project);
		fProjectModels.put(project, projectModel);
		return projectModel;
	}
	
	public OmttCompiler getOmttCompiler () {
		return fOmttCompiler;
	}
	
	public static OmttModelManager getOmttModelManager() {
		if (fModelManager == null)
			fModelManager = new OmttModelManager();
		return fModelManager;
	}
}
