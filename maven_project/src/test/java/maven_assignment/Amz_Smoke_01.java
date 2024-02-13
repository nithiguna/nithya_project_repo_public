//Assignment -01
//Test case id: Amz_Smoke_01 
//Smoke test scenarios: 1.Login->seraching->logout

package maven_assignment;

import java.io.IOException;
//import java.time.Duration;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Cheching_assertsconcept.Compare_Homepage;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_logout01;
import resources.Amz_Launch_Quit;

import utility.Fetching_Excel_Data;
import utility.I_Listener1;


@Listeners(I_Listener1.class)
public class Amz_Smoke_01 extends Amz_Launch_Quit
{
	@Test(dataProvider ="Login",dataProviderClass=utility.Fetching_Excel_Data.class)//2. create the data provider and connect with that class
	@Parameters("browser")	
	
	public void login_with_valid_credentials(String username,String password) throws EncryptedDocumentException,IOException {	//fetch excel
		//Fetching_Excel_Data.fetchexcel();
		Amz_Login01 a1= new Amz_Login01(driver);
		a1.un(username);
		a1.un_submit();
		a1.pwd(password); 				
		a1.sign_in();
		Amz_Home01 a2 = new Amz_Home01(driver);
		Compare_Homepage c1= new Compare_Homepage(driver);
		c1.Validate_Page();//Assert
		System.out.println("The Home page of amazon is reached succesfully");
		a2.searching_the_product();
		System.out.println(1);
		Amz_logout01 log2 = new Amz_logout01(driver);
		System.out.println(2);
		log2.mouse_hover_account(driver);
		System.out.println(3);
		log2.sign_out();
		System.out.println(4);
		
	
	}

}

