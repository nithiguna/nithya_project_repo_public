//Assignment-10
//Validate the flight information, Fare details, Baggage Rules and cancellation Rules
// link has the details in the search result page.


package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Flight_Information_Details;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;
import goibibo_project_POM.Travellers_Class;

@Listeners(Listeners2.class)

public class Goibibo_Testcase10 extends Goibibo_Launch_quit1 {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void flight_info_faredetails_baggage_link_verify() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Register_Application r1 = new Register_Application(driver);
		//r1.hoverover_sign_up();
		//Thread.sleep(2000);
//			
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		
//		r1.enter_mobile_number();
//		r1.continue_mobile();
		
	//	Thread.sleep(6000);

		Search_Flight s1=new Search_Flight(driver);
		s1.one_way_Search();
		s1.from();
		s1.enter_from_city();
		s1.list_of_city();
		s1.enter_to_city();
		s1.list_of_city();
		Date_Selection_Travel d1=new Date_Selection_Travel(driver);
		d1.dept_calender();
		d1.date_from_dept_calender();
		d1.date_done();
		
		d1.travel_class_done();
		s1.search_flight_submit();
		Flight_Information_Details f1=new Flight_Information_Details(driver);
		f1.flight_detals();
		f1.flight_info();
		f1.validate_flight_info_link();
		f1.fare_details();
		f1.validate_fare_details();
		f1.baggage_details();
		f1.validate_baggage_details();
		f1.cancel_details();
		f1.validate_cancel_details();

}
}