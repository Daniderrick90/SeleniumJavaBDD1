package steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_Number_Of_Items extends BaseClass  {

	@Test
	public void run_Find_Number_Of_Items() throws InterruptedException {
		
	List<WebElement> item = driver.findElements(By.xpath("//div[@class='inventory_item']"));
	int num = item.size();
	System.out.println("The number of items present in the page is : " + num );
	Thread.sleep(2000);
	driver.close();
	
	}
	
}
