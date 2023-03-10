Feature: Checkout Feature File
  Contains All Checkout Module Test Cases

  @C238461 @Regression
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
    Then User Fetches Shipping Method on Mini Cart Page
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

   @C355 @Regression
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

   @C356 @Regression
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
    Then User Validates Credit Card Section Visibility "true"

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
  Scenario: Verify Select PayPal as a Payment Method

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

   @C238457 @Regression
  Scenario: Verify Phone Number Text Field Accepts Only Numeric Values.

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
    Then User Enters Invalid Phone No on Checkout Page
    Then User Validates Required Field Error Message "invalid.phone.no.error" on "phone" Field of Checkout Page

  @Regression
  Scenario: Verify Redirection to PayPal When Clicked On Pay with Paypal

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
  Scenario: Verify Cancel PayPal Payment and Return to Checkout Page

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
    Then User Click on Cancel and Return To Shoebacca Button on PayPal Payment Page
    Then User Switches to Parent Tab
    Then User Should Redirect Toward "shopping.checkout" Page

  @Regression
  Scenario: Verify First Time Order Placement Saves Address as Default

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Clicks on Create an Account Link on Account Menu
    Then User Enters Random Email Address on Register Account Menus
    Then User Enters Random First Name on Register Account Menu
    Then User Enters Random Last Name on Register Account Menu
    Then User Enters Random Password on Register Account Menu
    Then User Clicks on Create an Account Button
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
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
    And User Clicks the Account Icon on Header
    Then User Clicks on Address Book Option
    Then User Should Redirect Toward "shopping.addressbook" Page
    Then User Validates Address Set as Default Visibility "true"

  @Regression
  Scenario: Verify customer has option to receive or not receive order tracking emails

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
    Then User Validates Order Tracking Email Check Box Visibility "true"
    Then User Validates Order Tracking Email Check Box Type "checkbox.type"

  @Regression
  Scenario: Verify Customers can Select Address from Address Book when they want to Add New Shipping Address

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    Then User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Add New Address Option on Checkout Page
    Then User Validates Shipping Detail Address Form Visibility "true" on Checkout Page
    Then User Clicks on Select from Address Book Button on Checkout Page
    Then User Validates Shipping Detail Address List Visibility "true" on Checkout Page

   @C238462 @Regression
  Scenario: Validate Customer Can Change Shipping Method.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Fetches Shipping Method on Cart Page
    And User Clicks on Change Shipping Option of Cart Page
    And User Clicks on "rush.shipping" Shipping Method on Dropdown of Cart Page
    And User Fetches Shipping Method on Cart Page
    And User Clicks Checkout Button on Cart View
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
    Then User Validates Shipping Method on Checkout Page
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    And User Validates "expedited.shipping" Method Name on Summary Section of Checkout Page

   @C238461 @Regression
  Scenario: Validate Customer's Selected Shipping Method is Retained on Checkout Page.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    Then User Fetches Shipping Method on Cart Page
    And User Clicks Checkout Button on Cart View
    And User Clicks on Guest Checkout Button
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Validates Shipping Method on Checkout Page

  @Regression
  Scenario: Verify There is a Sign-Up Checkbox for Shoebacca Emails Available at Shipping Details Section for Guest Users

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
    Then User Validates Sign Up Check Box Visibility and Checked by Default "true"


  @Regression
  Scenario: Verify Default Shipping Method on Checkout Page

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
    Then User Validates Default Shipping Method as "standard.shipping" on Checkout Page

  @Regression
  Scenario: Verify Guest Customer can Edit Shipping Address Which was Entered on Checkout

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
    Then User Select "expedited.shipping" Shipping Method on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Shipping Detail Address Form Visibility "false" on Checkout Page
    Then User Click on Shipping Details Section Title
    Then User Validates Shipping Detail Section is in "open" State
    Then User Clicks on Shipping Details Edit Button on Checkout Page
    Then User Validates Shipping Detail Section is in "edit" State
    And User Enters Valid Last Name on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page

  @Regression
  Scenario: Verify Customer can not Proceed with Phone Number Greater than Ten Digits

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
    Then User Enters Wrong Phone No on Checkout Page
    Then User Validates Entered Phone No in Shipping Detail Section

  @Regression
  Scenario: Verify Cannot Proceed Forward with Incomplete Shipping Address

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
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "city" Field of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "state" Field of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "zip.code" Field of Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "phone" Field of Checkout Page

    @Regression
    Scenario: Verify Customer can Proceed with Valid Shipping Address

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
      Then User Validates Active Shipping Method Section Visibility "true" on Checkout Page
      Then User Select "expedited.shipping" Shipping Method on Checkout Page
      Then User Validates "expedited.shipping" Method Name on Summary Section of Checkout Page

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
    And User Enters Incomplete Phone No on Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "phone" Field of Checkout Page

  @Regression
  Scenario: Verify Saved Credit Cards for Logged in Customers if Available

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    Then User Clicks Checkout Button on Mini Cart View
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Stored Cards Visibility "true" on Checkout Page
    Then User Validates Credit Card Last Digits Visibility "true" on Checkout Page
    Then User Validates Credit Card Expiry Date Visibility "true" on Checkout Page
    Then User Validates Credit Card Logo Visibility "true" on Checkout Page

  @C238452 @Regression
  Scenario: Verify Logged in Customer Can Add New Shipping Address at Checkout.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks on View Cart Button
    And User Clicks Checkout Button on Cart View
    Then User Clicks on Member Checkout Button
    And User Enters Valid All Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    And User Clicks the Login Button on Account Menu
    Then User Clicks on Add New Address Option on Checkout Page
    And User Enters Random First Name on Checkout Page
    And User Enters Valid Last Name on Checkout Page
    And User Enters Valid Address on Checkout Page
    And User Enters Valid City on Checkout Page
    And User Selects Valid State on Checkout Page
    And User Enters Valid Zip Code on Checkout Page
    And User Enters Valid Phone No on Checkout Page
    And User Validates Set as Default Field Visibility "true" on Checkout Page
    And User Clicks on Set as Default Field
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Shipping Detail Section is in "edit" State
    Then User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Clicks on Address Book Option
    Then User Should Redirect Toward "shopping.addressbook" Page
    Then User Validates Address Set as Default in Address Book Visiblity "true"

  @Regression
  Scenario: Verify Default Payment Should be Selected on Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    Then User Clicks on Payment Method Option
    Then User Fetch Default Credit Card
    And User Clicks the Mini Cart Icon on Header
    Then User Clicks Checkout Button on Mini Cart View
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Payment Method Section is in "active" State
    Then User Validates Credit Card Same as Default

  @Regression
  Scenario: Verify New Card Fields Hides When Stored Card Option is Selected

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
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Stored Cards Visibility "true" on Checkout Page
    Then User Validates Credit Card Last Digits Visibility "true" on Checkout Page
    Then User Validates Credit Card Expiry Date Visibility "true" on Checkout Page
    Then User Validates Credit Card Logo Visibility "true" on Checkout Page
    Then User Select "credit.card.payment" Payment Method
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Credit Card Section Visibility "true"
    Then User Validates Credit Card Number Field is Empty
    Then User Validates Expiry Date Field is Empty
    Then User Validates CVV Number Field is Empty
    Then User Select "stored.card.payment" Payment Method
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Stored Cards Visibility "true" on Checkout Page

  @Regression
  Scenario: Validate Expiration Year is Minimum Current Year on Checkout Page

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
    And User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Invalid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Validates "invalid.exp.date.error" Text from "exp.date.error.field" on Checkout Page
    And User Clears Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    And User Closes Feedback Window on Confirmation Page
    Then User Validates Order Number Text Visibility "true" on Confirmation Page

  @Regression
  Scenario: Validate Order Will not be Placed if Logged in Customer Leaves a New Billing Address

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
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Stored Cards Visibility "true" on Checkout Page
    Then User Select "credit.card.payment" Payment Method
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks on Use Shipping Address for Billing Checkbox
    Then User Validates Shipping Addresses Visibility "true" on Dropdown
    Then User Clicks on Add New Address Option on Checkout Page
    Then User Validates Add New Address Form Section Visibility "true" on Billing Section of Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.first.name" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.last.name" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.address" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.city" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.state" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "invalid.ph.no.error.msg" on "billing.phone" Field on Billing Section of Checkout Page
    Then User Validates Required Field Error Message "required.field.error.msg" on "billing.zip.code" Field on Billing Section of Checkout Page

  @Regression
  Scenario: Verify Order can be Placed through Paypal

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
    And User Enters Valid PayPal Username on PayPal Page
    And User Clicks on Next Button on PayPal Page
    And User Enters Valid PayPal Password on PayPal Page
    And User Clicks on Login Button on PayPal Page
    And User Wait for Final Details to Load on PayPal Page
    Then User Clicks on Pay Now Button PayPal Page
    Then User Switches to Parent Tab
    And User Closes Feedback Window on Confirmation Page
    Then User Validates Order Number Text Visibility "true" on Confirmation Page

  @Regression
  Scenario: Validate Logged in Customer can Use any of Saved Addresses

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid All Login Data Username on Account Menu
    And User Enters Valid All Login Data Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    Then User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks Checkout Button on Mini Cart View
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Default Address Visibility "true" on Checkout Page
    Then User Fetches Shipping Address on Checkout Page
    Then User Clicks on Change Address Button on Checkout Page
    Then User Validates Shipping Address Quantity on Checkout Page
    Then User Validates Shipping Address User Name on Checkout Page
    Then User Select First Saved Address on Checkout Page
    Then User Clicks Save and Continue Button on Checkout Page
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    Then User Clicks the Account Icon on Header
    Then User Clicks on Address Book Option
    Then User Validates Shipping Address Quantity on Address Book

  @Regression
  Scenario: Validate Customer Can Apply Valid Coupon/Promo Code.

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

  @Regression
  Scenario: Validate Only Allowed Card Types are Accepted

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
    Then User Validates "visa.card" Credit Card Visibility "true"
    Then User Validates "master.card" Credit Card Visibility "true"
    Then User Validates "american.express.card" Credit Card Visibility "true"
    Then User Validates "dicsover.card" Credit Card Visibility "true"

  @C332 @Regression
  Scenario: Validate CVV for Less than 3 Digits on Checkout Page

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    And User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    And User Clicks the Login Button on Account Menu
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Select "credit.card.payment" Payment Method
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Invalid Credit Card CVV on Checkout Page
    And User Clicks Place Order Button on Checkout Page
    Then User Validates "invalid.cvv.error" Text from "cvv.error.field" on Checkout Page

  @Regression
  Scenario: Verify Coupon Already Applied Through Cart is Reflected in Payment Method

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    Then User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    Then User Clicks on View Cart Button
    Then User Should Redirect Toward "shopping.cart" Page
    Then User Enter "valid.coupon" in Promo Code on Cart Page
    Then User Clicks on Add Promo Code Button
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
    Then User Validates "valid.coupon" is Already Applied on Checkout Page
    Then User Validates Discounted Amount on Checkout Page

  @Regression
  Scenario: Validate Guest Customer Can Select Different Billing Address.

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
    Then User Clicks on Use Shipping Address for Billing Checkbox
    And User Enters Valid First Name For Billing on Checkout Page
    And User Enters Valid Last Name For Billing on Checkout Page
    And User Enters Valid Address For Billing on Checkout Page
    And User Enters Valid City For Billing on Checkout Page
    And User Selects Valid State For Billing on Checkout Page
    And User Enters Valid Zip Code For Billing on Checkout Page
    And User Enters Valid Phone No For Billing on Checkout Page
    Then User Clicks Place Order Button on Checkout Page
    And User Closes Feedback Window on Confirmation Page
    Then User Validates Order Number Text Visibility "true" on Confirmation Page

  @Regression
  Scenario: Validate Logged in Customer Can Select a Different Billing Address in The Payment Section.

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.first.bag.pdt" Url
    And User Clicks Add to Cart Button on PDP
    And User Validates Successful Triggered Mini Cart
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks on Member Checkout Button
    And User Enters Valid All Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    And User Clicks the Login Button on Account Menu
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Select "credit.card.payment" Payment Method
    And User Enters Valid Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Valid Credit Card CVV on Checkout Page
    Then User Clicks on Use Shipping Address for Billing Checkbox
    And User Clicks on Stored Shipping Address in Payment Section
    Then User Clicks Place Order Button on Checkout Page
    And User Closes Feedback Window on Confirmation Page
    Then User Validates Order Number Text Visibility "true" on Confirmation Page

  @C238446 @Regression
    Scenario: Verify New Address Form is Opened By Default If There Are No Saved Addresses For Logged In Customer.

      Given User Setups the Web Browser
      When User Navigates to "shoebacca.home" Url
      And User Clicks the Account Icon on Header
      Then User Enters Valid Login Shipping Username on Account Menu
      And User Enters Valid Login Password on Account Menu
      Then User Clicks the Login Button on Account Menu
      Then User Validates Successful Login on Account Menu
      And User Clicks the Mini Cart Icon on Header
      And User Clicks Checkout Button on Mini Cart View
      Then User Should Redirect Toward "shopping.checkout" Page
      Then User Validates Shipping Detail Section is in "edit" State

  @C337 @Regression
  Scenario: Validate The Billing Address is The Same As Shipping By Default.

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
    Then User Validates Shipping Address Checkbox Selection is "true"

  @C331 @Regression
  Scenario: Validate Four Digit CVV Number

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
    And User Enters "valid.visa.card.number" as Credit Card Number on Checkout Page
    And User Enters Valid Credit Card Expiry Date on Checkout Page
    And User Enters Four Digit CVV Number on Checkout Page
    Then User Validates Four CVV Number is Not Entered
    And User Clears Credit Card Number on Checkout Page
    And User Clears Credit Card CVV Number on Checkout Page
    And User Enters "valid.master.card.number" as Credit Card Number on Checkout Page
    And User Enters Four Digit CVV Number on Checkout Page
    Then User Validates Four CVV Number is Not Entered
    And User Clears Credit Card Number on Checkout Page
    And User Clears Credit Card CVV Number on Checkout Page
    And User Enters "valid.discovery.card.number" as Credit Card Number on Checkout Page
    And User Enters Four Digit CVV Number on Checkout Page
    Then User Validates Four CVV Number is Not Entered
    And User Clears Credit Card Number on Checkout Page
    And User Clears Credit Card CVV Number on Checkout Page
    And User Enters "valid.amex.card.number" as Credit Card Number on Checkout Page
    And User Enters Four Digit CVV Number on Checkout Page
    Then User Validates Four CVV Number is Entered

  @C3779 @Regression
  Scenario: Verify Save Card for Next Time Option is Not Displayed for Guest Customers

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
    Then User Validates Credit Card Section Visibility "true"
    Then User Validates Save Card for Next Time Checkbox Visibility "false"

  @C3781 @Regression
  Scenario: Verify Stored Card Option Not Displayed For Registered User If No Cards Saved Yet

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login No Cards Stored Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Should Redirect Toward "shopping.checkout" Page
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates Successful Loaded Checkout Page
    Then User Validates Stored Cards Visibility "false" on Checkout Page

  @C324 @Regression
  Scenario: Verify Logged In Customer Can Enter a New Credit Card Even There Are Saved Cards

    Given User Setups the Web Browser
    When User Navigates to "shoebacca.home" Url
    And User Clicks the Account Icon on Header
    Then User Enters Valid Login Data Username on Account Menu
    And User Enters Valid Login Password on Account Menu
    Then User Clicks the Login Button on Account Menu
    Then User Validates Successful Login on Account Menu
    And User Clicks the Mini Cart Icon on Header
    And User Clicks Checkout Button on Mini Cart View
    Then User Clicks Save and Continue Button on Checkout Page
    Then User Validates "stored.card.payment" Selected Payment Method "true" on Checkout Page
    Then User Select "credit.card.payment" Payment Method
    And User Validates Credit Card Section Visibility "true"

  @C3778 @Regression
  Scenario: Verify that Stored Cards Option Will not be Displayed for Guest Customers

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
    Then User Validates Payment Method Section is in "active" State
    Then User Validates Stored Cards Visibility "false" on Checkout Page

  @C320 @Regression
  Scenario: Validate Payment Methods are Shown as per Configuration

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
    Then User waits for Payment Method to Load
    Then User Validates Payment Method "credit.card.payment" Option Visibility "true" on Checkout Page
    Then User Validates Payment Method "paypal.payment" Option Visibility "true" on Checkout Page