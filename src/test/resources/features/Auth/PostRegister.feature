Feature: POST Register User

  @Test @PositiveCase @Register
  Scenario: Post register student with valid and complete JSON body
    Given Post register student with valid and complete JSON body
    When Send POST request for register
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario:  Post register student with invalid data
    Given Post register student with invalid data
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario:  Post register student with incomplete JSON body
    Given Post register student with incomplete JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register student with invalid JSON body
    Given Post register student with invalid JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register student with blank JSON body
    Given Post register student with blank JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register student with invalid parameter page
    Given Post register student with invalid parameter page
    When Send POST request for register invalid
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema

  @Test @PositiveCase @Register
  Scenario: Post register mentor with valid and complete JSON body
    Given Post register mentor with valid and complete JSON body
    When Send POST request for register
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register mentor with invalid data
    Given Post register mentor with invalid data
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register mentor with incomplete JSON body
    Given Post register mentor with incomplete JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register mentor with invalid JSON body
    Given Post register mentor with invalid JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register mentor with blank JSON body
    Given Post register mentor with blank JSON body
    When Send POST request for register
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Register
  Scenario: Post register mentor with invalid parameter page
    Given Post register mentor with invalid parameter page
    When Send POST request for register invalid
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema