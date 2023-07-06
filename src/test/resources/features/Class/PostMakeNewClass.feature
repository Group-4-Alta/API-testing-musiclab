Feature: POST Make a New Class

  @Test @PositiveCase @MakeClass
  Scenario: Post a class with valid and complete JSON body
    Given User login mentor normal account
    And Post class with valid and complete JSON body
    When Send POST request for class
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @MakeClass
  Scenario: Post a class with incomplete JSON body
    Given User login mentor normal account
    And Post class with incomplete JSON body
    When Send POST request for class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @MakeClass
  Scenario: Post a class with invalid JSON body
    Given User login mentor normal account
    And Post class with invalid JSON body
    When Send POST request for class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @MakeClass
  Scenario: Post a class with blank JSON body
    Given User login mentor normal account
    And Post class with blank JSON body
    When Send POST request for class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @MakeClass
  Scenario: Post a class with invalid parameter page
    Given User login mentor normal account
    And Post class with invalid parameter page
    When Send POST request for class invalid
    Then API response should return 405 Method Not Allowed status code
    And Validate Message JSON Schema