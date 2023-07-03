Feature: Post Mentor Genres
  @Test @PositiveCase @PostMentorGenre
  Scenario: Post mentor genre with valid request body
    Given User login mentor normal account
    And Post mentor genre with valid request body
    When Send POST request for mentor genre
    Then API response should return 201 Created status code
    And Validate response body for message should be "success add mentor genre"
    And Validate Message JSON Schema

  @Test @NegativeCase @PostMentorGenre
  Scenario: Post mentor genre with invalid request body
    Given User login mentor normal account
    And Post mentor genre with invalid request body
    When Send POST request for mentor genre
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @PostMentorGenre
  Scenario: Post mentor genre with exceed request body genreId
    Given User login mentor normal account
    And Post mentor genre with exceed request body genreId
    When Send POST request for mentor genre
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema