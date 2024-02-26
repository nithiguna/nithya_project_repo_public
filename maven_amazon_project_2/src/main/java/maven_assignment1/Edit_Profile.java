package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Edit_Profile {

	//@FindBy(xpath="//span[text()='Manage Profiles']")
	@FindBy(xpath="//div[@class='sc-fvEvSO iLGXrF']")
	WebElement manage_profile;
	
	@FindBy(linkText="View")
	WebElement view;
	
	@FindBy(xpath="(//div[@class='accordion-item'])[1]")
	WebElement prefered_dept;
	
	@FindBy(xpath="//button[text()='Add']")
	WebElement add;
	
	@FindBy(xpath="//button[text()='Women']")
	WebElement women;
	
	//@FindBy(xpath="//span[text()='Save']")
	@FindBy(xpath="//input[@type='submit']")
	WebElement save;
	
	
	public void manage_profile()
	{
		manage_profile.click();
	}
	public void view()
	{
		view.click();
	}
	public void prefered_dept()
	{
		prefered_dept.click();
	}
	public void add()
	{
		add.click();
	}
	public void women()
	{
		women.click();
	}
	public void save()
	{
		save.click();
	}
	
	public void validate_profile_save()
	{
		Assert.assertTrue(save.isDisplayed(), "not able to edit the profile");
	}
	public Edit_Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
			
	}
}
