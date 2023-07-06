Feature: PUT Edit a Class

  @Test @PositiveCase @PutEditClass
  Scenario: Put edit a class with valid and complete data
    Given User login mentor normal account
    And Put edit a class with valid and complete data 71
    When Send PUT request for edit a class
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditClass
  Scenario Outline: Put edit a class with invalid parameter page
    Given User login mentor normal account
    And Put edit a class with invalid parameter page <id>
    When Send PUT request for edit a class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | id  |
      | dua |
      | @   |

  @Test @NegativeCase @PutEditClass
  Scenario: Put edit a class with blank parameter page
    Given User login mentor normal account
    And Put edit a class with blank parameter page ""
    When Send PUT request for edit a class
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditClass
  Scenario: Put edit a class with incomplete JSON body
    Given User login mentor normal account
    And Put edit a class with incomplete JSON body 71
    When Send PUT request for edit a class
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditClass
  Scenario: Put edit a class with invalid JSON body
    Given User login mentor normal account
    And Put edit a class with invalid JSON body 71
    When Send PUT request for edit a class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PutEditClass
  Scenario: Put edit a class with blank JSON body
    Given User login mentor normal account
    And Put edit a class with blank JSON body 71
    When Send PUT request for edit a class
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema