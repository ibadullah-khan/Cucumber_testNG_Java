package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CartPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepsDef extends HarnessVariables{

    protected String runPropFile = "run.properties";

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
    @Then("User Click on Remove Link on  {string} Product on Cart Page")
    public void userClickOnRemoveLinkOnProductOnCartPage(String productName) throws Exception {
        String removeProductName = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(productName);
        cartPage.clickonRemoveLink(removeProductName);
    }

    @Then("User Validates Price Between Product Item Section and Account Detail")
    public void userValidatesPriceBetweenProductItemSectionAndAccountDetail() {
        cartPage.validateAmount();
    }

    @Then("User Validates Product Quantity {string} in Counter Section on Cart Page")
    public void userValidatesProductQuantityInCounterSectionOnCartPage(String expectedQuantity)  {
        cartPage.validateProductQuantityInCounterSection(expectedQuantity);
    }

    @Then("User Validates Cart Page Has {string} Remove Product Link")
    public void userValidatesCartPageHasRemoveProductLink(String expectedRemoveLink) {
        cartPage.validateRemoveLinkVisibility((Integer.parseInt(expectedRemoveLink)));
    }
}
