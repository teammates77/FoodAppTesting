package Userdetails;

import org.testng.Assert;
import org.testng.annotations.Test;

import Sourcepage.Merchantreg;
import base.BaseTest;

public class Merchantregtest {
	public class Registeruser extends BaseTest {
		@Test
		public void verifylogin() throws InterruptedException {
		
			Merchantreg merchantReg=new Merchantreg(webDriver);
			merchantReg.verifyLogin();
			Thread.sleep(2000);
			//merchantReg.verifyRegister();
			Thread.sleep(2000);
		   // registerPage.verifyHeader();
		   // Thread.sleep(2000);
			merchantReg.setfirstName("Sambrudhi");
			Thread.sleep(2000);
			merchantReg.setlastName("shetty");
			Thread.sleep(2000);
			merchantReg.setEmail("Sambrudhi@gmail.com");
			Thread.sleep(2000);
			merchantReg.setPassword("Sambrudhi@21");
			Thread.sleep(2000);
			merchantReg.setPhonenumber("6756464644");
			Thread.sleep(2000);
			merchantReg.clickOnRegisterBtn();
			Thread.sleep(2000);
			merchantReg.clickOkBtn();
			Thread.sleep(2000);
			String currUrl=webDriver.getCurrentUrl();
			String expectedUrl="http://localhost:4200/register";
			Assert.assertEquals(currUrl, expectedUrl);
			
		}
	 
	}
	
	

}
