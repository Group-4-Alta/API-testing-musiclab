Feature: Get all chat by id student and id mentor
  @ChatTesting
  Scenario: Get all chat by id student and id mentor that available
    Given User login mentor normal account
    And Get all chat by id student 2 and id mentor 1 that available
    When Send GET request for all chat by id student and id mentor
    Then API response should return 200 OK status code
    And Validate get all chat by id student and id mentor JSON Schema

  @ChatTesting
  Scenario: Get all chat by id student and id mentor with invalid parameter
    Given User login mentor normal account
    And Get all chat by id student 2 and id mentor 1 with invalid path
    When Send GET request for all chat by id student and id mentor with invalid parameter
    Then API response should return 400 Bad Request status code

