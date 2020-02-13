package org.ActiTime.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class Baseclass
{
	public static WebDriver driver;
		//public String exp = XlOperation.readData("sheet3",2,);

	@BeforeTest
	public void openBrowser()
	{
		 String browser="chrome";
		if(browser.equals("chrome"))
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
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		
	}
	@AfterClass
	public void logout()
	{ 
		driver.findElement(By.className("logoutImg")).click();
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
	

}
