package stepDefinitions;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login;
import pageObject.NewUserReg;



public class Steps {
	
	public WebDriver driver;
	public NewUserReg ur;
	public Login l;
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		ur=new NewUserReg(driver);
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	   
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String Email, String Password) {
		ur.setNewName(Email);
		ur.setPassword(Password);
		
	    
	}

	@Then("Click on Register")
	public void click_on_Register() {
	    ur.setclickRegister();
	    ur.ldriver.close();
	}
	
	
	@Given("User Launch chrome Browser")
	public void user_Launch_chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		l=new Login(driver);
		
	    
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) {
		driver.get(url);
	    
	}

	@When("User Input Email as {string} and Password as {string}")
	public void user_Input_Email_as_and_Password_as(String Email, String Password) {
		l.setNewName(Email);
		l.setPassword(Password);
	    
	}

	@Then("Click on Login")
	public void click_on_Login() {
		l.setclickLogin();
		l.ldriver.close();
	    
	}
	
	
}
