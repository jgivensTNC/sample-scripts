package testScripts.modular.records;

import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;

/**
 * <b>ARGUMENTS: </b>
 * </p>
 * <ul>
 * <li><b>None</b></li>
 * </ul>
 * <p>
 * <b>RETURNS: </b>
 * </p>
 * <ul>
 * <li><b>String</b> - dataId for the record that was loaded</li>
 * </ul>
 * <p>
 * <b>Script Name: </b> LoadNewRecord.java
 * <p>
 * <b>Description: </b> This modular script will load a new record into the
 * system. The new record will be the next unused record in the
 * SystemRecords.csv data set.
 * <p>
 * <b>Pre-Condition: </b> User is logged in and on the New Record page
 * <p>
 * <b>Post-Condition: </b> The new record has been added to the system, the user
 * is returned to the home page.
 *
 * @since Apr 29, 2021
 * @author jgivens
 */
public class LoadNewRecord extends TestScript {

	@Override
	public void testScript(Arguments arg0) {

		setReturn("Record1");
	}
}
