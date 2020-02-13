package org.ActiTime.TS;

import org.testng.annotations.Test;

import actitime.wp.Addnewcustomerpage;


public class CreateCustomerTC_000 extends actitime.ut.BaseClass3 {
	@Test
	public void testCreateCustomerTC_000()
	{
		actitime.wp.OpenTasksPage otp = new actitime.wp.OpenTasksPage();
		otp.clickOnProjectsAndCustomers();
		
		actitime.wp.ActiveProjectsAndCustomerPage apcp = new actitime.wp.ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewCustomer();
		
		Addnewcustomerpage acp = new Addnewcustomerpage();
		acp.enterCustomerName("sudheer25");
		acp.clickOnCreateCustomerButton();
		
		String s = apcp.retreiveSuccessMsg();
		System.out.println(s);
		
		
	}

}

