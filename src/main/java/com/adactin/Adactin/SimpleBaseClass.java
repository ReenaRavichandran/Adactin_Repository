package com.adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SimpleBaseClass {

	public static WebDriver driver;
	
	//send keys 
     public static void sendin(WebElement element,String value) {
           element.sendKeys(value);
	} 
     
     //click 
     public static void click(WebElement element) {
           element.click();
	}
	
     //clear
     public static void vanish(WebElement element) {
              element.clear();
	}
	
     // check box
     public static void checkBox(WebElement element) {
           element.click();
	}
	
     // is enabled
     public static void enabled(WebElement element) {
        boolean e = element.isEnabled();
        System.out.println(e);
	}
	
     //is displayed 
     public static void displayed(WebElement element) {
         boolean d = element.isDisplayed();
         System.out.println(d);
	}
	
     //is selected
     public static void selected(WebElement element) {
           boolean s = element.isSelected();
           System.out.println(s);
	}
     
     //get text
     public static void get(WebElement element) {
          String t = element.getText();
          System.out.println(t);
	}
     
     //get attribute 
     public static void getAttribute(WebElement  element,String value) {
          String a = element.getAttribute(value);
          System.out.println(a);
	}
	
     //select by index 
     public static  void byIndex(WebElement element ,String options,int a) {

    	 Select  s =  new Select(element);
    	 
    	 options.equalsIgnoreCase("by index");
    	 s.selectByIndex(a);
    	 
	}
	
     // select by  value  
     public static void byValue(WebElement element,String options , String value) {
       
    	 Select s =  new Select(element);
    	 options.equalsIgnoreCase("by value");
    	 s.selectByValue(value);
    	 
	}
	
     //  select by visible text
     public static void byVisibleText(WebElement element, String options , String value) {
        
    	 Select s =  new  Select(element);
    	 options.equalsIgnoreCase("by visible text");
    	 s.selectByVisibleText(value);
    	 
    	 }
     
     // deselect by index
     public static void deByIndex(WebElement element ,String options ,int a) {

    	 Select s =  new Select(element);
    	 options.equalsIgnoreCase("by index");
    	 s.deselectByIndex(a);
	}
	
	// deselect by value 
     public static void debyValue(WebElement element,String options , String value) {
         
    	 Select s =  new Select(element);
    	 options.equalsIgnoreCase("by value");
    	 s.deselectByValue(value);
    	 
	}
     //deselect by visible text
     public static void debyVisibleText(WebElement element,String options , String value) {
         
    	 Select s =  new Select(element);
    	 options.equalsIgnoreCase("by value");
    	 s.deselectByVisibleText(value);
    	 
	}
     
     //deselect all  
     public static void deSelectAll(WebElement element) {
           
    	 Select s =  new Select(element);
    	 s.deselectAll();
    	 
    	 
	}
     
     //get first selected 
     
	
	
	
	
	
}
