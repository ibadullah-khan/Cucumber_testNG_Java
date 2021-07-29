package com.shoebacca.StepsDefinitions;

import PageObjectFactory.ProductDetailsPageFactory;
import io.cucumber.java.en.And;

public class PDPStepsDef extends HarnessVariables{

    ProductDetailsPageFactory productDetailsPage;

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
}


