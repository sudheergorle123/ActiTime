package org.ActiTime.TestScripts;

import org.ActiTime.Webpages.ActiveProjectsandCustomers;
import org.ActiTime.Webpages.AddNewProjectPage;
import org.ActiTime.Webpages.OpenTaskPage;

public class AddNewProjectTc_02
{
	public void testCreateProjectTC_02()
	{
		OpenTaskPage otp = new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		
		ActiveProjectsandCustomers apcp = new ActiveProjectsandCustomers();
		apcp.clickOnAddNewProjectButton();
		
		AddNewProjectPage anpp = new AddNewProjectPage();
		anpp.customerDropDownText();
		anpp.projectNameTextFieldText("shjd");
		anpp.createProjectText();
		apcp.retrievesuccessMessage();
		
	}


}
