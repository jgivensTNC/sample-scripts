package testScripts.execution;

import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;
import samplePageClasses.HomePage;
import testScripts.Args;

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
 * <b>Script Name: </b> SampleExecutionScript.java
 * <p>
 * <b>Description: </b>
 * <p>
 * <b>Pre-Condition: </b>
 * <p>
 * <b>Post-Condition: </b>
 *
 * @since Apr 29, 2021
 * @author jgivens
 */
public class SampleExecutionScript extends TestScript {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runScript(args);
	}

	@Override
	public void testScript(Arguments args) {

		String userDataId = "User1";

		Arguments loginArgs = new Arguments();
		loginArgs.set(Args.USER_DATA_ID, userDataId);
		runModularScript("testScripts.modular.login.Login", loginArgs);

		HomePage hp = new HomePage();
		hp.clickAddNewRecord();

		String recordDataId = (String) runModularScript("testScripts.modular.records.LoadNewRecord");

		Arguments editRecordArgs = new Arguments();
		editRecordArgs.set(Args.RECORD_DATA_ID, recordDataId);
		runModularScript("testScripts.modular.records.EditRecord", editRecordArgs);
		
	}
}
