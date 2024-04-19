package Sourcepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Merchantlogin {
 
	WebDriver webDriver;
	
	
	public Merchantlogin(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "/html/body/app-root/app-footer/div/div[4]/a[2]")
	WebElement Partner;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="/html/body/app-root/app-merchant-login/div/div/form/button")
	WebElement LoginButton;
	@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	WebElement OK;
	

	
	public void verifyLogin()
	{
		Partner.click();
	}
	
	public void setUserName(String uname) {
		if(uname.isBlank())
			email.clear();
		email.sendKeys(uname);
	
	}
	
	public void setPassword(String pwd) {
		if(pwd.isBlank())
			password.clear();
		email.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		LoginButton.click();
	}
	public void clickOnOkBtn()
	{
		OK.click();
	}
		
}



