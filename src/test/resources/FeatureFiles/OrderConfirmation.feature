Feature: Order Confirmation Feature File
  Contains All Order Confirmation Module Test Cases

  @Regression
  Scenario: Verify Account not Created for MisMatch Confirm Password
    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Valid Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Closes Feedback Window on Confirmation Page
    Then User Enters Password on Order Confirmation Page
    And User Enters Mismatch Password on Order Confirmation Page
    Then User Clicks on Create Account Button on Order Confirmation Page
    Then Verify Validation Text Appear on Order Confirmation Page

  @Regression
  Scenario: Verify User can Print Receipt after Placing an Order

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Valid Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Closes Feedback Window on Confirmation Page
    Then User Validates Print Slip Button on Confirmation Page "true"

  @Regression
  Scenario: Verify Account not Created for Already Exist Email

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Valid Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Closes Feedback Window on Confirmation Page
    Then User Enters Password on Order Confirmation Page
    Then User Enters Confirm Password on Order Confirmation Page
    Then User Clicks on Create Account Button on Order Confirmation Page
    Then User Validates "oc.exist.user" Error Message on Order Confirmation Page

  @Regression
  Scenario: Validate Guest Customer is Given Option To Enter Password To Create Account.

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
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Closes Feedback Window on Confirmation Page
    Then User Validates Password Field Visibility "true" on Confirmation Page

  @Regression
  Scenario: Validate When Password is Entered, Account is Created.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Random Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Closes Feedback Window on Confirmation Page
    And User Enters Password on Order Confirmation Page
    And User Enters Confirm Password on Order Confirmation Page
    Then User Clicks on Create Account Button on Order Confirmation Page
    Then User Clicks the Account Icon on Header
    Then User Validates Successful Login on Account Menu


  @Regression
  Scenario: Validate Placing an Order Takes User to Order Confirmation Page With Valid Order Number.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Enters Random Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    And User Closes Feedback Window on Confirmation Page
    Then User Validates Order Number Text Visibility "true" on Confirmation Page