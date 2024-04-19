package Userdetails;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import base.BaseTest;
	import Sourcepage.Merchantlogin;

	public class Merchantlogintest extends BaseTest {

		@Test(priority=3)
		public void verifyValid() throws InterruptedException {
			Merchantlogin merchantLogin=new Merchantlogin(webDriver);
			merchantLogin.verifyLogin();
			Thread.sleep(2000);
			merchantLogin.setUserName("shweta@gmail.com");
			Thread.sleep(2000);
			merchantLogin.setPassword("Shwe@20");
			Thread.sleep(2000);
			merchantLogin.clickOnLoginBtn();
			Thread.sleep(2000);
			merchantLogin.clickOnOkBtn();
			Thread.sleep(2000);
			
			String currUrl=webDriver.getCurrentUrl();
			Thread.sleep(2000);
			String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
			Assert.assertEquals(currUrl, expectedUrl);
			
		}
		/*@Test(priority=2)
		public void verifyInvalid() throws InterruptedException {
			LoginPage loginPage=new LoginPage(webDriver);
			loginPage.verifyLogin();
			loginPage.setUserName("shwetha");
			Thread.sleep(2000);
			loginPage.setPassword("jerry@27");
			Thread.sleep(2000);
			loginPage.clickOnLoginBtn();
			Thread.sleep(2000);
			loginPage.clickOnOkBtn();
		
			String currUrl=webDriver.getCurrentUrl();
			String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
			Assert.assertEquals(currUrl, expectedUrl);
			
			
		}*/
		@Test(priority=1)
		public void verifyEmpty() throws InterruptedException {
			Merchantlogin merchantLogin=new Merchantlogin(webDriver);
			merchantLogin.verifyLogin();
			merchantLogin.setUserName("");
			Thread.sleep(2000);
			merchantLogin.setPassword("");
			Thread.sleep(2000);
			merchantLogin.clickOnLoginBtn();
			Thread.sleep(2000);
			merchantLogin.clickOnOkBtn();
			
			String currUrl=webDriver.getCurrentUrl();
			String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
			Assert.assertEquals(currUrl, expectedUrl);
			
		}	
		
	}





