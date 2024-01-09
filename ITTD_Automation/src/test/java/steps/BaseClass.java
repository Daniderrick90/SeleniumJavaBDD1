package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	public ChromeDriver driver;
//	
//	@BeforeSuite
//	public void Get_test_Data() {
//		
//		System.out.println("Test Data start");
//		
//	}
//	
//	@AfterSuite
//	public void Close_test_Data() {
//		
//		System.out.println("Test Data end");
//		
//	}
//	
//	@Parameters({"url" , "username" , "password"})
//	@BeforeMethod
//	public void initiate_Browser(String url , String username , String password) {
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(url);
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
//		
//	}
//	
//	@AfterMethod
//	public void close_Browser() {
//		
//		driver.close();
//		
//	}

}
