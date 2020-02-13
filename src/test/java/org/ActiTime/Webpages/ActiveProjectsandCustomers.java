package org.ActiTime.Webpages;

import org.ActiTime.utilities.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiveProjectsandCustomers 
{
	@FindBy(xpath = "//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//input[@value='Add New Project']")
	private WebElement  addNewProjectButton;
	
	public ActiveProjectsandCustomers()
	{
		PageFactory.initElements(Baseclass.driver, this);
	}
	
	
	
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
		
	}
	
	public String retrievesuccessMessage()
	{
		return successMessage.getText();
		
	}
	
	public void clickOnAddNewProjectButton()
	{
		addNewProjectButton.click();
		
	}

}
