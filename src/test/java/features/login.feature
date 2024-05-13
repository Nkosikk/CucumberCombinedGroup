Feature: Login

  Scenario Outline: As a user i want to login and verify that i am logged in successfully
    Given I am on Login page
    And I enter the username <user_name>
    And I enter password <password>
    And I click login button
    Then I should see the text "Products"
    Examples:
      | user_name               | password         |
      | standard_user           | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |

