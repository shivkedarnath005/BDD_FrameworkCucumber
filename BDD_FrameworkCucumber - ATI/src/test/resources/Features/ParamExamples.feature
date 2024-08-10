
Feature: Test the login functionality of OrangeHRM

Scenario Outilne: Test the valid login

Given user is on the login page
When user enters <username> and <password>
And click on the login button
Then user should land on home page

Examples:
| username | password |
| Admin    | admin123 |
| admin    | admin1234|


