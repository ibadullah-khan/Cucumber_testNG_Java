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

    @Then("User Validates Login Link Visibility on Mini Cart View {string}")
    public void userValidatesLoginLinkVisibilityOnMiniCartView(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateLoginLinkVisibility(true);
        }else {
            miniCartPage.validateLoginLinkVisibility(false);
        }
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

    @Then("User Validates Mini Cart Scrollability {string}")
    public void userValidatesMiniCartScrollability(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateMiniCartScrollability(true);
        }else {
            miniCartPage.validateMiniCartScrollability(false);
        }
    }

    @Then("User Validate Product Image Visibility {string}")
    public void userValidateProductImageVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductImageVisibility(1,true);
        }else {
            miniCartPage.validateProductImageVisibility(1,false);
        }
    }

    @Then("User Validate Product Size Visibility {string}")
    public void userValidateProductSizeVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductSizeVisibility(1,true);
        }else {
            miniCartPage.validateProductSizeVisibility(1,false);
        }
    }

    @Then("User Validate Product Color Visibility {string}")
    public void userValidateProductColorVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductColorVisibility(1,true);
        }else {
            miniCartPage.validateProductColorVisibility(1,false);
        }
    }

    @Then("User Validate Product Remove Visibility {string}")
    public void userValidateProductRemoveVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductRemoveVisibility(1,true);
        }else {
            miniCartPage.validateProductRemoveVisibility(1,false);
        }
    }

    @Then("User Validate Product Brand Visibility {string}")
    public void userValidateProductBrandVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductBrandVisibility(1,true);
        }else {
            miniCartPage.validateProductBrandVisibility(1,false);
        }
    }

    @Then("User Validate Shipping Label Visibility {string}")
    public void userValidateShippingLabelVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateShippingLabelVisibility(true);
        }else {
            miniCartPage.validateShippingLabelVisibility(false);
        }
    }

    @Then("User Validate Tax Label Visibility {string}")
    public void userValidateTaxLabelVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateTaxLabelVisibility(true);
        }else {
            miniCartPage.validateTaxLabelVisibility(false);
        }
    }

    @Then("User Validate View Cart Button Visibility {string}")
    public void userValidateViewCartButtonVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateViewCartButtonVisibility(true);
        }else {
            miniCartPage.validateViewCartButtonVisibility(false);
        }
    }

    @Then("User Validate Checkout Button Visibility {string}")
    public void userValidateCheckoutButtonVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateCheckoutButtonVisibility(true);
        }else {
            miniCartPage.validateCheckoutButtonVisibility(false);
        }
    }

    @And("User Validate Previous Product Name in Mini Cart")
    public void userValidatePreviousProductNameInMiniCart() {
        miniCartPage.validateInvalidProductName(PREVIOUS_PRODUCT_NAME);
    }

    @Then("User Validates {string} Products have Been Added to Mini Cart")
    public void userValidatesProductsHaveBeenAddedToMiniCart(String expectedCount) {
        miniCartPage.validateProductNoAdded(expectedCount);
    }

    @Then("User Validates Mini Cart Has {string} Product's Attributes Visibility {string}")
    public void userValidatesMiniCartHasProductSAttributesVisibility(String expectedNumber, String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateAllProductsAttributesVisibility(expectedNumber,true);
        }else {
            miniCartPage.validateAllProductsAttributesVisibility(expectedNumber,false);
        }
    }

    @Then("User Click on View Cart Button")
    public void userClickOnViewCartButton() {
        miniCartPage.clickOnViewCartButton();
    }
}
