//Assignment -03
//Ensure login fails with incorrect email or password.
package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Login02;
//import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Pwd_Incorrect01;
import maven_assignment1.Amz_logout01;
import resources.I_Listener1;
import resources.Laaunch;
//import resources.Launch_Quit_Automation_Amazon;

//@Listeners(I_Listener1.class) // pls change the password fetching as incorrect one 
public class Amazon_Testcase03 extends Laaunch {

	@Test(dataProvider = "Login1", dataProviderClass = utility1.Wrong_Login_Credentials.class)
	// @Parameters("browser")
	public void invalid_login_credentials(String username, String password)
			throws EncryptedDocumentException, IOException {

		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		Amz_Login02 a1 = new Amz_Login02(driver);
		a1.signing_in();
		a1.un(username);
		a1.un_submit();
		a1.pwd(password);
		a1.sign_in();

		Compare_Homepage c1 = new Compare_Homepage(driver);
		c1.validate_incorrect_password(); // Assert

	}

}









//@Test(priority=1)
//public void verify2()
//{
//    LoginPage login=new LoginPage(driver);
//    login.set_username("adm");
//    login.set_password("admin");
//    login.click_button();
//    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")),"Wrong username or password!");
//}
