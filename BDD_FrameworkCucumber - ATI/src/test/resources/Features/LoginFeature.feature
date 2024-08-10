
Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid login

Given user is on the login page
When user enters "Admin" and "admin123"
And click on the login button
Then user should land on home page


Scenario: Test the valid login1

Given user is on the login page
When user enters "Admin" and "admin123"
And click on the login button
Then user should land on home page