//Assignment-01
//Verify that users can successfully register for a new account.


package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import goibibo_project_POM.Register_Application;

public class Goibibo_Testcase1 extends Goibibo_Launch_quit1 {
@Test
//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
//@Parameters("browser")
public void register_account() throws EncryptedDocumentException, IOException, InterruptedException {
	
Register_Application r1=new Register_Application(driver);
	
	
			//r1.hoverover_sign_up();
		//Thread.sleep(2000);
//			
	//	r1.pop_up_window();
	//	r1.Close_the_Mobile_window();
		
	r1.enter_mobile_number1();
	r1.continue_mobile();

}
}
