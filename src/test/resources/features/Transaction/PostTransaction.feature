Feature: POST Make a Transaction

  @Test @PositiveCase @PostTransaction
  Scenario: Post a transaction with valid and complete JSON body
    Given User login student trial account
    And Post a transaction with valid and complete JSON body
    When Send POST request for transactions
    Then API response should return 201 Created status code
    And Validate Transaction Message JSON Schema

  @Test @NegativeCase @PostTransaction
  Scenario: Post a transaction with incomplete JSON body
    Given User login student trial account
    And Post a transaction with incomplete JSON body
    When Send POST request for transactions
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostTransaction
  Scenario: Post a transaction with invalid JSON body
    Given User login student trial account
    And Post a transaction with invalid JSON body
    When Send POST request for transactions
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostTransaction
  Scenario: Post a transaction with blank JSON body
    Given User login student trial account
    And Post a transaction with blank JSON body
    When Send POST request for transactions
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostTransaction
  Scenario: Post a transaction with invalid parameter page
    Given User login student trial account
    And Post a transaction with invalid parameter page
    When Send POST request for transactions invalid
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema