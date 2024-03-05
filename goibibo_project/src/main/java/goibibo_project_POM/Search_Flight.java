package goibibo_project_POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Search_Flight {
	
	@FindBy(xpath="//div[@data-id='flt-srch-wdgt']//h2")
	WebElement homepage;
	
	@FindBy(xpath="//div[@class='sc-1gt8xf5-3 helaNf']/div")
	WebElement homepage_pop_window;
	
	@FindBy(xpath="//div[@class='sc-bVHCgj esilDC']/header/ul/li[2]")
	WebElement hotel;
	
	@FindBy(xpath="(//div[@class='sc-bVHCgj esilDC']/header/ul/li)[1]")
	//@FindBy(xpath="//span[text()='Flights']")
	WebElement flight;
	
	@FindBy(xpath="(//div[@class='sc-12foipm-30 cYbSgs']/ul/li)[1]")
	WebElement one_way_Search;
	
	@FindBy(xpath="//div[@class='sc-12foipm-30 cYbSgs']/ul/li[2]")
	WebElement round_trip;
	
	@FindBy(xpath="//div[@class='sc-12foipm-30 cYbSgs']/ul/li[3]")
	WebElement multi_city;
	
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement from;
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement from1;
	@FindBy(xpath="//div[@class='sc-tagGq itVWqe']")
	WebElement other_element;
	
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[5]")
	WebElement multicity_from;
	
	//@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]/p[1]")
	//@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]/p[2]")
	@FindBy(xpath="(//div[@class='sc-12foipm-34 iHoHRr'])[6]/div[1]/p[1]")
	WebElement multicity_to;
	
	@FindBy (xpath="//input[@type='text']")
	WebElement enter_from_city;
	
	@FindBy(xpath="//ul[@id='autoSuggest-list']/li[1]")
	List<WebElement> list_of_city;
	
	//ul[@id='autoSuggest-list']/li[1]
	@FindBy(xpath="//span[text()='SEARCH FLIGHTS']")
	WebElement after_giving_date_traveller_class_Details_search;
	
	@FindBy(xpath="//section[@class='search-widget-uistyles__OuterWrapDiv-sc-f6e3g4-0 djUYgM']//div//div//input[1]")
	WebElement validate_one_way_search;
	
	@FindBy(xpath="(//div[@class='search-widget-uistyles__ClassWrap-sc-f6e3g4-2 kNDUVZ']/label)[2]")
	WebElement validate_round_trip;
	
	@FindBy(xpath="//span[@class='sc-1f95z5i-8 gnkTau header-sprite logo gi-logo']")
	WebElement goibibo;
	
	public void enter_sleeptime() throws InterruptedException
	{
		Thread.sleep(5000);		
	}
	public void home_page_domestic_international()
	{
		homepage.click();
	}
	

	public void home_page_pop()
	{
		homepage_pop_window.click();
	}
	
	public void hotel()
	{
		hotel.click();
	}
	public void flight(WebDriver driver)
	{
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(flight));
		flight.click();
	}
	public void one_way_Search()
	{
		one_way_Search.click();
	}
	
	public void round_trip()
	{
		round_trip.click();
	}
	public void multi_city()
	{
		multi_city.click();
	}
	public void from()
	{
		from.click();
	}
	public void other_element()
	{
		other_element.click();
	}
	
//	public void from1(WebDriver driver) 
//	{
		
	//	WebElement element = driver.findElement(By.xpath("your_xpath"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", from1);
//		from1.click();
		
		
//		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(20));
//		w1.until(ExpectedConditions.elementToBeClickable(from1)).click();;
	//	from.click();
		
//		try {
//		   from1.click();
//		} catch (ElementClickInterceptedException e) {
//		    // Handle the exception, such as waiting and retrying
//		System.out.println("Im here clickable is not working ");
//		}
		
		//WebElement fromCityField = driver.findElement(By.id("fromCity"));
//		if (from1.isEnabled() && from1.isDisplayed()) {
//			from1.click();
//		} else {
//			System.out.println("Im here clickable is not working ");
//			// Handle the situation when the element is not clickable
//		}
		
		public void from1(WebDriver driver) throws InterruptedException
		{
			Point p1=from1.getLocation();
			int y=p1.getY();
			System.out.println(y);
			JavascriptExecutor j1=(JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(2000);
			from1.click();

	}
	public void multicity_from()
	{

		multicity_from.click();
	}
	
	public void multicity_to()
	{

		multicity_to.click();
	}

	public void enter_from_city()
	{
		enter_from_city.sendKeys("goa");
		
	}
	public void enter_to_city()
	{
		
		enter_from_city.sendKeys("New Delhi");
	}
	public void multicity_enter_from_city()
	{
		
		enter_from_city.sendKeys("coimbatore");
	}
	public void multicity_to_city()
	{
		
		enter_from_city.sendKeys("chennai");
	}
	
	public void list_of_city()
	{
		list_of_city.get(0).click();
	}
	
	public void search_flight_submit()
	{
		after_giving_date_traveller_class_Details_search.click();
	}
	public void validate_one_way_search()
	{
//		String text=validate_one_way_search.getText();
//		String text1=text.toLowerCase();
//		System.out.println(text1);
//		
//		Assert.assertEquals(text1,"One Way Trip", "one way search is not shown");//One Way Trip
		//Assert.assertEquals(validate_one_way_search.getText(),"One Way Trip", "one way search is not shown");//One Way Trip
		//Assert.assertTrue(validate_one_way_search.isSelected(),"One way search is not selected");
		Assert.assertEquals(validate_one_way_search.isSelected(), true,"One way search is not selected");
		//Assert.assertEquals(validate_one_way_search.isDisplayed(), true,"One way search is not selected");
	}
	public void validate_round_trip()
	{
		
		//System.out.println(validate_round_trip.getText());
		Assert.assertEquals(validate_round_trip.isDisplayed(),true, "Round trip flight is not showed");
	}
	public void sleep_time_before_Search() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	public void title(WebDriver driver)
	{
		String expected=driver.getTitle();
		System.out.println(expected);
		Assert.assertEquals(expected, "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off");
		
	}
	public void goibibo()
	{
		goibibo.click();	
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();	
	}
	
//	public void checking_search_page_loaded_Succesfully()
//	{
//		Assert.assertEquals(driver.getTitle(),"Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo","sorry its failed");
//	}
	//Assert.assertEquals(driver.getTitle(), "Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "sorry its failed");

	public Search_Flight(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
