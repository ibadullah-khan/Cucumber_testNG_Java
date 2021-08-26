Feature: Checkout Feature File
  Contains All Checkout Module Test Cases

#  @Regression
#  Scenario: Verify Shipping Address and Other Data is Retained After Refresh or Came Back to Checkout Page
#
#    Given User Setups the Web Browser
#    When User Navigates to "shoebacca.first.bag.pdt" Url
#    And User Clicks Add to Cart Button on PDP
#    And User Validates Successful Triggered Mini Cart
#    And User Clicks Checkout Button on Mini Cart View
#    Then User Clicks on Guest Checkout Button
#    Then User Should Redirect Toward "shopping.checkout" Page
#    And User Enters Valid Email Address on Checkout Page
#    And User Enters Valid First Name on Checkout Page
#    And User Enters Valid Last Name on Checkout Page
#    And User Enters Valid Address on Checkout Page
#    And User Enters Valid City on Checkout Page
#    And User Selects Valid State on Checkout Page
#    And User Enters Valid Zip Code on Checkout Page
#    And User Enters Valid Phone No on Checkout Page
#    Then User Select "rush.shipping" Shipping Method on Checkout Page
#    Then User Refresh the Page
#    Then User Validate Email Address is Retained on Checkout Page
#    Then User Validate First Name is Retained on Checkout Page
#    Then User Validate Last Name is Retained on Checkout Page
#    Then User Validate Address is Retained on Checkout Page
#    Then User Validate City is Retained on Checkout Page
#    Then User Validate State is Retained on Checkout Page
#    Then User Validate Zip Code Address is Retained on Checkout Page
#    Then User Validate Phone No is Retained on Checkout Page
#    Then User Validates "rush.shipping" Option Selected Visibility "true"
#    When User Navigates to "shoebacca.home" Url
#    Then User Should Redirect Toward "shopping.home" Page
#    Then User Navigate to Back Page
#    Then User Validate Email Address is Retained on Checkout Page
#    Then User Validate First Name is Retained on Checkout Page
#    Then User Validate Last Name is Retained on Checkout Page
#    Then User Validate Address is Retained on Checkout Page
#    Then User Validate City is Retained on Checkout Page
#    Then User Validate State is Retained on Checkout Page
#    Then User Validate Zip Code Address is Retained on Checkout Page
#    Then User Validate Phone No is Retained on Checkout Page
#    Then User Validates "rush.shipping" Option Selected Visibility "true"
#
#  @Regression
#  Scenario: Verify Accordant Close and Open State of Completed Sections on Checkout Page
#
#    Given User Setups the Web Browser
#    When User Navigates to "shoebacca.first.bag.pdt" Url
#    And User Clicks Add to Cart Button on PDP
#    And User Validates Successful Triggered Mini Cart
#    And User Clicks Checkout Button on Mini Cart View
#    Then User Clicks on Guest Checkout Button
#    Then User Should Redirect Toward "shopping.checkout" Page
#    And User Enters Valid Email Address on Checkout Page
#    And User Enters Valid First Name on Checkout Page
#    And User Enters Valid Last Name on Checkout Page
#    And User Enters Valid Address on Checkout Page
#    And User Enters Valid City on Checkout Page
#    And User Selects Valid State on Checkout Page
#    And User Enters Valid Zip Code on Checkout Page
#    And User Enters Valid Phone No on Checkout Page
#    Then User Select "rush.shipping" Shipping Method on Checkout Page
#    Then User Validates Shipping Detail Section is in "edit" State
#    Then User Clicks Save and Continue Button on Checkout Page
#    Then User Validates Shipping Detail Section is in "close" State
#    Then User Click on Shipping Details Section Title
#    Then User Validates Shipping Detail Section is in "open" State
#    Then User Click on Shipping Details Section Title
#    Then User Validates Shipping Detail Section is in "close" State
#
#  @Regression
#  Scenario: Verify Checkout Page Cannot be Accessed Through URL With Empty Cart
#
#    When User Navigates to "shoebacca.checkout" Url
#    Then User Should Redirect Toward "shoebacca.cart" Page
#    Then User Validates Successful Loaded Cart Page
#    Then User Validates Your Cart is Empty Section Visibility "true"
#
#  @Regression
#  Scenario: Verify Shipping Method Can be Changed Only After All Required Shipping Address Fields are Filled
#
#    Given User Setups the Web Browser
#    When User Navigates to "shoebacca.first.bag.pdt" Url
#    Then User Clicks Add to Cart Button on PDP
#    And User Validates Successful Triggered Mini Cart
#    And User Closes Mini Cart View
#    And User Clicks the Mini Cart Icon on Header
#    And User Clicks Checkout Button on Mini Cart View
#    Then User Clicks on Guest Checkout Button
#    Then User Should Redirect Toward "shopping.checkout" Page
#    Then User Select "expedited.shipping" Shipping Method on Checkout Page
#    Then User Validates "standard.shipping" Method Name on Summary Section of Checkout Page
#    And User Enters Invalid Email Address on Checkout Page
#    And User Enters Valid First Name on Checkout Page
#    And User Enters Valid Last Name on Checkout Page
#    And User Enters Valid Address on Checkout Page
#    And User Enters Valid City on Checkout Page
#    And User Selects Valid State on Checkout Page
#    And User Enters Invalid Zip Code on Checkout Page
#    And User Enters Invalid Phone No on Checkout Page
#    Then User Select "expedited.shipping" Shipping Method on Checkout Page
#    Then User Validates "standard.shipping" Method Name on Summary Section of Checkout Page
#    Then User Clears the Email Field on Checkout Page
#    Then User Clears the Zip Code Field on Checkout Page
#    And User Enters Valid Email Address on Checkout Page
#    And User Enters Valid Zip Code on Checkout Page
#    And User Enters Valid Phone No on Checkout Page
#    Then User Select "expedited.shipping" Shipping Method on Checkout Page
#    Then User Clicks Save and Continue Button on Checkout Page
#    Then User Validates "expedited.shipping" Method Name on Summary Section of Checkout Page
#
#  @Regression
#  Scenario: Verify There is an Option for Logged in User to Add New Address or Change it
#
#    Given User Setups the Web Browser
#    When User Navigates to "shoebacca.home" Url
#    And User Clicks the Account Icon on Header
#    Then User Enters Valid Login Data Username on Account Menu
#    And User Enters Valid Login Password on Account Menu
#    Then User Clicks the Login Button on Account Menu
#    Then User Validates Successful Login on Account Menu
#    And User Clicks the Mini Cart Icon on Header
#    And User Clicks Checkout Button on Mini Cart View
#    Then User Should Redirect Toward "shopping.checkout" Page
#    Then User Validates First Name and Last Name in Shipping Detail Section
#    Then User Validates Address in Shipping Detail Section
#    Then User Validates State City and Zip Code in Shipping Detail Section
#    Then User Validates Phone No in Shipping Detail Section
#    Then User Validates Email Address in Shipping Detail Section
#    Then User Validates Add New Address Visibility "true"

#  @Regression
#  Scenario: Validate Sign In Without Entering Any Values
#
#    Given User Setups the Web Browser
#    When User Navigates to "shoebacca.first.bag.pdt" Url
#    And User Clicks Add to Cart Button on PDP
#    And User Validates Successful Triggered Mini Cart
#    And User Clicks Checkout Button on Mini Cart View
#    Then User Clicks on Member Checkout Button
#    Then User Clicks the Login Button on Account Menu
#    Then User Validates Error Message Visibility "true" on Email Field on Account Menu
#    Then User Validates Error Message Visibility "true" on Password Field on Account Menu

  @Regression
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



