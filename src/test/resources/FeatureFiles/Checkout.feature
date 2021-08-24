Feature: Checkout Feature File
  Contains All Checkout Module Test Cases

  @Regression
  Scenario: Verify Shipping Address and Other Data is Retained After Refresh or Came Back to Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Valid Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Select "rush.shipping" Shipping Method on Checkout Page
    Then User Refresh the Page
    Then User Validate Email Address is Retained on Checkout Page
    Then User Validate First Name is Retained on Checkout Page
    Then User Validate Last Name is Retained on Checkout Page
    Then User Validate Address is Retained on Checkout Page
    Then User Validate City is Retained on Checkout Page
    Then User Validate State is Retained on Checkout Page
    Then User Validate Zip Code Address is Retained on Checkout Page
    Then User Validate Phone No is Retained on Checkout Page
    Then User Validates "rush.shipping" Option Selected Visibility "true"
    When User Navigates to "shoebacca.home" Url
    Then User Should Redirect Toward "shopping.home" Page
    Then User Navigate to Back Page
    Then User Validate Email Address is Retained on Checkout Page
    Then User Validate First Name is Retained on Checkout Page
    Then User Validate Last Name is Retained on Checkout Page
    Then User Validate Address is Retained on Checkout Page
    Then User Validate City is Retained on Checkout Page
    Then User Validate State is Retained on Checkout Page
    Then User Validate Zip Code Address is Retained on Checkout Page
    Then User Validate Phone No is Retained on Checkout Page
    Then User Validates "rush.shipping" Option Selected Visibility "true"

  @Regression
  Scenario: Verify Checkout Page Cannot be Accessed Through URL With Empty Cart

    When User Navigates to "shoebacca.checkout" Url
    Then User Should Redirect Toward "shoebacca.cart" Page
    Then User Validates Your Cart is Empty Section Visibility "true"