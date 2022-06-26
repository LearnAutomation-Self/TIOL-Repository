package POMObejctClasse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BasePage;

public class LoginPage extends BasePage{
	

 final By  loginpageUsername = (By.id("UserName"));
 final By  loginpagepassword = (By.id("Password"));
 final By  LoginClick = (By.xpath("/html/body/div/form/input[3]")); 
 //final By  LoginClick = (By.xpath("/html/body/div/frm/input[3]"));
 
 public LoginPage(WebDriver driver)
 {
	 super(driver);
	 
 }
 

	/*
	public WebElement LoginUsername()
	{
			
		WebElement lgnUsername = driver.findElement(loginpageUsername);
		return lgnUsername;
		
	}

	public WebElement LoginPassword()
			
	{
		WebElement lgnPassword = driver.findElement(loginpagepassword);
		return lgnPassword;
	
		
	}
	
	public WebElement LoginSubmit()
	{
			
		WebElement lgnSubmit = driver.findElement(LoginClick);
		
		return lgnSubmit;
	
		
	}
	*/
 
 
 public void LoginUsername()
	{
			
		 driver.findElement(loginpageUsername).sendKeys("tioladmin");;
		
		
	}

	public void LoginPassword()
			
	{
		 driver.findElement(loginpagepassword).sendKeys("TIOL@2022");;
		
	
		
	}
	
	public UsrMgmntRegistrationMasterPage LoginSubmit()
	{
			
		 driver.findElement(LoginClick).click();
		 return new UsrMgmntRegistrationMasterPage(driver);
		
	}


}
