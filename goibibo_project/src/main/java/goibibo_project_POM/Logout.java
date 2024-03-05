package goibibo_project_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath=" //div[@data-id='user-info-tab']")
	//@FindBy(xpath="(//div[@class='sc-1f95z5i-46 eysNXF']//div)[4]")
	//div[@class='sc-fifgRP iKzBkA']
	WebElement hover_profile_name;
	
	@FindBy(xpath="//div[@data-id='header-dropdown']/li")
	//@FindBy(xpath="(//div[@class='sc-1f95z5i-26 lkHhCD'])/li")
	WebElement view_your_profile;
	
	@FindBy(xpath="//button[.='Yes, Log out']")
	WebElement confirm_logout;
	
	//button[@class='sc-sypgwv-6 kkbZLK']
	@FindBy(xpath="//span[.='LOGOUT']")
	WebElement logout;
	
	public void hover_profile_name(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(hover_profile_name).perform();
	}
	public void view_your_profile()
	{
		view_your_profile.click();
	}
	public void logout()
	{
		logout.click();
	}
	public void confirm_logout()
	{
		confirm_logout.click();
	}
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
