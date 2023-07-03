Feature: Get all mentor
  @Test @PositiveCase @GetAllMentors
  Scenario: Get all mentors with valid parameter 1
    Given User login mentor normal account
    And Get all mentors with valid page 1, limit 5, name "Nagita" parameter
    When Send GET request for all mentors path A
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all mentor"
    And Validate Message JSON Schema

  @Test @NegativeCase @GetAllMentors
  Scenario: Get all mentors with invalid parameter A
    Given User login mentor normal account
    And Get all mentors with invalid path, with page 1, limit 5, name "Nagita"
    When Send GET request for invalid path all mentors A
    Then API response should return 404 Not Found status code

  @Test @PositiveCase @GetAllMentors
  Scenario: Get all mentors with valid parameter B
    Given User login mentor normal account
    And Get all mentors with valid page 1, limit 5, instrument 2, genre 1 parameter
    When Send GET request for all mentors path B
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all mentor"
    And Validate Message JSON Schema

  @Test @NegativeCase @GetAllMentors
  Scenario: Get all mentors with valid parameter B
    Given User login mentor normal account
    And Get all mentors with invalid path, with page 1, limit 5, instrument 2, genre 1
    When Send GET request for invalid path all mentors B
    Then API response should return 404 Not Found status code

  @Test @PositiveCase @GetAllMentors
  Scenario: Get all mentors with valid parameter C
    Given User login mentor normal account
    And Get all mentors with valid rating 5, qualification "International"
    When Send GET request for all mentors path C
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all mentor"
    And Validate Message JSON Schema

  @Test @NegativeCase @GetAllMentors
  Scenario: Get all mentors with unavailable parameter C
    Given User login mentor normal account
    And Get all mentors with unavailable parameter, with rating 5, qualification "Regional"
    When Send GET request for unavailable parameter all mentors C
    Then API response should return 400 Bad Request status code

  @Test @NegativeCase @GetAllMentors
  Scenario: Get all mentors with empty parameter
    Given User login mentor normal account
    And Get all mentors with all parameter are empty
    When Send GET request for all mentors empty path
    Then API response should return 200 OK status code
    And Validate response body for message should be "success show all mentor"
    And Validate Message JSON Schema

