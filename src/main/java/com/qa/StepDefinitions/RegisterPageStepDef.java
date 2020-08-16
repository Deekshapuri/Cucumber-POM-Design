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
public class RegisterPageStepDef extends TestBase{
	
	RegisterPage registerPage;
	LoginPage loginPage;
	HomePage homePage;
	
	public RegisterPageStepDef()
	{
		super();
	}
	
	@Before
	public void setUp()
	{
		TestBase.initialisation();
		homePage = new HomePage();
		registerPage = homePage.redirectionToRegisterPage();
	}

	@Given("^Title of Register page is My Account$")
	public void title_of_page_is_My_Account() 
	{
		String title = registerPage.verifyTitle();
		System.out.println("Title of Register Page is " + title);
		Assert.assertEquals("ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site",title);
	}

	@Then("^User enter register details username and email_address and password$")
	public void user_enter_register_details_username_and_email_address_and_password() 
	{
	    registerPage.register("rapa123@gmail.com", "rapa123@gmail.com", "cars@2425");
	    System.out.println("Registration done successfully!");
	}
	
	@Then("^User redirects$")
	public void userRedirects()
	{
		loginPage = registerPage.redirection();
	}

}
