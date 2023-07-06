Feature: POST Login User

  @Test @PositiveCase @Login
  Scenario: Post login student with valid and complete JSON body
    Given Post login student with valid and complete JSON body
    When Send POST request for login
    Then API response should return 200 OK status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login student with invalid data
    Given Post login student with invalid data
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login student with incomplete JSON body
    Given Post login student with incomplete JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login student with invalid JSON body
    Given Post login student with invalid JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login student with blank JSON body
    Given Post login student with blank JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login student with invalid parameter page
    Given Post login student with invalid parameter page
    When Send POST request for login invalid
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema

  @Test @PositiveCase @Login
  Scenario: Post login mentor with valid and complete JSON body
    Given Post login mentor with valid and complete JSON body
    When Send POST request for login
    Then API response should return 200 OK status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login mentor with invalid data
    Given Post login mentor with invalid data
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login mentor with incomplete JSON body
    Given Post login mentor with incomplete JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login mentor with invalid JSON body
    Given Post login mentor with invalid JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login mentor with blank JSON body
    Given Post login mentor with blank JSON body
    When Send POST request for login
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @Login
  Scenario: Post login mentor with invalid parameter page
    Given Post login mentor with invalid parameter page
    When Send POST request for login invalid
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema