package org.ActiTime.Webpages;

import org.ActiTime.utilities.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddNewProjectPage
{
	@FindBy(name="customerId")
	private WebElement customerDropdDown;
	 
	@FindBy(name = "name")
	private WebElement projectNameTextField;
	
	@FindBy(name = "createProjectSubmit")
	private WebElement createProjectButton;

	public AddNewProjectPage()
	{
		PageFactory.initElements(Baseclass.driver, this);
	}
	
	public void customerDropDownText()
	{
		Select s1 = new Select(customerDropdDown);
		s1.selectByIndex(4);
	}
	
	
	public void projectNameTextFieldText(String project)
	{
		projectNameTextField.sendKeys(project);
	}
	public void createProjectText()
	{
		createProjectButton.click();
	}
	

}
