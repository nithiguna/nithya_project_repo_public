//Assignment -01
//Test if a new user can successfully register.


package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_logout01;
import maven_assignment1.New_Register_Account;
import resources.I_Listener1;
import resources.Laaunch;
//import utility.Fetching_Excel_Data;
import resources.Launch_Quit_Automation_Amazon;
//import utility1.Fetching_Excel_Data;

//@Listeners(I_Listener1.class)
public class Amazon__Testcase01 extends Laaunch {

	@Test
	public void sign_in_firsttime() throws EncryptedDocumentException, IOException
	{
		
		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
	//	Fetching_Excel_Data.fetchexcel();
//		Amz_Login01 a1 = new Amz_Login01(driver);
//		a1.signing_in();
		
		//a1.sign_in();
		
		New_Register_Account n1=new New_Register_Account(driver);
		n1.start_here();
	//	n1.create_amazon();
		n1.cust_name();
		
		n1.mobile_no();
		n1.password();
		n1.verifiy_mobile();
		
}
}
