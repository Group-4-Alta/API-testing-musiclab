Feature: Make a review in mentor class
  @ReviewTesting
  Scenario: Post make a review in mentor class with valid request body
    Given User login student normal account
    And Post make a review in mentor 2 class with valid request body
    When Send POST request for make a review in mentor class with valid request body
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @ReviewTesting
  Scenario: Post make a review in mentor class with invalid request body
    Given User login student normal account
    And Post make a review in mentor 2 class with invalid request body
    When Send POST request for make a review in mentor class with invalid request body
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema