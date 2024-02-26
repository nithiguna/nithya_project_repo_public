//Assignment-13
//Check if user is able to apply for coupon code while ordering the product


package automation_project_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Checking_assertsconcept1.Compare_Homepage;
import maven_assignment1.Amz_Add_Card_Wishlist_Revert;
import maven_assignment1.Amz_Cod01;
import maven_assignment1.Amz_Coupon01;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Wish_List01;
import maven_assignment1.Amz_logout01;
import maven_assignment1.payment_option;
import resources.I_Listener1;
import resources.Launch_Quit_Automation_Amazon;
import resources.Navigation_Window;

@Listeners(I_Listener1.class)
public class Amazon_Testcase13 extends Launch_Quit_Automation_Amazon {
	
	@Test(dataProvider = "Login", dataProviderClass=utility1.Data_For_Login.class)
	@Parameters("browser")
	public void verify_coupon_applied_cart(String username, String password) throws EncryptedDocumentException, IOException, InterruptedException {
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
		Navigation_Window n1=new Navigation_Window(driver);
		n1.get_title("title");
		Amz_Add_Card_Wishlist_Revert a4=new Amz_Add_Card_Wishlist_Revert(driver);
		a4.add_cart();
		Amz_Cod01 a5=new Amz_Cod01(driver);
		a5.buy_product();
		a5.address();
		//a5.cash_delivery();
		payment_option p1=new payment_option(driver);
		//p1.creditcard();
	
		
		//p1.entercard();
	//	n1.switch_to_frame();
	//	p1.cancel_button();
		
		p1.cod();
		Thread.sleep(2000);
		//p1.use_this_pay();
		p1.use_payment();
		Amz_Coupon01 c2=new Amz_Coupon01(driver);
		c2.coupon_data();
		c2.apply_this_coupon();
		c2.apply_coupon_verifed();	//assert
		n1.checkout_page();
		//Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		log2.sign_out();
		

	
	}

}
