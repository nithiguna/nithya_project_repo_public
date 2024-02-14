package utility1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class Data_For_Login {
	@DataProvider(name="Login")
	
	public static Object[][] fetchexcel() throws EncryptedDocumentException, IOException // fetch excel
	{
		Object[][]obj =new Object[1][2];
		//Object[][] obj=new String[2][2];
		FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\amazon_maven\\Excel_Sheet\\Amazon_New_Username.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		obj[0][0]= NumberToTextConverter.toText(w1.getSheet("Login_credentials").getRow(1).getCell(0).getNumericCellValue());
		obj[0][1]= w1.getSheet("Login_credentials").getRow(1).getCell(1).getStringCellValue();
		
//		for(int i=1;i<3;i++)
//			{
//				for (int j=0;j<2;j++)
//				{
//					//obj[i-1][j]=w1.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//					if(j==0)
//					{
//						obj[i-1][j]= NumberToTextConverter.toText(w1.getSheet("Login_credentials").getRow(i).getCell(j).getNumericCellValue());
//					}
//					if(j==1)
//					{
//						obj[i-1][j]=w1.getSheet("Login_credentials").getRow(i).getCell(j).getStringCellValue();
//					}
//				}
				
			
		
		return obj;
	}
}
