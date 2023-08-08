Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given User launches browser
    And Opens URL "http://localhost:81/opencart/upload/"
    When User navigates to MyAccount menu
    And Clicks on Login
    Then Check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples:
      | row_index |
      | 1         |
      | 2         |
      | 3         |
      | 4         |
