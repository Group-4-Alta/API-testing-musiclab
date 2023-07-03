Feature: Put Edit Student Password
  @Test @PositiveCase @PutEditStudentPassword
  Scenario: Put edit student password with valid request body
    Given User login student normal account
    And Put edit student password with valid request body
    When Send PUT request for edit student password
    Then API response should return 200 OK status code
    And Validate response body for message should be "success update student password"
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentPassword
  Scenario: Put edit student password with invalid request body
    Given User login student normal account
    And Put edit student password with invalid request body
    When Send PUT request for edit student password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentPassword
  Scenario: Put edit student password with empty request body
    Given User login student normal account
    And Put edit student password with empty request body
    When Send PUT request for edit student password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentPassword
  Scenario: Put edit student password with empty new password on request body
    Given User login student normal account
    And Put edit student password with empty new password on request body
    When Send PUT request for edit student password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentPassword
  Scenario: Put edit student password with empty old password on request body
    Given User login student normal account
    And Put edit student password with empty old password on request body
    When Send PUT request for edit student password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditStudentPassword
  Scenario: Put edit student password with empty confirmation password on request body
    Given User login student normal account
    And Put edit student password with empty confirmation password on request body
    When Send PUT request for edit student password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema