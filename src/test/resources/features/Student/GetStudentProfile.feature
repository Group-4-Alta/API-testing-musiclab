Feature: Get Student Profile
  @Test @PositiveCase @GetStudentProfile
  Scenario: Get show student profile with valid path
    Given User login student normal account
    And Get show student profile with valid path "profile"
    When Send GET request for show student profile valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show student profile"
    And Validate get student profile JSON Schema

  @Test @NegativeCase @GetStudentProfile
  Scenario: Get show student profile with wrong path
    Given User login student normal account
    And Get show student profile with wrong path "profileee"
    When Send GET request for show student profile invalid path
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema