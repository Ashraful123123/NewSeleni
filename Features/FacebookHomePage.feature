Feature: Facebook Home page Validation

  Scenario: Validate Facebook Homepage		
    Given User Visits Facebook Homepage   //We can not change anything after execution,
    Then User Should see Facebook Newsfeed //beacuse our Automation structure is already created
    																			// if we change anything then our automation structure will not going to work//
