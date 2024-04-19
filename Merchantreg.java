package Sourcepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Merchantreg{
	WebDriver webDriver;
	
	
	public Merchantreg(WebDriver webDriver) {
	super();
	this.webDriver = webDriver;
	PageFactory.initElements(webDriver, this);
	
	}
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[4]/a[2]")
	WebElement Partner;
	@FindBy(id="//*[@id=\"firstName\"]")
	WebElement firstName;
	@FindBy(id="//*[@id=\"lastName\"]")
	WebElement lastName;
	@FindBy(id="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(id="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(id="//*[@id=\"phoneNumber\"]")
	WebElement phoneNumber;
	@FindBy(xpath="/html/body/app-root/app-merchant-reg/div/div/form/button")
	WebElement Registerbtn;
	@FindBy(xpath="")
	WebElement OK;
	
	public void verifyLogin() {
		Partner.click();
	}
	

	public void setfirstName(String fname) {
		if(fname.isBlank())
			firstName.clear();
	firstName.sendKeys(fname);
	}
	public void setlastName(String lname) {
		if(lname.isBlank())
			lastName.clear();
		lastName.sendKeys(lname);
		}
	public void setEmail(String mail) {
		if(mail.isBlank())
			email.clear();
	email.sendKeys(mail);
	}
	public void setPassword(String arg1) {
		if(arg1.isBlank())
			password.clear();	
	password.sendKeys(arg1);
	}
	public void setPhonenumber(String phno) {
		if(phno.isBlank())
			phoneNumber.clear();	
		phoneNumber.sendKeys(phno);
		}
	
	public void clickOnRegisterBtn() {
		 Registerbtn.click();
	}	
	public void clickOkBtn() {
		OK.click();
	}	
}	
	
	
	
	
