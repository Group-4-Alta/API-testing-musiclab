Feature: Get mentor review
  @ReviewTesting
  Scenario: Get mentor review with available id mentor
    Given User login student normal account
    And Get mentor review with available id mentor 2
    When Send GET request for get mentor review
    Then API response should return 200 OK status code
    And Validate get mentor review JSON Schema

  @ReviewTesting
  Scenario: Get mentor review with unavailable id mentor
    Given User login student normal account
    And Get mentor review with exceed id mentor 100
    When Send GET request for get mentor review
    Then API response should return 404 Not Found status code