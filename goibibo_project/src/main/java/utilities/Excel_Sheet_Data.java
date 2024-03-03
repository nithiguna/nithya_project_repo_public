package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class Excel_Sheet_Data {

	@DataProvider(name="Login")
	public static Object[][] fetchexcel() throws EncryptedDocumentException, IOException // fetch excel
	{
		Object[][] obj = new Object[1][1];
		FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\goibibo_project\\Excel\\Goibibo_Excel.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		obj[0][0] = NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
		//obj[0][1] = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		return obj;
	}
}
