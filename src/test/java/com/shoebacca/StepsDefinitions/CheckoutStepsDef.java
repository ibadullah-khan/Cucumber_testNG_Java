package com.shoebacca.StepsDefinitions;


import PageObjectFactory.CheckoutPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepsDef extends HarnessVariables {

    CheckoutPageFactory checkoutPage;
    protected String checkoutPropFile = "checkout.properties";
    protected String errorMsgPropFile = "errorMsg.properties";
    protected String runPropFile = "run.properties";

    public CheckoutStepsDef() throws Exception {
        checkoutPage = new CheckoutPageFactory();
    }

    @And("User Enters Valid Email Address on Checkout Page")
    public void userEntersValidEmailAddressOnCheckoutPage() throws Exception {
        checkoutPage.enterEmailAddress(VALID_EMAIL_ADDRESS);
    }

    @And("User Enters Valid First Name on Checkout Page")
    public void userEntersValidFirstNameOnCheckoutPage() throws Exception {
        checkoutPage.enterFirstName(VALID_FIRSTNAME);
    }

    @And("User Enters Valid Last Name on Checkout Page")
    public void userEntersValidLastNameOnCheckoutPage() throws Exception {
        checkoutPage.enterLastName(VALID_LASTNAME);
    }

    @And("User Enters Valid Address on Checkout Page")
    public void userEntersValidAddressOnCheckoutPage() throws Exception {
        checkoutPage.enterAddress(VALID_ADDRESS);
    }

    @And("User Enters Valid City on Checkout Page")
    public void userEntersValidCityOnCheckoutPage() throws Exception {
        checkoutPage.enterCity(VALID_CITY);
    }

    @And("User Selects Valid State on Checkout Page")
    public void userSelectsValidStateOnCheckoutPage() throws Exception {
        checkoutPage.selectState(VALID_STATE);
    }

    @And("User Enters Valid Zip Code on Checkout Page")
    public void userEntersValidZipCodeOnCheckoutPage() throws Exception {
        checkoutPage.enterZipCode(VALID_ZIPCODE);
    }

    @And("User Enters Valid Phone No on Checkout Page")
    public void userEntersValidPhoneNoOnCheckoutPage() throws Exception {
        checkoutPage.enterPhNo(VALID_PH_NO);
    }

    @Then("User Clicks Save and Continue Button on Checkout Page")
    public void userClicksSaveAndContinueButtonOnCheckoutPage() throws Exception {
        checkoutPage.clickSaveAndContinueButton();
    }

    @And("User Enters Valid Credit Card Number on Checkout Page")
    public void userEntersValidCreditCardNumberOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardNumber(VALID_CC_NUM);
    }

    @And("User Enters Valid Credit Card Expiry Date on Checkout Page")
    public void userEntersValidCreditCardExpiryDateOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardExpiryDate(VALID_CC_EXPIRY);
    }

    @And("User Enters Valid Credit Card CVV on Checkout Page")
    public void userEntersValidCreditCardCVVOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardCVV(VALID_CC_CVV);
    }

    @Then("User Clicks Place Order Button on Checkout Page")
    public void userClicksPlaceOrderButtonOnCheckoutPage() throws Exception {
        checkoutPage.clickPlaceOrderButton();
    }

    @Then("User Fetches Tax Value on Checkout")
    public void userFetchesTaxValueOnCheckout() {
        TAX_VALUE = checkoutPage.getTaxValue();
    }

    @Then("User Validates Tax Value from Checkout")
    public void userValidatesTaxValueFromCheckout() {
        checkoutPage.validateTaxValue(TAX_VALUE);
    }

    @Then("User Validates {string} Estimated Delivery Date Color on Checkout Page")
    public void userValidatesDateColorOnCheckout(String expectedValue) throws Exception {
        String expectedDateColor = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(expectedValue);
        checkoutPage.validateDateColor(expectedDateColor);
    }

    @Then("User Select {string} Shipping Method on Checkout Page")
    public void userSelectShippingMethodOnCheckoutPage(String shippingMethod) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(shippingMethod);
        checkoutPage.clickOnShippingMethod(shippingMethodName);
    }

    @Then("User Validate Email Address is Retained on Checkout Page")
    public void userValidateEmailAddressIsRetainedOnCheckoutPage() {
        checkoutPage.validateEmailAddressIsRetained(VALID_EMAIL_ADDRESS);
    }

    @Then("User Validates {string} Option Selected Visibility {string}")
    public void userValidatesOptionSelectedVisibility(String shippingMethod, String expectedCondition) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(shippingMethod);
        if (expectedCondition.equals("true")) {
            checkoutPage.validateShippingMethodValue(shippingMethodName, true);
        } else {
            checkoutPage.validateShippingMethodValue(shippingMethodName, false);
        }
    }

    @Then("User Validate First Name is Retained on Checkout Page")
    public void userValidateFirstNameIsRetainedOnCheckoutPage() {
        checkoutPage.validateFirstNameIsRetained(VALID_FIRSTNAME);
    }

    @Then("User Validate Last Name is Retained on Checkout Page")
    public void userValidateLastNameIsRetainedOnCheckoutPage() {
        checkoutPage.validateLastNameIsRetained(VALID_LASTNAME);
    }

    @Then("User Validate Address is Retained on Checkout Page")
    public void userValidateAddressIsRetainedOnCheckoutPage() {
        checkoutPage.validateAddressIsRetained(VALID_ADDRESS);
    }

    @Then("User Validate City is Retained on Checkout Page")
    public void userValidateCityIsRetainedOnCheckoutPage() {
        checkoutPage.validateCityIsRetained(VALID_CITY);
    }

    @Then("User Validate State is Retained on Checkout Page")
    public void userValidateStateIsRetainedOnCheckoutPage() {
        checkoutPage.validateStateIsRetained(VALID_STATE);
    }

    @Then("User Validate Zip Code Address is Retained on Checkout Page")
    public void userValidateZipCodeAddressIsRetainedOnCheckoutPage() {
        checkoutPage.validateZipCodeIsRetained(VALID_ZIPCODE);
    }

    @Then("User Validate Phone No is Retained on Checkout Page")
    public void userValidatePhoneNoIsRetainedOnCheckoutPage() {
        checkoutPage.validatePhoneNoIsRetained(VALID_PH_NO);
    }

    @Then("User Validates Shipping Detail Section is in {string} State")
    public void userValidatesShippingDetailSectionIsInState(String state) {
        checkoutPage.validateShippingSectionState(state);

    }

    @Then("User Click on Shipping Details Section Title")
    public void userClickOnShippingDetailsSectionTitle() throws Exception {
        checkoutPage.clickOnShippingDetailTitle();
    }

    @Then("User Validates {string} Method Name on Summary Section of Checkout Page")
    public void userValidatesMethodNameOnSummarySectionOfCheckoutPage(String shippingMethod) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(shippingMethod);
        checkoutPage.validateShippingMethodNameOnSummarySection(shippingMethodName);
    }

    @And("User Validates Successful Loaded Checkout Page")
    public void userValidatesSuccessfulLoadedCheckoutPage() {
        checkoutPage.validateCheckoutPageTriggered();
    }

    @And("User Enters Invalid Email Address on Checkout Page")
    public void userEntersInvalidEmailAddressOnCheckoutPage() throws Exception {
        checkoutPage.enterEmailAddress(INVALID_EMAIL_ADDRESS);
    }

    @And("User Enters Invalid Zip Code on Checkout Page")
    public void userEntersInvalidZipCodeOnCheckoutPage() throws Exception {
        checkoutPage.enterZipCode(INVALID_ZIPCODE);
    }

    @And("User Enters Invalid Phone No on Checkout Page")
    public void userEntersInvalidPhoneNoOnCheckoutPage() throws Exception {
        checkoutPage.enterPhNo(INVALID_PH_NO);
    }

    @Then("User Clears the Email Field on Checkout Page")
    public void userClearsTheEmailFieldOnCheckoutPage() throws Exception {
        checkoutPage.clearEmailField();
    }

    @Then("User Clears the Zip Code Field on Checkout Page")
    public void userClearsTheZipCodeFieldOnCheckoutPage() throws Exception {
        checkoutPage.clearZipCodeField();
    }

    @Then("User Validates Add New Address Visibility {string}")
    public void userValidatesAddNewAddressVisibility(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateAddNewAddressOption(true);
        } else {
            checkoutPage.validateAddNewAddressOption(false);
        }
    }

    @Then("User Validates First Name and Last Name in Shipping Detail Section")
    public void userValidatesFirstNameAndLastNameInShippingDetailSection() {
        checkoutPage.validateFirstAndLastNameInShippingDetailSection(VALID_FIRSTNAME + " " + VALID_LASTNAME);
    }

    @Then("User Validates Address in Shipping Detail Section")
    public void userValidatesAddressInShippingDetailSection() {
        checkoutPage.validateAddressInShippingDetailSection(VALID_ADDRESS);
    }

    @Then("User Validates State City and Zip Code in Shipping Detail Section")
    public void userValidatesStateCityAndZipCodeInShippingDetailSection() {
        checkoutPage.validateStateCityZipCode(VALID_STATE + ", " + VALID_CITY + " " + VALID_ZIPCODE + " US");
    }

    @Then("User Validates Email Address in Shipping Detail Section")
    public void userValidatesEmailAddressInShippingDetailSection() {
        checkoutPage.validateEmailAddressInDetailSection(VALID_DATA_EMAIL_ADDRESS);
    }

    @And("User Clicks on Email Address Field on Checkout Page")
    public void userClicksOnEmailAddressFieldOnCheckoutPage() {
        checkoutPage.clickOnEmailAddressField();
    }

    @And("User Clicks on First Name Field on Checkout Page")
    public void userClicksOnFirstNameFieldOnCheckoutPage() {
        checkoutPage.clickOnFirstNameField();
    }

    @Then("User Validates Required Field Error Message {string} on {string} Field of Checkout Page")
    public void userValidatesRequiredFieldErrorMessageVisibilityOnFieldOfCheckoutPage(String errorMsgText, String inputField) throws Exception {
        String expectedinputField = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(inputField);
        String expectedErrorMsgText = new PropertyLoaderFactory().getPropertyFile(errorMsgPropFile).getProperty(errorMsgText);
        checkoutPage.validateRequiredErrorMessageText(expectedinputField, expectedErrorMsgText);
    }

    @And("User Clicks on Last Name Field on Checkout Page")
    public void userClicksOnLastNameFieldOnCheckoutPage() {
        checkoutPage.clickOnLastNameField();
    }

    @And("User Clicks on Address Field on Checkout Page")
    public void userClicksOnAddressFieldOnCheckoutPage() {
        checkoutPage.clickOnAddressField();
    }

    @And("User Clicks on City Field on Checkout Page")
    public void userClicksOnCityFieldOnCheckoutPage() {
        checkoutPage.clickOnCityField();
    }

    @And("User Clicks on State Field on Checkout Page")
    public void userClicksOnStateFieldOnCheckoutPage() {
        checkoutPage.clickOnStateField();
    }

    @And("User Clicks on Zip Code Field on Checkout Page")
    public void userClicksOnZipCodeFieldOnCheckoutPage() {
        checkoutPage.clickOnZipCodeField();
    }

    @And("User Clicks on Phone No Field on Checkout Page")
    public void userClicksOnPhoneNoFieldOnCheckoutPage() {
        checkoutPage.clickOnPhoneNoField();
    }

    @Then("User Validates Header Visibility {string} on Checkout Page")
    public void userValidatesHeaderVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateHeaderVisibility(true);
        } else {
            checkoutPage.validateHeaderVisibility(false);
        }
    }

    @Then("User Validates Logo Visibility {string} in Header on Checkout Page")
    public void userValidatesLogoVisibilityInHeaderOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateHeaderLogoVisibility(true);
        } else {
            checkoutPage.validateHeaderLogoVisibility(false);
        }
    }

    @Then("User Validates Help icon Visibility {string} on Checkout Page")
    public void userValidatesHelpIconVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateHeaderIconVisibility(true);
        } else {
            checkoutPage.validateHeaderIconVisibility(false);
        }
    }

    @Then("User Clicks on Shipping Details Edit Button on Checkout Page")
    public void userClicksOnShippingDetailsEditButtonOnCheckoutPage() throws Exception {
        checkoutPage.clickOnEditButton();
    }

    @Then("User Click on Inactive Shipping Details Section Title")
    public void userClickOnInactiveShippingDetailsSectionTitle() {
        checkoutPage.validateInactiveShippingDetailsSection();

    }

    @Then("User Validates Shipping Method on Checkout Page")
    public void userValidatesShippingMethodOnCheckoutPage() {
        checkoutPage.validateShippingMethod(SHIPPING_METHOD);
    }

    @Then("User Validates Payment Method Section is in {string} State")
    public void userValidatesPaymentMethodSectionIsInState(String state) {
        checkoutPage.validatePaymentMethodState(state);
    }

    @Then("User Enter {string} in Promo Code on Checkout Page")
    public void userEnterPromoCodeOnCheckoutPage(String coupon) throws Exception {
        String couponValue = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(coupon);
        checkoutPage.enterCouponCode(couponValue);
    }

    @Then("User Validates {string} Coupon Error Message Text on Checkout Page")
    public void userValidatedCouponErrorMessageTextOnCheckoutPage(String errorMsgValue) throws Exception {
        String errorMsg = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(errorMsgValue);
        checkoutPage.validateErrorMsgText(errorMsg);
    }

    @Then("User Clicks on Add Promo Code Button on Checkout Page")
    public void userClicksOnAddPromoCodeButtonOnCheckoutPage() {
        checkoutPage.clickOnAddPromoCodeButton();
    }

    @Then("User Validates Total Amount Using Blank Coupon on Checkout Page")
    public void userValidatesTotalAmountUsingBlankCouponOnCheckoutPage() {
        checkoutPage.validateTotalAmountAfterUsingBlankCoupon();
    }

    @Then("User Clears the Promo Code on Checkout Page")
    public void userClearPromoCodeOnCheckoutPage() throws Exception {
        checkoutPage.clearPromoCode();
    }

    @Then("User Validates Discounted Amount on Checkout Page")
    public void userValidatesDiscountedAmountOnCheckoutPage() {
        checkoutPage.validateDiscountedAmount();
    }

    @Then("User Clicks on Remove Promo Code Button on Checkout Page")
    public void userClicksOnRemovePromoCodeOnCheckoutPage() {
        checkoutPage.clickOnRemovePromoCodeButton();
    }

    @Then("User Validates Total Amount After Removing Promo Code on Checkout Page")
    public void userValidatesTotalAmountAfterRemovingCouponOnCheckoutPage() {
        checkoutPage.validateTotalAmountAfterRemovingPromoCode();
    }

    @Then("User Select {string} Payment Method")
    public void userSelectPaymentMethod(String paymentoption) throws Exception {
        String paymentOption = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(paymentoption);
        checkoutPage.clickOnPaymentMethod(paymentOption);
    }

    @And("User Enters Random Email Address on Checkout Page")
    public void userEntersRandomEmailAddressOnCheckoutPage() throws Exception {
        String rndName = getRandomStrings();
        checkoutPage.enterEmailAddress(rndName + EMAIL_ADDRESS_WITHOUT_RECIPIENT);
    }

    @Then("User Validates Only One Payment Method is Selected")
    public void userValidatesOnlyOnePaymentMethodisSelected() {
        checkoutPage.validateOnlyOnePaymentSelected();
    }

    @Then("User Validates Credit Card Section Visibility {string}")
    public void userValidatesCreditCardSectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateCreditCardSectionVisibility(true);
        } else {
            checkoutPage.validateCreditCardSectionVisibility(false);
        }
    }

    @Then("User Validates Subtotal Price {string} on Checkout Page")
    public void userValidatesSubtotalPriceOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validatesSubtotalPriceVisibility(true);
        }else {
            checkoutPage.validatesSubtotalPriceVisibility(false);
        }
    }

    @Then("User Validates Tax Value {string} on Checkout Page")
    public void userValidatesTaxValueOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validatesTaxValueVisibility(true);
        }else {
            checkoutPage.validatesTaxValueVisibility(false);
        }
    }

    @Then("User Validates total Amount Value {string} on Summary Section of Checkout Page")
    public void userValidatesTotalAmountValueOnSummarySectionOfCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validatesTotalAmountValueVisibility(true);
        }else {
            checkoutPage.validatesTotalAmountValueVisibility(false);
        }
    }

    @Then("User Validates Product Image Visibility {string} on Summary Section of Checkout Page")
    public void userValidatesProductImageVisibilityOnSummarySectionOfCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateProductImageVisibility(true);
        } else {
            checkoutPage.validateProductImageVisibility(false);
        }
    }

    @Then("User Validates Product Size Visibility {string} on Checkout Page")
    public void userValidatesProductSizeVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateProductSizeVisibility(true);
        } else {
            checkoutPage.validateProductSizeVisibility(false);
        }
    }

    @Then("User Validates Product Color Visibility {string} on Checkout Page")
    public void userValidatesProductColorVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateProductColorVisibility(true);
        } else {
            checkoutPage.validateProductColorVisibility(false);
        }
    }

    @Then("User Validates Estimated Delivery Date Visibility {string} on Checkout Page")
    public void userValidatesEstimatedDeliveryDateVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateEstimatedDeliveryDateVisibility(true);
        } else {
            checkoutPage.validateEstimatedDeliveryDateVisibility(false);
        }
    }

    @Then("User Validates Product Quantity {string} on Checkout Page")
    public void userValidatesProductQuantityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateProductQuantityVisibility(true);
        } else {
            checkoutPage.validateProductQuantityVisibility(false);
        }
    }

    @Then("User Validates Products Name Visibility {string} on Checkout Page")
    public void userValidatesProductsNameVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.ValidatesProductsNameVisibility(true);
        } else {
            checkoutPage.ValidatesProductsNameVisibility(false);
        }
    }

    @Then("User Validates Brand Name Visibility {string} on Checkout Page")
    public void userValidatesBrandNameVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.ValidatesBrandNameVisibility(true);
        } else {
            checkoutPage.ValidatesBrandNameVisibility(false);
        }
    }

    @Then("User Validates Actual Amount Visibility {string} on Checkout Page")
    public void userValidatesActualAmountVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.ValidatesActualAmountVisibility(true);
        } else {
            checkoutPage.ValidatesActualAmountVisibility(false);
        }
    }

    @Then("User Validates Original Amount Visibility {string} on Checkout Page")
    public void userValidatesOriginalAmountVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.ValidatesOriginalAmountVisibility(true);
        } else {
            checkoutPage.ValidatesOriginalAmountVisibility(false);
        }
    }

    @Then("User Validates Save Amount Visibility {string} on Checkout Page")
    public void userValidatesSaveAmountVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.ValidatesSaveAmountVisibility(true);
        } else {
            checkoutPage.ValidatesSaveAmountVisibility(false);
        }
    }

    @And("User Enters Invalid Credit Card Number on Checkout Page")
    public void userEntersInvalidCreditCardNumberOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardNumber(INVALID_CC_NUM);
    }

    @And("User Enters Invalid Credit Card Expiry Date on Checkout Page")
    public void userEntersInvalidCreditCardExpiryDateOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardExpiryDate(INVALID_CC_EXPIRY);
    }

    @And("User Enters Invalid Credit Card CVV on Checkout Page")
    public void userEntersInvalidCreditCardCVVOnCheckoutPage() throws Exception {
        checkoutPage.enterCreditCardCVV(INVALID_CC_CVV);
    }

    @Then("User Validates Payment Method Error Visibility {string}")
    public void userValidatesPaymentMethodErrorVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validatePaymentErrorMessageVisibility(true);
        }else {
            checkoutPage.validatePaymentErrorMessageVisibility(false);
        }
    }

    @Then("User Validates {string} Text from {string} on Checkout Page")
    public void userValidatesTextFromOnCheckoutPage(String expectedError, String errorField) throws Exception {
        String field = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(errorField);
        String errorMsg = new PropertyLoaderFactory().getPropertyFile(errorMsgPropFile).getProperty(expectedError);
        checkoutPage.validatePaymentMethodFormErrorMsg(errorMsg,field);
    }

    @Then("User Fetches Shipping Name from Checkout Page")
    public void userFetchesShippingNameFromCheckoutPage() {
        SHIPPING_METHOD=checkoutPage.getShippingMethod();
    }

    @Then("User Fetches Shipping Value From Checkout Page")
    public void userFetchesShippingValueFromCheckoutPage() {
        SHIPPING_VALUE=checkoutPage.getShippingValue();
    }

    @Then("User Validates Shipping Name on Summary Section on Checkout Page")
    public void userValidatesShippingNameOnSummarySectionOnCheckoutPage() {
        checkoutPage.validateShippingMethodonSummary(SHIPPING_METHOD);
    }

    @Then("User Validates Shipping Value on Summary Section on Checkout Page")
    public void userValidatesShippingValueOnSummarySectionOnCheckoutPage() {
        checkoutPage.validateShippingValueonSummary(SHIPPING_VALUE);
    }

    @Then("User Validates PayPal Section Visibility {string}")
    public void userValidatesPayPalSectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validatePayPalSectionVisibility(true);
        }else {
            checkoutPage.validatePayPalSectionVisibility(false);
        }
    }

    @Then("User Clicks on Pay with PayPal Button on Checkout Page")
    public void userClicksPayWithPayPalButtonOnCheckoutPage() throws Exception {
        checkoutPage.clickPayWithPayPalButton();
    }

    @Then("User Validates Tax is Calculated on Checkout Page")
    public void userValidatesTaxIsCalculatedOnCheckoutPage() {
        checkoutPage.validateTaxValue(CALCULATED_TAX_VALUE);
    }

    @Then("User Validates Phone No in Shipping Detail Section")
    public void userValidatesPhoneNoInShippingDetailSection() {
        checkoutPage.validatePhoneNoInDetailSection(VALID_PH_NO);
    }

    @Then("User Validates Order Tracking Email Check Box Visibility {string}")
    public void userValidatesOrderTrackingEmailCheckBoxVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateOrderTrackingCheckBoxVisibility(true);
        }else {
            checkoutPage.validateOrderTrackingCheckBoxVisibility(false);
        }
    }

    @Then("User Validates Order Tracking Email Check Box Type {string}")
    public void userValidatesOrderTrackingEmailCheckBoxType(String type) throws Exception {
        String expectedType = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(type);
        checkoutPage.validateOrderTrackingEmailCheckedOrUnchecked(expectedType);
    }

    @Then("User Clicks on Add New Address Option on Checkout Page")
    public void userClicksOnAddNewAddressButtonOnCheckoutPage() throws Exception {
        checkoutPage.clickAddNewAddressButton();
    }

    @Then("User Clicks on Select from Address Book Button on Checkout Page")
    public void userClicksOnSelectFromAddressBookButtonOnCheckoutPage() throws Exception {
        checkoutPage.selectFromAddressBookButton();
    }

    @Then("User Validates Shipping Detail Address Form Visibility {string} on Checkout Page")
    public void userValidatesShippingDetailAddressFormVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateShippingDetailFormVisibility(true);
        }else {
            checkoutPage.validateShippingDetailFormVisibility(false);
        }
    }

    @Then("User Validates Shipping Detail Address List Visibility {string} on Checkout Page")
    public void userValidatesShippingDetailAddressLVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateShippingDetailAddressListVisibility(true);
        }else {
            checkoutPage.validateShippingDetailAddressListVisibility(false);
        }
    }

    @Then("User Validates Sign Up Check Box Visibility and Checked by Default {string}")
    public void userValidatesSignUpCheckBoxVisibilityAndCheckedByDefault(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateSignUpCheckBoxAndByDefaultVisibility(true);
        }else {
            checkoutPage.validateSignUpCheckBoxAndByDefaultVisibility(false);
        }
    }

    @Then("User Validates Default Shipping Method as {string} on Checkout Page")
    public void userValidatesDefaultShippingMethodAsOnCheckoutPage(String expectedDefault) throws Exception {
        String expectedMethod = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(expectedDefault);
        checkoutPage.validateDefaultShippingMethod(expectedMethod);
    }

    @Then("User Enters Wrong Phone No on Checkout Page")
    public void userEntersWrongPhoneNoOnCheckoutPage() throws Exception {
        checkoutPage.enterPhNo(WRONG_PH_NO);
    }

    @Then("User Validates Entered Phone No in Shipping Detail Section")
    public void userValidatesEnteredPhoneNoInShippingDetailSection() {
        checkoutPage.validateEnteredPhoneNo(WRONG_PH_NO);
    }

    @Then("User Validates Active Shipping Method Section Visibility {string} on Checkout Page")
    public void userValidatesActiveShippingMethodSectionVisibilityOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateActiveShippingMethodSectionVisibility(true);
        }else {
            checkoutPage.validateActiveShippingMethodSectionVisibility(false);
        }
    }

    @Then("User Validates Stored Cards Visibility {string} on Checkout Page")
    public void userValidatesStoredCardsVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateStoredCardSectionVisibility(true);
        }else {
            checkoutPage.validateStoredCardSectionVisibility(false);
        }
    }

    @Then("User Validates Credit Card Expiry Date Visibility {string} on Checkout Page")
    public void userValidatesCreditCardExpiryDateVisibilityOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateCardExpiryVisibility(true);
        }else {
            checkoutPage.validateCardExpiryVisibility(false);
        }
    }

    @Then("User Validates Credit Card Logo Visibility {string} on Checkout Page")
    public void userValidatesCreditCardLogoVisibilityOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateCardLogoVisibility(true);
        }else {
            checkoutPage.validateCardLogoVisibility(false);
        }
    }

    @Then("User Validates Credit Card Last Digits Visibility {string} on Checkout Page")
    public void userValidatesCreditCardLastDigitsVisibilityOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateCardLastDigitsVisibility(true);
        }else {
            checkoutPage.validateCardLastDigitsVisibility(false);
        }
    }

    @And("User Enters Incomplete Phone No on Checkout Page")
    public void userEntersIncompletePhoneNoOnCheckoutPage() throws Exception {
        checkoutPage.enterPhNo(INCOMPLETE_PH_NO);
    }

    @Then("User Clicks on Set as Default Field")
    public void userClicksOnSetAsDefaultFieldOnCheckoutPage() {
        checkoutPage.clickSetAsDefaultField();
    }

    @And("User Enters Random First Name on Checkout Page")
    public void userEntersRandomFirstNameOnCheckoutPage() throws Exception {
        String rndName = getRandomStrings();
        checkoutPage.enterFirstName(rndName);
        RANDOM_NAME  = rndName;
    }

    @Then("User Validates Set as Default Field Visibility {string} on Checkout Page")
    public void userValidatesSetDefaultFieldVisibilityOnCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateSetAsDefaultFieldVisibility(true);
        } else {
            checkoutPage.validateSetAsDefaultFieldVisibility(false);
        }
    }

    @Then("User Validates Credit Card Same as Default")
    public void userValidatesCreditCardSameAsDefault() {
        checkoutPage.validateCreditCard(CREDIT_CARD_NO);
    }

    @Then("User Validates Credit Card Number Field is Empty")
    public void userValidatesCreditCardNumberFieldIsEmpty() throws Exception{
        checkoutPage.validateCreditCardFieldEmpty();
    }

    @Then("User Validates Expiry Date Field is Empty")
    public void userValidatesExpiryDateFieldIsEmpty() throws Exception{
        checkoutPage.validateExpiryDateFieldEmpty();
    }

    @Then("User Validates CVV Number Field is Empty")
    public void userValidatesCVVNumberFieldIsEmpty() throws Exception{
        checkoutPage.validateCVVNumberFieldEmpty();
    }

    @And("User Clears Credit Card Expiry Date on Checkout Page")
    public void userClearsCreditCardExpiryDateOnCheckoutPage() throws Exception {
        checkoutPage.clearCreditCardExpiryDate();
    }

    @Then("User Clicks on Use Shipping Address for Billing Checkbox")
    public void userClicksOnUseShippingAddressForBillingCheckbox() {
        checkoutPage.clickOnUseShippingAddressForBillingCheckBox();
    }

    @Then("User Validates Shipping Addresses Visibility {string} on Dropdown")
    public void userValidatesShippingAddressesVisibilityOnDropdown(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateShippingAddressVisibilityOnDropdown(true);
        } else {
            checkoutPage.validateShippingAddressVisibilityOnDropdown(false);
        }
    }

    @Then("User Validates Add New Address Form Section Visibility {string} on Billing Section of Checkout Page")
    public void userValidatesAddNewAddressFormSectionVisibilityonBillingSectionofCheckoutPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateNewAddressFormSectionVisibility(true);
        } else {
            checkoutPage.validateNewAddressFormSectionVisibility(false);
        }
    }

    @Then("User Validates Required Field Error Message {string} on {string} Field on Billing Section of Checkout Page")
    public void userValidatesRequiredFieldErrorMessageOnFieldOnBillingSectionOfCheckoutPage(String errorMsgText, String inputField) throws Exception {
        String expectedinputField = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(inputField);
        String expectedErrorMsgText = new PropertyLoaderFactory().getPropertyFile(errorMsgPropFile).getProperty(errorMsgText);
        checkoutPage.validateRequiredErrorMessageTextOnBillingSection(expectedinputField, expectedErrorMsgText);
    }


    @Then("User Validates Shipping Address Checkbox Selection is {string}")
    public void userValidatesShippingAddressField(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            checkoutPage.validateShippingAddressField(true);
        } else {
            checkoutPage.validateShippingAddressField(false);
        }
    }

    @Then("User Clicks on Change Address Button on Checkout Page")
    public void userClicksOnChangeAddressButtonOnCheckoutPage() {
        checkoutPage.clickChangeAddressButton();
    }

    @Then("User Select First Saved Address on Checkout Page")
    public void userSelectFirstSavedAddressOnCheckoutPage() {
        checkoutPage.selectSavedAddress();
    }

    @Then("User Fetches Shipping Address on Checkout Page")
    public void userFetchesShippingAddressOnCheckoutPage() {
        SHIPPING_METHOD_USERNAME=checkoutPage.getShippingUserName();
    }

    @Then("User Validates Shipping Address User Name on Checkout Page")
    public void userValidatesShippingAddressUserNameOnCheckoutPage() {
        checkoutPage.validateShippingAddressName(SHIPPING_METHOD_USERNAME);
    }

    @Then("User Validates Shipping Address Quantity on Checkout Page")
    public void userValidatesShippingAddressQuantityOnCheckoutPage() {
        SHIPPING_ADDRESS = checkoutPage.validateShippingAddressQuantityVisibility();
    }

    @Then("User Validates Default Address Visibility {string} on Checkout Page")
    public void userValidatesDefaultAddressVisibilityOnCheckoutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            checkoutPage.validateDefaultAddressVisibility(true);
        }else {
            checkoutPage.validateDefaultAddressVisibility(false);
        }
    }

    @Then("User Validates {string} Credit Card Visibility {string}")
    public void userValidatesCreditCardVisibility(String visaType, String expectedCondition) throws Exception {
        String expectedVisaType = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(visaType);
        if (expectedCondition.equals("true")) {
            checkoutPage.validateCreditCardTypeVisibility(expectedVisaType,true);
        } else {
            checkoutPage.validateCreditCardTypeVisibility(expectedVisaType,false);
        }
    }

    @And("User Clicks on Stored Shipping Address in Payment Section")
    public void userClicksStoredShippingInPaymentSection() throws Exception {
        checkoutPage.clickStoredAddress();
    }

    @Then("User Validates {string} is Already Applied on Checkout Page")
    public void userValidatesIsAlreadyAppliedOnCheckoutPage(String coupon) throws Exception {
        String couponValue= new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(coupon);
        checkoutPage.validateAppliedCouponValue(couponValue);
    }

    @And("User Enters Valid First Name For Billing on Checkout Page")
    public void userEntersValidFirstNameForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterFirstNameForBilling(VALID_FIRSTNAME_BILLING);
    }

    @And("User Enters Valid Last Name For Billing on Checkout Page")
    public void userEntersValidLastNameForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterLastNameForBilling(VALID_LASTNAME_BILLING);
    }

    @And("User Enters Valid Phone No For Billing on Checkout Page")
    public void userEntersValidPhoneNoForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterPhNoForBilling(VALID_PH_NO_BILLING);
    }

    @And("User Enters Valid Address For Billing on Checkout Page")
    public void userEntersValidAddressForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterAddressForBilling(VALID_ADDRESS_BILLING);
    }

    @And("User Enters Valid City For Billing on Checkout Page")
    public void userEntersValidCityForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterCityForBilling(VALID_CITY_BILLING);
    }

    @And("User Selects Valid State For Billing on Checkout Page")
    public void userSelectsValidStateForBillingOnCheckoutPage() throws Exception {
        checkoutPage.selectStateForBilling(VALID_STATE_BILLING);
    }

    @And("User Enters Valid Zip Code For Billing on Checkout Page")
    public void userEntersValidZipCodeForBillingOnCheckoutPage() throws Exception {
        checkoutPage.enterZipCodeForBilling(VALID_ZIPCODE_BILLING);
    }

    @And("User Enters {string} as Credit Card Number on Checkout Page")
    public void userEntersAsCreditCardNumberOnCheckoutPage(String creditCardType) throws Exception {
        String creditCardNumber = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(creditCardType);
        checkoutPage.enterCreditCardNumber(creditCardNumber);
    }

    @And("User Enters Four Digit CVV Number on Checkout Page")
    public void userEntersFourDigitCVVNumberOnCheckoutPage() throws Exception {
        String fourDigitCVVNumber = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty("four.digit.cvv");
        checkoutPage.enterCreditCardCVV(fourDigitCVVNumber);
    }

    @Then("User Validates Four CVV Number is Not Entered")
    public void userValidatesFourCVVNumberIsNotEntered() throws Exception {
        checkoutPage.validateFourDigitCVVNotEntered();
    }

    @And("User Clears Credit Card Number on Checkout Page")
    public void userClearsCreditCardNumberOnCheckoutPage() throws Exception {
        checkoutPage.clearCreditCardNumber();
    }

    @And("User Clears Credit Card CVV Number on Checkout Page")
    public void userClearsCreditCardCVVNumberOnCheckoutPage() throws Exception {
        checkoutPage.clearCreditCardCVVNumber();
    }

    @Then("User Validates Four CVV Number is Entered")
    public void userValidatesFourCVVNumberIsEntered() throws Exception {
        checkoutPage.validateFourDigitCVVEntered();
    }

    @Then("User Validates Save Card for Next Time Checkbox Visibility {string}")
    public void userValidatesSaveCardForNextTimeCheckboxVisibility(String expectedVisibility) {
        if (expectedVisibility.equals("true")) {
            checkoutPage.validateSaveCardForNextPayVisibility(true);
        } else {
            checkoutPage.validateSaveCardForNextPayVisibility(false);
        }
    }

    @Then("User Validates {string} Selected Payment Method {string} on Checkout Page")
    public void userValidatesPaymentMethodIsSelected(String paymentMethod, String expectedSelection) throws Exception  {
        String expectedPaymentMethod = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(paymentMethod);
        if (expectedSelection.equals("true")) {
            checkoutPage.validatePaymentSelected(expectedPaymentMethod,true);
        } else {
            checkoutPage.validatePaymentSelected(expectedPaymentMethod,false);
        }
    }

    @Then("User Validates Payment Method {string} Option Visibility {string} on Checkout Page")
    public void userValidatePaymentMethodOptionVisibilityOnCheckoutPage(String paymentMethod ,String expectedCondition) throws Exception {
        String expectedPaymentMethod = new PropertyLoaderFactory().getPropertyFile(checkoutPropFile).getProperty(paymentMethod);
        if(expectedCondition.equals("true")){
            checkoutPage.validatePaymentMethodOptionVisibility(expectedPaymentMethod,true);
        }else {
            checkoutPage.validatePaymentMethodOptionVisibility(expectedPaymentMethod,false);
        }
    }

    @Then("User waits for Payment Method to Load")
    public void userWaitsForPaymentMethodToLoad() {
        checkoutPage.waitForPaymentMethodToLoad();
    }
}