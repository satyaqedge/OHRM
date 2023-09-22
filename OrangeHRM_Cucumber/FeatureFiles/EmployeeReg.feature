@tag
Feature: Employee Registration Test
  I want to use this template to check new employee registration 

  @tag1
  Scenario: Check New Employee Registration With Valid Data
   Given i open browser with the url "http://orangehrm.qedgetech.com"
   Then i should see login page
   When i entered username as "Admin"
   And i entered password as "Qedge123!@#"
   And i click login button
   Then i should see admin module
   When i go to add employee page
   And i enter firstname as "Satya"
   And i enter lastname as "Mohapatra"
   And i click save
   Then i Should see Registered Employee in employee list
   When i click logout
   And i close browser
   
   
   

 
