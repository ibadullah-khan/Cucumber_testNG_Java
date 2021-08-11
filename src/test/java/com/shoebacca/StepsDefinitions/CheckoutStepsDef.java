package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CheckoutPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepsDef extends HarnessVariables{

    CheckoutPageFactory checkoutPage;

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
        TAX_VALUE=checkoutPage.getTaxValue();
    }

    @Then("User Validates Tax Value from Checkout")
    public void userValidatesTaxValueFromCheckout() {
        checkoutPage.validateTaxValue(TAX_VALUE);
    }
}