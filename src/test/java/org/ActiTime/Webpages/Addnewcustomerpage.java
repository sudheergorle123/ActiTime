package org.ActiTime.Webpages;

import org.ActiTime.utilities.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Addnewcustomerpage 
{
	@FindBy(name = "name")
	private WebElement customerNameTextfield;
	
	@FindBy(xpath = "//input[@value='Create Customer']")
	private WebElement createCustomerButton;
	
	Addnewcustomerpage()
	{
		PageFactory.initElements(Baseclass.driver, this);
	}
	
	public void enterCustomerName(String cn) 
	{
		customerNameTextfield.sendKeys(cn);
		
	}
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
}
