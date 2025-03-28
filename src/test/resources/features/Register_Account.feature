@Register_Account @all
Feature: User Account Registration Functionality

Users who dont have an account has to register account

 Background: 
 Given User navigates to Register Account Page

@login  @withManadatoryfields    @smoke    @regression
Scenario: Register only with Manadatory fields
When User enters the below details into the fields
|First Name|"Aryan"|
|Last Name|"Krishna"|
|Email|"kr.eem@gmail.com"|
|telephone|"9878907012"|
|password|"Aryan@1234"|
And  Checked_in the Privacy Policy check box
And  Clicked on Continute button
Then Account should get created successfully

@login  @withallfields    @smoke 
Scenario: Register with all fields
When User enters the below details into the fields
|First Name|"Aravind"|
|Last Name|"Krishnan"|
|Email|"aravind.krishan@gmail.com"|
|telephone|"9878907014"|
|password|"Aryan@1234"|
And  Click on the Yes Radio button to suscribe the Newsletter
And  Checked_in the Privacy Policy check box
And  Clicked on Continute button
Then Account should get created successfully 

@login  @withoutEnteringanyfields   
Scenario: Register without Entering any fields
When User dont enther the details in any fields
And  Clicked on Continute button
Then Worning message should dispalped in the mandatory fiedls

@login  @withduplicateemailaddress @regression
Scenario: Register with duplicate email address
When User enters the below details into the fields
|First Name|"Anand"|
|Last Name|"Krishnav"|
|Email|"kr.eem@gmail.com"|
|telephone|"9878907012"|
|password|"Aryan@1234"|
And  Click on the Yes Radio button to suscribe the Newsletter
And  Checked_in the Privacy Policy check box
And  Clicked on Continute button
Then Account should not get created successfully 
And  Worning message to be displayed as Email address already existed 