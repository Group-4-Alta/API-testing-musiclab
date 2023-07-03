Feature: Delete Mentor Genre by Genre Id
  @Test @PositiveCase @DeleteMentorGenre
  Scenario: Delete mentor genre with valid parameter genre_id
    Given User login mentor normal account
    And Delete mentor genre with valid parameter genreId 3
    When Send DELETE request for delete mentor genre
    Then API response should return 200 OK status code
    And Validate response body for message should be "success delete mentor genre"
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteMentorGenre
  Scenario: Delete mentor genre with invalid parameter genre_id
    Given User login mentor normal account
    And Delete mentor genre with invalid parameter genreId "dua"
    When Send DELETE request for delete mentor genre
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteMentorGenre
  Scenario: Delete mentor genre with exceed parameter genre_id
    Given User login mentor normal account
    And Delete mentor genre with exceed parameter genreId 50
    When Send DELETE request for delete mentor genre
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema