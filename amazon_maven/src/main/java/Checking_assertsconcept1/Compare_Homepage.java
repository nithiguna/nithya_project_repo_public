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
	
	//span[text()='Qty:']
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-small'])[11]")
	WebElement review_the_process;
	
	@FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']/li/span")
	WebElement incorrect_password;
	
	public void incorrect_password()
	{
		Assert.assertTrue(incorrect_password.isDisplayed(),"Incorrect Password");
	}
	
	
public void Validate_Page() {
	Assert.assertTrue(home_page.isDisplayed());
}

public void quantity_validate() {
	
	
	Assert.assertTrue(quantity_verify.isDisplayed());
}

public void review_cart_till_end()
{
	Assert.assertTrue(review_the_process.isDisplayed());
}
public Compare_Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
}
