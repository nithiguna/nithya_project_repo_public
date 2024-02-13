package maven_assignment1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Add_Cart01 {
	WebDriver driver;

	//1. Locating each component by using @FindBy Annotations
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_cart;
	
	//2. creating the method for each componenet to perform its action
	
	public void add_cart() {
		
		add_cart.click();
		}
//		String parentid = driver.getWindowHandle();
//		Set<String> childid = driver.getWindowHandles();
//		
//		System.out.println(parentid);
//		System.out.println(childid);
//		
//		Iterator<String> childid1 = childid.iterator();
//		
//		String firstwindow= childid1.next();
//		String secondwindow = childid1.next();
//		
//		System.out.println(firstwindow);
//		System.out.println(secondwindow);
//		
//		driver.switchTo().window(secondwindow);
//		//WebElement add_cart1 = driver.findElement(By.xpath("(//input[@value='Add to Cart'])[2]"));
		
		

	
//3. Initializing each component using page factory class

			public Amz_Add_Cart01(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				
				
			}

}
