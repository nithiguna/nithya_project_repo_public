//Assignment-5
//Test the search functionality for round-trip flights.


package goibibo_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Goibibo_Launch_quit1;
import baseClass.Listeners2;
import goibibo_project_POM.Date_Selection_Travel;
import goibibo_project_POM.Register_Application;
import goibibo_project_POM.Search_Flight;
@Listeners(Listeners2.class)

public class Goibibo_Testcase5 extends Goibibo_Launch_quit1 {
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void roundtrip_flight() throws EncryptedDocumentException, IOException, InterruptedException

	
	{
		Register_Application r1 = new Register_Application(driver);
	
		r1.pop_up_window();
		r1.Close_the_Mobile_window();
		//r1.enter_mobile_number();
		//r1.continue_mobile();
		Search_Flight s1=new Search_Flight(driver);
		s1.round_trip();
		s1.from();
		s1.enter_from_city();
		s1.list_of_city();
		s1.enter_to_city();
		s1.list_of_city();
		Date_Selection_Travel d1=new Date_Selection_Travel(driver);
		d1.dept_calender();
		d1.date_from_dept_calender();
		d1.return_calender();
		d1.date_from_return_calender();
		d1.date_done();
		d1.travel_class_done();
		s1.search_flight_submit();
		s1.validate_round_trip();
		
		
	//	d1.date_done();

}
}