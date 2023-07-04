Feature: GET User Transactions

  @Test @PositiveCase @GetTransaction
  Scenario Outline: Get mentor transactions with valid parameter page
    Given User login mentor normal account
    And Get mentor transactions with valid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then API response should return 200 OK status code
    Examples:
      | page | limit |
      | 1    | 9     |
      | 2    | 2     |

  @Test @NegativeCase @GetTransaction
  Scenario Outline: Get mentor transactions with invalid parameter page
    Given User login mentor normal account
    And Get mentor transactions with invalid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | page | limit |
      | dua  | 2     |
      | 1    | enam  |

  @Test @NegativeCase @GetTransaction
  Scenario: Get mentor transactions with blank parameter page
    Given User login mentor normal account
    And Get mentor transactions with blank parameter page "" ""
    When Send GET request for mentor transactions
    Then API response should return 200 OK status code

  @Test @PositiveCase @GetTransaction
  Scenario Outline: Get student transactions with valid parameter page
    Given User login student normal account
    And Get student transactions with valid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then API response should return 200 OK status code
    Examples:
      | page | limit |
      | 1    | 9     |
      | 2    | 2     |

  @Test @NegativeCase @GetTransaction
  Scenario Outline: Get student transactions with invalid parameter page
    Given User login student normal account
    And Get student transactions with invalid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema
    Examples:
      | page | limit |
      | dua  | 2     |
      | 1    | enam  |

  @Test @NegativeCase @GetTransaction
  Scenario: Get student transactions with blank parameter page
    Given User login student normal account
    And Get student transactions with blank parameter page "" ""
    When Send GET request for mentor transactions
    Then API response should return 200 OK status code