Feature: Put edit mentor profile
  @Test @PositiveCase @PutEditMentorProfile
  Scenario: Put edit mentor profile with valid body request
    Given User login mentor trial account
    And Put edit mentor profile with valid body request
    When Send PUT request for edit mentor profile with valid body request
    Then API response should return 200 OK status code
    And Validate put edit mentor profile JSON Schema
