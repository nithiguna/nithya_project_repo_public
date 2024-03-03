package goibibo_project_POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Extra_Features_Flightpassenger {

	@FindBy(xpath="(//span[text()='1 Stop'])")
	WebElement one_stop;
	
	@FindBy(xpath="(//button[text()='VIEW FARES'])[3]")
	WebElement view_fares;
	
	@FindBy(xpath="(//span[text()='Meal'])")
	WebElement meal;
	
	@FindBy(xpath="(//div[text()='Chargeable'])[2]")
	WebElement chargable_meal;
	
	@FindBy(xpath="(//div[text()='Paid seats only'])[2]")
	WebElement paid_seat;
	
	@FindBy(xpath="(//div[text()='Standard seat included; non-standard seats chargeable'])")
	WebElement seat_chargable;
	
	@FindBy(xpath="(//span[text()='Check-in baggage'])[2]")
	WebElement check_in_baggage;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	WebElement book_ticket;
	
	@FindBy(xpath="//div[text()='Personal']")
	WebElement personal_info;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceed;
	
	
	@FindBy(xpath="//button[text()='Travel Unsecured']")
	WebElement travel_unsecured;
	
	@FindBy(xpath="//button[text()='That’s Correct']")
	WebElement thats_correct;
	
	@FindBy(xpath="//span[text()='Skip to Payment']")
	WebElement skip_payment;
	
	@FindBy(xpath="//span[text()='Credit/Debit/ATM Card']")
	WebElement credit_payment;
	
	//@FindBy(xpath="//span[text()='ALL PAYMENT OPTIONS']")
	@FindBy(xpath="//span[@class='sprite backArrowIcon--blue']")
	WebElement all_payment_option;
	
	@FindBy(xpath="(//div[@class='border1 borderRad12 slideUp']//div//div//div//div/input)[1]")
	WebElement card_details;
	
	@FindBy(xpath="//span[text()='Extra leg-room']")
	WebElement extra_legroom_charge;
	
	
	//button[text()='OK']	
	
	//span[text()='Credit/Debit/ATM Card']
	
	public void one_stop()
	{
		one_stop.click();
	}
	public void view_fares()
	{
		view_fares.click();
	}
	public void meal()
	{
		meal.click();
	}
	public void chargable_meal()
	{
		chargable_meal.click();
	}
	public void paid_seat()
	{
		paid_seat.click();
	}
	public void seat_chargable()
	{
		seat_chargable.click();
	}
	public void check_in_baggage()
	{
		check_in_baggage.click();
	}
	
	public void switchtochildWindow(WebDriver driver) {
		String window =driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> winpop = windows.iterator();
		String parentid = winpop.next();
		String childid = winpop.next();
		driver.switchTo().window(childid);
	}

	public void book_ticket(WebDriver driver) throws InterruptedException
	{
		
		book_ticket.click();
		Thread.sleep(3000);
		switchtochildWindow(driver);
		
		
	}
//	public void switchwindow(WebDriver driver)
//	{
//	
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> win_pop = windows.iterator();
//		String firstwindow= win_pop.next();
//		String secondwindow = win_pop.next();
//		driver.switchTo().window(secondwindow);
//		
//	}
	public void personal_info()
	{
		personal_info.click();
	}
	public void validate_chargable_meal()
	
	{
		String text=chargable_meal.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Chargeable", "meal is not charged");
		//Assert.assertEquals(chargable_meal, true, "meal is not charged");
	}
	public void validate_check_in_baggage()
	{
		
		System.out.println(check_in_baggage.getText());
		Assert.assertEquals(check_in_baggage.getText(),"Check-in baggage", "check_in baggage is not charged");
	}
	
	public void validate_view_fares()
	{
		
		System.out.println(view_fares.getText());
		Assert.assertEquals(view_fares.getText(),"VIEW ", "check_in baggage is not charged");//VIEW FARES
	}
	
	
	public void proceed(WebDriver driver) throws InterruptedException
	{
		Point p1=proceed.getLocation();
		int y=p1.getY();
		JavascriptExecutor j1=(JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(2000);
		proceed.click();
		Thread.sleep(3000);
		switchtochildWindow(driver);
	}
	public void travel_unsecured()
	{
		travel_unsecured.click();
	}
	public void thats_correct()
	{
		thats_correct.click();
	}
	public void skip_payment()
	{
		skip_payment.click();
	}
	public void credit_payment()
	{
		credit_payment.click();
	}
	public void all_payment_option()
	{
		all_payment_option.click();
	}
	public void card_details() throws InterruptedException
	{
		
		card_details.sendKeys("43563245523452345");
		Thread.sleep(1000);
	}
	
	public void validate_credit_payment()
	{
		//Assert.assertEquals(credit_payment.isDisplayed(),true,"Credit card selection is not succeed");
		Assert.assertEquals(credit_payment.getText(),"Credit/Debit/ATM Card","Credit card selection is not succeed");
	}
	public void extra_legroom_charge()
	{
		extra_legroom_charge.click();
	}
	public void validate_extra_legroom_charge()
	{
		
		Assert.assertEquals(extra_legroom_charge.getText(),"Extra leg-room","Extra leg-room is not charged");
	}
	public Extra_Features_Flightpassenger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
}
