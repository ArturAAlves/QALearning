Feature: Login to Application

    as a valid useri want to log in into Application

    Scenario: valid then
        Given I open login page
        When I submit login
        Then I should see logout button
