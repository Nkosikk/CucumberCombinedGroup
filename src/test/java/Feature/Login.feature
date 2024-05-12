Feature: Login action

  Scenario Outline: As a User I want to login page
    Given I am on Login page
    And I enter the username <user_name>
    And I enter th password <pass>
    When I click on the login button
    Then  The home page is displayed
    Examples:
      | user_name               | pass         |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |