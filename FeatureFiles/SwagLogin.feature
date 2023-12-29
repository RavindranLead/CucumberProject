Feature: login feature of Swag Application 
Scenario Outline: Login Functionality of Swag 
	Given User launched the application by url 
	And User entered the "<Username>" and "<Password>" 
	When User Clicked the Login Button 
	Then User can view the Swag homepage 
	
	Examples: 
		|Username|Password|
		|standard_user|secret_sauce|
		|locked_out_user|secret_sauce|
		|visual_user|secret_sauce|
