package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class payment_option{
	WebDriver driver;
	
@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[3]")
WebElement debit_card;

@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[3]")
WebElement credit_card;

@FindBy(linkText="Enter card details")
WebElement enter_card_details;

@FindBy(xpath="//button[@class='a-button-text']")
WebElement cancel;

@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[4]")
WebElement net_banking;

@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[5]")
WebElement upi;

@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[6]")
WebElement emi;

@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[7]")
WebElement cod;

public void creditcard()
{
	credit_card.click();
}
public void entercard()
{
	enter_card_details.click();
}
public void cancel_button()
{
	cancel.click();
}

public void debit()
{
	debit_card.click();
}

public void net_bank()
{
	net_banking.click();
}
public void upi()
{
	upi.click();
}

public void emi()
{
	emi.click();
}
public void cod()
{
	cod.click();
}

public void payment_selected_verify(WebDriver driver)
{
	String expected="Amazon.in Checkout";
	String actual=driver.getTitle();
	Assert.assertEquals(actual, expected,"Sorry its not match");
}
public payment_option(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}

}
