Feature: Application Login
  I want to use this template for my feature file

  Background: 
    Given browser chosen is chrome
    When the broser triggers
    Then browser tag is chrome browser

  @SmokeTest
  Scenario Outline: bad login test
    Given user on landing <status>
    And some other precondition
    When user login with <name> and <value>
    Then invalid login data

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      | name3 |     7 | success |
      | name4 |     7 | Fail    |
      | name5 |     7 | Fail    |

  @RegTest
  Scenario: Log out
    Given user on landing page
    And some other precondition
    When user logged in with dataaa
      | zzezeze | sdadswa |
    Then invalid login data
