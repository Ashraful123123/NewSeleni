Feature: Dell Solution option drop down validation
  
  In order to validate the Solution drop down option

  @action
  Scenario: 
    Given user visit dell homepage
    When user go to Solution dropdown menu and able to see view all solution
    When use click on retail
    Then user should redirect to Solution portfolio
