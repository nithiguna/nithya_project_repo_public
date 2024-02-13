//Assignment -2
//Test case Id: Amz_Smoke_02
//Test case scenarios: Login->searching the product ->adding the product 
//to wishlist->adding the product to cart->logout	

package maven_assignment;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Cheching_assertsconcept.Compare_Homepage;
import maven_assignment1.Amz_Add_Cart01;
import maven_assignment1.Amz_Home01;
import maven_assignment1.Amz_Login01;
import maven_assignment1.Amz_Wish_List01;
import maven_assignment1.Amz_logout01;
import resources.Amz_Launch_Quit;
import resources.Navigation_Window;
import utility.Fetching_Excel_Data;
import utility.I_Listener1;

@Listeners(I_Listener1.class)
public class Amz_Smoke_02 extends Amz_Launch_Quit {
	@Test(dataProvider ="Login",dataProviderClass=utility.Fetching_Excel_Data.class)
	@Parameters("browser")
	public void wish_list(String username,String password) throws EncryptedDocumentException,IOException {	//fetch excel
		
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
		Amz_Wish_List01 wish = new Amz_Wish_List01(driver);
		wish.first_prd();
		wish.switchwindow(driver);
		wish.add_wish_list();
		wish.view_list();
		Navigation_Window n1 = new Navigation_Window(driver);
		n1.navigate_back();
		Amz_Add_Cart01 a6 = new Amz_Add_Cart01(driver);
		a6.add_cart();
		Amz_logout01 log2 = new Amz_logout01(driver);
		log2.mouse_hover_account(driver);
		log2.sign_out();
	}
}
