package pl.omtt.eclipse.nature;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
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
import pl.omtt.core.Debugging;
import pl.omtt.eclipse.model.OmttProjectModel;

public class OmttProjectSetup {
	public static void setup(IProject project) {
		IJavaProject jproject = OmttProjectModel.getJavaProject(project);
		if (jproject != null) {
			addPostfixResourceCopyExclusion(jproject);
			installCallerJarToClasspath(jproject);
			addTemplatesFolderToProject(jproject);
		}
	}

	public static void addTemplatesFolderToProject(IJavaProject jproject) {
		IFolder folder = jproject.getProject().getFolder("/templates");
		if (folder.exists())
			return;
		try {
			folder.create(false, true, null);
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}
		IClasspathEntry cpentry = JavaCore.newSourceEntry(folder.getFullPath());
		addClassPathEntry(jproject, cpentry);
	}

	public static void installCallerJarToClasspath(IJavaProject jproject) {
		Bundle bundle = Platform
				.getBundle(pl.omtt.core.eclipse.Activator.PLUGIN_ID);
		if (bundle == null)
			return;

		final URL local;
		try {
			local = FileLocator.toFileURL(bundle.getEntry("/"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		}
		String fullPath = new File(local.getPath() + "/lib/omtt-core.jar")
				.getAbsolutePath();
		IClasspathEntry cpentry = JavaCore.newLibraryEntry(Path
				.fromOSString(fullPath), null, null);
		addClassPathEntry(jproject, cpentry);
	}

	private static void addClassPathEntry(IJavaProject jproject,
			IClasspathEntry cpentry) {
		try {
			Set<IClasspathEntry> cp = new HashSet<IClasspathEntry>();
			cp.add(cpentry);
			cp.addAll(Arrays.asList(jproject.getRawClasspath()));
			jproject.setRawClasspath(
					cp.toArray(new IClasspathEntry[cp.size()]), null);
		} catch (JavaModelException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * Add an exclusion to the JDT resource copy mechanism to prevent Eclipse's
	 * Java compiler from copying the OMTT source files to the bin directory
	 * 
	 * @param jproject
	 *            Java project having the exclusion added
	 */
	@SuppressWarnings("rawtypes")
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

					if (Debugging.DEBUG > 0)
						System.out.println("removing  OMTT nature");
					return;
				}
			}

			if (Debugging.DEBUG > 0)
				System.out.println("adding OMTT nature");

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = OmttNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

			setup(project);
		} catch (CoreException e) {
		}
	}
}
