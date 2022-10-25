@tag
Feature: Login
  I want to use this template for my feature file

  #@tag1
  #Scenario: Sucessfull Login
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes


	Background:
	Given I land on Login Page 

  @tag2
  Scenario Outline: Login with valid email <email> and password <password>
    Given I enter <email> and <password>
    When I click to log in
    Then I log in Successfully.

    Examples: 
      | email                   | password
      | arturdoalves@gmail.com  | Sapo78978!   
      | arturdoalves@gmail.com  | Sapo789789!     
    
