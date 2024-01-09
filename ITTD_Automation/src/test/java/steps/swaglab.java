package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class swaglab extends BaseClass {

	@Test
	public  void Runswaglab() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[5]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.close();

		
	}

}
