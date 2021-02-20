package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver; 

	public LoginPage(WebDriver rdriver) // constructor

	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);// page factory class
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	
	public void setUserName(String uname) //action method for user name
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)//action method for password
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() //action method for submit
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
}


