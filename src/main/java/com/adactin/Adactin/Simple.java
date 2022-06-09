package com.adactin.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static WebDriver driver;

	private void one() {
		driver = new ChromeDriver();

		WebElement user = driver.findElement(By.id(""));
		user.sendKeys("");
	}

	// sendkeys - webelement

// ref.sendkeys 

	public static void inputre(WebElement element) {
		element.sendKeys();
	}
//	public void inputre(WebElement element,String value) {
//		element.sendKeys(value);
//	}
//	protected static void inputre(WebElement element,String value) {
//		element.sendKeys(value);
//	}
//	
//	 void inputre(WebElement element,String value) {
//		element.sendKeys(value);
//	}
	
	
	 
	 public static void button(WebElement jeneseruma) {
		 jeneseruma.click();
		}

}
