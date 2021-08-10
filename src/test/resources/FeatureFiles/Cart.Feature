Feature: Cart Feature File
  Contains All Cart Module Test Cases

  @Regression
  Scenario: Verify Cart Page When One Product is Added to Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
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
  Scenario: Verify Adding Multiple Items of Different Types in Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    And User Validates Cart Items Quantity "1" on Cart Page
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    And User Validates Cart Items Quantity "2" on Cart Page
    Then User Validates "2" Products have Been Added to Cart
    Then User Validates Cart Has "2" Product's Attributes Visibility "true"

  @Regression
  Scenario:  Verify on Clicking Product Name Page is Redirected to Relevant PDP

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    And User Validates Cart Items Quantity "1" on Cart Page
    And User Click on Product Name on Cart Page
    Then User Should Redirect Toward "shoebacca.first.bag.pdt" Page

  @Regression
  Scenario: Verify Same Product Multiple Times Added in Cart

    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    And User Validates Product Count "2" on Mini Cart
    Then User Clicks on View Cart Button
    Then User Validates Product Name in Cart Page
    And User Validates "2" Quantity is Displayed on Quantity Text Field

  @Regression
  Scenario: Verify Remove Some Item Functionality on Cart Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Validates Cart Items Quantity "2" on Cart Page
    Then User Validates Cart Page Has "2" Remove Product Link
    Then User Validates Price Between Product Item Section and Account Detail Section
    Then User Click on Remove Link on "shoebacca.first.bag.name" Product on Cart Page
    Then User Validates Cart Page Has "1" Remove Product Link
    Then User Validates Cart Items Quantity "1" on Cart Page
    Then User Validates Price Between Product Item Section and Account Detail Section

  @Regression
  Scenario: Verify Cart Total And Tax When Tax is Applied for Specific Areas and Customer Returns to Shopping Cart from Checkout

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Validates Tax Value "cart.notax.value" on Cart Page
    Then User Clicks Checkout Button on Cart View
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
    Then User Fetches Tax Value on Checkout
    Then User Navigates to "shoebacca.home" Url
    Then User Clicks the Mini Cart Icon on Header
    Then User Validates Tax Value from Mini Cart
    And User Clicks on View Cart Button
    And User Validates Tax Value from Cart
    Then User Clicks Checkout Button on Cart View
    Then User Clicks on Guest Checkout Button
    Then User Validates Tax Value from Checkout

  @Regression
  Scenario: Verify Remove All Item Functionality from  Cart

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Navigates to "shoebacca.second.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Validates Cart Page Has "2" Remove Product Link
    Then User Click on Remove Link on "shoebacca.first.bag.name" Product on Cart Page
    Then User Validates Cart Page Has "1" Remove Product Link
    Then User Click on Remove Link on "shoebacca.second.bag.name" Product on Cart Page
    Then User Validates Your Cart is Empty Section Visibility "true"

  @Regression
  Scenario: Verify Decimal Value Cannot be Added in Quantity Text Field

    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    Then User Clicks on View Cart Button
    And User Enters "0.5" on Quantity Text Field on Cart
    Then User Validates "5" Quantity is Displayed on Quantity Text Field

  @Regression
  Scenario: Verify Shipping Method And their Prices

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Clicks on Change Shipping Option of Cart Page
    Then User Validates "standard.shipping" Shipping Method Visibility "true" on Dropdown of Cart Page
    Then User Validates "standard.shipping" Shipping Price Visibility "true" on Dropdown of Cart Page
    Then User Validates "standard.shipping" Method Price "standard.shipping.price" on Dropdown of Cart Page
    Then User Validates "expedited.shipping" Shipping Method Visibility "true" on Dropdown of Cart Page
    Then User Validates "expedited.shipping" Shipping Price Visibility "true" on Dropdown of Cart Page
    Then User Validates "expedited.shipping" Method Price "expedited.shipping.price" on Dropdown of Cart Page
    Then User Validates "rush.shipping" Shipping Method Visibility "true" on Dropdown of Cart Page
    Then User Validates "rush.shipping" Shipping Price Visibility "true" on Dropdown of Cart Page
    Then User Validates "rush.shipping" Method Price "rush.shipping.price" on Dropdown of Cart Page
    Then User Clicks on "expedited.shipping" Shipping Method on Dropdown of Cart Page
    Then User Validates "expedited.shipping" Shipping Method Name on Summary Section of Cart Page
    Then User Validates "expedited.shipping.price" Shipping Price on Summary Section of Cart Page
    Then User Validates total Amount on Summary Section of Cart Page
    Then User Clicks on Change Shipping Option of Cart Page
    Then User Clicks on "rush.shipping" Shipping Method on Dropdown of Cart Page
    Then User Validates "rush.shipping" Shipping Method Name on Summary Section of Cart Page
    Then User Validates "rush.shipping.price" Shipping Price on Summary Section of Cart Page
    Then User Validates total Amount on Summary Section of Cart Page
    Then User Clicks on Change Shipping Option of Cart Page
    Then User Clicks on "standard.shipping" Shipping Method on Dropdown of Cart Page
    Then User Validates "standard.shipping" Shipping Method Name on Summary Section of Cart Page
    Then User Validates "standard.shipping.price" Shipping Price on Summary Section of Cart Page
    Then User Validates total Amount on Summary Section of Cart Page

  @Regression
  Scenario: Verify the Product Information on Cart Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Fetches Product Name from PDP
    And User Fetches Product Price from PDP
    And User Fetches Product Size from PDP
    And User Fetches Product Colour from PDP
    And User Fetches Product Brand from PDP
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Validates Product Name in Cart Page
    Then User Validates Product Price in Cart
    Then User Validates Product Size in Cart
    Then User Validates Product Colour in Cart
    Then User Validates Product Brand in Cart
    Then User Validates Product Image Visibility on Cart "true"
    Then User Validates Expected Date Visibility on Cart "true"
    Then User Validates Cart Items Quantity "1" on Cart Page

  @Regression
  Scenario: Verify User can not Proceed to Checkout if Session Expires

    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    And User Clears the Session
    Then User Refresh the Page
    Then User Validates Your Cart is Empty Section Visibility "true"

  @Regression
  Scenario: Verify Related Products Section is Displayed with Four Products on Cart Page

    Given User Setups the Web Browser
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Validates Related Product Section Visibility on Cart Page "true"
    Then User Validates Related Products Visibility on Cart Page "true"
    Then User Validates Related Product Brand Visibility on Cart Page "true"
    Then User Validates Related Product Name Visibility on Cart Page "true"
    Then User Validates Related Product Price Visibility on Cart Page "true"



  @Regression
  Scenario: Verify Price is not Discounted When Invalid Coupon is Entered

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Enter "invalid.coupon" in Promo Code on Cart Page
    Then User Clicks on Add Promo Code Button
    Then User Validates Discount Details Visibility "false" on Summary Section of Cart Page
    Then User Validates Total Amount using "invalid" Coupon