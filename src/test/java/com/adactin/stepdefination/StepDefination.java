package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.adactin.Adactin.BaseClass;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.LogOut;
import com.adactin.pom.Login;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;
import com.configuration.reader.FileReader;
import com.configuration.reader.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination  extends  BaseClass{

	public static WebDriver driver = TestRunner.driver;
	
	public  static PageObjectManager pom = new  PageObjectManager(driver);
	
//	 Login l = new Login(driver);
	
	@Given("^user Succesfully Able To Launch The Adactin Website$")
	public void user_Succesfully_Able_To_Launch_The_Adactin_Website() throws Throwable {
	   
		String launch = FileReader.getInstance().getInstanceCR().getLaunch();
		get(launch);
		waiting();
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
	
	sendin(pom.getInstanceLogin().getUsername(), username);
	
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
sendin(pom.getInstanceLogin().getPassword(), password );	
	}

	@Then("^user ClickOn The Login Button And It Navigates To The Search Hotel Page$")
	public void user_ClickOn_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	  eclick(pom.getInstanceLogin().getLogin());
	  
	  waiting();
	}
	
	
//	SearchHotel s = new SearchHotel(driver);
	
	

@When("^user Have To Select The Location/Place Where He/She Supposed  To Book The  Hotelroom$")
public void user_Have_To_Select_The_Location_Place_Where_He_She_Supposed_To_Book_The_Hotelroom() throws Throwable {
   
multiple(pom.getInstanceSearch().getLocation(), "Melbourne", "by visibletext");
	
}

@When("^user Have To Select Which Type Of Hotels They Need$")
public void user_Have_To_Select_Which_Type_Of_Hotels_They_Need() throws Throwable {
multiple(pom.getInstanceSearch().getHotel(), "Hotel Sunshine", "by value");
}

@When("^user Have To Select The Hotelrooms Type Where Feel Comfortable$")
public void user_Have_To_Select_The_Hotelrooms_Type_Where_Feel_Comfortable() throws Throwable {

multiple(pom.getInstanceSearch().getRoomtype(), "Double", "by value");

}

@When("^user Have To Select Number Of Rooms  They  Needed  To  Stay$")
public void user_Have_To_Select_Number_Of_Rooms_They_Needed_To_Stay() throws Throwable {

	multiple(pom.getInstanceSearch().getRoomnum(), "5", "by index");

}

@When("^user Have To  Mention Date When They Are Going To Check-in Hotel Room$")
public void user_Have_To_Mention_Date_When_They_Are_Going_To_Check_in_Hotel_Room() throws Throwable {
 
	eclear(pom.getInstanceSearch().getCheckin());
	sendin(pom.getInstanceSearch().getCheckin(), "20/06/2021");
}

@When("^user Have To  Mention Date When They Are Going To Check-out From  Hotel Room$")
public void user_Have_To_Mention_Date_When_They_Are_Going_To_Check_out_From_Hotel_Room() throws Throwable {

	eclear(pom.getInstanceSearch().getCheckout());
	sendin(pom.getInstanceSearch().getCheckout(), "28/06/2021");
	
	
}

@When("^user Have To Mention Number Of Adults Per Room Going To Stay In Hotelroom$")
public void user_Have_To_Mention_Number_Of_Adults_Per_Room_Going_To_Stay_In_Hotelroom() throws Throwable {

multiple(pom.getInstanceSearch().getAdultroom(), "3", "by value");
}

@When("^user Have To Mention Number Of Childern Per Room Going To Stay In Hotelroom$")
public void user_Have_To_Mention_Number_Of_Childern_Per_Room_Going_To_Stay_In_Hotelroom() throws Throwable {

multiple(pom.getInstanceSearch().getChildroom(), "2 - Two", "by visibletext");
}

@Then("^user Click The Search Button And It Navigates To  Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {

thread();
eclick(pom.getInstanceSearch().getSearch());


}

SelectHotel sh  = new SelectHotel(driver);

@When("^user Have To Click The Select CheckBox$")
public void user_Have_To_Click_The_Select_CheckBox() throws Throwable {

	waiting();
	
	checkbox(pom.getInstanceSelect().getSelect());

}

@Then("^user Click The Continue Button And It Navigates To The Book A Hotel Page$")
public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {

	eclick(pom.getInstanceSelect().getProceed());

}

//BookAHotel b =new BookAHotel(driver);

@When("^user Enter The FirstName Of His/Her In The Firstname  Field$")
public void user_Enter_The_FirstName_Of_His_Her_In_The_Firstname_Field() throws Throwable {

 sendin(pom.getInstanceBook().getFirstname(), "Reena");
}

@When("^user Enter The LastName Of His/Her In The Lastname  Field$")
public void user_Enter_The_LastName_Of_His_Her_In_The_Lastname_Field() throws Throwable {

sendin(pom.getInstanceBook().getLastname(), "Ravi");
}

@When("^user Enter The Residing Address Of His/Her In THe Billing Address Field$")
public void user_Enter_The_Residing_Address_Of_His_Her_In_THe_Billing_Address_Field() throws Throwable {

sendin(pom.getInstanceBook().getAddress(), "NO.4 , Dubai Main Road,  Dubai kuruku santhu , Dubai");
waiting();
}

@When("^user Enter The Creditnumber Of His/Her In The Credit Card No\\. Field$")
public void user_Enter_The_Creditnumber_Of_His_Her_In_The_Credit_Card_No_Field() throws Throwable {

	String cardNumber = FileReader.getInstance().getInstanceCR().cardNumber();
	
	sendin(pom.getInstanceBook().getCreditnum(), cardNumber);

}

@When("^user Enter The Creditype Of His/Her In The Credit Card Type Field$")
public void user_Enter_The_Creditype_Of_His_Her_In_The_Credit_Card_Type_Field() throws Throwable {

multiple(pom.getInstanceBook().getCredittype(),"VISA", "by visibletext");
}

@When("^user Have To Select The Expiry Month Of His/Her Cerdit Card In The Expiry Data Field$")
public void user_Have_To_Select_The_Expiry_Month_Of_His_Her_Cerdit_Card_In_The_Expiry_Data_Field() throws Throwable {

multiple(pom.getInstanceBook().getExmonth(), "March", "by visibletext");
}



@When("^user Have To Select The Expiry Date Of His/Her Cerdit Card In The Expiry Data Field$")
public void user_Have_To_Select_The_Expiry_Date_Of_His_Her_Cerdit_Card_In_The_Expiry_Data_Field() throws Throwable {

multiple(pom.getInstanceBook().getExyear(), "2014", "by visibletext");
}

@When("^user Enter The Ccv Number Of His/Her Cerdit Card In The Ccv Number Field$")
public void user_Enter_The_Ccv_Number_Of_His_Her_Cerdit_Card_In_The_Ccv_Number_Field() throws Throwable {

  String ccvNumber = FileReader.getInstance().getInstanceCR().ccvNumber();
	
	sendin(pom.getInstanceBook().getCcvnum(), ccvNumber);

screenshot();
}

@Then("^user Click The Book Now Button and It Navigates To The Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_and_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {

eclick(pom.getInstanceBook().getBooknow());
waiting();


}

//BookingConfirmation bc = new BookingConfirmation(driver);

@Then("^user Click The My Iteinerary Button It Navigates To The Booked Itinerary Page$")
public void user_Click_The_My_Iteinerary_Button_It_Navigates_To_The_Booked_Itinerary_Page() throws Throwable {

eclick(pom.getInstanceConfirmation().getItinerary());

waiting();
}

//LogOut lo = new LogOut(driver);

@Then("^user Click the LogOut Button And It Leaves The Page$")
public void user_Click_the_LogOut_Button_And_It_Leaves_The_Page() throws Throwable {

eclick(pom.getInstanceLogOut().getLogout());

shot();
}

@When("^user get the first title$")
public void user_get_the_first_title() throws Throwable {
    
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
