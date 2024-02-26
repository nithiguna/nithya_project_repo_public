package maven_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_logout01 {
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement account_list;
	//@FindBy(linkText = "Sign Out")
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement sign_out;
	public void mouse_hover_account(WebDriver driver) {
		Actions a2 = new Actions(driver);
		a2.moveToElement(account_list).perform();
	}
	public void sign_out() {
		sign_out.click();
	}
	// 3. initilizaing each component using page factory class
	public Amz_logout01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
