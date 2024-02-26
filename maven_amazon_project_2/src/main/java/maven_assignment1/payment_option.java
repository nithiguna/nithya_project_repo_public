package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class payment_option{
	WebDriver driver;
	
@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[2]")
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

//@FindBy(xpath="//span[@id='pp-iWLmSm-192-announce']")
//WebElement use_this_payment;


@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
WebElement use_payment;

public void creditcard()
{
	credit_card.click();
}
public void credit_card_selection_check()
{
	Assert.assertTrue(credit_card.isDisplayed());
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
public void debit_card_selection_check()
{
	Assert.assertEquals(debit_card.isDisplayed(),true,"debit card is not selected");
}

public void net_bank()
{
	net_banking.click();
}
public void net_banking_selection_check()
{
	Assert.assertEquals(net_banking.isDisplayed(),true,"net banking is not selected");
}

public void upi()
{
	upi.click();
}
public void upi_selection_check()
{
	Assert.assertEquals(upi.isDisplayed(),true,"upi is not selected");
}


public void emi()
{
	emi.click();
}
public void emi_selection_check()
{
	Assert.assertEquals(emi.isDisplayed(),true,"emi is not selected");
}

public void cod()
{
	cod.click();
}
public void cod_selection_check()
{
	Assert.assertEquals(cod.isDisplayed(),true,"cod is not selected");
}

//public void use_this_pay()
//{
//	use_this_payment.click();
//}

public void use_payment()
{
	use_payment.click();
}
public payment_option(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}

}
