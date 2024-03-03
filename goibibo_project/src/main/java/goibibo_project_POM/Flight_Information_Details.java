package goibibo_project_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flight_Information_Details {

	@FindBy(linkText="Flight Details")
	WebElement flight_details;
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[1]/span[1]")
	WebElement flight_info;
	
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']")
	WebElement validate_flight_info_link;
	
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[1]/span[2]")
	WebElement fare_details;
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[2]")
	WebElement validate_fare_details;
	
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[1]/span[3]")
	WebElement baggage_details;
	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[2]")
	WebElement validate_baggage_details;

	@FindBy(xpath="//div[@class='srp-card-uistyles__FltDetailCnt-sc-3flq99-39 anweF']/div[1]/span[4]")
	WebElement cancel_details;
	@FindBy(xpath="//div[@class='bagCancelRulesstyles__PolicyBody-sc-1li590v-13 AHevY']")
	WebElement validate_cancel_details;
	
	public void flight_detals()
	{
		flight_details.click();
	}
	public void flight_info()
	{
		flight_info.click();
	}
	public void fare_details()
	{
		fare_details.click();
	}
	public void baggage_details()
	{
		baggage_details.click();
	}
	public void cancel_details()
	{
		cancel_details.click();
	}
	public void validate_flight_info_link()
	{
		Assert.assertEquals(validate_flight_info_link.isDisplayed(),true,"validate_flight_info is not present");
	}
	public void validate_fare_details()
	{
		Assert.assertEquals(validate_fare_details.isDisplayed(),true,"validate_fare_details is not present");
	}
	public void validate_baggage_details()
	{
		Assert.assertEquals(validate_baggage_details.isDisplayed(),true,"validate_baggage_details is not present");
	}
	public void validate_cancel_details()
	{
		Assert.assertEquals(validate_cancel_details.isDisplayed(),true,"validate_cancel_details is not present");
	}
	public Flight_Information_Details(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
