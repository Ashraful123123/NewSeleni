@UserLogsIn
Feature: validate shopping cart option
  
  In order to login user enters username and password \\Line no 4,5,6 this are the acceptance criteria
  As a registered user                                 \\we don't have worry about this line
  I want to login into my account                      \\Product owner will give us the acceptance criteria
@log_in_neg
  Scenario Outline: Positive                  \\Scenario is my part,My concern part\\
    Given the user in the homepage
    When the user click on a product and click on add to cart
    And click add to cart
    And click update
    Then user will find the product in shopping cart
      #| E-MailAddress | password | 		For Negative scenario i am just going comment out line by line.
     #| pat@yahoo.com  | Abc123   | 		My test case will be one but there will be multiple test daata line
     # | pat@yahoo.com | Abc123   | 		I am just going to call by the tags in testrunnerclass.
     
     
     #Here I will Have One negative test scenario and inside that 
     #I will multiple line of test data
     #I am not going to right multiple negative test case.
     #One negative scenario and multiple testdata
     #I will comment out that line of data which I don't want to be executed
     