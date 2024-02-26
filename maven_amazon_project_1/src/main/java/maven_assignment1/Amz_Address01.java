package maven_assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_Address01 {

	
		WebDriver driver;
		@FindBy(xpath="(//div[@class='nav-title'])[2]")
		WebElement address_update;
		
		//@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[4]")
		@FindBy(linkText="Your Account")
		WebElement your_account;
		
		@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[4]")
		WebElement your_address;
		
		@FindBy(xpath="//div[@class='a-box first-desktop-address-tile']")
		WebElement add_address;
		
	//	@FindBy(id="ya-myab-address-edit-btn-1")
	//	@FindBy(xpath="//div[@class='a-column a-span4 a-spacing-none a-spacing-top-mini address-column'][2]/div[2]/a[@class='a-link-normal']")
		//@FindBy(xpath="//div[@class='a-section a-spacing-double-large']/div/div[2]/div[2]/span/a")
		//@FindBy(linkText="Edit            ")
		@FindBy(xpath="//a[@id='ya-myab-address-edit-btn-0']")
		WebElement edit_address;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
		WebElement name;
		
		@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressPhoneNumber']")
		WebElement mobile_update;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
		WebElement pincode;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
		WebElement flatno;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
		WebElement street;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
		WebElement landmark;
		
		@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
		WebElement city;
		
	//	@FindBy(xpath="(//span[@class='select2-selection__rendered'])[2]")
		@FindBy(xpath="//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']")
		WebElement state;
		
		@FindBy(xpath="(//input[@class='a-button-input'])[3]")
		WebElement addadress_afterupdate;
		
		@FindBy(xpath="//span[text()='Make this my default address']")
		WebElement default1;
		
	//	@FindBy(xpath="(//span[@class='a-declarative'])[15]/span[@id='address-ui-widgets-form-submit-button']/span[@class='a-button-inner']/span")
	//	@FindBy(xpath="//span[text()='Save changes']")
		//@FindBy(xpath="(//span[@class='a-declarative'])[15]")
		//@FindBy(xpath="(//span[@class=\"a-declarative\"])[5]/span[@id=\"address-ui-widgets-form-submit-button\"]/span[@class=\"a-button-inner\"]")
		@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']")
		WebElement save_changes;
		
		@FindBy(linkText="Set as Default")
		WebElement set_as_default_Address;
				
		public void address()
		{
			address_update.click();
		}
		
		public void your_account()
		{
			your_account.click();
		}
		public void your_address()
		{
			your_address.click();
		}
		public void add_address() {
			add_address.click();
		}
		public void edit_address()
		{
			edit_address.click();
		}
		public void full_name()
		{
			name.clear();
			name.sendKeys("Nithya");
		}
		public void mobile()
		{
			mobile_update.clear();
			mobile_update.sendKeys("7339443860");
		}
		
		public void pincode()
		{
			pincode.clear();
			pincode.sendKeys("620001");
		}
		public void flat_no()
		{
			flatno.clear();
			flatno.sendKeys("113/70");
		}
		public void street()
		{
			street.clear();
			street.sendKeys("New St,4th cross,karumandapam");
		}
		public void landmark()
		{
			landmark.clear();
			landmark.sendKeys("Near Venllangkanni stores");
			
		}
		public void city()
		{
			city.sendKeys("Trichy");
		}
		public void state()
		{
			Select s1=new Select(state);
			s1.selectByVisibleText("TAMIL NADU");
			//state.sendKeys("TAMIL NADU");
			
		}
		public void addadress_update()
		{
			addadress_afterupdate.click();
		}
		public void default1()
		{
			default1.click();
		}
		public void set_default_address()
{
			set_as_default_Address.click();
}
		public void save_changes()
		{
			
		//	WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
			
		//	w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='address-ui-widgets-form-submit-button']"))).click();
			//w1.until(ExpectedConditions.visibilityOfElementLocated(save_changes.click());
		save_changes.click();
		}
		public void address_saved_verify(WebDriver driver)
		{
			String actual=driver.getTitle();
			String Expexted_title="Your Addresses";
			Assert.assertEquals(actual, Expexted_title);
		}

//		public void clearing_the-textdata()
//		{
//			name.clear();
//			mobile_update.clear();
//			pincode.clear();
//			flatno.clear();
//			street.clear();
//			landmark.clear();
//			city.clear();
//		}
		
		public Amz_Address01(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

	}

