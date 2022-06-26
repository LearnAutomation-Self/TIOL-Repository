package POMTestClasses;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import POMObejctClasse.LoginPage;
import POMObejctClasse.UsrMgmntRegistrationMasterPage;

public class UsrMgmntRegistrationMasterTest extends BaseTest {

	@Test
	public void RunLoginTest()	throws InterruptedException
	{
		
		
		
		driver.get("http://54.205.159.61:8090/");
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginUsername();
		
		LP.LoginPassword();
		LP.LoginSubmit();
		//UsrMgmntRegistrationMasterPage regitrationMaster = LP.LoginSubmit();
		//regitrationMaster.createNew();
		
		
		UsrMgmntRegistrationMasterPage regitrationMaster = new UsrMgmntRegistrationMasterPage(driver);
		regitrationMaster.createNew();
		
	}
	
	
}
