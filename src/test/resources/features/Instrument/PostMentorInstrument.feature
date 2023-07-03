Feature: Post Mentor Instrument
  @Test @PositiveCase @PostMentorInstrument
  Scenario: Post mentor instrument with valid request body
    Given User login mentor normal account
    And Post mentor instrument with valid request body
    When Send POST request for mentor instrument
    Then API response should return 201 Created status code
    And Validate response body for message should be "success add mentor instrument"
    And Validate Message JSON Schema

  @Test @NegativeCase @PostMentorInstrument
  Scenario: Post mentor instrument with invalid request body
    Given User login mentor normal account
    And Post mentor instrument with invalid request body
    When Send POST request for mentor instrument
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostMentorInstrument
  Scenario: Post mentor instrument with exceed request body instrumentId
    Given User login mentor normal account
    And Post mentor instrument with exceed request body instrumentId
    When Send POST request for mentor instrument
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema