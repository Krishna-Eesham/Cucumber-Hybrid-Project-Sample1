@login @all
 Feature: Login Functionality
 Regeistered user shold be able login
 
 Background: 
 Given User navigates to the login page  
 
 @login  @validcredentials    @smoke   @dev
 Scenario Outline: Login with valid credentials
 When User enters the valid email address <email>
	 And Valid password <psassword>
 And Clicks on login button
 Then User should get logged in successfully
 Examples:
    | email         | password |
    | ak@sample.com | Ak@1234# |
    | bk@sample.com | Bk@1234# |
    | ck@sample.com | Ck@1234# |

 @login   @invalidcredentials @smoke 
 Scenario: Login with invalid credentials 
 When User enters the invalid email address "amatooricap@gmail.com"
 And Invalid Password "1234"
 And Clicks on login button
 Then User should not get logged in 
 And User should get warning message
 
 @login  @invalidemailaddress @smoke   @regression @wip
 Scenario: Login with invalid email address and valid password
 When User enters the invalid email address "amatooricap@gmail.com"
 And Valid password1 "Ak@1234#"
 And Clicks on login button
 Then User should not get logged in 
 And User should get warning message
 
 @login   @validemailaddressandinvalidpassword  @smoke
 Scenario: Login with valid email address and invalid password
 When User enters the valid email1 address "ak@sample.com "
 And Invalid Password "12345"
 And Clicks on login button
 Then User should not get logged in
 And User should get warning message 
  
  @login  @withoutprovidinganycredentials  @regression @ignore
 Scenario: Login without providing any credentials
 When User does not enter the email address
 And User does not enter the password
 And Clicks on login button
 Then User should not get logged in 
 And User should get warning message