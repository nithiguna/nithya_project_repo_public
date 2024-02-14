package maven_assignment1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amz_Add_Card_Wishlist_Revert {
	
	WebDriver driver;
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement add_cart;
	
	@FindBy(id="buy-now-button")
	WebElement buy_now;
	
//	@FindBy(xpath="//input[@name='submit.buy-now']")
//	WebElement buy_now;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	
	//@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	@FindBy(xpath="//span[@id='sw-gtc']")
	WebElement Go_to_Cart;
	
	
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	WebElement delete_cart;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[15]")
	WebElement testfile10_add_cart;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement quantity_verify; 
	
	@FindBy(xpath="//select[@name='quantity']")
	WebElement quantity_selection;
	
	//2. creating the method for each component to perform its action
	
	
	//click on first product 
		
	public void quantity_selection() {
		Select s1=new Select(quantity_selection);
		s1.selectByIndex(1);
		
		//int count =	quantity_selection.size()	;
		//quantity_selection.get(1).click();;
	}

	public void window(WebDriver driver)
	
	{
		String parentid = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		Iterator<String> childid1 = childid.iterator();
		
		String firstwindow= childid1.next();
		String secondwindow = childid1.next();
		
		System.out.println(firstwindow);
		System.out.println(secondwindow);
		
		driver.switchTo().window(secondwindow);
		
	}
		public void add_cart() {
			
		
			add_cart.sendKeys(Keys.ENTER);
		}
		
		public void go_to_cart()
		{
			Go_to_Cart.click();
		}
		public void buynow()
		{
			buy_now.click();
		}
		
		public void delete_cart()
		{
			delete_cart.click();
			
		}
		public void proceed_to_buy()
		{
			proceed_to_buy.click();
		}
		public void addcart_file10()
		{
			testfile10_add_cart.click();
		}
		public void quantity()
		{
			quantity_verify.click();
		}
		//3. Initializing each component using page factory class

		public Amz_Add_Card_Wishlist_Revert(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
			
		}

		

}
