Feature: Delete Deactive Mentor
  @TestingMentor
  Scenario: Delete deactive mentor with valid path
    Given User login mentor trial account
    And Detele deactive mentor with valid path
    When Send DELETE request for deactive mentor
    Then API response should return 200 OK status code
    And Validate response body for message should be "succes deactivate mentor"
    And Validate Message JSON Schema