Feature: Forgotlogin functionality
	@validlogininfo
	Scenario Outline:  logininfo is located with validdata
		Given User is on parabank Forgotlogininfo page
		When User provides the valid data <First Name>,<Last Name>,<Address>,<City>,<State>,<Zip Code>,<SSN>
		And User clicks on the "FIND MY LOGIN INFO" button
	  Then The login information will be located successfully
	  And User should see the Customer lookup page with message "Your login information was located successfully. You are now logged in."
    
    Examples:
    		|First Name |Last Name |Address    |City       |State    |Zip Code |SSN    |
		    |first      |last      |address    |city       |state    |zip      |ssn    |		
		    |Sathya     |Saro      |Sweetberry |Alpharetta |GA       |30005    |12345  |
		    
	@invalidlogininfo
	Scenario: Unable to locate logininfo with invalid data
	  Given User is on parabank Forgotlogininfo page
		When User provides the invalid data <First Name>,<Last Name>,<Address>,<City>,<State>,<Zip Code>,<SSN>
			  |First Name   |Last Name |Address    |City       |State    |Zip Code  |SSN    |	
		    |raj          |krish     |Sweetberry |Alpharetta |GA       |30005     |12345  |
		And User clicks on the "FIND MY LOGIN INFO" button
	  Then User should see the error page with message "The customer information provided could not be found."
	  And User should see the page navigated to homepage
    
   
    	