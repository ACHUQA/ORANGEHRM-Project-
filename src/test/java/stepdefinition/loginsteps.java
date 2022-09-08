package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginhrmPage;

public class loginsteps {
	public WebDriver driver;
	  public LoginhrmPage lp;

	@Given("launch the browser")
	public void launch_the_browser() {
	  WebDriverManager.edgedriver().setup();
	   driver=new EdgeDriver();
	 
	}

	@When("Get the url")
	public void get_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	    
	}

	@When("user sends the username and password")
	public void user_sends_the_username_and_password() throws InterruptedException {
		
		 lp=new LoginhrmPage(driver);
		 lp.setuname();
		 lp.setpassword();
		
		 
	}

	@When("click the login button '")
	public void click_the_login_button() throws InterruptedException {
		
		lp.clicklogin();
		lp.setuname();
		lp.setpassword();
		lp.clicklogin();
	 
	}

	@When("click the add button")
	public void click_the_add_button() {
	 lp.clickaddbtn();
	}

	@When("User send first name,middle name, last name as {string}, {string}, {string}")
	public void user_send_first_name_middle_name_last_name_as(String fname, String midname, 
			String lname) throws InterruptedException 
	{
			lp.addnames(fname, midname, lname);
		
	}

	@When("click the save button")
	public void click_the_save_button() {
	  lp.clicksavebtn();
	}

	@Then("verify the current url")
	public void verify_the_current_url() {
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("Current url of the page is : " +currentUrl);
	}



}
