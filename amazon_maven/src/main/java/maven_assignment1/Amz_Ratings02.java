package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amz_Ratings02 {
	WebDriver driver;
	@FindBy(linkText="Your Orders")
	WebElement your_order;
	
	@FindBy(id="time-filter")
	WebElement prevoius_order;
	
	@FindBy(linkText="Write a product review")
	WebElement product_review;
	
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
	public Amz_Ratings02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
}
