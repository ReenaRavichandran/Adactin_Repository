package com.configuration.reader;


public class FileReader {

	
	public ConfigurationReader getInstanceCR() throws Throwable {
		  
		  ConfigurationReader  helper = new ConfigurationReader();
		  
		  return helper;
		
	}
	
	
	
	public  static FileReader getInstance() {

		  FileReader file = new FileReader();
		  
		  return file;
		
	}
	
	private FileReader() {

	   
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
