Feature: POST Check a Mentor Schedule Availability

  @Test @PositiveCase @PostCheckSchedule
  Scenario: Post a mentor schedule with valid and complete JSON body
    Given User login mentor trial account
    And Post a mentor schedule with valid and complete JSON body
    When Send POST request for mentor schedule
    Then API response should return 200 OK status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostCheckSchedule
  Scenario: Post a mentor schedule with incomplete JSON body
    Given User login mentor trial account
    And Post a mentor schedule with incomplete JSON body
    When Send POST request for mentor schedule
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostCheckSchedule
  Scenario: Post a mentor schedule with invalid JSON body
    Given User login mentor trial account
    And Post a mentor schedule with invalid JSON body
    When Send POST request for mentor schedule
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostCheckSchedule
  Scenario: Post a mentor schedule with blank JSON body
    Given User login mentor trial account
    And Post a mentor schedule with blank JSON body
    When Send POST request for mentor schedule
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostCheckSchedule
  Scenario: Post a mentor schedule with invalid parameter page
    Given User login mentor trial account
    And Post a mentor schedule with invalid parameter page
    When Send POST request for mentor schedule invalid
    Then API response should return 405 Method Not Allowed status code
    And Validate Message JSON Schema