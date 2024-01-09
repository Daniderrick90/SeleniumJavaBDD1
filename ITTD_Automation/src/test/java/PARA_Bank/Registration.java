package PARA_Bank;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration {
	
	public ChromeDriver driver;
	
	@Test(dataProvider = "sendData")
	public void Test_Registration(String fname , String lname , String street , String city , String state , String zipcode , String Phonenumber, String ssn , String username , String password , String retypepassword) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(street);
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(Phonenumber);
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ssn);
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(retypepassword);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(5000);
		String success_text = driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']")).getText();
		if(success_text.equals("Your account was created successfully. You are now logged in.")) {
			System.out.println("Account registered. Test case passed");
		}else {
			System.out.println("Account not registered. Test case failed");
		}
		driver.close();

		}
	@DataProvider
	public String[][] sendData() throws IOException{
		
		//open workbook with file name and path
		XSSFWorkbook wb = new XSSFWorkbook("./datasheet/Registration.xlsx");
		
		//Go to specific sheet using sheet name/index
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//to get number of rows in the sheet
		int row_count = sheet.getLastRowNum();
		
		//to get number of Columns in the sheet
		int column_count = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of rows present is : " + row_count );
		System.out.println("Total number of column present is : " + column_count );
		
		String[][]	data = new String[row_count][column_count];
		
		//read all data from excel
		for(int i = 1 ; i<=row_count;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j = 0; j<column_count; j++) {
				String stringcellvalue = row.getCell(j).getStringCellValue();
				System.out.println(stringcellvalue);
				data[i-1][j] = stringcellvalue;
			}
		}
		
		return data;
		
	}
	
	@Test(dataProvider = "sendData" , dependsOnMethods={"Test_Registration"})
	public void Test_Login(String fname , String lname , String street , String city , String state , String zipcode , String Phonenumber, String ssn , String username , String password , String retypepassword) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		List<WebElement> home = driver.findElements(By.xpath("//li[@class='home']"));
		int num = home.size();
		if(num>0) {
			System.out.println("Test case pass. Logged in successfully" );
		}
		else {
			System.out.println("Test case failed. Logged in failed" );
		}
		driver.close();
	}
}
