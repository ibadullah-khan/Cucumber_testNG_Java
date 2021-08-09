package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CartPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepsDef extends HarnessVariables{

    protected String runPropFile = "run.properties";
    protected String cartPropFile = "cartData.properties";

    CartPageFactory cartPage;

    public CartStepsDef() throws Exception {
        cartPage = new CartPageFactory();
    }

    @And("User Validates Item Heading on Item Container Visibility {string}")
    public void userValidatesItemHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(ITEM_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(ITEM_HEADING,false);
        }
    }

    @And("User Validates Description Heading on Item Container Visibility {string}")
    public void userValidatesDescriptionHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(DESCRIPTION_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(DESCRIPTION_HEADING,false);
        }
    }

    @And("User Validates Quantity Heading on Item Container Visibility {string}")
    public void userValidatesQuantityHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(QUANTITY_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(QUANTITY_HEADING,false);
        }
    }

    @And("User Validates Item Total Heading on Item Container Visibility {string}")
    public void userValidatesItemTotalHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(ITEM_TOTAL_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(ITEM_TOTAL_HEADING,false);
        }
    }

    @And("User Validates Item Content on Item Container Visibility {string}")
    public void userValidatesItemContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(ITEM_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(ITEM_CONTENT,false);
        }
    }

    @And("User Validates Description Content on Item Container Visibility {string}")
    public void userValidatesDescriptionContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(DESCRIPTION_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(DESCRIPTION_CONTENT,false);
        }
    }

    @And("User Validates Quantity Content on Item Container Visibility {string}")
    public void userValidatesQuantityContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(QUANTITY_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(QUANTITY_CONTENT,false);
        }
    }

    @And("User Validates Item Total Content on Item Container Visibility {string}")
    public void userValidatesItemTotalContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(ITEM_TOTAL_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(ITEM_TOTAL_CONTENT,false);
        }
    }

    @And("User Validates {string} Quantity is Displayed on Quantity Text Field")
    public void userValidatesQuantityIsDisplayedOnQuantityTextField(String expectedValue) {
        cartPage.validateQuantityOfProductAdded(expectedValue);
    }

    @And("User Validates Cart Items Quantity {string} on Cart Page")
    public void userValidatesCartItemsQuantityOnCartPage(String expectedValue) {
        cartPage.validateCartItemQuantity(expectedValue);
    }

    @Then("User Validates Summary Section Visibility {string}")
    public void userValidatesSummarySectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateSummarySectionVisibility(true);
        }else {
            cartPage.validateSummarySectionVisibility(false);
        }
    }
    @Then("User Click on Remove Link on {string} Product on Cart Page")
    public void userClickOnRemoveLinkOnProductOnCartPage(String productName) throws Exception {
        String removeProductName = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(productName);
        cartPage.clickOnRemoveLink(removeProductName);
    }

    @Then("User Validates Price Between Product Item Section and Account Detail Section")
    public void userValidatesPriceBetweenProductItemSectionAndAccountDetailSection() {
        cartPage.validateSubAmount();
    }

    @Then("User Validates Cart Page Has {string} Remove Product Link")
    public void userValidatesCartPageHasRemoveProductLink(String expectedRemoveLink) {
        cartPage.validateRemoveLinkVisibility((Integer.parseInt(expectedRemoveLink)));
    }

    @Then("User Validates {string} Products have Been Added to Cart")
    public void userValidatesProductsHaveBeenAddedToCart(String expectedCount) {
        cartPage.validateDifferentProductNoAdded(expectedCount);
    }

    @Then("User Validates Product Name in Cart Page")
    public void userValidatesProductNameInCartPage() {
        cartPage.validateProductName(PRODUCT_NAME);
    }

    @Then("User Validates Cart Has {string} Product's Attributes Visibility {string}")
    public void userValidatesCartHasProductSAttributesVisibility(String expectedNumber, String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateAllProductsAttributesVisibility(expectedNumber,true);
        }else {
            cartPage.validateAllProductsAttributesVisibility(expectedNumber,false);
        }
    }

    @And("User Click on Product Name on Cart Page")
    public void userClickOnProductNameOnCartPage() {
        cartPage.clickOnProductName();
    }

    @Then("User Validates Your Cart is Empty Section Visibility {string}")
    public void userValidatesYourCartIsEmptySectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateCartIsEmptySectionVisibility(true);
        }else {
            cartPage.validateCartIsEmptySectionVisibility(false);
        }
    }

    @And("User Enters {string} on Quantity Text Field on Cart")
    public void userEntersOnQuantityTextFieldOnCart(String quantityValue) throws Exception {
        cartPage.enterProductQuantity(quantityValue);
    }

    @Then("User Clicks on Change Shipping Option of Cart Page")
    public void userClicksOnChangeShippingOptionofCartPage() {
        cartPage.clickOnChangeShippingOption();
    }

    @Then("User Clicks on {string} Shipping Method on Dropdown of Cart Page")
    public void userClicksOnShippingMethod(String shippingMethod) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        cartPage.clickOnShippingMethod(shippingMethodName);
    }

    @Then("User Validates {string} Shipping Method Visibility {string} on Dropdown of Cart Page")
    public void userValidatesMethodVisibilityOnDropdownofCartPage(String shippingMethod, String expectedCondition) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        if(expectedCondition.equals("true")){
            cartPage.validateShippingMethodVisibilityOnDropDown(shippingMethodName,true);
        }else {
            cartPage.validateShippingMethodVisibilityOnDropDown(shippingMethodName,false);
        }
    }

    @Then("User Validates {string} Shipping Price Visibility {string} on Dropdown of Cart Page")
    public void userValidatesShippingPriceVisibilityOnDropdownofCartPage(String shippingMethod, String expectedCondition) throws Exception {
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        if(expectedCondition.equals("true")){
            cartPage.validateShippingPriceVisibilityOnDropDown(shippingMethodName,true);
        }else {
            cartPage.validateShippingPriceVisibilityOnDropDown(shippingMethodName,false);
        }
    }

    @Then("User Validates total Amount on Summary Section of Cart Page")
    public void userValidatesTotalAmountOnSummarySectionOfCartPage() {
        cartPage.validateTotalAmount();
    }

    @Then("User Validates {string} Method Price {string} on Dropdown of Cart Page")
    public void userValidatesShippingPriceAmountOnDropdownofCartPage(String shippingMethod, String shippingPrice) throws Exception {
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        String shippingPriceValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingPrice);
        cartPage.validateShippingPriceAmountOnDropDown(shippingMethodName,shippingPriceValue);

    }

    @Then("User Validates {string} Shipping Price on Summary Section of Cart Page")
    public void userValidatesShippingPriceOnSummarySectionOfCartPage(String shippingPrice) throws Exception{
        String shippingPriceValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingPrice);
        cartPage.validateShippingPriceAmountOnSummarySection(shippingPriceValue);
    }

    @Then("User Validates {string} Shipping Method Name on Summary Section of Cart Page")
    public void userValidatesShippingMethodNameOnSummarySectionOfCartPage(String shippingMethod) throws Exception{
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        cartPage.validateShippingMethodNameOnSummarySection(shippingMethodName);
    }
}