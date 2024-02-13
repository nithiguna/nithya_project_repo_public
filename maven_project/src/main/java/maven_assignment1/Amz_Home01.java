package maven_assignment1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Home01 {
	WebDriver driver;

	// 1. Locating each component by using @FindBy Annotations
	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;

	// 2. creating the method for each componenet to perform its action

	public void searching_the_product() {
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
	}

	// 3. initilizaing each component using page factory class

	public Amz_Home01(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

}
