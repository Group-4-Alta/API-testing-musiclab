Feature: Get All Instruments by Mentor Id
  @Test @PositiveCase @GetAllInstrumentByMentorId
  Scenario: Get all instruments with valid parameter mentorId
    Given User login mentor normal account
    And Get all instruments with valid parameter mentorId 2
    When Send GET request for all instruments
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all instruments"
    And Validate get all instruments JSON Schema

  @Test @NegativeCase @GetAllInstrumentByMentorId
  Scenario: Get all instruments with invalid parameter mentorId
    Given User login mentor normal account
    And Get all instruments with invalid parameter mentorId "dua"
    When Send GET request for all instruments
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @GetAllInstrumentByMentorId
  Scenario: Get all instruments with exceed parameter mentorId
    Given User login mentor normal account
    And Get all instruments with exceed parameter mentorId 300
    When Send GET request for all instruments
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema