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
  Scenario: Verify Accordant Close and Open State of Completed Sections on Checkout Page

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
    Then User Validates Shipping Detail Section is in "edit" State
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Shipping Detail Section is in "close" State
    Then User Click on Shipping Details Section Title
    Then User Validates Shipping Detail Section is in "open" State
    Then User Click on Shipping Details Section Title
    Then User Validates Shipping Detail Section is in "close" State

  @Regression
  Scenario: Verify Checkout Page Cannot be Accessed Through URL With Empty Cart

    When User Navigates to "shoebacca.checkout" Url
    Then User Should Redirect Toward "shoebacca.cart" Page
    Then User Validates Successful Loaded Cart Page
    Then User Validates Your Cart is Empty Section Visibility "true"

  @Regression
  Scenario: Verify Shipping Method Can be Changed Only After All Required Shipping Address Fields are Filled

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Closes Mini Cart View
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    Then User Validates "standard.shipping" Method Name on Summary Section of Checkout Page
    And User Enters Invalid Email Address on Checkout Page
    And User Enters Valid First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Invalid Zip Code on Checkout Page
    And User Enters Invalid Phone No on Checkout Page
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    Then User Validates "standard.shipping" Method Name on Summary Section of Checkout Page
    Then User Clears the Email Field on Checkout Page
    Then User Clears the Zip Code Field on Checkout Page
    And User Enters Valid Email Address on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates "expedited.shipping" Method Name on Summary Section of Checkout Page

  @Regression
  Scenario: Verify There is an Option for Logged in User to Add New Address or Change it

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Validates First Name and Last Name in Shipping Detail Section
    Then User Validates Address in Shipping Detail Section
    Then User Validates State City and Zip Code in Shipping Detail Section
    Then User Validates Phone No in Shipping Detail Section
    Then User Validates Email Address in Shipping Detail Section
    Then User Validates Add New Address Visibility "true"

  @Regression
  Scenario: Validate Error Messages are Shown for Required Fields on Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Clicks on Email Address Field on Checkout Page
    And User Clicks on First Name Field on Checkout Page
    Then User Validates Required Field Error Message "invalid.email.error.msg" on "email.address" Field of Checkout Page
    And User Clicks on Last Name Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "first.name" Field of Checkout Page
    And User Clicks on Address Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "last.name" Field of Checkout Page
    And User Clicks on City Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "address" Field of Checkout Page
    And User Clicks on State Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "city" Field of Checkout Page
    And User Clicks on Zip Code Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "state" Field of Checkout Page
    And User Clicks on Phone No Field on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "zip.code" Field of Checkout Page
    Then User Clicks on First Name Field on Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "phone" Field of Checkout Page
    Then User Enters Invalid Email Address on Checkout Page
    Then User Validates Required Field Error Message "invalid.email.error.msg" on "email.address" Field of Checkout Page
    Then User Enters Invalid Zip Code on Checkout Page
    Then User Validates Required Field Error Message "invalid.zip.code.error.msg" on "zip.code" Field of Checkout Page
    Then User Enters Invalid Phone No on Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "phone" Field of Checkout Page

  @Regression
  Scenario: Verify the Header in Checkout

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Validates Header Visibility "true" on Checkout Page
    Then User Validates Logo Visibility "true" in Header on Checkout Page
    Then User Validates Help icon Visibility "true" on Checkout Page

    @Regression
    Scenario: Validate "Edit" Link For Shipping Details Expands Section

      Given User Setups the Web Browser
      When User Navigates to "shoebacca.first.bag.pdt" Url
      Then User Clicks Add to Cart Button on PDP
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
      Then User Click on Shipping Details Section Title
      Then User Clicks on Shipping Details Edit Button on Checkout Page
      Then User Validates Shipping Detail Section is in "edit" State

  @Regression
  Scenario: Verify Active Section of Checkout Cannot be Collapsed

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    And User Validates Successful Loaded Checkout Page
    Then User Validates Shipping Detail Section is in "edit" State
    Then User Click on Inactive Shipping Details Section Title
    Then User Validates Shipping Detail Section is in "edit" State

  @Regression
  Scenario: Validate the UI for Active and Inactive Steps

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Fetches Shipping Method on Cart Page
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Shipping Detail Section is in "edit" State
    Then User Validates Shipping Method on Checkout Page
    Then User Validates Payment Method Section is in "inactive" State

  @Regression
  Scenario: Validate Logged in Customer can Proceed to Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Validates Successful Loaded Cart Page
    Then User Clicks Checkout Button on Cart View
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Validates Successful Loaded Checkout Page

  @Regression
  Scenario: Validate Guest Customer can Continue as Guest and Lands on the Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Clicks Checkout Button on Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page

  @Regression
    Scenario: Validate Customer Cannot Apply an Invalid/Empty Promo Code.

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
      Then User Enter "invalid.coupon" in Promo Code on Checkout Page
      Then User Clicks on Add Promo Code Button on Checkout Page
      Then User Validates "invalid.coupon.error.msg" Coupon Error Message Text on Checkout Page
      Then User Clears the Promo Code on Checkout Page
      Then User Clicks on Add Promo Code Button on Checkout Page
      Then User Validates "blank.coupon.error.msg" Coupon Error Message Text on Checkout Page
      Then User Validates Total Amount Using Blank Coupon on Checkout Page

  @Regression
  Scenario: Validate Customer Can Remove Promo Code.

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
    Then User Enter "valid.coupon" in Promo Code on Checkout Page
    Then User Clicks on Add Promo Code Button on Checkout Page
    Then User Validates Discounted Amount on Checkout Page
    Then User Clicks on Remove Promo Code Button on Checkout Page
    Then User Validates Total Amount After Removing Promo Code on Checkout Page

  @Regression
    Scenario: Verify Only One Payment Method Can be Selected

      Given User Setups the Web Browser
      When User Navigates to "shoebacca.home" Url
      And User Clicks the Account Icon on Header
      Then User Enters Valid Login Data Username on Account Menu
      And User Enters Valid Login Password on Account Menu
      Then User Clicks the Login Button on Account Menu
      Then User Validates Successful Login on Account Menu
      And User Clicks the Mini Cart Icon on Header
      And User Clicks Checkout Button on Mini Cart View
      Then User Should Redirect Toward "shopping.checkout" Page
      Then User Clicks Save and Continue Button on Checkout Page
      Then User Select "paypal.payment" Payment Method
      Then User Validates Only One Payment Method is Selected

  @Regression
  Scenario: Verify Credit Card Payment Method is Opened by Default for Guest/First Time Logged in User

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
    Then User Validates Credit Card Section Visibility "true" by Default

  @Regression
  Scenario: Verify Summary Details,Shipping Details,Payment Method Content on Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Validates Subtotal Price "true" on Checkout Page
    Then User Validates "standard.shipping" Method Name on Summary Section of Checkout Page
    Then User Validates Tax Value "true" on Checkout Page
    Then User Validates total Amount Value "true" on Summary Section of Checkout Page
    Then User Validates Product Image Visibility "true" on Summary Section of Checkout Page
    Then User Validates Product Size Visibility "true" on Checkout Page
    Then User Validates Product Color Visibility "true" on Checkout Page
    Then User Validates Estimated Delivery Date Visibility "true" on Checkout Page
    Then User Validates Product Quantity "true" on Checkout Page
    Then User Validates Products Name Visibility "true" on Checkout Page
    Then User Validates Brand Name Visibility "true" on Checkout Page
    Then User Validates Actual Amount Visibility "true" on Checkout Page
    Then User Validates Original Amount Visibility "true" on Checkout Page
    Then User Validates Save Amount Visibility "true" on Checkout Page

  @Regression
  Scenario: Verify Order Cannot be Placed with Invalid Payment Details

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
    And User Enters Invalid Credit Card Number on Checkout Page
    And User Enters Invalid Credit Card Expiry Date on Checkout Page
    And User Enters Invalid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Validates Payment Method Error Visibility "true"

  @Regression
  Scenario: Verify Order Cannot be Placed with Empty Payment Details

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
    Then User Clicks Place Order Button on Checkout Page
    Then User Validates Payment Method Error Visibility "true"

  @Regression
  Scenario: Verify Error Messages on Payment Form for Invalid Data

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
    And User Enters Invalid Credit Card Number on Checkout Page
    And User Enters Invalid Credit Card Expiry Date on Checkout Page
    And User Enters Invalid Credit Card CVV on Checkout Page
    And User Clicks Place Order Button on Checkout Page
    Then User Validates "invalid.cc.number.error" Text from "cc.number.error.field" on Checkout Page
    Then User Validates "invalid.exp.date.error" Text from "exp.date.error.field" on Checkout Page
    Then User Validates "invalid.cvv.error" Text from "cvv.error.field" on Checkout Page

  @Regression
  Scenario: Verify Error Message for Passed Expire Date for Credit Card

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
    And User Enters Invalid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Validates "invalid.exp.date.error" Text from "exp.date.error.field" on Checkout Page

  @Regression
  Scenario: Verify Customer can Select PayPal as a Payment Method

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
    Then User Select "paypal.payment" Payment Method

  @Regression
  Scenario: Validate Shipping Methods and their Prices

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
    Then User Refresh the Page
    Then User Fetches Shipping Name from Checkout Page
    Then User Fetches Shipping Value From Checkout Page
    Then User Validates Shipping Name on Summary Section on Checkout Page
    Then User Validates Shipping Value on Summary Section on Checkout Page
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    Then User Refresh the Page
    Then User Refresh the Page
    Then User Fetches Shipping Name from Checkout Page
    Then User Fetches Shipping Value From Checkout Page
    Then User Validates Shipping Name on Summary Section on Checkout Page
    Then User Validates Shipping Value on Summary Section on Checkout Page
    Then User Select "standard.shipping" Shipping Method on Checkout Page
    Then User Refresh the Page
    Then User Refresh the Page
    Then User Fetches Shipping Name from Checkout Page
    Then User Fetches Shipping Value From Checkout Page
    Then User Validates Shipping Name on Summary Section on Checkout Page
    Then User Validates Shipping Value on Summary Section on Checkout Page

  @Regression
  Scenario: Verify Customer is Redirected to PayPal When Clicked On Pay with Paypal

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
    Then User Select "paypal.payment" Payment Method
    Then User Validates PayPal Section Visibility "true"
    Then User Clicks on Pay with PayPal Button on Checkout Page
    Then User Switches New Tab
    Then User Validates Successful Loaded PayPal Page
    Then User Should Redirect Toward "checkout.paypal.payment" Page

  @Regression
  Scenario: Verify Tax is Calculated When Shipping Address Form is Filled

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
    Then User Validates Tax is Calculated on Checkout Page

  @Regression
  Scenario: Verify Customer Cannot Save Address with Providing Phone Number Less than Ten Digits

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
    And User Enters Not Full Phone No on Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "phone" Field of Checkout Page