package maven_assignment1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class Searching_Category {
WebDriver driver;
	
	

	@FindBy(xpath="//div[@id='departments']/ul/span/span/li[6]/span/a/span")
	WebElement prd_selection;
	
	@FindBy(xpath="//div[@id='priceRefinements']/ul/span/span[4]/li/span/a/span")
	WebElement price_sorting;
	
	@FindBy(xpath="//div[@id='priceRefinements']/ul/span/span[3]/li/span/a/span")
	WebElement second_price_sorting;
	
	
//	@FindBy(xpath="//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i/span[1]")
	@FindBy(xpath="(//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i)[1]")
	WebElement reviews_check;
	
	@FindBy(xpath="(//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i)[3]")
	WebElement second_reviews_check;
	
	public void product()
	
	{
		prd_selection.click();
	}
	public void price_select()
	{
		price_sorting.click();
	}
	
	public void view_the_reviews()
	{
		reviews_check.click();
	}
	public void second_price_select()
	{
		second_price_sorting.click();
	}
	
	public void second_view_the_reviews()
	{
		reviews_check.click();
	}

	public Searching_Category(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
