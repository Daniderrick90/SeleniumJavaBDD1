Feature: Create an account functionality of LUMA Application

Background:
Given i open the browser
And i load the 'https://www.demoblaze.com/index.html'


Scenario Outline: Verify Create New Customer Account page is loaded successfully
And i click on Sign Up button - xpath '//*[@id="signin2"]'
And i enter User name <Username>
And i enter Password <Password>
And i click on sign up button - xpath '//*[@id="signInModal"]/div/div/div[3]/button[2]'
Then user should be signed up successfully

Examples:
|Username|Password|
|dani52|pass52|
|dani53|pass53|
|dani54|pass54|
|dani55|pass55|
|dani56|pass56|

#Scenario: Verify user is able to login to the application successfully
#And i click on login button - xpath '//*[@id="login2"]'
#And i enter User name 'dani19' - xpath '//*[@id="loginusername"]'
#And i enter Password 'dani19' - xpath '//*[@id="loginpassword"]'
#And i click on login button - xpath '//*[@id="logInModal"]/div/div/div[3]/button[2]'
#Then user should be logged in successfully
