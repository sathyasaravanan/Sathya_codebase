#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
@automated
Feature: Login functionality
	@validlogin
  Scenario: Validate login using valid credentials
    Given User is on parabank login page
    And User enters <userid> into Username textbox
    	|userid|
    	|sathuo|
    And User enters <password> into password textbox
    	|password|
    	|123|
    When User clicks on login button
    Then User should be able to login successfully
    And User should see the Welcome page with message "Welcome to account services"
    And USer should see the Account overview page

  @invalidlogin
  Scenario Outline: Validate login using invalid credentials
    Given User is on parabank login page
    And User enters <userid> into Username textbox
    And User enters <password> into password textbox
    When User clicks on login button   
    Then User should see the error page
    And User should see the error message "The username and password could not be verified."

    Examples: 
      | userid  | password | 
      | sathuo |     234 | 
      | sathi |     123 | 
