Feature: Search google
Background:
Given User launches the chrome website
@Simple
Scenario: Google search with Oneplus
And user search the "Oneplus 12" in the search bar 
When user clicks the search button
Then user can see the Oneplus12 related search results

@Regression
Scenario: Google search with Apple
And user searching the "Iphone 15" in the search 
When user clicks the search icon
Then user can see the Iphone15 related search results

@Sanity
Scenario: Google search with Samsung 
And the use search the "S23 Ultra" in the search bar 
When user clicks the search option
Then user can see the S23 ultra related search results