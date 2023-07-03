Feature: Delete Mentor Instrument by Instrument Id
  @Test @PositiveCase @DeleteMentorInstrument
  Scenario: Delete mentor instrument with valid parameter instrumentId
    Given User login mentor normal account
    And Delete mentor instrument with valid parameter instrumentId 3
    When Send DELETE request for delete mentor instrument
    Then API response should return 200 OK status code
    And Validate response body for message should be "success delete mentor instrument"
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteMentorInstrument
  Scenario: Delete mentor instrument with invalid parameter instrumentId
    Given User login mentor normal account
    And Delete mentor instrument with invalid parameter instrumentId "satu"
    When Send DELETE request for delete mentor instrument
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteMentorInstrument
  Scenario: Delete mentor instrument with exceed parameter instrumentId
    Given User login mentor normal account
    And Delete mentor instrument with exceed parameter instrumentId 55
    When Send DELETE request for delete mentor instrument
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema