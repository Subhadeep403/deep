package Practice;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


	//LoginPage class
	public class TestMethodCls {
		
		@Test
		public void validLogin() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			LoginPage l= new LoginPage(driver);
			l.setLogin("admin","manager");
		}
			
	}


