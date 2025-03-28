@Search @all
Feature: Search functionality

Background: 
Given User opens the application

@login  @availableproduct    @smoke    @regression
Scenario: Search for an available product
When Enter an available product in search field
And Clicked on search button
Then Available product should get displayed in search results

@login  @notavailableproduct    @smoke
Scenario: Search for a not available product
When Enter a not available product in search field
And  Clicked on search button
Then Product should not displayed in search results
And Should displays a There is no product that matches the search criteria message
 
@login  @withoutenteringanyproduct  @regression
Scenario: Search without entering any product
When Not Enter any product in search field
And  Clicked on search button
Then Product should not displayed in search results
And Should displays a There is no product that matches the search criteria message