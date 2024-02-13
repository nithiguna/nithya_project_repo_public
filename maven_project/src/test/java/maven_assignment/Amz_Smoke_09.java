//Assignment -09
//Test Case Scenario: Amz_Smoke_09	
//Test Case Id: Login->update your default 
//address->trying to reach till payments 
//page with new address->logout


package maven_assignment;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Cheching_assertsconcept.Compare_Homepage;
import maven_assignment1.Amz_Address01;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_logout01;
import resources.Amz_Launch_Quit;
import utility.Fetching_Excel_Data;
import utility.I_Listener1;

@Listeners(I_Listener1.class)
public class Amz_Smoke_09 extends Amz_Launch_Quit {
	@Test(dataProvider ="Login",dataProviderClass=utility.Fetching_Excel_Data.class)
	//@Parameters("browser")
	public void update_address(String username,String password) throws EncryptedDocumentException,IOException {	//fetch excel
		Amz_Login01 a1= new Amz_Login01(driver);
		a1.un(username);
		a1.un_submit();
		a1.pwd(password); 				
		a1.sign_in();
		Amz_Home01 a2 = new Amz_Home01(driver);
		Compare_Homepage c1= new Compare_Homepage(driver);
		c1.Validate_Page();//Assert
		System.out.println("The Home page of amazon is reached succesfully");
		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		Amz_Address01 adr1 = new Amz_Address01(driver);
		adr1.address();
		adr1.your_account();
		adr1.your_address();
		adr1.add_address();
		//adr1.edit_address();
		adr1.full_name();
		adr1.mobile();
		adr1.pincode();
		adr1.flat_no();
		adr1.street();
		adr1.landmark();
		adr1.city();
		adr1.state();
		//Thread.sleep(2000);
		adr1.addadress_update();
		//adr1.save_changes();
		//adr1.set_default_address();
		Amz_logout01 log3 = new Amz_logout01(driver);
		log3.mouse_hover_account(driver);
		log3.sign_out();

	}

}







//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// adr1.edit_address();
//		adr1.full_name();
//		adr1.mobile();
//		Thread.sleep(1000);
//		adr1.pincode();
//		Thread.sleep(1000);
//		adr1.flat_no();
//		Thread.sleep(1000);
//		adr1.street();
//		Thread.sleep(1000);
//		adr1.landmark();
//		Thread.sleep(1000);
//		adr1.city();
//		Thread.sleep(1000);
//		//adr1.state();
//		//Thread.sleep(1000);
//		adr1.default1();
//		adr1.save_changes();
//		Thread.sleep(1000);
	