Feature: Delete a Schedule

  @Test @PositiveCase @DeleteSchedule
  Scenario: Delete a schedule with valid parameter page
    Given User login mentor trial account
    And Delete a schedule with valid parameter page 50
    When Send DELETE request for a schedule
    Then API response should return 200 OK status code
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteSchedule
  Scenario Outline: Delete a schedule with invalid parameter page
    Given User login mentor trial account
    And Delete a schedule with invalid parameter page <id>
    When Send DELETE request for a schedule
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | id  |
      | dua |
      | @   |

  @Test @NegativeCase @DeleteSchedule
  Scenario: Delete a schedule with blank parameter page
    Given User login mentor trial account
    And Delete a schedule with blank parameter page ""
    When Send DELETE request for a schedule
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema