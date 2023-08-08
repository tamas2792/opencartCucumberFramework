Feature: Login with Valid Credentials

@sanity
  Scenario: Successful Login with Valid Credentials
    Given User launches browser
    And Opens URL "http://localhost:81/opencart/upload/"
    When User navigates to MyAccount menu
    And Clicks on Login
    And User enters email as "pavanoltraining@gmail.com" and Password as "test@123"
    And Clicks on Login button
    Then User navigates to MyAccount page
