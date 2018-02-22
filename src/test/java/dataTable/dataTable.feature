Feature: Data table

Background: 
Verify that the new user registration is unsuccessful after passing incorrect inputs.

Scenario:
Given I am on the new user registration page


When I enter invalid data on the page
| Fields                 | Values                |
| First Name             | Tester                |
| Last Name              | Raj                   |
| Email Address          | TesterRaj@yopmail.com |
| Password               | TesterRaj             |


Then the user registration should be unsuccessful