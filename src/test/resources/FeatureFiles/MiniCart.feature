Feature: Mini Cart Feature File
  Contains All Mini Cart Module Test Cases

  @Regression
  Scenario: Verify Mini Cart icon is Visible and Opens Mini Cart View when Clicked

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Icon is Visible on Header
    Then User Clicks the Mini Cart Icon on Header
    And User Validates Mini Cart View is Visible

  @Regression
  Scenario: Verify Mini Cart Counter is not Visible when Mini Cart is Empty

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Counter is not Visible on Header

  @Regression
  Scenario: Verify Login Link in Empty Mini Cart Opens Account Menu

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Counter is not Visible on Header
    Then User Clicks the Mini Cart Icon on Header
    Then User Clicks the Login Link On Mini Cart View
    And User Validates Account Menu is Visible

  @Regression
  Scenario: Verify Visibility of Login Link in Empty Mini Cart Logged In

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validate Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    Then User Validates Login Link Visibility on Mini Cart View

  @Regression
  Scenario: Verify Mini Cart Counter Functionality When Product Added

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.sports.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Validates Mini Cart Counter Value as "1"
    And User Closes Mini Cart View
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Validates Mini Cart Counter Value as "2"

  @Regression
  Scenario: Verify Mini Cart Content When Item is Added in the Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.sports.bag.pdt" Url
    And User Fetches Product Name from PDP
    And User Fetches Product Price from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Validate Product Name in Mini Cart
    Then User Validate Product Price in Mini Cart