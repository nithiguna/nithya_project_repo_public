package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Register_Account {

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
	public void create_amazon()
	{
		create_amazon.click();
	}
	public void cust_name()
	{
		cust_name.sendKeys("Gunasekaran");
	}
	public void mobile_no()
	{
		mobile_no.sendKeys("16303292834");
	}
	public void password()
	{
		password.sendKeys("");
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
