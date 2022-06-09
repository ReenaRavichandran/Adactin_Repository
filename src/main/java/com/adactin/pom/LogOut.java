package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	public static WebDriver  driver;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logout;
	
	public LogOut(WebDriver driver2) {
     this.driver = driver2;
     PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
}
