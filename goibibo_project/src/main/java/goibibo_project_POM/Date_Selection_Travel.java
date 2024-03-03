package goibibo_project_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Date_Selection_Travel {

//	@FindBy(xpath="//div[@class='gr_fswFld active']")
//	WebElement date_selection1;
//	
//	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '][1]/p)[3]")
//	WebElement Departure_calender;
	@FindBy(xpath="//div[@class='sc-12foipm-14 lhvXDk']/div[3]")
	WebElement dept_calender;
	
	//@FindBy(xpath="//div[@class='sc-12foipm-14 lhvXDk']/div[4]")
	//@FindBy(xpath="(//div[@class='sc-12foipm-53 hUYjEP']/div[2]/span[2])")
	@FindBy(xpath="//*[.='Date']")
	WebElement return_calender;
	
	@FindBy(xpath="(//div[@class='gr_fswFld active']/p)[1]")
	WebElement Multicity_departure_calender;
	
	
	@FindBy(xpath=("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[7]"))
	WebElement multicity_add_a_date;
	
	@FindBy(xpath="//*[.='Done']")
	WebElement click_date_done;
	
	
	@FindBy(xpath="//*[.='Cancel']")
	WebElement click_Cancel_date;
	
	@FindBy(xpath="//*[.='Cancel']")
	WebElement travel_click_cancel;
	
	@FindBy(xpath="//*[.='Done']")
	WebElement travel_Class_done;
	
	@FindBy(xpath="(//div[@class='DayPicker-Caption']/div)[1]")
	WebElement actual_month;
	
	@FindBy(xpath="(//div[@class='DayPicker-Caption']/div)[2]")
	WebElement actual_month1;
	@FindBy(xpath="(//div[@class='DayPicker-Caption']/div)[1]")
	WebElement actual_month2;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement navigate_to_month;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement navigate_to_month1;
	//"//span[@aria-label='Next Month']
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement navigate_to_month2;
	
	@FindBy(xpath="(//div[@class='DayPicker-Body'])[1]//p[@class='fsw__date']")
	List<WebElement> all_dates;
	
	@FindBy(xpath="(//div[@class='DayPicker-Body'])[2]//p[@class='fsw__date']")
	List<WebElement> all_dates1;
	@FindBy(xpath="(//div[@class='DayPicker-Body'])[1]//p[@class='fsw__date']")
	List<WebElement> all_dates2;
	
	public void dept_calender()
	{
		dept_calender.click();
	}
	public void return_calender()
	{
		return_calender.click();
	}
	public void Multicity_departure_calender()
	{
		Multicity_departure_calender.click();
	}
	
	public void multicity_add_a_date()
	{
		multicity_add_a_date.click();
	}
	public void click_Cancel_date()
	{
		click_Cancel_date.click();
	}
	public void date_done()
	{
		click_date_done.click();
	}
	
	public void travel_click_cancel()
	{
		travel_click_cancel.click();
	}
	
	public void travel_class_done()
	{
		travel_Class_done.click();
	}
	
	
//	--------------------------------------------------------
	public void date_from_dept_calender()
	{
		String expected_month="May 2024";
		String exp_date="4";
		
		while(true)
		{
			String month_text=actual_month.getText();
			if(expected_month.equals(month_text))
			{
				break;
				
			}
			else
			{
				navigate_to_month.click();
			}
		}
			for(WebElement ele:all_dates)
			{
				String date=ele.getText();
				if(date.equals(exp_date))
				{
					ele.click();
					break;
				}
				
			}
		
		
	}
	//-----------------------------------------------------
	public void date_from_return_calender()
	{
		String expected_month="June 2024";
		String exp_date="11";
		while(true)
		{
			String month_text=actual_month1.getText();
			if(expected_month.equals(month_text))
			{
				break;
			}
			else
			{
				navigate_to_month1.click();
			}
		}
		for(WebElement ele:all_dates1)
		{
			String date1=ele.getText();
			if(date1.equals(exp_date))
		//	if(exp_date.equals(date1))
			{
				ele.click();
				break;
			}
			
		}
	
	}
	//--------------------------------------------------
	public void multicity_date_from_departure_calender()
	{
		String expected_month2="June 2024";
		String exp_date2="18";
		while(true)
		{
			String month_text2=actual_month2.getText();
			if(expected_month2.equals(month_text2))
			{
				System.out.println(month_text2);
				break;
			}
			else
			{
				navigate_to_month2.click();
			}
		}
		for(WebElement ele2:all_dates2)
		{
			String date2=ele2.getText();
			if(date2.equals(exp_date2))
			{
				System.out.println(date2);
				ele2.click();
				break;
			}
			
		}
	
	}
	
	
	public Date_Selection_Travel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
}
