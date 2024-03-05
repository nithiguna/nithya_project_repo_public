package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Goibibo_Launch_quit1 {
	public static WebDriver driver;// static way

	@BeforeMethod
	@Parameters("browser")
	// public void preconditon() {

	public void browserlaunch(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			driver = new ChromeDriver();

		}
		if (nameofbrowser.equals("Edge")) {
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.goibibo.com/");
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		
		//driver.quit();
	}

}
