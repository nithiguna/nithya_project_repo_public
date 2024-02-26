//Assignment-6
//Amz_Smoke_06	Login->searching->adding the product
//to wish_list->adding the product to
//cart->reaching till payment option DebitCard->logout

package maven_assignment;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Cheching_assertsconcept.Compare_Homepage;
import maven_assignment1.Amz_Add_Card_Wishlist_Revert;
import maven_assignment1.Amz_Cod01;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Wish_List01;
import maven_assignment1.Amz_logout01;
import maven_assignment1.payment_option;
import resources.Amz_Launch_Quit;
import resources.Navigation_Window;
import utility.Fetching_Excel_Data;
import utility.I_Listener1;

@Listeners(I_Listener1.class)
public class Amz_Smoke_06 extends Amz_Launch_Quit {
	@Test(dataProvider ="Login",dataProviderClass=utility.Fetching_Excel_Data.class)
	//@Parameters("browser")
	public void debit_card(String username,String password) throws EncryptedDocumentException,IOException {	//fetch excel
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
		Amz_Wish_List01 a3 = new Amz_Wish_List01(driver);
		a3.first_prd();
		a3.switchwindow(driver);
		a3.add_wish_list();
		a3.view_list();
		Navigation_Window n1 = new Navigation_Window(driver);
		n1.navigate_back();
		Amz_Add_Card_Wishlist_Revert a6 = new Amz_Add_Card_Wishlist_Revert(driver);
		a6.add_cart();
		Amz_Cod01 a4 = new Amz_Cod01(driver);
		Navigation_Window n2 = new Navigation_Window(driver);
		n2.get_title("title");
		a4.buy_product();
		a4.address();
		payment_option a5 = new payment_option(driver);
		a5.debit();
		n2.checkout_page();
		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		log2.sign_out();
	}
}
