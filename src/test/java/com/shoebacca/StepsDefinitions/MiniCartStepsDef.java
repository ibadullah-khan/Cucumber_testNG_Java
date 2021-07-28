package com.shoebacca.StepsDefinitions;

import PageObjectFactory.MiniCartPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MiniCartStepsDef extends HarnessVariables{

    MiniCartPageFactory miniCartPage;

    public MiniCartStepsDef() throws Exception {
        miniCartPage = new MiniCartPageFactory();
    }

    @Then("User Clicks the Login Link On Mini Cart View")
    public void userClicksTheLoginLinkOnMiniCartView() {
        miniCartPage.clickOnLoginLink();
    }

    @Then("User Validates Login Link Visibility on Mini Cart View")
    public void userValidatesLoginLinkVisibilityOnMiniCartView() {
        miniCartPage.validateLoginLinkVisibility(false);
    }

    @And("User Closes Mini Cart View")
    public void userClosesMiniCartView() {
        miniCartPage.clickOnCloseIcon();
    }

    @And("User Validates Successful Triggered Mini Cart")
    public void userValidatesSuccessfulTriggeredMiniCart() {
        miniCartPage.validateMiniCartTriggered();
    }

    @Then("User Validate Product Name in Mini Cart")
    public void userValidateProductNameInMiniCart() {
        miniCartPage.validateProductName(PRODUCT_NAME);
    }

    @Then("User Validate Product Price in Mini Cart")
    public void userValidateProductPriceInMiniCart() {
        miniCartPage.validateProductPrice(PRODUCT_PRICE);
    }

    @And("User Validates Mini Cart View Visibility {string}")
    public void userValidatesMiniCartViewVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")) {
            miniCartPage.validateMiniCartViewVisibility(true);
        } else {
            miniCartPage.validateMiniCartViewVisibility(false);
        }
    }

    @And("User Validates Close Button Visibility {string}")
    public void userValidatesCloseButtonVisibility(String expectedCondition) {

        if(expectedCondition.equals("true")) {
            miniCartPage.validateCloseButtonVisibility(true);
        } else {
            miniCartPage.validateCloseButtonVisibility(false);
        }
    }

    @And("User Validates Mini Cart View Visibilility {string}")
    public void userValidatesMiniCartViewVisibilility(String expectedConditions) {
        if(expectedConditions.equals("true")){
            miniCartPage.validateMiniCartViewVisibility(true);
        }else{
            miniCartPage.validateMiniCartViewVisibility(false);
        }
    }
}
