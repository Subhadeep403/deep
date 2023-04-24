package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	WebDriver driver;

	@Test
	public void parameter() throws InterruptedException {

		String Browser = System.getProperty("browser");
		String Url = System.getProperty("url");
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.get(Url);
		Thread.sleep(2000);
		System.out.println(Browser);
		System.out.println(Url);
		driver.close();
	}
}
