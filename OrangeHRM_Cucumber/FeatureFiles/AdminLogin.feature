@tag
Feature: Admin Login
  I want to use this template for Check Admin Login

  @tag1
  Scenario: Admin Login Test With Valid Data
   Given i open browser with the url "http://orangehrm.qedgetech.com"
   Then i should see login page
   When i entered username as "Admin"
   And i entered password as "Qedge123!@#"
   And i click login button
   Then i should see admin module
   When i click logout
   Then i should see login page
   When i close browser
   
   Scenario Outline: Check Admin Login With Invalid Data
   Given i open browser with the url "http://orangehrm.qedgetech.com"
   Then i should see login page
   When i entered username as "<username>"
   And i entered password as "<password>"
   And click login button
   Then i should see error message
   When i close browser	
   
   Examples:
   |username|password|
   |Admin|xyz|
   |abc|Qedge123!@|
   |abc|xyz|
   |abc|  |
   |   |xyz|
   |    |   |	
   
   