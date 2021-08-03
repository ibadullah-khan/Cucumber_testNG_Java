package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CartPageFactory;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.WaitFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartPageStepsDef extends HarnessVariables{

    protected String runPropFile = "run.properties";
    WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    CartPageFactory cartPage;

    public CartPageStepsDef() throws Exception {
        cartPage = new CartPageFactory();
    }

    @Then("User Click on Remove Link on  {string} Product on Cart Page")
    public void userClickOnRemoveLinkOnProductOnCartPage(String productName) throws Exception {
        String removeProductName = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(productName);
        cartPage.clickonRemoveLink(removeProductName);
    }

    @And("User Validates Product Remove Successfully")
    public void userValidatesProductRemoveSuccessfully() {
        cartPage.validateRemoveLinkTriggered();
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