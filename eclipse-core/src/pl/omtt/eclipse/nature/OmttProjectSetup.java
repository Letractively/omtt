package pl.omtt.eclipse.nature;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.framework.Bundle;

import pl.omtt.core.Constants;
import pl.omtt.eclipse.model.OmttProjectModel;

public class OmttProjectSetup {
	public static void setup(IProject project) {
		IJavaProject jproject = OmttProjectModel.getJavaProject(project);
		if (jproject != null) {
			addPostfixResourceCopyExclusion(jproject);
			installCallerJarToClasspath(jproject);
		}
	}

	public static void installCallerJarToClasspath(IJavaProject jproject) {
		Bundle bundle = Platform.getBundle(Constants.OMTT_CORE_BUNDLE);
		if (bundle == null)
			return;

		URL installLocation = bundle.getEntry("/");
		try {
			URL local = FileLocator.toFileURL(installLocation);
			String fullPath = new File(local.getPath() + "/lib/omtt-core.jar")
					.getAbsolutePath();
			Set<IClasspathEntry> cp = new HashSet<IClasspathEntry>();
			cp.add(JavaCore.newLibraryEntry(Path.fromOSString(fullPath), null,
					null));
			cp.addAll(Arrays.asList(jproject.getRawClasspath()));
			jproject.setRawClasspath(
					cp.toArray(new IClasspathEntry[cp.size()]), null);
		} catch (JavaModelException e) {
			System.err.println("model exception");
			e.printStackTrace();
			return;
		} catch (Exception e) {
			System.err.println("other exception");
			e.printStackTrace();
		}

		// JavaCore.setClasspathVariable(OtCorePlugin.PLUGIN_ID,
		// Path.fromOSString(fullPath), null);
		System.err.println(JavaCore.getClasspathVariableNames());
	}

	/**
	 * Add an exclusion to the JDT resource copy mechanism to prevent Eclipse's
	 * Java compiler from copying the postfix files to the bin directory
	 * 
	 * @param project
	 *            Project having the exclusion added
	 */
	@SuppressWarnings("unchecked")
	public static void addPostfixResourceCopyExclusion(IJavaProject jproject) {
		final String JDTPREF_EXCLUSIONFILTER = "org.eclipse.jdt.core.builder.resourceCopyExclusionFilter";

		Map optionsMap = jproject.getOptions(true);
		String exclusions = (String) optionsMap.get(JDTPREF_EXCLUSIONFILTER);

		final String EXTENSION_MASK = "*." + Constants.OMTT_FILE_EXTENSION;
		// check to see if the exclusion is already there
		if (exclusions.indexOf(EXTENSION_MASK) < 0) {
			if (exclusions.length() == 0) {
				exclusions = EXTENSION_MASK;
			} else {
				exclusions += "," + EXTENSION_MASK;
			}
			jproject.setOption(JDTPREF_EXCLUSIONFILTER, exclusions);
		}
	}

	/**
	 * Toggles OMTT nature on a project
	 * 
	 * @param project
	 *            to have OMTT nature added or removed
	 */
	public static synchronized void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			for (int i = 0; i < natures.length; ++i) {
				if (OmttNature.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i,
							natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);

					System.out.println("removing  OMTT nature");
					return;
				}
			}

			System.out.println("adding OMTT nature");

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = OmttNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

			OmttProjectSetup.setup(project);
		} catch (CoreException e) {
		}
	}
}
