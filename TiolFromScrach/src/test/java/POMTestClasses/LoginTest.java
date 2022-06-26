package POMTestClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import POMObejctClasse.LoginPage;

public class LoginTest extends BaseTest {	
	
	

	@Test
	public void RunLoginTest()	throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\NewChromeSelenium\\NewChrome\\NewChrome\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		/*
		driver.get("http://54.205.159.61:8090/");
		LoginPage LP = new LoginPage(driver);
		LP.LoginUsername();
		LP.LoginPassword().sendKeys("sdjfsdhfg");
		LP.LoginSubmit().click();
		
		*/
		driver.get("http://54.205.159.61:8090/");
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginUsername();
		LP.LoginPassword();
		LP.LoginSubmit();
	}

}

