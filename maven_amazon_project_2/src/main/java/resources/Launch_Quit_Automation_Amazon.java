package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit_Automation_Amazon {
	public static WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void browserlaunch(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.amazon.in/");

}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
