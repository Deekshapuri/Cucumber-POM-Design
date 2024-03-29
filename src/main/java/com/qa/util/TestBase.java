package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/deeksha/eclipse-workspace/CucumberPOM"
					+ "/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialisation() 
	{
		WebDriverManager.chromedriver().setup();
    	String browserName = prop.getProperty("browser");
   
    	if(browserName.equals("chrome")){
    	    driver = new ChromeDriver();
    	}
    	
    	if(browserName.equals("FF")){
    		driver = new FirefoxDriver();
    	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		driver.get(prop.getProperty("url"));
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
}
