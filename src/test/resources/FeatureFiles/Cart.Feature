Feature: Cart Feature File
  Contains All Cart Module Test Cases

  @Regression
  Scenario: Verify Cart Page When One Product is Added to Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Click on View Cart Button
    And User Should Redirect Toward "shopping.cart" Page
    And User Validates Cart Items Quantity "1" on Cart Page
    And User Validates Item Heading on Item Container Visibility "true"
    And User Validates Description Heading on Item Container Visibility "true"
    And User Validates Quantity Heading on Item Container Visibility "true"
    And User Validates Item Total Heading on Item Container Visibility "true"
    And User Validates Item Content on Item Container Visibility "true"
    And User Validates Description Content on Item Container Visibility "true"
    And User Validates Quantity Content on Item Container Visibility "true"
    And User Validates Item Total Content on Item Container Visibility "true"
    And User Validates "1" Quantity is Displayed on Quantity Text Field
    Then User Validates Summary Section Visibility "true"

  @Regression
  Scenario: Verify Decimal Value Cannot be Added in Quantity Text Field
    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    Then User Click on View Cart Button
    And User Enters "0.5" on Quantity Text Field on Cart
    Then User Validates "5" Quantity is Displayed on Quantity Text Field