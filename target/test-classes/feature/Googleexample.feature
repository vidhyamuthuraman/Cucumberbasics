
Feature: Validation of google page
         Enter valid keyword and search
Scenario Outline: Validate google search is working
    Given browser window is open
    And Enter url
    When Google is opened
    Then search "<searchtext>" with google
    And click Enter
    Examples:
      | searchtext | 
      | google  | 
      |facebook | 
 			| tesla |

