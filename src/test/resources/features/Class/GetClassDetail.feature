Feature: GET Mentor Class Detail

  @Test @PositiveCase @GetClassDetail
  Scenario Outline: Get a mentor class detail with valid parameter page
    Given User login mentor normal account
    And Get a mentor class with valid parameter page <id>
    When Send GET request for mentor class
    Then API response should return 200 OK status code
    And Validate response body id should be id <id>
    Examples:
      | id |
      | 1  |
      | 9  |

  @Test @NegativeCase @GetClassDetail
  Scenario Outline: Get a mentor class detail with invalid parameter page
    Given User login mentor normal account
    And Get a mentor class with invalid parameter page <id>
    When Send GET request for mentor class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | id  |
      | dua |
      | @   |

  @Test @NegativeCase @GetClassDetail
  Scenario: Get a mentor class detail with blank parameter page
    Given User login mentor normal account
    And Get a mentor class with blank parameter page ""
    When Send GET request for mentor class
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema