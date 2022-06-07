@UserLogsIn
Feature: User wants to login into facebook

  In order to login user enters username and password \\Line no 4,5,6 this are the acceptance criteria
  As a registered user                                 \\we don't have worry about this line
  I want to login into my account                      \\Product owner will give us the acceptance criteria

  Scenario: Positive                  \\Scenario is my part.My concern part\\
    Given the user in the homepage
    When  the user click on a product
    And  click add to cart
    And  click update
    Then  user will find the product in shopping cart

      | E-MailAddress | password |
      | pat@yahoo.com | Abc123   |
