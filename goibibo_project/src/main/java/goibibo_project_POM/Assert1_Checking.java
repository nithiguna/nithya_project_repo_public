package goibibo_project_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Assert1_Checking {

	WebDriver driver;
	public void checking_search_page_loaded_Succesfully()
	{
		Assert.assertEquals(driver.getTitle(),"Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo","sorry its failed");
	}
	//Assert.assertEquals(driver.getTitle(), "Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "sorry its failed");
	
	public Assert1_Checking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
