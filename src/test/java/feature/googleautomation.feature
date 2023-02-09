Feature: Validation of google page
         Enter valid keyword and search
  
 Background: 
  Given open chrome and go to google
   
 @regression
  Scenario: google search validation
    When enter valid keyword
    Then click search or enter
  
@regression
  Scenario: Click images 
  When  go to Apps
  Then click Apps
  
  
     
