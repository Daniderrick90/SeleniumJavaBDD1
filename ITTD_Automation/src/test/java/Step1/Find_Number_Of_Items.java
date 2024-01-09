package Step1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_Number_Of_Items  {

	public ChromeDriver driver;
	
	@Test
	public void run_Find_Number_Of_Items() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);	
		List<WebElement> item = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		int num = item.size();
		System.out.println("The number of items present in the page is : " + num );
		Thread.sleep(2000);
		driver.close();
	
	}
	
}
