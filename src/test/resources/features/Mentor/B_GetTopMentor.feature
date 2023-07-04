Feature: Get top mentor by rating
  @TestingMentor
  Scenario: Get all mentor by rating with valid path
    Given User login mentor normal account
    And Get Top mentor by rating per weeks with valid path "topweek"
    When Send GET request for top rating mentors with valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all mentor"
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Get top mentor by rating with invalid path
    Given User login mentor normal account
    And Get Top mentor by rating per weeks with invalid path "topwek"
    When Send GET request for top rating mentors with invalid path
    Then API response should return 400 Bad Request status code