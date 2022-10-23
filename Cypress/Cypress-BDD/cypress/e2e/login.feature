Feature: Login to Application

    as a valid useri want to log in into Application

    Scenario: valid scenario
        Given I open login page
        And I want to wait 2000 milliseconds
        # When I submit login
        When I fill username with "papydipupi"
        And I fill password with "papydipupi"
        Then I should see logout button



    Scenario: Invalid scenario
        Given I open login page
        # When I submit login
        When I fill username with "papydipupi"
        And I fill password with "papydipupi"
        Then I should see logout button
