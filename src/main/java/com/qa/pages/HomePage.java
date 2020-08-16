package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Dismiss')]")
	WebElement dismissLink;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement redirectionLink;
	
    public HomePage()
    {
    	PageFactory.initElements(driver, this);
    }

	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public RegisterPage redirectionToRegisterPage()
	{
		dismissLink.click();
		redirectionLink.click();
		return new RegisterPage();
	}
	
}
