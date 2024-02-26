package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Fetching_Excel_Data {
//	public static String un;
//	public static String pwd;


	@DataProvider(name="Login")
	public static Object[][] fetchexcel() throws EncryptedDocumentException, IOException // fetch excel
//1. data provider with static and object class
	{
		// Object[][] obj=new Object[2][2];  //creating 2 dimensional array with actual data that is row start wtih 1 and count of column which is 2 
		Object[][]obj =new Object[1][2];
		FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\maven_amazon_project_1\\Excel_Sheet\\New_Credentials.xlsx");
 		
		 //FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\maven_project\\Excel_Sheet\\gmail_excel.xlsx");
		 //FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\maven_project\\Excel_Sheet\\Username.xlsx");
		// FileInputStream f1=new
		// FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\maven_project\\Excel_Sheet\\Username_Password.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
	obj[0][0]=  NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
	obj[0][1]= w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	
//	for(int i=1;i<3;i++)
//	{
//		for (int j=0;j<2;j++)
//		{
//			//obj[i-1][j]=w1.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//			if(j==0)
//			{
//				obj[i-1][j]= NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue());
//			}
//			if(j==1)
//			{
//				obj[i-1][j]=w1.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		
//	}
//	
	return obj;
	
	}
	//Index of first row is
	//[0][0] index of first row and first column
	//[0][1]index of first row and second column
	//[1][0] index of second row and first column
	//[1][1]index of second row and second column
	
	
		
}
