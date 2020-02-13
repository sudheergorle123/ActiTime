package actitime.wp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OpenTasksPage {
	@FindBy(linkText = "Projects & Customers")
	private WebElement projectsAndCustomers;
	
	public OpenTasksPage()
	{
		PageFactory.initElements(actitime.ut.BaseClass3.driver, this);
	}
	
	
	public void clickOnProjectsAndCustomers() {
		projectsAndCustomers.click();
		
	}

}

