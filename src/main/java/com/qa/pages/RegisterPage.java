package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(id = "reg_username")
	WebElement regUsername;
	
	@FindBy(id = "reg_email")
	WebElement regEmail_address;
	
	@FindBy(id = "reg_password")
	WebElement regPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	WebElement registerBttn;
	
	@FindBy(id = "user_login")
	WebElement loginUsername;
	
	@FindBy(id = "user_pass")
	WebElement loginPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBttn;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement logOut;
	
	public RegisterPage()
    {
    	PageFactory.initElements(driver, this);
    }
	
	public String verifyTitle()
	{
		 return driver.getTitle();
	}
	
	public void register(String un, String email, String pwd)
	{
		regUsername.sendKeys(un);
		regEmail_address.sendKeys(email);
		regPassword.sendKeys(pwd);
		
		registerBttn.click();
	    
		loginUsername.sendKeys(un);
		loginPassword.sendKeys(pwd);	
		loginBttn.click();
		
		logOut.click();
	}
	
	public LoginPage redirection()
	{
		return new LoginPage();
	}

}
