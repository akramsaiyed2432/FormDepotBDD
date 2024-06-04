Feature: Test login functionality

  @smoketest
  Scenario Outline: Test login with valid credentials
    Given User is on the login page
    When User enters <username> and <password>
    And User clicks on the login button
    Then User is navigated to the home page
	
	Examples:
	|username|password|
	|radixdt|Radixweb@8|
	
	@negativetest
Scenario Outline: Test login with invalid credentials -1
    Given User is on the login page
    When User enters <username> and <password>
    And User clicks on the login button
    Then User is navigated to the home page
	
	Examples:
	|username|password|
	|Invalid|Radixweb@8|
	
		@negativetest
	Scenario Outline: Test login with invalid credentials -2
    Given User is on the login page
    When User enters <username> and <password>
    And User clicks on the login button
    Then User is navigated to the home page
	
	Examples:
	|username|password|
	|radixdt|Invalid@8|
	
		@negativetest
	Scenario Outline: Test login with invalid credentials -3
    Given User is on the login page
    When User enters <username> and <password>
    And User clicks on the login button
    Then User is navigated to the home page
	
	Examples:
	|username|password|
	|Invalid|Invalid@8|