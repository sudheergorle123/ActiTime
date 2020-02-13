package org.ActiTime.TestScripts;

import org.ActiTime.utilities.Baseclass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddNewCustomerTc_01 extends Baseclass
{
	@Test
	public void Addcustomer()
	{
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@type = 'button']")).click();
	driver.findElement(By.name("name")).sendKeys("Sudheer15");
	driver.findElement(By.name("description")).sendKeys("If i seen anybody is not doing any job i will give an opportunity to him.");
	driver.findElement(By.xpath("//input[@value = 'Create Customer']")).click();	
	}
}
