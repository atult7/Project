package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OLogin {
	
	
	public WebDriver ldriver;
	 
	 public OLogin(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy(xpath="//*[@name='loginfmt']")
	 @CacheLookup
	 WebElement txtEmail;
	 @FindBy(xpath="//*[@id=\'idSIButton9\']")
	 @CacheLookup
	 WebElement txtnxt;
	 @FindBy(xpath="//*[@id=\"i0118\"]")
	 @CacheLookup
	 WebElement txtPassword;
	 @FindBy(xpath="//*[@id=\"idSIButton9\"]")
	 @CacheLookup
	 WebElement txtsignin;
	 @FindBy(xpath="//*[@id=\'idBtn_Back\']")
	 @CacheLookup
	 WebElement txtnobtn;
	 
	 public void setNewName(String Email) {
		// txtEmail.clear();
		 txtEmail.sendKeys("sender01togo@outlook.com");
	 }
	 public void settxtnxt()
	 {
		 txtnxt.click();
	 }
	 public void setPassword(String Password) {
		// txtPassword.clear();
		 txtPassword.sendKeys("Sender@4321");
	 }
	 public void setsignin()
	 {
		 txtsignin.click();
	 }
	 public void setnobtn()
	 {
		 txtnobtn.click();
	 }
	 
	 
	

}
