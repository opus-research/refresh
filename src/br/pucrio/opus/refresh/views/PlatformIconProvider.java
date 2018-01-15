package br.pucrio.opus.refresh.views;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import br.pucrio.opus.refresh.services.RefreshLogger;

public class PlatformIconProvider {
	private static final String PREFIX = "platform:/plugin/org.eclipse.jdt.ui/icons/full/";
	
	private static Image fromRelativeUrl(String relativeUrl) {
		try {
			ImageDescriptor descriptor = ImageDescriptor.createFromURL(new URL(PREFIX + relativeUrl));
			return descriptor.createImage();
		} catch (MalformedURLException e) {
			new RefreshLogger().logError(e);
			return null;
		}
	}
	
	public static Image packageFragment() {
		return fromRelativeUrl("obj16/package_obj.png");
	}
	
	public static Image project() {
		return fromRelativeUrl("eview16/projects.png");
	}
	
	public static Image compilationUnit() {
		return fromRelativeUrl("obj16/jcu_obj.png");
	}
	
	public static Image sourceFolder() {
		return fromRelativeUrl("obj16/packagefolder_obj.png");
	}
}