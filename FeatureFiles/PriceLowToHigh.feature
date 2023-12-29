@SimpleTest
Feature: Verify Price Low to High Dropdown feature
Scenario: Price Low to High Dropdown selection
Given User lauches the Application
And User enters the "<Username>" and "<Password>"
And User Clicks the login button
And user selects the price low to high dropdown
Then verify the first low price product "Sauce Labs Onesie"


