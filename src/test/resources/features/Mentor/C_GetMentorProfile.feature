Feature: Get mentor profile
  @Test @PositiveCase @GetMentorProfile
  Scenario: Get mentor profile with valid path
    Given User login mentor normal account
    And Get profile mentor with valid path "profile"
    When Send GET request for profile mentor with valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show mentor profile"
    And Validate Message JSON Schema

  @Test @NegativeCase @GetMentorProfile
  Scenario: Get mentor profile with invalid path
    Given User login mentor normal account
    And Get profile mentor with invalid path "profilezzz"
    When Send GET request for profile mentor with invalid path
    Then API response should return 400 Bad Request status code