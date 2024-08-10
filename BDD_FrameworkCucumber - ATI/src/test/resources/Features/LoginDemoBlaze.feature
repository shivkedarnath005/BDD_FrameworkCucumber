
@loginfeature
Feature: Login Feature

@loginlinkvalidation
Scenario: Login with correct credential
  Given user open the demoblaze home page
  And  click on the "<linkName>" window link
  When user enter the user name in the username textbox
  And user enter the password in the password textbox
  And click on login button
  Then home page should open
  
Examples:
|linkName|
|Log in|
    
