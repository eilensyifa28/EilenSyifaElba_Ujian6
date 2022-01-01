Feature: Regist Page

	Scenario: Testing the authentication
		Given User go to the Website
		When User click Dismiss button
		When User click Myaccount page button
		And User input username email password and click Register
		Then User can Register to the Website