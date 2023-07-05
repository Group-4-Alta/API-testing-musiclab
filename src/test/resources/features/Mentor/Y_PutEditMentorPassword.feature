Feature: Put edit mentor password
  @TestingMentor
  Scenario: Put edit mentor password with invalid request body
    Given User login mentor normal account
    And Put edit mentor password with invalid request body
    When Send PUT request for edit mentor password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @TestingMentor
    Scenario: Put edit mentor password with empty old password
    Given User login mentor normal account
    And Put edit mentor password with empty old password
    When Send PUT request for edit mentor password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Put edit mentor password with empty confirmation password
    Given User login mentor normal account
    And Put edit mentor password with empty confirmation password
    When Send PUT request for edit mentor password
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Put edit mentor password with valid request body
    Given User login mentor normal account
    And Put edit mentor password with valid request body
    When Send PUT request for edit mentor password with valid request body
    Then API response should return 200 OK status code
    And Validate Message JSON Schema