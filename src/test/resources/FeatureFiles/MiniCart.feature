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
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    Then User Validates Login Link Visibility on Mini Cart View "false"

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
    Then User Validates Product Name in Mini Cart
    Then User Validates Product Price in Mini Cart
    Then User Validates Product Image Visibility "true"
    Then User Validates Product Size Visibility "true"
    Then User Validates Product Color Visibility "true"
    Then User Validates Product Remove Visibility "true"
    Then User Validates Product Brand Visibility "true"
    Then User Validates Shipping Label Visibility "true"
    Then User Validates Tax Label Visibility "true"
    Then User Validates View Cart Button Visibility "true"
    Then User Validates Checkout Button Visibility "true"

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
    And User Validates Product Name in Mini Cart
    And User Validates Previous Product Name in Mini Cart

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

  @Regression
  Scenario: Verify Product Quantity Cannot be Edit in Mini Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    And User Fetches Product Price from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    Then User Validates Product Name in Mini Cart
    Then User Validates Edit Product Quantity Button Visibility "false"

  @Regression
  Scenario: Verify View and Click Functionality of View Cart That Present on Mini Cart Menu

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Validates Mini Cart View Visibility "true"
    Then User Validates Product Image Visibility "true"
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page

  @Regression
  Scenario: Verify Mini Cart Displays Checkout Button that Navigates to Checkout When Clicked

    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Validates Checkout Button Visibility "true"
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page

  @Regression
  Scenario: Verify Product is Added to Cart Without Page Refresh

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Validates Product Name in Mini Cart

  @Regression
    Scenario: Verify Delete Product Functionality on Mini Cart Menu

      Given User Setups the Web Browser
      When User Navigates to "shoebacca.first.bag.pdt" Url
      Then User Clicks Add to Cart Button on PDP
      And User Validates Successful Triggered Mini Cart
      Then User Validates Product Remove Visibility "false"
      And User Closes Mini Cart View
      Then User Clicks the Mini Cart Icon on Header
      Then User Validates Product Section Visibility "true" on Mini Cart View
      Then User Validates Product Remove Visibility "true"
      Then User Click on Remove Link on Mini Cart View
      Then User Validates Product Section Visibility "false" on Mini Cart View

  @Regression
  Scenario: Validate SignIn With Invalid Credentials

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Member Checkout Button
    Then User Enters Invalid Login Username on Account Menu
    And User Enters Invalid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    And User Validates Mini Cart Icon Visibility on Header "true"
    Then User Validates UnSuccessful Login Error Visibility "true" on Cart Page