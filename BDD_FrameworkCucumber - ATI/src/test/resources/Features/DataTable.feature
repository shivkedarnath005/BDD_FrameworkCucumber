
Feature: Test the login functionality of OrangeHRM using DataTable

Scenario: Test the valid login using DataTable

Given user is on the login page
When user enters login credenials using DataTable
| Admin | admin123 |
And click on the login button
Then user should land on home page




