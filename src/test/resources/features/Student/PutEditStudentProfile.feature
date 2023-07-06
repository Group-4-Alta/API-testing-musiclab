Feature: Put Edit Student Profile
  @Test @PositiveCase @PutEditStudentProfile
  Scenario: Put edit student profile with valid request body
    Given User login student normal account
    And Put edit student profile with valid request body
    When Send PUT request for edit student profile
    Then API response should return 200 OK status code
    And Validate response body for message should be "success update student profile"
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentProfile
  Scenario: Put edit student profile with invalid request body
    Given User login student normal account
    And Put edit student profile with invalid request body
    When Send PUT request for edit student profile
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentProfile
  Scenario: Put edit student profile with empty name on request body
    Given User login student normal account
    And Put edit student profile with empty name on request body
    When Send PUT request for edit student profile
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentProfile
  Scenario: Put edit student profile for only request body address with valid request body
    Given User login student normal account
    And Put edit student profile for only request body address with valid request body
    When Send PUT request for edit student profile
    Then API response should return 200 OK status code

  @Test @NegativeCase @PutEditStudentProfile
  Scenario: Put edit student profile with empty request body
    Given User login student normal account
    And Put edit student profile with empty request body
    When Send PUT request for edit student profile
    Then API response should return 400 Bad Request status code