Feature:  AddItemToCart
  Scenario Outline: As a user, I need to add an Item to cart on Sauce Demo website and verify that i have added Item successfully
    Given I am on the desired webpage
    And I enter the correct username <Username>
    And I enter the correct password <Password>
    When I click the Login Button
    And Products page is Displayed
    When I click the Add To Cart Button
    Then The selected item is added to cart

    Examples:
      | Username               | Password         |
      | standard_user           | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |

