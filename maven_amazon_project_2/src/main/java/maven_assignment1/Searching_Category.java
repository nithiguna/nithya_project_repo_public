package maven_assignment1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;

public class Searching_Category {
WebDriver driver;
	
	

	@FindBy(xpath="//div[@id='departments']/ul/span/span/li[6]/span/a/span")
	WebElement prd_selection;
	
	@FindBy(xpath="//div[@id='priceRefinements']/ul/span/span[4]/li/span/a/span")
	WebElement price_sorting;
	
	@FindBy(xpath="//div[@id='priceRefinements']/ul/span/span[3]/li/span/a/span")
	WebElement filter_price;
	
	

	@FindBy(xpath="(//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i)[1]")
	WebElement reviews_check;  //homepage search that customer review
	
	
	
	//@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']/span[1]")
	//@FindBy(xpath="//span[@class='a-price aok-align-center']/span[1]")
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center aok-relative']/span[3]")
	WebElement individual_price;
	
//	//@FindBy(linkText="See customer reviews")
//	@FindBy(xpath="//div[@class='a-popover a-popover-no-header a-declarative a-arrow-bottom']//div[@class='a-section a-spacing-base a-text-center']")
//	WebElement customer_review;
	
	
	@FindBy(xpath="(//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i)[3]")
	WebElement second_reviews_check;
	
	@FindBy(xpath="//span[@id='acrCustomerReviewText'][1]")
	WebElement reviews_prod_page;
	
	
//	@FindBy(xpath="//div[@id='averageCustomerReviews']/span[3]/a")
//	WebElement ratings;
	
	
	
	@FindBy(xpath="//div[@id='aplus']/h2")
	//@FindBy(xpath="//div[@id='aplus_feature_div']/div//hr[@class='bucketDivider']")
	WebElement Prod_description;
	public void product()
	
	{
		prd_selection.click();
	}
	public void validate_product()
	{
		Assert.assertTrue(prd_selection.isDisplayed(),"category selection is not happen");
	}
	public void price_filter()
	{
		price_sorting.click();
	}
	public void validate_price_filter()
	{
		Assert.assertEquals(price_sorting.isDisplayed(),true,"price selection not happen");
	}
	
	public void view_the_reviews()
	{
		
		reviews_check.click();
	}
	public void individual_price()
			{
		//String Product_price=individual_price.getText();
//		WebElement expected=individual_price;
	//	System.out.println(Product_price);
	//Assert.assertEquals(Product_price, expected, "Price is not shown");
	//	return actual;
		Assert.assertEquals(individual_price.isDisplayed(),true,"price is not show");
		
	}
//	public void customer_review()
//	{
//		Assert.assertEquals(customer_review().isDisplayed(),true,"customer review is not showing");
//		//customer_review.click();
//	}
	public void price_select()
	{
		filter_price.click();
	}
	
	public void second_view_the_reviews()
	{
		reviews_check.click();
	}

	public void validate_review_prod_page()
	{
		//String prod=reviews_prod_page.getText();
		//System.out.println(prod);
		Assert.assertEquals(reviews_prod_page.isDisplayed(),true,"Reviews is not shown");
	}
	
	
	public void validate_Prod_description()
	{
		//String prod_descp=Prod_description.getText();
		//System.out.println(prod_descp);
		Assert.assertEquals(Prod_description.isDisplayed(),true,"Product descriptions is not shown");
	}
	public void Validate_second_price()
	{
		//String prod_price_filter=filter_price.getText();
	//	System.out.println(prod_price_filter);
		Assert.assertEquals(filter_price.isDisplayed(),true,"Pirce is not selected");
		
	}

	public Searching_Category(WebDriver driver)
		
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
