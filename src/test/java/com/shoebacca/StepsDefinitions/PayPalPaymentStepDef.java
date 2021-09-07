package com.shoebacca.StepsDefinitions;

import PageObjectFactory.PayPalPaymentPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PayPalPaymentStepDef extends HarnessVariables{

    PayPalPaymentPageFactory payPalPaymentPageFactory = new PayPalPaymentPageFactory();

    public PayPalPaymentStepDef() throws Exception {
    }

    @Then("User Validates Successful Loaded PayPal Page")
    public void userValidatesSuccessfulLoadedPayPalPage() {
        customWait(5000);
    }

    @Then("User Click on Cancel and Return To Shoebacca Button on PayPal Payment Page")
    public void userClickOnCancelAndReturnToShoebaccaButtonOnPayPalPaymentPage() throws Exception {
        payPalPaymentPageFactory.clickOnCancelAndReturnToShoebacca();
    }

    @Then("User Switches to Parent Tab")
    public void userSwitchesToParentTab() {
        switchToParentTab();
    }
    @And("User Enters Valid PayPal Username on PayPal Page")
    public void userEntersValidPayPalUsernameOnPayPalPage() throws Exception {
        payPalPaymentPageFactory.userEnterPayPalUsername(VALID_PAYPAL_USERNAME);

    }

    @And("User Clicks on Next Button on PayPal Page")
    public void userClicksOnNextButtonOnPayPalPage() {
        payPalPaymentPageFactory.userClicksOnNextButton();
    }

    @And("User Enters Valid PayPal Password on PayPal Page")
    public void userEntersValidPayPalPasswordOnPayPalPage() throws Exception {
        payPalPaymentPageFactory.userEnterPayPalPassword(VALID_PAYPAL_PASSWORD);
    }

    @And("User Clicks on Login Button on PayPal Page")
    public void userClicksOnLoginButtonOnPayPalPage() {
        payPalPaymentPageFactory.userClicksOnLoginButton();
    }

    @Then("User Clicks on Pay Now Button PayPal Page")
    public void userClicksOnPayNowButtonPayPalPage() throws Exception {
        payPalPaymentPageFactory.userClicksOnPayNowButton();
    }

    @And("User Wait for Final Details to Load on PayPal Page")
    public void userWaitForFinalDetailsToLoadOnPayPalPage() { payPalPaymentPageFactory.userWaitForPayLaterDetailsToLoad();
    }
}
