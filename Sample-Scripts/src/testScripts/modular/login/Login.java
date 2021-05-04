package testScripts.modular.login;

import platformIndependentCore.datafiles.CsvDataFile;
import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;
import samplePageClasses.HomePage;
import samplePageClasses.LoginPage;
import testScripts.Args;
import testScripts.Data;

/**
 * <b>ARGUMENTS: </b>
 * </p>
 * <ul>
 * <li><b>Args.USER_DATA_ID</b>= DATA_ID from the UserData.csv data set</li>
 * </ul>
 * <p>
 * <b>RETURNS: </b>
 * </p>
 * <ul>
 * <li><b>N/A</b></li>
 * </ul>
 * <p>
 * <b>Script Name: </b> Login.java
 * <p>
 * <b>Description: </b> This modular script will log the user into the
 * application
 * <p>
 * <b>Pre-Condition: </b> Application environment is available, UserData.csv
 * contains login credentials for user
 * <p>
 * <b>Post-Condition: </b> User is logged in and left on the home page
 *
 * @since Apr 20, 2021
 * @author jgivens
 */
public class Login extends TestScript {

	@Override
	public void testScript(Arguments arg0) {

		// Declare data file to pull credentials from
		CsvDataFile userData = getDataFile("UserData.csv");
		String dataId = arg0.getString(Args.USER_DATA_ID);

		// Retrieve data from data set
		String username = userData.getData(dataId, Data.USERDATA_USERNAME);
		String password = userData.getData(dataId, Data.USERDATA_PASSWORD);

		// Declare the login page and load the browser
		LoginPage lp = new LoginPage();
		lp.loadPage();

		// Enter credentials and login
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();

		// Verify the home page displays the correct username for the logged in user
		HomePage hp = new HomePage();
		vpEquals("LoggedInUserNameDisplaysOnHomePage", username, hp.readLoggedInUsername());

	}
}
