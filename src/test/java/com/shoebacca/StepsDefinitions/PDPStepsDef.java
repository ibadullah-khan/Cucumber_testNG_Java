package com.shoebacca.StepsDefinitions;

import PageObjectFactory.ProductDetailsPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PDPStepsDef extends HarnessVariables{

    ProductDetailsPageFactory productDetailsPage;
    protected String pdpPropFile = "pdp.properties";

    public PDPStepsDef() throws Exception {
        productDetailsPage = new ProductDetailsPageFactory();
    }

    @And("User Clicks Add to Cart Button on PDP")
    public void userClicksAddToCartButtonOnPDP() {
        productDetailsPage.clickOnAddToCart();
    }

    @And("User Fetches Product Name from PDP")
    public void userFetchesProductNameFromPDP() {
        PRODUCT_NAME = productDetailsPage.getProductName();
    }

    @And("User Fetches Product Price from PDP")
    public void userFetchesProductPriceFromPDP() {
        PRODUCT_PRICE = productDetailsPage.getProductPrice();
    }

    @And("User Keeps Track of Product Name")
    public void userKeepsTrackOfProductName() {
        PREVIOUS_PRODUCT_NAME = PRODUCT_NAME;
    }

    @And("User Fetches Product Colour from PDP")
    public void userFetchesProductColourFromPDP() {
        PRODUCT_COLOUR=productDetailsPage.getProductColour();
    }

    @And("User Fetches Product Size from PDP")
    public void userFetchesProductSizeFromPDP() {
        PRODUCT_SIZE=productDetailsPage.getProductSize();
    }

    @And("User Fetches Product Brand from PDP")
    public void userFetchesProductBrandFromPDP() {
        PRODUCT_BRAND=productDetailsPage.getProductBrand();
    }

    @And("User Select First Available Product Size from PDP")
    public void userSelectFirstAvailableProductSizeFromPDP() {
        productDetailsPage.selectFirstAvailableProductSize();
    }

    @Then("User Validates Product Name from PDP to Related Product Name")
    public void userValidatesProductNameFromPDPtoRelatedProductName() {
        productDetailsPage.validateProductNameToRelatedProduct(PRODUCT_NAME,RELATED_PRODUCT_NAME);
    }

    @Then("User Validates {string} Estimated Delivery Date Color on PDP")
    public void userValidatesDateColorOnPDP(String expectedValue) throws Exception {
        String expectedDateColor= new PropertyLoaderFactory().getPropertyFile(pdpPropFile).getProperty(expectedValue);
        productDetailsPage.validateDateColor(expectedDateColor);
    }

    @Then("User Validates Estimated Delivery Date Visibility on PDP {string} for Mobile")
    public void userValidatesEstimatedDeliveryDateVisibilityOnPDP(String expectedCondition) {
        if(expectedCondition.equals("true")){
            productDetailsPage.validateEstimatedDeliveryDateQuantityVisibility(true);
        }else {
            productDetailsPage.validateEstimatedDeliveryDateQuantityVisibility(false);
        }
    }

    @Then("User Clicks Add to Cart Button on PDP for Mobile")
    public void userClicksAddToCartButtonOnPDPForMobile() {
        productDetailsPage.clickOnAddToCartMobile();
    }

}