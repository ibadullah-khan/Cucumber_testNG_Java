package com.shoebacca.StepsDefinitions;

import PageObjectFactory.MiniCartPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MiniCartStepsDef {

    MiniCartPageFactory miniCartPage;

    public MiniCartStepsDef() throws Exception {
        miniCartPage = new MiniCartPageFactory();
    }

    @And("User Validates Mini Cart View is Visible")
    public void userValidateMiniCartViewIsVisible() throws Exception {
        miniCartPage.validateMiniCartViewVisibility(true);
    }

    @Then("User Clicks the Login Link On Mini Cart View")
    public void userClicksTheLoginLinkOnMiniCartView() {
        miniCartPage.clickOnLoginLink();
    }
}
