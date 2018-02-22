Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Background: 
   User navigates to Averex
   Given I am on Averex login page 
   
   
#Scenario with AND 
  Scenario: 
  When I enter username as "admin1"
  And I enter password as "123.Com!" 
  
  Then Login should fail 
  
#Scenario with BUT 
  Scenario: 
   When I enter username as "admin1"
   And I enter password as "123.Com!" 
   Then Login should fail 
   But Relogin option should be available