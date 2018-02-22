Feature: hookTest

Scenario Outline: hookTest
 

Given user navigates to Facebook

When I enter Username as "Tester" and Password as "Tester"

Then login should be unsuccessful
