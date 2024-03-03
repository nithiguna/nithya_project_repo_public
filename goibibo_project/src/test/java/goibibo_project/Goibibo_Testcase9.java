//Assignment -9
//Validate the system’s ability to handle multiple passengers in a single booking.


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
import goibibo_project_POM.Travellers_Class;

@Listeners(Listeners2.class)

public class Goibibo_Testcase9 extends Goibibo_Launch_quit1 {
	
	@Test
	//@Test(dataProvider="Login",dataProviderClass=utilities.Excel_Sheet_Data.class)
	@Parameters("browser")
	public void multiple_passengers_singlebooking() throws EncryptedDocumentException, IOException, InterruptedException

	
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
		
	//	Travel class done 
		Travellers_Class t1=new Travellers_Class(driver);
		t1.adult_count();
		d1.travel_class_done();
		s1.search_flight_submit();
		t1.Validate_economy_result_after_search();
		

	}

}
