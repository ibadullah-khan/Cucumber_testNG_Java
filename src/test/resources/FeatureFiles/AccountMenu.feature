Feature: Account Menu Feature File
  Contains All Account Menu Module Test Cases

 @C286 @Regression
  Scenario: Validate Sign In Without Entering Any Values

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Member Checkout Button
    Then User Clicks the Login Button on Account Menu
    Then User Validates Error Message Visibility "true" on Email Field on Account Menu
    Then User Validates Error Message Visibility "true" on Password Field on Account Menu

  @C287 @Regression
  Scenario: Verify Email Address is Validated When Entered to Sign In

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Member Checkout Button
    Then User Enters Invalid Email Address on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Validation Error Message Visibility "true" on Account Menu
    Then User Clears the Email Field on Account Menu
    Then User Enters Invalid Email Address Without Domain Name on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Validation Error Message Visibility "true" on Account Menu
    Then User Clears the Email Field on Account Menu
    Then User Enters Invalid Email Address Without Recipient Name on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Validation Error Message Visibility "true" on Account Menu

  @C284 @Regression
  Scenario:Validate Registered Customer When Signs in with Valid Credentials is Landed on Checkout page.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Clicks Checkout Button on Cart View
    Then User Validates Checkout Process Pop Up Visibility "true"
    Then User Clicks on Member Checkout Button
    Then User Validates Sign In Pop Up Visibility "true"
    Then User Enters Valid Login Username on Account Menu
    Then User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Loaded Checkout Page
    Then User Should Redirect Toward "shopping.checkout" Page

  @C285 @Regression
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