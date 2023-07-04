Feature: Put edit mentor profile
  @TestingMentor
  Scenario: Put edit mentor profile with valid body request
    Given User login mentor trial account
    And Put edit mentor profile with valid body request
    When Send PUT request for edit mentor profile
    Then API response should return 200 OK status code
    And Validate response body for message should be "success update mentor profile"
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Put edit mentor profile with invalid body request
    Given User login mentor trial account
    And Put edit mentor profile with invalid body request
    When Send PUT request for edit mentor profile
    Then API response should return 400 Bad Request status code

  @TestingMentor
    Scenario: Put edit mentor profile with invalid path
    Given User login mentor trial account
    And Put edit mentor profile with invalid path
    When Send PUT request for edit mentor profile with invalid path
    Then API response should return 404 Not Found status code
