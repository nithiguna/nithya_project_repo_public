//Assignment -4
//Test the search functionality for one way flight

package goibibo_project;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Extra_Features_Flightpassenger;
import goibibo_project_POM.Logout;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;
import utilities.Screenshot;

@Listeners(Listeners2.class)

public class Goibibo_Testcase4 extends Goibibo_Launch_quit1 {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Register_Application r1 = new Register_Application(driver);
		
			
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
//	r1.enter_mobile_number();
//	r1.continue_mobile();
//	r1.enter_otp();
	

		
		Search_Flight s1=new Search_Flight(driver);
	
	//	s1.home_page();
	//	s1.home_page_pop();
	//	s1.hotel();
	//	Thread.sleep(2000);
	//	s1.flight();
	//	s1.round_trip();
	//	Thread.sleep(2000);
	//	s1.one_way_Search();
//		s1.sleep_time_before_Search();
//		s1.title(driver);
//		//s1.goibibo();
//		s1.flight(driver);
		s1.from();
		s1.enter_from_city();
		s1.list_of_city();
		s1.enter_to_city();
		s1.list_of_city();
		Date_Selection_Travel d1=new Date_Selection_Travel(driver);
		d1.dept_calender();
		d1.date_from_dept_calender();
		d1.date_done();
		
	//	Travel class done 
		d1.travel_class_done();
		s1.search_flight_submit();
		s1.validate_one_way_search();
		

//		Logout l1=new Logout(driver);
//		l1.hover_profile_name();
//		l1.view_your_profile();
//		l1.logout();
//		l1.confirm_logout();

		
		

	}
}


