package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mail {
	
	public WebDriver ldriver;
	 
	 public Mail(WebDriver rdriver)
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
	 @FindBy(xpath="//*[@id=\'idSIButton9\']")
	 @CacheLookup
	 WebElement txtsignin;
	 @FindBy(xpath="//*[@id=\'idBtn_Back\']")
	 @CacheLookup
	 WebElement txtnobtn;
	 @FindBy(xpath="//*[@class='_9fiU2J67uJPVP0DBdOFMW']")
	 @CacheLookup
	 WebElement txtmsgbtn;
	 @FindBy(xpath="//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/input")
	 @CacheLookup
	 WebElement txtmsgto;
	 @FindBy(xpath="//*[@id=\"sug-header-item2\"]/div")
	 @CacheLookup
	 WebElement txtselrep;
	 @FindBy(xpath="//*[@type='text']")
	 @CacheLookup
	 WebElement txtselsub;
	 @FindBy(xpath="//*[@role='textbox']")
	 @CacheLookup
	 WebElement txtmsgbox;
	 @FindBy(xpath="//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/div/span/button[1]")
	 @CacheLookup
	 WebElement txtsndbtn;
	 
	 
	
	 
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
	 public void setmsgbtn()
	 {
		 txtmsgbtn.click();
	 }
	 public void setmsgto()
	 {
		 txtmsgto.sendKeys("sender01togo@gmail.com");
	 }
	 public void setrep()
	 {
		 txtselrep.click();
	 }
	 public void setsub()
	 {
		 txtselsub.sendKeys("Hello");
	 }
	 public void setmsgbox()
	 {
		 txtmsgbox.sendKeys("Demo Test");
	 }
	 public void setsndbtn()
	 {
		 txtsndbtn.click();
	 }

}
