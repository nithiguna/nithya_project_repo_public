package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Laaunch {
	public static WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
	

//	
	}

	@AfterMethod
	public void quit() {
		//driver.quit();
	}

}
