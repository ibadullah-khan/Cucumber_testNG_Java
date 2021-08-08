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

    @Then("User Validates Product Name in Mini Cart")
    public void userValidatesProductNameInMiniCart() {

        miniCartPage.validateProductName(PRODUCT_NAME);
    }

    @Then("User Validates Product Price in Mini Cart")
    public void userValidatesProductPriceInMiniCart() {
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

    @Then("User Validates Product Image Visibility {string}")
    public void userValidatesProductImageVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductImageVisibility(1,true);
        }else {
            miniCartPage.validateProductImageVisibility(1,false);
        }
    }

    @Then("User Validates Product Size Visibility {string}")
    public void userValidatesProductSizeVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductSizeVisibility(1,true);
        }else {
            miniCartPage.validateProductSizeVisibility(1,false);
        }
    }

    @Then("User Validates Product Color Visibility {string}")
    public void userValidatesProductColorVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductColorVisibility(1,true);
        }else {
            miniCartPage.validateProductColorVisibility(1,false);
        }
    }

    @Then("User Validates Product Remove Visibility {string}")
    public void userValidatesProductRemoveVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductRemoveVisibility(1,true);
        }else {
            miniCartPage.validateProductRemoveVisibility(1,false);
        }
    }

    @Then("User Validates Product Brand Visibility {string}")
    public void userValidatesProductBrandVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductBrandVisibility(1,true);
        }else {
            miniCartPage.validateProductBrandVisibility(1,false);
        }
    }

    @Then("User Validates Shipping Label Visibility {string}")
    public void userValidatesShippingLabelVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateShippingLabelVisibility(true);
        }else {
            miniCartPage.validateShippingLabelVisibility(false);
        }
    }

    @Then("User Validates View Cart Button Visibility {string}")
    public void userValidatesViewCartButtonVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateViewCartButtonVisibility(true);
        }else {
            miniCartPage.validateViewCartButtonVisibility(false);
        }
    }

    @Then("User Validates Checkout Button Visibility {string}")
    public void userValidatesCheckoutButtonVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateCheckoutButtonVisibility(true);
        }else {
            miniCartPage.validateCheckoutButtonVisibility(false);
        }
    }

    @And("User Validates Previous Product Name in Mini Cart")
    public void userValidatesPreviousProductNameInMiniCart() {
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

    @And("User Clicks Checkout Button on Mini Cart View")
    public void userClicksCheckoutButtonOnMiniCartView() {
        miniCartPage.clickOnCheckoutButton();
    }

    @Then("User Validates Edit Product Quantity Button Visibility {string}")
    public void userValidatesEditProductVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateEditQuantityVisibility(true);
        }else {
            miniCartPage.validateEditQuantityVisibility(false);
        }
    }

    @Then("User Click on Remove Link on Mini Cart View")
    public void userClickOnRemoveLinkOnMiniCartView() {
        miniCartPage.clickOnProductRemoveLink();
    }

    @Then("User Validates Product Section Visibility {string} on Mini Cart View")
    public void userValidatesProductSectionVisibilityOnMiniCartView(String expectedCondition) {
        if(expectedCondition.equals("true")){
            miniCartPage.validateProductSectionVisibility(true);
        }else {
            miniCartPage.validateProductSectionVisibility(false);
        }
    }

    @And("User Validates Product Count {string} on Mini Cart")
    public void userValidatesProductCountOnMiniCart(String expectedValue) {
        miniCartPage.validateProductCountText(expectedValue);
    }

    @Then("User Validates Tax Value from Mini Cart")
    public void userValidatesTaxValueFromMinicart() {
        miniCartPage.validateTaxValue(TAX_VALUE);
    }
}
