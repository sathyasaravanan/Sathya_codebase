Feature: Registration functionality
	@validdata
	Scenario Outline: Register successfully with valid data
		Given User is on parabank registration page
		When User fill in the registration page with valid data <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNum>, <ssn>, <username>, <password>, and <confirmPassword>
		And User clicks on the "Register" button
		Then User should be able to register successfully
		And User should see the registration successful message "Your account was created successfully. You are now logged in."
  	And User should see the Welcome page with message "Welcome to account services"
  	
  Examples:
  | firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
  | Advik     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
  | Sathya    | saran    | 89 sweet | Alpharetta  | GA    | 12345   | 1234567899   | 123456789 | sathya    | 123      | 123             |
  
	@invaliddata
	Scenario: User cannot register with invaild data
		Given User is on parabank registration page
		When User fill in the registration page with invalid data <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNum>, <ssn>, <username>, <password>, and <confirmPassword>
		| firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
    | ""     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
		And User clicks on the "Register" button
		Then User should see the error message "First name is required."
		And User stays on the registration page
		
	Scenario: User cannot register with invaild data
		Given User is on parabank registration page
		When User fill in the registration page with invalid data <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNum>, <ssn>, <username>, <password>, and <confirmPassword>
		| firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
    | Advik     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 124             |
		And User clicks on the "Register" button
		Then User should see the error message "Passwords did not match."
		And User stays on the registration page
		
	Scenario: User cannot register with invaild data
		Given User is on parabank registration page
		When User fill in the registration page with invalid data <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNum>, <ssn>, <username>, <password>, and <confirmPassword>
		| firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
    | Advik     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
		And User clicks on the "Register" button
		Then User should see the error message "This username already exists."
		And User stays on the registration page
		
	
			
	