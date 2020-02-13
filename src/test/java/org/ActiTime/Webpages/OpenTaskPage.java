package org.ActiTime.Webpages;

import org.ActiTime.utilities.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OpenTaskPage 
{
	@FindBy(linkText = "Projects & Customers")
	private WebElement projectsAndCustomerLink;
	
	public OpenTaskPage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	
	public void clickOnProjectsAndCustomerLink()
	{
		
		projectsAndCustomerLink.click();
	}
	
}
