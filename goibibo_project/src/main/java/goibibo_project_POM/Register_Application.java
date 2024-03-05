package goibibo_project_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.Goibibo_Launch_quit1;

public class Register_Application extends Goibibo_Launch_quit1 {
	WebDriver driver;


	@FindBy(xpath = "//div[@class='sc-1f95z5i-17 jhzkPz']/p[1]")
	WebElement Login_signup;
	
	@FindBy(xpath="//div[@data-id='dweb-modal']")
	WebElement window_pop_up;

	
	@FindBy(xpath="(//div[@class='sc-kAyceB bwDIOk']/div/form)/div/input")
	WebElement enter_mobile_number;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement continue_mobile;
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement Close_the_window_popup;
	
	@FindBy(xpath="//p[text()='You have successfully logged in']")
	WebElement successful_login_message;

	@FindBy(xpath="//p[text()='Please enter a valid OTP']")
	WebElement invalid_otp;
	
	public void hoverover_sign_up() {
		Login_signup.click();
	}
	public void pop_up_window()
	{
		window_pop_up.click();
	}
//	public void enter_mobile_number(String mobile_num) {
//		enter_mobile_number.sendKeys(mobile_num);
//		// enter_mobile_number.click();
//	}
	public void enter_mobile_number() {
		enter_mobile_number.sendKeys("7339443860");
		
	}
	public void enter_mobile_number1(String mob_num) {
		enter_mobile_number.sendKeys(mob_num);
		
	}
	public void enter_mobile_number1() {
		enter_mobile_number.sendKeys("6379289114");
		
	}
	public void continue_mobile() throws InterruptedException {
		continue_mobile.click();
		Thread.sleep(30);
	}
	
	public void sleep_time() throws InterruptedException {
		
		Thread.sleep(10);
	}
	public void wait_until_homepage_load(WebDriver driver)
	{
		//Thread.sleep(5000);	
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(20));
		w1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[.='Congratulations']")));
	}
	
	
	public void Close_the_Mobile_window()
	{
		Close_the_window_popup.click();
	}
	public String login_success_message()
	{
		String success_login_message=successful_login_message.getText();
		
		return success_login_message;
	}
	public void Validate_login()
	{
		Assert.assertEquals(login_success_message(), "You have successfully logged in");
	}

	public String invalid_otp()
	{
		String invalid_otp1=invalid_otp.getText();
		return invalid_otp1;
	}
	
	public void Validate_invalid_otp()
	{
		Assert.assertEquals(invalid_otp(),"Please enter a valid OTP");
	}
	public Register_Application(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
