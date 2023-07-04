Feature: POST a Mentor Schedule

  @Test @PositiveCase @PostSchedule
  Scenario: Post a schedule with valid and complete JSON body
    Given User login mentor trial account
    And Post a schedule with valid and complete JSON body
    When Send POST request for schedules
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostSchedule
  Scenario: Post a schedule with incomplete JSON body
    Given User login mentor trial account
    And Post a schedule with incomplete JSON body
    When Send POST request for schedules
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostSchedule
  Scenario: Post a schedule with invalid JSON body
    Given User login mentor trial account
    And Post a schedule with invalid JSON body
    When Send POST request for schedules
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostSchedule
  Scenario: Post a schedule with blank JSON body
    Given User login mentor trial account
    And Post a schedule with blank JSON body
    When Send POST request for schedules
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostSchedule
  Scenario: Post a schedule with invalid parameter page
    Given User login mentor trial account
    And Post a schedule with invalid parameter page
    When Send POST request for schedules invalid
    Then API response should return 405 Method Not Allowed status code
    And Validate Message JSON Schema