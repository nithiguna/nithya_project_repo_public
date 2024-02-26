package utility1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class Wrong_Login_Credentials {
	@DataProvider(name = "Login1")
	public static Object[][] fetchexcel() throws EncryptedDocumentException, IOException // fetch excel
	{
		Object[][] obj = new Object[1][2];
		FileInputStream f1 = new FileInputStream("C:\\Users\\nithi\\eclipse-workspace\\amazon_maven\\Excel_Sheet\\Wrong_Data_Credentials.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		obj[0][0] = NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue());
		obj[0][1] = w1.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		return obj;
	}
}