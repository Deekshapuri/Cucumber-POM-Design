package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/deeksha/eclipse-workspace/CucumberPOM/src/main/java/com/qa/features/shopDemoQA.feature", 
		//the path of the feature files
		glue = {"com/qa/StepDefinitions"}, 
		//the path of the step definition files or give direct the package name
		format = {"pretty", "html:test-output", "json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml"},
		//to generate different types of reporting
		monochrome = true, 
		//display the console output in proper readable format
		strict = false,
		//it will check if step defined in step definition, fail test case in case of undefined/pending step definitions
		// tags = {"@SmokeTest" , "@RegressionTest"},
		dryRun = false
		//to check mapping is proper between feature file and step definition 
		)

public class TestRunner {

}