package utility1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import resources.Launch_Quit_Automation_Amazon;

public class Take_Screenshot extends Launch_Quit_Automation_Amazon	
{
	
	public static void pass_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//screenshot_picture//pass_testcase_screenshot//amazon//"+Math.random()+".png");
	//File destination =new File("C:\\Users\\nithi\\eclipse-workspace\\amazon_maven\\Get_Screenshot_For_Testcase_Pass\\amazon" +Math.random()+".png");
	//File destination = new File(".Get_Screenshot_For_Testcase_Pass//pass_screenshot//amazon"+Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
	public static void fail_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//screenshot_picture//fail_testcase_screenshot//amazon//"+Math.random()+".png");
	//File destination =new File("C:\\Users\\nithi\\eclipse-workspace\\amazon_maven\\Get_Screenshot_For_Testcase_Fail\\amazon"+Math.random()+".png");
	//File destination = new File(".Get_Screenshot_For_Testcase_Fail//fail_screenshot//amazon"+Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
	
	
}
//.//ScreenShot-All//Pass_ScreenShot