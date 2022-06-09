package com.configuration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

	public static  Properties p;
	
	public ConfigurationReader() throws Throwable {  // constructor - property read panna
		
		File f = new  File("C:\\Users\\Sys\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\configuration\\configuration.properties");
		
	  FileInputStream fis = new FileInputStream(f); // file erruka data to read 
	  
	   p  = new Properties(); // property file  have to load the values here
	   
	   p.load(fis);
	   
	   
	   }
	
	
	public  String getBrowser() {
          String browser = p.getProperty("browser");
          
          return  browser;
	}
	
	public String getLaunch() {

		String url = p.getProperty("url");
	
	        return url;
	}
	
	
	public String cardNumber() {
            
		String cardnumber = p.getProperty("cardnumber");
		
		return cardnumber;
	}
	
	
	public String ccvNumber() {
          
		String ccvnumber = p.getProperty("ccvnumber");
		
		return ccvnumber;
		
	}
	
	
	
	
	
	
	
	
	
}
