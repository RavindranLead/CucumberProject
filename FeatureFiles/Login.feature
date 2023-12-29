Feature: Verify the Lable Name in the Home Page
Scenario: Label name verification in the swaglabs home page
Given User launch the Swaglabs application
When User enters the username "standard_user"
And User enters the password "secret_sauce"
And User clicks the login button
Then verify the lable name of home page