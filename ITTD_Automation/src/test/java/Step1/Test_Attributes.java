package Step1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Attributes {
	
	public ChromeDriver driver;
	
	@Test(priority = 1 , timeOut = 3000)
	public void test1() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item'])[5]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		List<WebElement> Cart_item = driver.findElements(By.xpath("//div[@class='cart_item']"));
		int num = Cart_item.size();
		System.out.println("The number of items in cart is : " + Cart_item);
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@Test(priority = 5)
	public void test2() {
		
		System.out.println("Run - Test2");
		
	}
	
	@Test(priority = 4)
	public void test3() {
		
		System.out.println("Run - Test3");
		
	}
	
	@Test(priority = 2)
	public void test4() {
		
		System.out.println("Run - Test4");
		
	}
	
	@Test(priority = 3)
	public void test5() {
		
		System.out.println("Run - Test5");
		
	}

}
