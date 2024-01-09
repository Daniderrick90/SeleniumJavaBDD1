package Step1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart{
	
	public ChromeDriver driver;
	
	@Test
	public void runAddToCart() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[5]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.close();

	} 

}
