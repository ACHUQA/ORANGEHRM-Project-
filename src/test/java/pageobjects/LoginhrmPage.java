package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginhrmPage {
	
	public  WebDriver driver;
	
	public LoginhrmPage(WebDriver driver) {
		this.driver=driver;
	}
	

	By uname=By.xpath("//input[@name='username']");
	By pwd=By.xpath("//input[@name='password']");
	By loginbtn= By.xpath("//button[@type='submit']");
	
	By addbtn=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-"
			+ "button--secondary']");
	By fname=By.xpath("//input[@name='firstName']");
	By midname=By.xpath("//input[@name='middleName']");
	By lname=By.xpath("//input[@name='lastName']");
	By savebtn=By.xpath("//button[@type='submit']");
	
	
	public void setuname() throws InterruptedException {
		Thread.sleep(5000);
		WebElement username = driver.findElement(uname);
		username.clear();
		username.sendKeys("Admin");
	}
	public void setpassword() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement password = driver.findElement(pwd);
		password.clear();
		password.sendKeys("admin123");
	}
	
	public void clicklogin()
	{
		WebElement loginbutton = driver.findElement(loginbtn);
		loginbutton.click();
	}
	
	public void clickaddbtn()
	
	{
		WebElement addbutton = driver.findElement(addbtn);
		addbutton.click();
	}
	
	public void addnames(String firstname, String middlename, String lastname ) throws InterruptedException {
		
		WebElement first = driver.findElement(fname);
		first.clear();
		first.sendKeys(firstname);
		WebElement midName = driver.findElement(midname);
		midName.clear();
	midName.sendKeys(middlename);
	WebElement last = driver.findElement(lname);
	last.clear();
	last.sendKeys(lastname);
	}
	public void clicksavebtn() {
	
	
	WebElement savebutton = driver.findElement(savebtn);
	WebDriverWait wait =new WebDriverWait(driver,10);
   wait.until(ExpectedConditions.elementToBeClickable(savebtn)).click();

	}

}


