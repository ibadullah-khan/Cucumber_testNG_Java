Feature: Mini Cart Feature File
  Contains All Mini Cart Module Test Cases

  @Regression
  Scenario: Verify Mini Cart icon is Displayed and Opens Mini Cart View when Clicked

    Given User Setup the Web Browser
    When User Navigate to "shoebacca_home" Url
    And User Validate Mini Cart Icon is Visible on Header
    Then User Clicks the Mini Cart Icon on Header
    And User Validate Mini Cart View is Visible
