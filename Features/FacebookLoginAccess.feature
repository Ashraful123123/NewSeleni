Feature: Validate FAcebook login

Scenario Outline:
Given user visit facebook homepage
When user give email"<email>"
When user give password"<password>" 
Then user click on login button     

Examples:
|email	             |password|    
|ter1005             |TSO-0055|
|ter1006						 |TSO-0066|
|ter1007             |TSO-0077|
|ter1008             |TSO-0088|