package maven_assignment1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility1.Data_For_Login;


public class Amz_Pwd_Incorrect01 extends Data_For_Login {
	static WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement username_submit;
	
	@FindBy(id="ap_password")
	WebElement password;

	//@FindBy(xpath="//div[@id='auth-error-message-box']/div/div/ul/li")
	@FindBy(xpath="//div[@class='a-alert-content']/ul/li")
	WebElement pwd_incorrect;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement sign_in_submit;

	@FindBy(xpath="//span[text()='Hello, sign in']")
	WebElement hello_sign;

	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement sign_in;




	//2. creating the method for each componenet to perform its action
	public void un1() throws EncryptedDocumentException, IOException
	{
		
		//username.sendKeys("7339443860");
	//	username.sendKeys(un1);
		}
	public void un_submit()
	{
		username_submit.click();
	}
	public void pwd1() throws EncryptedDocumentException, IOException
	{
		//password.sendKeys("Vijaya@@");
	//	password.sendKeys(pwd1);
																																
	}
	
	public void sign_in()
	{
		sign_in_submit.click();
	}
	public void hello_sign_in()
	{
		hello_sign.click();
	}
	public void sign_in1()
	{
		sign_in.click();
	}
	public String pwd_incorrect_message()
	{
		String message1=pwd_incorrect.getText();
		return message1;
	}

	//3. initiliazing each component using page factory class
	public Amz_Pwd_Incorrect01(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

	

