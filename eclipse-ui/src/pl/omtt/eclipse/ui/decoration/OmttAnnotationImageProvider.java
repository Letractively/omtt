package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IAnnotationImageProvider;

/**
 * Based on <code>org.eclipse.jdt.internal.ui.javaeditor.JavaAnnotationImageProvider</code>. 
 */
public class OmttAnnotationImageProvider implements IAnnotationImageProvider {

	ImageRegistry fImageRegistry;

	@Override
	public Image getManagedImage(Annotation annotaiton) {
		ISharedImages sharedImages= PlatformUI.getWorkbench().getSharedImages();
		Display display = Display.getCurrent();

		Image img = sharedImages.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		if (annotaiton.isMarkedDeleted()) {
			ImageRegistry registry = getImageRegistry(display);
			String key = Integer.toString(img.hashCode());
			Image grayImage = registry.get(key);
			if (grayImage == null) {
				grayImage = new Image(display, img, SWT.IMAGE_GRAY);
				registry.put(key, grayImage);
			}
			return grayImage;
		} else {
			return img;
		}
	}

	@Override
	public ImageDescriptor getImageDescriptor(String symbolicName) {
		return null;
	}

	@Override
	public String getImageDescriptorId(Annotation annotation) {
		return null;
	}

	private ImageRegistry getImageRegistry (Display display) {
		if(fImageRegistry == null) {
			fImageRegistry = new ImageRegistry(display);
		}
		return fImageRegistry;
	}
}
