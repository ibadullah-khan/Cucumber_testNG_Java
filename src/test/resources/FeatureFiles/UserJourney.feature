Feature: User Journey Feature File
  Contains All User Journey Flows

  @UserJourney
  Scenario: Guest User Checkout Selected Product to Order Confirmation Page

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