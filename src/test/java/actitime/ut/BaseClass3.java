package actitime.ut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class BaseClass3 {
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser()
	{
		String browser = "Chrome";
		if(browser.equals("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://desktop-1rt3eln:81/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeClass
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterClass
	public void logOut()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
	


}
