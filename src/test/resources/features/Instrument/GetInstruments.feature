Feature: Get All Instruments
  @Test @PositiveCase @GetAllInstrument
  Scenario: Get all instruments list with valid path
    Given User login mentor normal account
    And Get all instruments list with valid path "instruments"
    When Send GET request for all instruments valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all instruments"
    And Validate get all instruments JSON Schema

  @Test @NegativeCase @GetAllInstrument
  Scenario: Get all instruments list with wrong path
    Given User login mentor normal account
    And Get all instruments list with wrong path "instrumentszzz"
    When Send GET request for all instruments wrong path
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema