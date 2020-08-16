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
public class HomePageStepDef extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;
	
	public HomePageStepDef()
	{
		super();
	}
	
	@Before
	public void setUp()
	{
		TestBase.initialisation();
		homePage = new HomePage();
	}
	
	@Given("^Title of Home page is Shop Demo QA$")
	public void title_of_page_is_Shop_Demo_QA() 
	{
	   String title = homePage.verifyTitle();
	   System.out.println("Title of Home Page is " + title);
	   Assert.assertEquals("ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site", title);
	}

	@Then("^User moves to login page$")
	public void user_is_redirected_to_login_page()
    {
		registerPage = homePage.redirectionToRegisterPage();
	}

}
