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
}
