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