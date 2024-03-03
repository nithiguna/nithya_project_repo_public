package goibibo_project_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Travellers_Class {

	@FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[1]")
	WebElement economy;
	
	@FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[2]")
	WebElement premium_economy;
	
	@FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[3]")
	WebElement business;
	
	@FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[4]")
	WebElement first_class;
	
	@FindBy(xpath="//div[@class='search-widget-uistyles__PaxWrapperStyle-sc-f6e3g4-10 kmrdNu']/input")
	WebElement economy_result_after_search;
	
	@FindBy(xpath="(//*[local-name()='svg']//*[local-name()='path'])[3]")
	//@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]")
	WebElement adult_count;
	
	@FindBy(xpath="//div[@class='search-widget-uistyles__PaxWrapperStyle-sc-f6e3g4-10 kmrdNu']/input")
	WebElement passenger_class;
	
	@FindBy(xpath="//div[@class='pax-widgetstyles__FlightClassWrapper-sc-1rr7cks-12 gZyCvY']/div[2]/div/select")
	WebElement validate_passenger_class;
	public void economy()
	{
		economy.click();
	}
	public void premium_economy()
	{
		premium_economy.click();
	}
	public void business()
	{
		business.click();
	}
	public void first_class()
	{
		first_class.click();
	}
	public void validate_economy()
	{
		Assert.assertEquals(economy.isDisplayed(), true, "economy class is not selected ");
	}
	public void Validate_economy_result_after_search()
	{
		//SoftAssert sa=new SoftAssert();
		String travel_passenger=economy_result_after_search.getAttribute("value");
		String person=travel_passenger.substring(0, 1);
		System.out.println(person);
		int num=Integer.parseInt(person);
	//	Assert.assertTrue
		Assert.assertTrue(num>=2,"Mulitpassenger is not added");
		/*
		//if(num>=2)
		//{
			//try {
				if(num>=2)
				{
			Assert.assertEquals(num, num>=2, "multipassenger is not added");
				//	Assert.assertTrue(economy_result_after_search.isDisplayed(),"Mulitpassenger is not added");
				}
				else
				{
					Assert.assertTrue(economy_result_after_search.isDisplayed(),"Mulitpassenger is not added");
				}//				catch(AssertionError e)
//				{
//					System.out.println(e);
//				}

 */
			}
			
	
		//sa.assertAll();
		
	
	public void validate_premium_economy()
	{
		Assert.assertEquals(premium_economy.isDisplayed(), true, "premium_economy class is not selected ");
	}
	public void validate_business()
	{
		Assert.assertEquals(business.isDisplayed(), true, "business class is not selected ");
	}
	public void validate_first_class()
	{
		Assert.assertEquals(first_class.isDisplayed(), true, "first_class class is not selected ");
	}
	public void adult_count()
	{
		//adult_count.sendKeys("2");
		//adult_count.sendKeys(Keys.ENTER);
		adult_count.click();
		adult_count.click();
		adult_count.click();
		
	}
	public void validate_passenger_class()
	{
	//	Select s1=new Select(validate_passenger_class);
	//	s1.selectByVisibleText("Economy");
		//String travel_passenger=economy_result_after_search.getAttribute("value");
//		String passenger_class_name=validate_passenger_class.getAttribute("value");
//		String name=passenger_class.getText();	
//		String first_letter=name.substring(15);
//		System.out.println(first_letter);
//		Assert.assertTrue(passenger_class_name.equals(first_letter),"class is not selected" );
		
		Assert.assertEquals(passenger_class.isDisplayed(), true,"Passenger class is not select");
	}
	public void passenger_class()
	{
		passenger_class.click();
	}
	
	public Travellers_Class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
