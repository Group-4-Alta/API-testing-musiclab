Feature: DELETE a Class

  @Test @PositiveCase @DeleteClass
  Scenario: Delete a class with valid parameter page
    Given User login mentor normal account
    And Delete a class with valid parameter page 65
    When Send DELETE request for a class
    Then API response should return 200 OK status code
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteClass
  Scenario Outline: Delete a class with invalid parameter page
    Given User login mentor normal account
    And Delete a class with invalid parameter page <id>
    When Send DELETE request for a class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | id  |
      | dua |
      | @   |

  @Test @NegativeCase @DeleteClass
  Scenario: Delete a class with blank parameter page
    Given User login mentor normal account
    And Delete a class with blank parameter page ""
    When Send DELETE request for a class
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema