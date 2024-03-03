//Assignement-3
//Test login with invalid credentials and ensure proper error messages are displayed.

package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import goibibo_project_POM.Register_Application;

public class Goibibo_Testcase3 extends Goibibo_Launch_quit1 {
	@Test
	// @Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	// @Parameters("browser")
	public void login_invalid_credentials() throws EncryptedDocumentException, IOException, InterruptedException

	{
		Register_Application r1 = new Register_Application(driver);
		r1.enter_mobile_number();
		r1.continue_mobile();
		r1.enter_otp();
		r1.Validate_invalid_otp(); //Assert

	}

}
