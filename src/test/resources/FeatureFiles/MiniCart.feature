Feature: Mini Cart Feature File
  Contains All Mini Cart Module Test Cases

  @Regression
  Scenario: Verify Mini Cart icon is Visible and Opens Mini Cart View when Clicked

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Icon Visibility on Header "true"
    Then User Clicks the Mini Cart Icon on Header
    And User Validates Mini Cart View Visibility "true"

  @Regression
  Scenario: Verify Mini Cart Counter is not Visible when Mini Cart is Empty

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Counter Visibility on Header "false"

  @Regression
  Scenario: Verify Login Link in Empty Mini Cart Opens Account Menu

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Counter Visibility on Header "false"
    Then User Clicks the Mini Cart Icon on Header
    Then User Clicks the Login Link On Mini Cart View
    And User Validates Account Menu Visibility "true"

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
    Then User Validates Mini Cart Scrollability "false"

  @Regression
  Scenario: Verify Mini Cart Counter Functionality When Product Added

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
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
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    And User Fetches Product Price from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    Then User Validate Product Name in Mini Cart
    Then User Validate Product Price in Mini Cart
    Then User Validate Product Image Visibility "true"
    Then User Validate Product Size Visibility "true"
    Then User Validate Product Color Visibility "true"
    Then User Validate Product Remove Visibility "true"
    Then User Validate Product Brand Visibility "true"
    Then User Validate Shipping Label Visibility "true"
    Then User Validate Tax Label Visibility "true"
    Then User Validate View Cart Button Visibility "true"
    Then User Validate Checkout Button Visibility "true"

  @Regression
  Scenario: Verify Close Button Visibility on Mini Cart View and Close It on Click

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    Then User Clicks the Mini Cart Icon on Header
    And User Validates Close Button Visibility "true"
    Then User Closes Mini Cart View
    And User Validates Mini Cart View Visibility "false"

  @Regression
  Scenario: Verify Mini Cart is Scrollable when 2 or More Products are Added

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    Then User Validates Mini Cart Scrollability "true"

  @Regression
  Scenario: Verify Mini Cart Icon Functionality on Header

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Validates Mini Cart Icon Visibility on Header "true"
    Then User Clicks the Mini Cart Icon on Header
    And User Validates Mini Cart View Visibility "true"
    Then User Clicks the Mini Cart Icon on Header
    And User Validates Mini Cart View Visibility "false"

  @Regression
  Scenario: Verify User Shall be able to See Only Last Added Item in the Mini Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Keeps Track of Product Name
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Fetches Product Name from PDP
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Validate Product Name in Mini Cart
    And User Validate Previous Product Name in Mini Cart

  @Regression
  Scenario: Verify Each Product has Separate Section in Mini Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    Then User Validates Mini Cart Counter Value as "2"
    And User Clicks the Mini Cart Icon on Header
    Then User Validates "2" Products have Been Added to Mini Cart
    Then User Validates Mini Cart Has "2" Product's Attributes Visibility "true"