Feature: To validate the Facebook application access login functionality for multiple users

Scenario: To validate Login using invalid username and invalid password

Given User is in facebook login page 

When User enter invalid username and invalid password

And User clicks the login button

Then User should be in a invalid credintial page

