//Assignment-14
//Go to orders page and click on your last 
//ordered product and give 5 star ratings

package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Ratings02;
import maven_assignment1.Amz_logout01;
import resources.I_Listener1;
import resources.Launch_Quit_Automation_Amazon;

@Listeners(I_Listener1.class)
public class Amazon_Testcase14 extends Launch_Quit_Automation_Amazon {
	@Test(dataProvider = "Login", dataProviderClass=utility1.Data_For_Login.class)
	@Parameters("browser")
	public void last_ordered_five_star_ratings(String username, String password) throws EncryptedDocumentException, IOException, InterruptedException {
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
		// Amz_logout01 a2=new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		Amz_Ratings02 a3 = new Amz_Ratings02(driver);
		a3.your_order();
		a3.previous_order();
		Thread.sleep(4000);
		a3.prd_review();
		Thread.sleep(4000);
		a3.give_Stars();
		Thread.sleep(1000);
		a3.submit();
		a3.validate_submit_reviews();	 //assert
		log2.mouse_hover_account(driver);
		log2.sign_out();

	}
}
