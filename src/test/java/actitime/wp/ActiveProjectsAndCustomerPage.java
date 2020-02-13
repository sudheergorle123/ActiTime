package actitime.wp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiveProjectsAndCustomerPage {

	@FindBy(xpath = "//input[@value='Add New Customer']")
	private WebElement addNewCustomer;
	
	@FindBy(className = "successmsg")
	private WebElement successMsg;
	
	public ActiveProjectsAndCustomerPage()
	{
		PageFactory.initElements(actitime.ut.BaseClass3.driver, this);
	}
	
	
	public void clickOnAddNewCustomer()
	{
		
		addNewCustomer.click();
	}
	
	public String retreiveSuccessMsg()
	{
		String s1 = successMsg.getText();
		return s1;
	}

}

