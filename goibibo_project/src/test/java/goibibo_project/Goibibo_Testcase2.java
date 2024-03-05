//Assignment -2
//Validate the login functionality with valid credentials.

package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import goibibo_project_POM.Register_Application;

public class Goibibo_Testcase2 extends Goibibo_Launch_quit1 {
	@Test
	// @Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	// @Parameters("browser")
	public void login_valid_credentials() throws EncryptedDocumentException, IOException, InterruptedException

	{
		Register_Application r1 = new Register_Application(driver);
		r1.enter_mobile_number();
		r1.continue_mobile();
		r1.wait_until_homepage_load(driver);
		r1.Validate_login();    // assert
	}
}
