package maven_assignment1;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Fetching_Excel_Data;

public class Amz_Login01 extends Fetching_Excel_Data{
//WebDriver driver;

//1. Locating each component by using @FindBy Annotations
@FindBy(id="ap_email")
WebElement username;

@FindBy(id="continue")
WebElement username_submit;

@FindBy(id="ap_password")
WebElement password;

@FindBy(xpath="//input[@id='signInSubmit']")
WebElement sign_in_submit;

@FindBy(xpath="//span[text()='Hello, sign in']")
WebElement hello_sign;

@FindBy(xpath="(//span[text()='Sign in'])[1]")
WebElement sign_in;




//2. creating the method for each componenet to perform its 
public void un(String user_name) //throws EncryptedDocumentException, IOException
{
	
	username.sendKeys(user_name);
}

//public void un(String un) throws EncryptedDocumentException, IOException
//{
//	
//	username.sendKeys(un);
//}
public void un_submit()
{
	username_submit.click();
}

public void pwd(String pass_Word) // throws EncryptedDocumentException, IOException
{
	password.sendKeys(pass_Word);
																															
}
//public void pwd(String pwd) throws EncryptedDocumentException, IOException
//{
//	password.sendKeys(pwd);
//																															
//}
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

//3. initilizaing each component using page factory class
public Amz_Login01(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
