package BaseClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import DriverManager.DriverManagerClass;

public class BaseTest {
	
	
	protected  WebDriver driver;
	
	@BeforeMethod
	public void startDriver()
	{
		
		driver = new DriverManagerClass().initializeDriver();
		
	}
	
	//@AfterMethod
	public void ExitDriver(ITestResult result)
	{
		
		File file = new File("src" + ".png");
		driver.quit();
		
	}
	
	@AfterMethod
	public void takescreeshot()
	
	
	{
		TakesScreenshot tashot = (TakesScreenshot) driver;
		tashot.getScreenshotAs(OutputType.FILE);
		
		
	}
	
}
