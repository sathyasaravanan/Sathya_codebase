Feature: Register Functionality
	@validuser
	Scenario Outline: Successfull registration with valid data
  	Given User is on  parabank registration page
  	When User fill in the registration form with valid <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNum>, <ssn>, <username>, <password>, and <confirmPassword>
  	And User clicks on the "Register" button
  	Then User should be able to register successfully
  	And User should see the registration successful message "Your account was created successfully. You are now logged in."
  	And User should see the Welcome page with message "Welcome to account services"

  Examples:
  | firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
  | Advik     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
  | Sathya    | saran    | 89 sweet | Alpharetta  | GA    | 12345   | 1234567899   | 123456789 | sathya    | 123      | 123             |
  
	@invaliduser
	Scenario: User cannot register with invalid data
  	Given User is on  parabank registration page
  	When USer fill in the registration form with invalid data <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phoneNumber>, <ssn>, <username>, <password>, and <confirmPassword>
  	And User clicks on the "Register" button
  	Then User should see an error message
  	And User stays on the registration page

	Examples:
  | firstName | lastName | address  | city        | state | zipCode | phoneNum     | ssn       | username  | password | confirmPassword |
  | ""        | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
  | Advik     | ""       | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
  | Advik     | kumar    | ""       | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 123             |
  | Advik     | kumar    | 79 sweet | Alpharetta  | GA    | 12345   | 1234567890   | 123456789 | advik     | 123      | 124             |
  