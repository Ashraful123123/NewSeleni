Feature: Facebook sign up validation now

  @select3
  Scenario Outline: 
    Given user visits facebook home
    When user click on Create New Account
    When user gives first name"<first name>"and last name"<last name>"and valid email address"<email address>" and reType email address"<email address>" and new password"<new password>"
    Then user should selects dropdown moth month and dropdown day and dropdown year
    Then user click on male
    Then user click on signup button

    Examples: 
      | first name | last name | email address | email address | new password | month | day | year |
      | ami        | achi      | abc@gmail.com | abc@gmail.com |      1234567 |       |     |      |
