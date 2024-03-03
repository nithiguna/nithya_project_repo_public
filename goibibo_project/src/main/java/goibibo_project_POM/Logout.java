package goibibo_project_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//div[@class='sc-1f95z5i-48 hXpXUa']")
	WebElement hover_profile_name;
	
	@FindBy(xpath="//div[@class='sc-1f95z5i-42 hnuxwW']/p[2]")
	WebElement view_your_profile;
	
	@FindBy(xpath="//div[@class='sc-1e4no8h-4 hAlxgR'][2]/button/span[2]")
	WebElement logout;
	
	@FindBy(xpath="//button[@class='sc-sypgwv-6 kkbZLK']")
	WebElement confirm_logout;
	
	public void hover_profile_name()
	{
		hover_profile_name.click();
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
