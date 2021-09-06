package com.shoebacca.StepsDefinitions;

import PageObjectFactory.PaymentMethodPageFactory;
import io.cucumber.java.en.Then;

public class PaymentMethodStepsDef extends HarnessVariables{

    PaymentMethodPageFactory paymentMethodPage;

    public PaymentMethodStepsDef() throws Exception {
        paymentMethodPage = new PaymentMethodPageFactory();
    }

    @Then("User Fetch Default Credit Card")
    public void userFetchDefaultCreditCard() {
        CREDIT_CARD_NO= paymentMethodPage.fetchDefaultCreditCard();
    }
}