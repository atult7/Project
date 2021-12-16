package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
 public WebDriver ldriver;
	 
	 public Login(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy(xpath="//*[@id='username']")
	 @CacheLookup
	 WebElement txtEmail;
	 
	 @FindBy(xpath="//*[@id='password']")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 @FindBy(xpath="//*[@name='login']")
	 @CacheLookup
	 WebElement btnlogin;
	 
	 public void setNewName(String name) {
		 txtEmail.clear();
		 txtEmail.sendKeys("sender01togo@outlook.com");
	 }
	 public void setPassword(String pwd) {
		 txtPassword.clear();
		 txtPassword.sendKeys("SenDeR5@432@178@9");
	 }
	 
	public void setclickLogin() {
		btnlogin.click();
		
	}

}
