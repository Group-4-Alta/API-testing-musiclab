Feature: Post send message to student or teacher
  @ChatTesting
  Scenario: Post mentor send message to student with available id
    Given User login mentor normal account
    And Post mentor send message to student with available id
    When Send POST request for message to student
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @ChatTesting
  Scenario: Post mentor send message to student with exceed id
    Given User login mentor normal account
    And Post mentor send message to student with exceed id
    When Send POST request for message to mentor
    Then API response should return 400 Bad Request status code

  @ChatTesting
  Scenario: Post student send message to mentor with available id
    Given User login student normal account
    And Post student send message to mentor with available id
    When Send POST request for message to student
    Then API response should return 201 Created status code
    And Validate Message JSON Schema

  @ChatTesting
  Scenario: Post student send message to mentor with exceed id
    Given User login student normal account
    And Post student send message to mentor with exceed id
    When Send POST request for message to mentor
    Then API response should return 400 Bad Request status code
