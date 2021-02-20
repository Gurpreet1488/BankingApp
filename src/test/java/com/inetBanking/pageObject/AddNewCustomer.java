package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	WebDriver ldriver; 

	public AddNewCustomer(WebDriver rdriver) // constructor

	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);// page factory class
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkNewCustomer;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement txtCustomerName;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement rdFemale;
	
	@FindBy(name="dob")
	WebElement txtdob;
	
	@FindBy(name="addr")
	WebElement txtaddress;
	
	@FindBy(name="city")
	WebElement txtCity;
	
	@FindBy(name="state")
	WebElement txtState;
	
	@FindBy(name="pinno")
	WebElement txtPin;
	
	@FindBy(name="telephoneno")
	WebElement txtPhone;
	
	@FindBy(name="emailid")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPwd;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	WebElement createnewcustomer;
	
	
	public void ClickNewCustomer()
	{
		lnkNewCustomer.click();
	}
	
	public void setCustomerName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	
	public void ClickrdButton()
	{
		rdFemale.click();
	}
	
	
	public void setDateOfBirth(String dd, String mm, String yyyy)
	{
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yyyy);
	}
	

	public void setAddress(String add)
	{
		txtaddress.sendKeys(add);
	}
	
	
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void setPIN(String pin)
	{
		txtPin.sendKeys(pin);
	}
	
	public void setPhone(String phone)
	{
		txtPhone.sendKeys(phone);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	
	public void setPassword(String password)
	{
		txtPwd.sendKeys(password);
	}
	
	public void ClickSubmitCreateNewCCustomer()
	{
		createnewcustomer.click();
	}
}