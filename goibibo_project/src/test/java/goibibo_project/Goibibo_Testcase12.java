//Assignment -12
//Login to page, search the flight and logout

package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Logout;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;

@Listeners(Listeners2.class)

public class Goibibo_Testcase12 extends Goibibo_Launch_quit1 {
	//@Test
	 @Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void login_search_logout(String mob) throws EncryptedDocumentException, IOException, InterruptedException

	{
		Register_Application r1 = new Register_Application(driver);
		r1.enter_mobile_number1(mob);
		//r1.continue_mobile();
		r1.wait_until_homepage_load(driver);
		Search_Flight s1 = new Search_Flight(driver);
		//s1.sleep_time_before_Search();
		//s1.refresh(driver);
		//s1.other_element();
		//s1.enter_sleeptime();
		s1.from();
		
		//s1.from1(driver);
		s1.enter_from_city();
		s1.list_of_city();
		s1.enter_to_city();
		s1.list_of_city();
		Date_Selection_Travel d1 = new Date_Selection_Travel(driver);
		d1.dept_calender();
		d1.date_from_dept_calender();
		d1.date_done();

		// Travel class done
		d1.travel_class_done();
		s1.search_flight_submit();
	//	r1.sleep_time();

		Logout l1 = new Logout(driver);
		l1.hover_profile_name(driver);
		l1.view_your_profile();
		l1.logout();
		l1.confirm_logout();

	}

}
