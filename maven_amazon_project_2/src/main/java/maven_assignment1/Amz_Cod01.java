package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Cod01 {
	WebDriver driver;
@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
WebElement buy_prod;
@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
WebElement use_this_address;
@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[7]")
WebElement cash_0n_delivery;

public void buy_product()
{
	buy_prod.click();
}

public void address()
{
	use_this_address.click();
}

public void cash_delivery()
{
	cash_0n_delivery.click();
}
public Amz_Cod01(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}
}
