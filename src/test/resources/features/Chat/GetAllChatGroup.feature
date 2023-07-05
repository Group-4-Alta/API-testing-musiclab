Feature: Get all chat group by student
  @ChatTesting
  Scenario: Get all chat group by student with valid parameter
    Given User login mentor normal account
    And Get all chat group by student with valid parameter page 1, limit 5
    When Send GET request for all chat group by student
    Then API response should return 200 OK status code
    And Validate get all chat group JSON Schema

  @ChatTesting
  Scenario: Get all chat group by student with invalid parameter
    Given User login mentor normal account
    And Get all chat group by student with valid parameter page "satu", limit "lima"
    When Send GET request for all chat group by student with invalid parameter
    Then API response should return 400 Bad Request status code

