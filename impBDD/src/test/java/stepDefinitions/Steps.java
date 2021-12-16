package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Mail;
import pageObject.OLogin;

public class Steps {
	public WebDriver driver;
	public OLogin ur;
	public Mail m;
	
	

@Given("User Launch Chrome Browser")
public void user_Launch_Chrome_Browser() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	ur=new OLogin(driver);
    
}

@When("User opens URL {string}")
public void user_opens_URL(String url) {
	driver.get(url);
   
}

@And("User enters Email as {string} and click next")
public void user_enters_Email_as_and_click_next(String Email) throws InterruptedException {
	Thread.sleep(3000);
	ur.setNewName(Email);
	
	ur.settxtnxt();
	
	
    
}

@And("user enters Password as {string} and click next")
public void user_enters_Password_as_and_click_next(String Password) throws InterruptedException {
	Thread.sleep(3000);
	ur.setPassword(Password);
	
   
}

@Then("Click on Signin")
public void click_on_Signin() {
	ur.setsignin();
    ur.setnobtn();
    System.out.println(driver.getTitle());
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    ur.ldriver.close();
}


@Given("User launch Chrome Browser")
public void user_launch_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		m=new Mail(driver);
    
}

@When("User Opens URL {string}")
public void user_Opens_URL(String url) {
	driver.get(url);
	
   
}

@When("User Enters Email as {string} and click next")
public void user_Enters_Email_as_and_click_next(String Email) throws InterruptedException {
	Thread.sleep(3000);
	m.setNewName(Email);
	
	m.settxtnxt();
    
}

@When("user Enters Password as {string} and click next")
public void user_Enters_Password_as_and_click_next(String Password) throws InterruptedException {
	Thread.sleep(3000);
	m.setPassword(Password);
    
}

@And("Click the Signin")
public void click_the_Signin() {
	m.setsignin();
    m.setnobtn();
    
}

@And("User Click on New Message")
public void user_Click_on_New_Message() {
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	m.setmsgbtn();
    
}

@And("Enter the mail")
public void enter_the_mail()  {
	m.setmsgto();
	m.setrep();
	m.setsub();
    m.setmsgbox();
}

@Then("Click on send")
public void click_on_send() {
	m.setsndbtn();
   
}


}
