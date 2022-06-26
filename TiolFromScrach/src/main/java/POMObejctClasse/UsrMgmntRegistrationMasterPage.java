package POMObejctClasse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BasePage;

public class UsrMgmntRegistrationMasterPage extends BasePage{
	

 final By  createNew = (By.linkText("Create New"));
 
 
 public UsrMgmntRegistrationMasterPage(WebDriver driver)
 {
	 super(driver);
	 
 }
 
 public void createNew()
	{
	 driver.findElement(createNew).click();
	
	}
 
 

	
}


