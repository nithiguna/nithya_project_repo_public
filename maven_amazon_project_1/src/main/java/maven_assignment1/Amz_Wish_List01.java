package maven_assignment1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Wish_List01 {
WebDriver driver;
	
//	@FindBy(xpath="//input[@id='add-to-cart-button']")
//	WebElement add_cart;
	
	
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'][1]")
	WebElement first_prd;
	
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")
	WebElement delete_wish_list;
	
	@FindBy(linkText="View Your List")
	WebElement view_list;
	
//	@FindBy(xpath="(//input[@class='a-button-input'])[23]")
//	WebElement continue_shopping;
	@FindBy(xpath="(//input[@class='a-button-input'])[11]")
	//@FindBy(xpath="(//span[@class='a-button-inner'])[55]")
	WebElement cont;
	
	//@FindBy(xpath="(//span[@class='a-button-inner'])[25]")
	//@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	@FindBy(xpath="//span[@id='wishListMainButton']")
	WebElement add_wish_list;
	
	
	//2. creating the method for each componenet to perform its action
		
	//click on first product 
	public void first_prd()
	{
		first_prd.click();
	}
		
	public void switchwindow(WebDriver driver)
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
	// Wishlist
	public void add_wish_list() {
		
		add_wish_list.click();
		
	}
	public void view_list()
	{
		view_list.click();
	}
//	public void contin()
//	{
//		continue_shopping.click();
//	}
	public void cont()
	{
		cont.click();
	}
	public void your_wish() {
		delete_wish_list.click();	}
		
	//3. Initializing each component using page factory class

		public Amz_Wish_List01(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			
		}

}
