Feature: Booking Hotel In an  Adactin Website

@smoketest
Scenario Outline:  Login Page

Given user Succesfully Able To Launch The Adactin Website
When user Enter The "<username>" In The Username Field
And  user Enter The "<password>" In The Password Field
Then user ClickOn The Login Button And It Navigates To The Search Hotel Page

Examples:
  |username|password|        
  |reena|reena@|
  |reenaravichandran|Reena@6129| 
  |naveen|naveenraj|
  |reenaravichandran|Reena@6129|    

@sanitytest
Scenario: Search Hotel

When user Have To Select The Location/Place Where He/She Supposed  To Book The  Hotelroom
And  user Have To Select Which Type Of Hotels They Need
And  user Have To Select The Hotelrooms Type Where Feel Comfortable
And  user Have To Select Number Of Rooms  They  Needed  To  Stay 
And  user Have To  Mention Date When They Are Going To Check-in Hotel Room
And  user Have To  Mention Date When They Are Going To Check-out From  Hotel Room
And  user Have To Mention Number Of Adults Per Room Going To Stay In Hotelroom
And  user Have To Mention Number Of Childern Per Room Going To Stay In Hotelroom
Then user Click The Search Button And It Navigates To  Select Hotel Page
@regressiontest
Scenario: Select Hotel

When user Have To Click The Select CheckBox 
Then user Click The Continue Button And It Navigates To The Book A Hotel Page
@acceptancetest
Scenario: Book A Hotel

When user Enter The FirstName Of His/Her In The Firstname  Field
And  user Enter The LastName Of His/Her In The Lastname  Field
And  user Enter The Residing Address Of His/Her In THe Billing Address Field 
And  user Enter The Creditnumber Of His/Her In The Credit Card No. Field
And  user Enter The Creditype Of His/Her In The Credit Card Type Field
And  user Have To Select The Expiry Month Of His/Her Cerdit Card In The Expiry Data Field
And  user Have To Select The Expiry Date Of His/Her Cerdit Card In The Expiry Data Field
And  user Enter The Ccv Number Of His/Her Cerdit Card In The Ccv Number Field
Then  user Click The Book Now Button and It Navigates To The Booking Confirmation Page
@unittest
Scenario:  Booking Confirmation

Then user Click The My Iteinerary Button It Navigates To The Booked Itinerary Page 
@systemtest
Scenario: Logout Page  

Then user Click the LogOut Button And It Leaves The Page 
 