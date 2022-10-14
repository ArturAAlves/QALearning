#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Buy items

  Scenario: Add 3 items to cart , and click place order button in cart page sucessfully
    Given user is on GreenCart Landing page
    When user adds 3 "brocolli" by clicking + button, then clicks add to cart button
 		And user press cart icon and click proceed to checkout button
    Then user should be in the cart page, and should have a set of "3" "brocolli" 
    And should see Apply button and Place Order button displaying
    Then user will click Place Order button and move to choose country page

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
 