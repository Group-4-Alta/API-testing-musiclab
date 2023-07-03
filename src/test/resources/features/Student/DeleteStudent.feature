Feature: Delete deactivate student
  @Test @PositiveCase @DeleteStudent
  Scenario: Delete student with valid path
    Given User login student trial account
    And Delete student with valid path "students"
    When Send DELETE request for delete student valid path
    Then API response should return 200 OK status code
    And Validate response body for message should be "succes deactivate student"
    And Validate Message JSON Schema

  @Test @NegativeCase @DeleteStudent
  Scenario: Delete student with wrong path
    Given User login student trial account
    And Delete student with wrong path "studentszzz"
    When Send DELETE request for delete student wrong path
    Then API response should return 404 Not Found status code
    And Validate Message JSON Schema