package testScripts.execution;

import platformIndependentCore.datafiles.CsvDataFile;
import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;

/**
 * <b>ARGUMENTS: </b>
 * </p>
 * <ul>
 * <li><b>Args.YOUR_SCRIPT_ARG_1</b>= Short description of script argument</li>
 * <li><b>Args.YOUR_SCRIPT_ARG_2</b>= Short description of script argument</li>
 * </ul>
 * <p>
 * <b>RETURNS: </b>
 * </p>
 * <ul>
 * <li><b>ObjectType</b> - short description of returned object</li>
 * </ul>
 * <p>
 * <b>Script Name: </b> ScriptExecution.java
 * <p>
 * <b>Description: </b>
 * <p>
 * <b>Pre-Condition: </b>
 * <p>
 * <b>Post-Condition: </b>
 *
 * @since Apr 30, 2021
 * @author jgivens
 */
public class ScriptExecution extends TestScript {
	/**
	 * @param args script arguments
	 */
	public static void main(String[] args) {
		runScript(args);
	}

	@Override
	public void testScript(Arguments args) {

		CsvDataFile sample = getDataFile("scriptDrivers\\SampleExecutionScriptDriver.csv");
		runSuite(sample);

		runSuite(sample, "SAMPLE-5");
	}
}
