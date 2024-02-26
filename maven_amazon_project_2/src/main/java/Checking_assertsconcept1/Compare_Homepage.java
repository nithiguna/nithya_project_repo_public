package Checking_assertsconcept1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Compare_Homepage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement home_page;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement quantity_verify; 
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-small'])[11]")
	WebElement review_the_process;
	
	@FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']/li/span")
	WebElement incorrect_password;
	
	public void validate_incorrect_password()
	{
		Assert.assertEquals(incorrect_password.isDisplayed(),true,"correct Password");
	}
	
	
public void Validate_Page() {
	Assert.assertEquals(home_page.isDisplayed(),true,"Login is unsuccessful");
}

public void quantity_validate() {
	
	
	Assert.assertEquals(quantity_verify.isDisplayed(),true,"quantity is not add");
}

public void review_cart_till_end()
{
	Assert.assertEquals(review_the_process.isDisplayed(),true,"Review items and delivery is not shown");
}
public Compare_Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
}
