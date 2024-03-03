//Assignment -15
//Reach till payments page and select credit card option→ enter card option → make the payment

package goibibo_project;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Coupon_Apply;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Extra_Features_Flightpassenger;
import goibibo_project_POM.Personal_Details;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;

@Listeners(Listeners2.class)

public class Goibibo_Testcase15 extends Goibibo_Launch_quit1 {

	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void search_oneway_flight() throws EncryptedDocumentException, IOException, InterruptedException, AWTException

	
	{
		Register_Application r1 = new Register_Application(driver);
		//r1.hoverover_sign_up();
		//Thread.sleep(2000);
		
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
//		r1.enter_mobile_number();
//		r1.continue_mobile();
//		r1.enter_otp();
		
	//Thread.sleep(30000);

		
		Search_Flight s1=new Search_Flight(driver);
		//s1.flight();
	//	s1.home_page_domestic_international();
	//	s1.home_page_pop();
	//	s1.hotel();
	//	s1.flight();
	//	s1.round_trip();
//		Thread.sleep(2000);
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
		e1.view_fares();
		e1.book_ticket(driver);
	//	Thread.sleep(3000);
	

		
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
		e1.proceed(driver);
		e1.thats_correct();
		
//		e1.skip_payment();
//		e1.credit_payment();
//		e1.card_details();
//		e1.all_payment_option();
//		e1.validate_credit_payment();
//		Coupon_Apply c1=new Coupon_Apply(driver);
//		c1.view_all_coupon();
//		c1.select_coupon();
//		c1.validate_discount();


//		Logout l1=new Logout(driver);
//		l1.hover_profile_name();
//		l1.view_your_profile();
//		l1.logout();
//		l1.confirm_logout();

	}

}
