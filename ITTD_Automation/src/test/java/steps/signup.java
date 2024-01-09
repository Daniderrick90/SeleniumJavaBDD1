package steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class signup {
	
	public ChromeDriver driver;
	
	@Given("i open the browser")
	public void i_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	 
	}

	@And("i load the {string}")
	public void i_load_the(String url) {
	    // Write code here that turns the phrase above into concrete actions

		driver.get(url);
	}

	@And("i click on Sign Up button - xpath {string}")
	public void i_click_on_create_an_account_button(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		
	}

	@And("i enter User name (.*)$")
	public void i_enter_user_name_xpath(String username) {

		driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys(username);
		
	}

	@And("i enter Password (.*)$")
	public void i_enter_password_xpath(String password) {
		
		driver.findElement(By.xpath("//*[@id='sign-password']")).sendKeys(password);
		
	}

	@And("i click on sign up button - xpath {string}")
	public void i_click_on_sign_up_button_xpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	@And("i click on login button - xpath {string}")
	public void i_click_on_login_button_xpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
		
	}

	@Then("user should be signed up successfully")
	public void user_should_be_signed_up_successfully() throws InterruptedException {
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String Signup_Message = alert.getText();
		Assert.assertEquals(Signup_Message,"Sign up successful.");  
		alert.accept();
		
	}
	
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() throws InterruptedException {
		Thread.sleep(2000);
		String login_Message = driver.findElement(By.xpath("//*[@id='nameofuser']")).getText();
		Assert.assertEquals(login_Message,"Welcome dani19");  
		
	}
	
	@AfterSuite
	public void close_browser() {
		driver.quit();
	}
	

}
