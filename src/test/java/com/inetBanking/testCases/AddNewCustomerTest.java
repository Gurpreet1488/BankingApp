package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.AddNewCustomer;
import com.inetBanking.pageObject.LoginPage;

public class AddNewCustomerTest extends BaseClass {
	
	@Test
	public void addnewcustomer() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
	
		
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		
		AddNewCustomer ac = new AddNewCustomer(driver);
		
		ac.ClickNewCustomer();
		ac.setCustomerName("Sonika");
		ac.ClickrdButton();
		ac.setDateOfBirth("14", "12","1990");
		ac.setAddress("5 Dixon Street");
		ac.setCity("Sunnybank");
		ac.setState("QLD");
		ac.setPIN("410922");
		ac.setPhone("04565676787");
		ac.setEmail("abc@gmail.com");
		ac.setPassword("abc123");
		Thread.sleep(3000);
		ac.ClickSubmitCreateNewCCustomer();
		
	
	}
	
	

}
