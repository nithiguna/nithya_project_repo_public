package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Register_Account {

	@FindBy(linkText="Start here.")
	WebElement start_here;
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement create_amazon;
	
	@FindBy(name="customerName")
	WebElement cust_name;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile_no;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement verify_mobile_no;
	public void start_here()
	{
		start_here.click();
	}
	public void create_amazon()
	{
		create_amazon.click();
	}
	public void cust_name()
	{
		cust_name.sendKeys("Nithya");
	}
	public void mobile_no()
	{
		mobile_no.sendKeys("6379289114");
	}
	public void password()
	{
		password.sendKeys("Vijaya1@@");
	}
	public void verifiy_mobile()
	{
		verify_mobile_no.click();
	}
	public New_Register_Account(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
