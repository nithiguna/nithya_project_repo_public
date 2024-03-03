package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.Goibibo_Launch_quit1;

public class Screenshot extends Goibibo_Launch_quit1 {

	
	public static void pass_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//Screenshot_Folder//Pass_Testcase_Screenshot//Goibibo//"+Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
	public static void fail_get_screenshot() throws IOException
	{
		
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source =  ts1.getScreenshotAs(OutputType.FILE);
	File destination =new File(".//Screenshot_Folder//Fail_Testcase_Screenshot//Goibibo//"+Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}
}
