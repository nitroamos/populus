/*******************************************************************************
 * Copyright (c) 2015 Regents of the University of Minnesota.
 *
 * This software is released under GNU General Public License 2.0
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
 *******************************************************************************/
package edu.umn.ecology.populus.model.sotl;

import edu.umn.ecology.populus.plot.*;

public class SOTLModel extends BasicPlotModel {

	@Override
	public Object getModelHelpText() {
		return "SOTLHELP";
	}

	public SOTLModel() {
		this.setModelInput( new SOTLPanel() );
	}

	public static String getModelName() {
		return "Two-Locus Selection";
	}

	@Override
	protected String getHelpId() {
		return "SOTL.overview";
	}
}
