package Selenium_Learning;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_WebTable {

	public static ChromeDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String current_Window = driver.getWindowHandle();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		element.click();
		
		//This button is used for opening a new browser window.
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String s : windows) {
			
			driver.switchTo().window(s);

		}
		String sn = driver.findElement(By.xpath("//div[@class='basicControls']/h1")).getText();
		System.out.println(sn);

		driver.switchTo().window(current_Window);
		String sn1 = driver.findElement(By.xpath("//div[@class='post-head']/h1")).getText();
		System.out.println(sn1);
	}

}
