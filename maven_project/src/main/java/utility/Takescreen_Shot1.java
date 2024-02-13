package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import resources.Amz_Launch_Quit;



public class Takescreen_Shot1 extends Amz_Launch_Quit	
{
	
	
	public static void pass_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//screenshot_taking//pass_screenshot//amazon" +Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
	public static void fail_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//screenshot_taking//fail_screenshot//amazon" +Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static WebDriver driver;
//	public  static void takescreenshot(String test_status) throws IOException //static
//	{
//		
//	TakesScreenshot ts1 =(TakesScreenshot) driver;
//	File source=ts1.getScreenshotAs(OutputType.FILE);
//		
//	//  .//ScreenShot-All//Pass_ScreenShot
//	if(test_status.equalsIgnoreCase("pass_test"))
//	{
////
//		File destination =new File(".//screenshot_taking//pass_screenshot//amazon" +Math.random()+".png");
//		FileUtils.copyFile(source, destination);
//	}
//	else if(test_status.equalsIgnoreCase("pass_fail"))
//	{
//		//File destination =new File("C:\\Users\\nithi\\eclipse-workspace\\maven_project\\Screenshot_Fail_Testcase\\amazon"+ driver.getClass()+".png");
//		File destination =new File(".//screenshot_taking//fail_screenshot//amazon" +Math.random()+".png");
//		FileUtils.copyFile(source, destination);
//	}
}
	



