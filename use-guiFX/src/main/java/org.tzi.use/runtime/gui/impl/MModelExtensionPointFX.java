package org.tzi.use.runtime.gui.impl;

import org.tzi.use.gui.main.ModelBrowserFX;
import org.tzi.use.gui.main.runtime.IPluginMMVisitor;
import org.tzi.use.gui.main.runtime.IPluginMMVisitorFX;
import org.tzi.use.gui.main.runtime.IPluginMModelExtensionPointFX;

import java.io.PrintWriter;

/**
 * This class provides the implementation of the MModel Extension Point. The
 * referenced interface should be locatd in the application elsewhere.
 * 
 * @author Roman Asendorf
 */

public class MModelExtensionPointFX implements IPluginMModelExtensionPointFX {

	private static IPluginMModelExtensionPointFX instance = new MModelExtensionPointFX();

	/**
	 * Method returning the Singleton instance of the PluginActionFactory
	 *
	 * @return The PluginActionFactory instance
	 */
	public static IPluginMModelExtensionPointFX getInstance() {
		return instance;
	}

	/**
	 * Private default Constructor.
	 */
	private MModelExtensionPointFX() {
	}

	@Override
	public IPluginMMVisitorFX createMMPrintVisitorFX(PrintWriter printWriter, ModelBrowserFX modelBrowser) {
		return new PluginMMPrintVisitorFX(printWriter, modelBrowser);
	}

	@Override
	public IPluginMMVisitorFX createMMHTMLPrintVisitorFX(PrintWriter printWriter, ModelBrowserFX modelBrowser) {
		return new PluginMMHTMLPrintVisitorFX(printWriter, modelBrowser);
	}
}
