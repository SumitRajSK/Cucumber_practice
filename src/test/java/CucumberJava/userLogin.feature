Feature: stepdefinition

  Scenario: Login functionality 
    Given user navigates to averex
    When I enter Username as \"admin\" and Password as \"123.Com!\"
    Then login should be unsuccessful
