Feature: Get All Genres by Mentor Id
  @Test @PositiveCase @GetAllGenreByMentorId
  Scenario: Get all genre with valid parameter mentorId
    Given User login mentor normal account
    And Get all genres with valid parameter mentorId 2
    When Send GET request for all genres
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all genres"
    And Validate get all genres by mentorId JSON Schema

  @Test @NegativeCase @GetAllGenreByMentorId
  Scenario: Get all genre with invalid parameter mentorId
    Given User login mentor normal account
    And Get all genres with invalid parameter mentorId "dua"
    When Send GET request for all genres
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @GetAllGenreByMentorId
  Scenario: Get all genre with exceed parameter mentorId
    Given User login mentor normal account
    And Get all genres with exceed parameter mentorId 300
    When Send GET request for all genres
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema