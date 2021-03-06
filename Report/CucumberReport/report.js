$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel In an  Adactin Website",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Succesfully Able To Launch The Adactin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"reenaravichandran\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"Reena@6129\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user ClickOn The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Succesfully_Able_To_Launch_The_Adactin_Website()"
});
formatter.result({
  "duration": 7144575200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reenaravichandran",
      "offset": 16
    }
  ],
  "location": "StepDefination.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 1223835100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reena@6129",
      "offset": 16
    }
  ],
  "location": "StepDefination.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 300436300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_ClickOn_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2635980100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Hotel",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user Have To Select The Location/Place Where He/She Supposed  To Book The  Hotelroom",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Have To Select Which Type Of Hotels They Need",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Have To Select The Hotelrooms Type Where Feel Comfortable",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Have To Select Number Of Rooms  They  Needed  To  Stay",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Have To  Mention Date When They Are Going To Check-in Hotel Room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Have To  Mention Date When They Are Going To Check-out From  Hotel Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Have To Mention Number Of Adults Per Room Going To Stay In Hotelroom",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Have To Mention Number Of Childern Per Room Going To Stay In Hotelroom",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click The Search Button And It Navigates To  Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_The_Location_Place_Where_He_She_Supposed_To_Book_The_Hotelroom()"
});
formatter.result({
  "duration": 1488763800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_Which_Type_Of_Hotels_They_Need()"
});
formatter.result({
  "duration": 374085700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_The_Hotelrooms_Type_Where_Feel_Comfortable()"
});
formatter.result({
  "duration": 257040200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_Number_Of_Rooms_They_Needed_To_Stay()"
});
formatter.result({
  "duration": 531489300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Mention_Date_When_They_Are_Going_To_Check_in_Hotel_Room()"
});
formatter.result({
  "duration": 905708800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Mention_Date_When_They_Are_Going_To_Check_out_From_Hotel_Room()"
});
formatter.result({
  "duration": 353453700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Mention_Number_Of_Adults_Per_Room_Going_To_Stay_In_Hotelroom()"
});
formatter.result({
  "duration": 252803500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Mention_Number_Of_Childern_Per_Room_Going_To_Stay_In_Hotelroom()"
});
formatter.result({
  "duration": 283259700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 6269425700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Select Hotel",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@regressiontest"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user Have To Click The Select CheckBox",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Click The Continue Button And It Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Have_To_Click_The_Select_CheckBox()"
});
formatter.result({
  "duration": 183918200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1329118000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Book A Hotel",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@acceptancetest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Enter The FirstName Of His/Her In The Firstname  Field",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Enter The LastName Of His/Her In The Lastname  Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Residing Address Of His/Her In THe Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Creditnumber Of His/Her In The Credit Card No. Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Creditype Of His/Her In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Have To Select The Expiry Month Of His/Her Cerdit Card In The Expiry Data Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Have To Select The Expiry Date Of His/Her Cerdit Card In The Expiry Data Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Ccv Number Of His/Her Cerdit Card In The Ccv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Click The Book Now Button and It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Enter_The_FirstName_Of_His_Her_In_The_Firstname_Field()"
});
formatter.result({
  "duration": 453449900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_The_LastName_Of_His_Her_In_The_Lastname_Field()"
});
formatter.result({
  "duration": 314348800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_The_Residing_Address_Of_His_Her_In_THe_Billing_Address_Field()"
});
formatter.result({
  "duration": 424022700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_The_Creditnumber_Of_His_Her_In_The_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 254795900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_The_Creditype_Of_His_Her_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 262687800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_The_Expiry_Month_Of_His_Her_Cerdit_Card_In_The_Expiry_Data_Field()"
});
formatter.result({
  "duration": 318870900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Have_To_Select_The_Expiry_Date_Of_His_Her_Cerdit_Card_In_The_Expiry_Data_Field()"
});
formatter.result({
  "duration": 281649200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_The_Ccv_Number_Of_His_Her_Cerdit_Card_In_The_Ccv_Number_Field()"
});
formatter.result({
  "duration": 2263943700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Click_The_Book_Now_Button_and_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 360554100,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Booking Confirmation",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@unittest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user Click The My Iteinerary Button It Navigates To The Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Click_The_My_Iteinerary_Button_It_Navigates_To_The_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 7243773100,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Logout Page",
  "description": "",
  "id": "booking-hotel-in-an--adactin-website;logout-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@systemtest"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "user Click the LogOut Button And It Leaves The Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Click_the_LogOut_Button_And_It_Leaves_The_Page()"
});
formatter.result({
  "duration": 1475013500,
  "status": "passed"
});
});