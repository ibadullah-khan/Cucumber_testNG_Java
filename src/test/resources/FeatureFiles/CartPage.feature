Feature: Cart Page Feature File
  Contains All Cart Page Module Test Cases

  @Regression
  Scenario: Verify Remove Some Item Functionality on Cart Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Click on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Validates Product Quantity "2" in Counter Section on Cart Page
    Then User Validates Cart Page Has "2" Remove Product Link
    Then User Validates Price Between Product Item Section and Account Detail
    Then User Click on Remove Link on  "shoebacca.first.bag.name" Product on Cart Page
    Then User Validates Cart Page Has "1" Remove Product Link
    Then User Validates Product Quantity "1" in Counter Section on Cart Page
    Then User Validates Price Between Product Item Section and Account Detail