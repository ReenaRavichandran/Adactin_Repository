package com.configuration.reader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.LogOut;
import com.adactin.pom.Login;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	
	public WebDriver driver;
	
	private Login   login;
	
	private SearchHotel search;
	
	private SelectHotel select;
	
    private BookAHotel book;
    
    private BookingConfirmation confirm;
    
    private LogOut out;

	public PageObjectManager(WebDriver driver2) {
	
	     this.driver =  driver2;
	     PageFactory.initElements(driver2, this);
	
	}
	
	public Login getInstanceLogin() {

		login = new Login(driver);
		
		return login;
		
	}
	
	public SearchHotel getInstanceSearch() {

		 search  = new SearchHotel(driver);
		
		return  search;
		
		
	}
	
	
	public SelectHotel getInstanceSelect() {

		 select =  new SelectHotel(driver);
		
	     return select;
		
		
	}
	
	public BookAHotel getInstanceBook() {

		 book = new BookAHotel(driver);
		
		return book;
	}
	
	public BookingConfirmation getInstanceConfirmation() {

		confirm = new BookingConfirmation(driver);
		
		return confirm;
		
	}
	
	
	public LogOut getInstanceLogOut() {

	    out = new LogOut(driver);
	    
	    return out;
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
