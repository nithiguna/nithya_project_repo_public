//Assignment -15
//Reach till cart page without login in amazon application


package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Add_Card_Wishlist_Revert;
import maven_assignment1.Amz_Cod01;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Wish_List01;
import maven_assignment1.Amz_logout01;
import resources.I_Listener1;
import resources.Launch_Quit_Automation_Amazon;
import resources.Navigation_Window;

@Listeners(I_Listener1.class)
public class Amazon_Testcase15 extends Launch_Quit_Automation_Amazon {
	@Test
	//@Test(dataProvider = "Login", dataProviderClass=utility1.Data_For_Login.class)
	//@Parameters("browser")
	public void verify_shopping_cart() throws EncryptedDocumentException, IOException, InterruptedException {

	//	Amz_logout01 log2=new Amz_logout01(driver);
	//	log2.mouse_hover_account(driver);
		//Amz_Login01 a1=new Amz_Login01(driver);
	//	a1.signing_in();
		//Fetching_Excel_Data.fetchexcel();
		
		Amz_Home01 a2 = new Amz_Home01(driver);
		a2.searching_the_product();
		Amz_Wish_List01 a3 =new Amz_Wish_List01(driver);
		a3.first_prd();
		a3.switchwindow(driver);
		Navigation_Window n1=new Navigation_Window(driver);
		n1.get_title("title");
		Amz_Add_Card_Wishlist_Revert a4=new Amz_Add_Card_Wishlist_Revert(driver);
		a4.add_cart();
		a4.go_to_cart();
		Compare_Homepage c1 = new Compare_Homepage(driver);
		c1.quantity_validate();
		System.out.println("verified that product has been added till cart page");
		
		
		Amz_Cod01 a5=new Amz_Cod01(driver);
		a5.buy_product();
		Thread.sleep(2000);
	
}
}
