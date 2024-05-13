Feature: Login

  Scenario Outline: As a user i want to login and verify that i am logged in successfully
    Given I am on Login page
    And I enter the username <user_name>
    And I enter password <pass>
    When I click login button
    Then The home page is displayed
    Examples:
      | user_name               | pass         |
      | standard_user           | secret_sauce |
   #   | problem_user            | secret_sauce |
   #   | performance_glitch_user | secret_sauce |

#    Scenario: As a user, i want to Login using invalid username and password and verify if the error message displayed
#      Given I am at the Login page
#      And I enter incorrect username <Username>
#      And I enter incorrect password <Password>
#      When I click the Login-Button
#      Then I should see an error message displayed
#



