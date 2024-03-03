package goibibo_project_POM;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Personal_Details {

	@FindBy(name="mobile")
	//@FindBy(xpath="((//div[@class='sc-162selc-3 bROSkA'])[1]/div[1])/div/input")
	WebElement mobile_number;
	
	@FindBy(xpath="//input[@name='email']")
	//@FindBy(xpath="((//div[@class='sc-162selc-3 bROSkA'])[1]/div[2])/div/input")
	WebElement email_id;
	
	@FindBy(xpath="//input[@name='givenname']")
	//@FindBy(xpath="((//div[@class='sc-162selc-3 bROSkA'])[2]/div[1])/div/input")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name='lastname']")
	//@FindBy(xpath="((//div[@class='sc-162selc-3 bROSkA'])[2]/div[2])/div/input")
	WebElement last_name;
	
	@FindBy(xpath="//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee']")
	//@FindBy(xpath="//span[@class='radioOuter']/label[2]")
	WebElement gender;
	
	@FindBy(xpath="(//div[@class='sc-1v8myus-2 eYa-DOi'][1]/button)[1]")
	WebElement personal_info_save;
	
	@FindBy(xpath="//input[@id='Billing Address']")
	//@FindBy(xpath="(//div[@class='sc-1gtddvc-0 eiKyMy']/div/div[1])/div[1]/input[1]")
	WebElement billing_address;
	
	@FindBy(xpath="//input[@id='Pincode']")
	//@FindBy(xpath="(//div[@class='sc-1gtddvc-0 eiKyMy']/div/div[2])/div[1]/input[1]")
	WebElement pincode;
	
	
	@FindBy(xpath="(//ul[@class='sc-iapWAC bPcczV'])/li")
	List<WebElement> state;
	
//	@FindBy(xpath="(//div[@class='sc-1v8myus-2 eYa-DOi'][1]/button)[3]")
//	WebElement billing_info_save;
	
	@FindBy(xpath="//div[@class='sc-1iwx74w-0 jYpDkq']/p")
	WebElement offers_available;//coupon code
	
	@FindBy(xpath="//span[@class='sc-ktPPKK hKXtqD']")
	WebElement billing_info_save;
	
	@FindBy(xpath="//div//p[@class='sc-dExYaf fFgTQr']")
	WebElement state_arrowdown;
	
	@FindBy(xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 iCEsUc'])[1]")
	WebElement proceed_with_booking;
	
	
	
	public void email_id()
	{
		email_id.sendKeys("nithimadhavguna@gmail.com");
	}
	public void mobile_number()
	{
		mobile_number.sendKeys("7339443860");
	}
	
//	public void mobile_number()
//	{
//		Assert.assertEquals(mobile_number.isDisplayed(), true, "Mobile number is not entered");
//		
//	}
//	public void validate_email_id()
//	{
//		Assert.assertEquals(email_id.isDisplayed(), true, "email_id is not entered");
//		
//	}
	public void first_name()
	{
		first_name.clear();
		first_name.sendKeys("Nithya");
	}
	public void last_name()
	{
		last_name.clear();
		last_name.sendKeys("Gunasekaran");
	}
	public void gender()
	{
			Select select_gender=new Select(gender);
			select_gender.selectByVisibleText("Female");		
			
		}
				
	
	public void personal_info_save()
	{
		personal_info_save.click();		
	}
	public void billing_address()
	{
		billing_address.sendKeys("113/70,New St,4th cross,karumandapam,Near Venllangkanni stores,TIRUCHIRAPPALLI");
		
	}
	public void pincode()
	{
		//pincode.clear();
		pincode.sendKeys("620001");
	}
	
	public void state_arrowdown() {
		state_arrowdown.click();
	}
	public void state() 
	{
		state_arrowdown();
		int count=state.size();
		state.get(31).click();
	}
	public void billing_info_save()
	{
		billing_info_save.click();		
	}
	public void offers_available()
	{
		offers_available.click();		
	}
	public void proceed_with_booking()
	{
		proceed_with_booking.click();		
	}

	public Personal_Details(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
