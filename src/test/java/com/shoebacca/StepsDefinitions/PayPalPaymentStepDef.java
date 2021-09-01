package com.shoebacca.StepsDefinitions;

import PageObjectFactory.PayPalPaymentPageFactory;
import io.cucumber.java.en.Then;

public class PayPalPaymentStepDef extends HarnessVariables{

    PayPalPaymentPageFactory payPalPaymentPageFactory = new PayPalPaymentPageFactory();

    public PayPalPaymentStepDef() throws Exception {
    }

    @Then("User Validates Successful Loaded PayPal Page")
    public void userValidatesSuccessfulLoadedPayPalPage() {
        customWait(5000);
    }
}
