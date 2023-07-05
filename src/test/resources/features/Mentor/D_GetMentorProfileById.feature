Feature: Get mentor profile by id mentor
  @TestingMentor
  Scenario: Get mentor profile by id mentor with available id parameter
    Given User login mentor normal account
    And Get mentor profile by id mentor with available id parameter 2
    When Send GET request with available id mentor
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show mentor profile"
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Get mentor mentor by id mentor with exceed id parameter
    Given User login student normal account
    And mentor profile by id mentor with unavailable id parameter 50
    When Send GET request with unavailable id mentor
    Then API response should return 404 Not Found status code