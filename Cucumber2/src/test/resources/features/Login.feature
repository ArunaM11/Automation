Feature: To test login functionality
Scenario: To verify login with valid credentials

Given User opens browser
And User navigates to URL
When user enters username and password
And User clicks on login button
Then User navigates to homepage

@smoke
Scenario: To verify user action to send message
Given User navigates to messanger
And User selects recepient
When User types message
Then User should be able to click on send button