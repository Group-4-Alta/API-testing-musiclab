Feature: Post mentor Credential
  @TestingMentor
  Scenario: Post mentor credential with valid request body
    Given User login mentor trial account
    And Post mentor credential with valid body request
    When Send POST request for mentor credential
    Then API response should return 200 OK status code
    And Validate response body for message should be "success add mentor credential"
    And Validate Message JSON Schema

  @TestingMentor
  Scenario: Post mentor credential with invalid request body
    Given User login mentor trial account
    And Post mentor credetial with invalid body request
    When Send POST request for mentor credential
    Then API response should return 400 Bad Request status code
    And Validate Message JSON Schema