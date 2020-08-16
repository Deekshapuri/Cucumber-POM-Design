package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement passWord;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginBttn;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement logOut;
	
	public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void logIn(String un, String pwd)
	{
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		loginBttn.click();
		
		logOut.click();	
	}
	
}
