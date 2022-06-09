package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.Adactin.BaseClass;
import com.configuration.reader.FileReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.stepdefination",
monochrome = true,
strict = true,
plugin = { "html:Report/CucumberReport1",
		"pretty",
		"json:Report/Cucumber1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:cucureport/File1.html",
		"rerun:target/return.txt"
		
		
},tags ="~@unittest"
		

		)
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void steUp() throws Throwable {

		
	String browser = FileReader.getInstance().getInstanceCR().getBrowser();
		
		driver = BaseClass.broswerlaunch(browser);

	}

	@AfterClass
	public static void tearDown() {

		driver.close();

	}

}
