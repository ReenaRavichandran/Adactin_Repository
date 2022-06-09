package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	public static WebDriver driver;
	
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditnum;
	
	@FindBy(id="cc_type")
	private WebElement credittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement exmonth;
	
	@FindBy(id="cc_exp_year")
	private  WebElement exyear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvnum;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement booknow;
	
	public BookAHotel(WebDriver driver2) {
	
		this.driver= driver2;
		PageFactory.initElements(driver2,this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditnum() {
		return creditnum;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getExmonth() {
		return exmonth;
	}

	public WebElement getExyear() {
		return exyear;
	}

	public WebElement getCcvnum() {
		return ccvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	
	
	
	
	
	
	
	
	
	
}
