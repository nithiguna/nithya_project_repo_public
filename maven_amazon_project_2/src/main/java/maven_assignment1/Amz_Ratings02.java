package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amz_Ratings02 {
	WebDriver driver;
	@FindBy(linkText="Your Orders")
	WebElement your_order;
	
	@FindBy(id="time-filter")
	WebElement prevoius_order;
	
	@FindBy(linkText="Write a product review")
	WebElement product_review;
	
	//@FindBy(xpath="(//div[@class='a-section a-spacing-top-micro ryp__interval-product-attribute-input'][1]//button[@type='button'][4])[1]")
	@FindBy(xpath="//div[@class='a-section a-spacing-top-micro']//button[@type='button'][5]")
	WebElement give_stars;
	
	@FindBy(xpath="//span[text()='Submitted']")
	WebElement submit;
	
	public void your_order()
	{
		your_order.click();
	}
	public void previous_order()
	{
		Select s1=new Select(prevoius_order);
		
		s1.selectByVisibleText("2023");
		}
	public void prd_review()
	{
		product_review.click();
	}
	public void give_Stars()
	{
		give_stars.click();
	}
	public void submit()
	{
		submit.click();
	}
	public void validate_submit_reviews()
	{
		Assert.assertEquals(submit.isDisplayed(),true,"reviews not submitted");
	}
	public Amz_Ratings02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
}
