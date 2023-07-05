Feature: GET a Mentor Schedule

  @Test @PositiveCase @GetSchedule
  Scenario Outline: Get a mentor schedule with valid parameter page
    Given User login mentor trial account
    And Get a schedule with valid parameter page <id>
    When Send GET request for mentor schedules
    Then API response should return 200 OK status code
    Examples:
      | id |
      | 2  |
      | 5  |

  @Test @NegativeCase @GetSchedule
  Scenario Outline: Get a mentor schedule with invalid parameter page
    Given User login mentor trial account
    And Get a schedule with invalid parameter page <id>
    When Send GET request for mentor schedules
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | id  |
      | dua |
      | @   |

  @Test @NegativeCase @GetSchedule
  Scenario: Get a mentor schedule with blank parameter page
    Given User login mentor trial account
    And Get a schedule with blank parameter page ""
    When Send GET request for mentor schedules
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema