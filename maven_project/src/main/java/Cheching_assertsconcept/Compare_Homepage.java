package Cheching_assertsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Compare_Homepage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement home_page;
	
public void Validate_Page() {
	Assert.assertTrue(home_page.isDisplayed());
}
public Compare_Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
}
