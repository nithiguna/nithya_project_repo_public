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
	@Test
	// @Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void login_search_logout() throws EncryptedDocumentException, IOException, InterruptedException

	{
		Register_Application r1 = new Register_Application(driver);
		r1.enter_mobile_number();
		r1.continue_mobile();
		r1.enter_otp();
		Search_Flight s1=new Search_Flight(driver);
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
			
			Logout l1=new Logout(driver);
			l1.hover_profile_name();
			l1.view_your_profile();
			l1.logout();
			l1.confirm_logout();


	}

}
