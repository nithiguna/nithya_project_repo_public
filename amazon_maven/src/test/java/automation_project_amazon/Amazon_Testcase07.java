//Assignment -7
//7 Ensure that the product detail 
//page displays all necessary information (price, reviews, description)


package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_logout01;
import maven_assignment1.Searching_Category;
import resources.I_Listener1;
import resources.Launch_Quit_Automation_Amazon;


@Listeners(I_Listener1.class)
public class Amazon_Testcase07 extends Launch_Quit_Automation_Amazon {

	@Test(dataProvider = "Login", dataProviderClass=utility1.Data_For_Login.class)
	@Parameters("browser")
	public void necessary_info_price_etc(String username, String password) throws EncryptedDocumentException, IOException, InterruptedException
	{
		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		Amz_Login01 a1 = new Amz_Login01(driver);
		a1.signing_in();
		a1.un(username);
		a1.un_submit();
		a1.pwd(password);
		a1.sign_in();
		Compare_Homepage c1 = new Compare_Homepage(driver);
		c1.Validate_Page();
		Amz_Home01 a2=new Amz_Home01(driver);
		a2.searching_the_product();
		Searching_Category a3=new Searching_Category(driver);
		a3.price_select();
		Thread.sleep(4000);
		a3.view_the_reviews();
		Thread.sleep(2000);
		log2.mouse_hover_account(driver);
		log2.sign_out();
	}
}
