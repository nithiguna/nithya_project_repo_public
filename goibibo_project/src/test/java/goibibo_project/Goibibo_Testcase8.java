//Assignment -8
//Verify that the user is presented with additional options like-luggage, 
//extra legroom, food/beverages, etc and selecting the same results in additional cost with the booking amount.

//luggage, legroom, food, 

package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Extra_Features_Flightpassenger;
import goibibo_project_POM.Personal_Details;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;

@Listeners(Listeners2.class)

public class Goibibo_Testcase8 extends Goibibo_Launch_quit1 {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	//@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Register_Application r1 = new Register_Application(driver);
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
		//	r1.enter_mobile_number();
		//	r1.continue_mobile();
		
		Search_Flight s1=new Search_Flight(driver);
	//	s1.flight();
	//	s1.home_page();
	//	s1.home_page_pop();
	//	s1.hotel();
	//	Thread.sleep(2000);
	//	s1.flight();
	//	s1.round_trip();
	//	Thread.sleep(2000);
	//	s1.one_way_Search();
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
		
		Extra_Features_Flightpassenger e1=new Extra_Features_Flightpassenger(driver);
		e1.one_stop();
		e1.view_fares();
		Thread.sleep(3000);
	//	e1.paid_seat();
		e1.chargable_meal();
		e1.check_in_baggage();
		e1.validate_chargable_meal();
		e1.validate_check_in_baggage();
		e1.book_ticket(driver);
		
		Personal_Details p1=new Personal_Details(driver);
		p1.billing_address();
		p1.pincode();
		p1.state();
		p1.billing_info_save();
		p1.gender();
		p1.first_name();
		p1.last_name();
		p1.email_id();
		p1.mobile_number();
		e1.travel_unsecured();
		p1.proceed_with_booking();
		e1.proceed(driver);
		e1.thats_correct();
		e1.extra_legroom_charge();
		e1.validate_extra_legroom_charge();
		
		

//		Logout l1=new Logout(driver);
//		l1.hover_profile_name();
//		l1.view_your_profile();
//		l1.logout();
//		l1.confirm_logout();

	}
}
