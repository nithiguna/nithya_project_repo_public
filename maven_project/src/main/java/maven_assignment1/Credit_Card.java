package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Credit_Card {
	
//	public void card_number()
//	{
//		card_details_enter.sendKeys("433334343434343");
//	}
	public Credit_Card(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
