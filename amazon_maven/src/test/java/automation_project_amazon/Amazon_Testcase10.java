//Assignment -10
//Test updating item quantities and removing items from the cart.

package automation_project_amazon;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Add_Card_Wishlist_Revert;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Wish_List01;
import maven_assignment1.Amz_logout01;
import resources.I_Listener1;
import resources.Launch_Quit_Automation_Amazon;

@Listeners(I_Listener1.class)
public class Amazon_Testcase10 extends Launch_Quit_Automation_Amazon {
	
	@Test(dataProvider = "Login", dataProviderClass=utility1.Data_For_Login.class)
	@Parameters("browser")
	public void verify_shopping_cart(String username, String password) throws EncryptedDocumentException, IOException, InterruptedException {
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
		Amz_Home01 a2 = new Amz_Home01(driver);
		a2.searching_the_product();
		Amz_Wish_List01 a3 =new Amz_Wish_List01(driver);
		a3.first_prd();
		a3.switchwindow(driver);
		Amz_Add_Card_Wishlist_Revert a6 = new Amz_Add_Card_Wishlist_Revert(driver);
		a6.add_cart();
//		Amz_Wish_List01 a4 =new Amz_Wish_List01(driver);
//		a4.switchwindow(driver);
		//a6.addcart_file10();
		a6.go_to_cart();
		a6.delete_cart();
		log2.mouse_hover_account(driver);
		log2.sign_out();
		

	}
}
