package com.qa.StepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginPageStepDef extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	RegisterPage registerPage;
	
	public LoginPageStepDef()
	{
		super();
	}
	
	@Before
	public void setUp()
	{
		TestBase.initialisation();
		registerPage = new RegisterPage();
		loginPage = registerPage.redirection();
	}
	
	@Given("^Title of Login page is My Account$")
	public void title_of_page_is_My_Account() 
	{
		String title = loginPage.verifyTitle();
		System.out.println("Title of Register Page is " + title);
		Assert.assertEquals("ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site",title);
	}
	
	@Then("^User enter login details username and password$")
	public void user_enter_login_details_username_and_passwords() 
	{
		loginPage.logIn("deeksha.puri01@gmail.com", "cars@2425");
	}
 
}
