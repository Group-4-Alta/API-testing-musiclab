Feature: GET Classes by Mentor ID

  @Test @PositiveCase @GetClasses
  Scenario Outline: Get classes with valid parameter page
    Given User login mentor normal account
    And Get classes with valid parameter page <id> <page> <limit>
    When Send GET request for classes
    Then API response should return 200 OK status code
    Examples:
      | id | page | limit |
      | 2  | 1    | 9     |
      | 7  | 2    | 2     |

  @Test @NegativeCase @GetClasses
  Scenario Outline: Get classes with invalid parameter page
    Given User login mentor normal account
    And Get classes with invalid parameter page <id> <page> <limit>
    When Send GET request for classes
    Then API response should return 400 Bad Request status code
    Examples:
      | id   | page | limit |
      | satu | 1    | 3     |
      | 7    | dua  | 2     |
      | 2    | 1    | enam  |

  @Test @NegativeCase @GetClasses
  Scenario: Get classes with blank parameter page
    Given User login mentor normal account
    And Get classes with blank parameter page "" "" ""
    When Send GET request for classes
    Then API response should return 400 Bad Request status code