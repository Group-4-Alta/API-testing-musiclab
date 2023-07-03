Feature: Get All Genres
  @Test @PositiveCase @GetAllGenres
  Scenario: Get all genres list with valid path
    Given User login mentor normal account
    And Get all genres list with valid path "genres"
    When Send GET request for all genres valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all genres"
    And Validate get all genres JSON Schema

  @Test @NegativeCase @GetAllGenres
  Scenario: Get all genres list with wrong path
    Given User login mentor normal account
    And Get all genres list with wrong path "genresszzz"
    When Send GET request for all genres wrong path
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema