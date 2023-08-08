Feature: Login Data Driven

  Scenario Outline: Login Data Driven
    Given User launches browser
    And Opens URL "http://localhost:81/opencart/upload/"
    When User navigates to MyAccount menu
    And Clicks on Login
    And User enters email as "<email>" and Password as "<password>"
    And Clicks on Login button
    Then User navigates to MyAccount page

    Examples:
      | email                     | password |
      | pavanol@gmail.com         | test123  |
      | pavanoltraining@gmail.com | test@123 |
      | abc123@gmail.com          | test@123 |
