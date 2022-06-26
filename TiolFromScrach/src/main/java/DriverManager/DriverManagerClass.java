package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerClass {
	
	public WebDriver initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\NewChromeSelenium\\NewChrome\\NewChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
