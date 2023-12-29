Feature: Swag order placing 
@Sanity
Scenario: Swag order placing end to end sanity flow
Given User is entered to the application
And User is login to the application with valid credentials
And User is add the product in the cart and clicked the cart badge
And User is clicked the checkout button in the your cart page
And User is entered the check out information and clicked the continue button
And user is verifyin the payment card type and clicked the finsh button
Then user can see the order success message
@SimpleTest
Scenario: Price Low to High Dropdown selection
Given User lauches the Application
And User enters the "<Username>" and "<Password>"
And User Clicks the login button
And user selects the price low to high dropdown
Then verify the first low price product "Sauce Labs Onesie"

Scenario: Verify the cart badge count in the swaglabs hoome page
Given Login to Swaglabs application
And login with correct username and pasword
And move any one of the product into cart
Then check the cart badge count