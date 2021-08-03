package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CartFactory;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CartStepDef extends HarnessVariables{

    protected String url;
    protected String runPropFile = "run.properties";
    protected String validatePropFile = "validateData.properties";

    CartFactory cart;

    public CartStepDef() throws Exception {
        cart = new CartFactory();
    }

    @And("User Validates Product Name in Cart")
    public void userValidateProductNameInCart() {
        cart.validateProductName(PRODUCT_NAME);
    }

    @And("User Validates Product Price in Cart")
    public void userValidateProductPriceInCart() {
        cart.validateProductPrice(PRODUCT_PRICE);
    }

    @And("User Validates Product Colour in Cart")
    public void userValidateProductColourInCart() {
        cart.validateProductColour(PRODUCT_COLOUR);
    }

    @And("User Validates Product Size in Cart")
    public void userValidateProductSizeInCart() {
        cart.validateProductSize(PRODUCT_SIZE);
    }

    @And("User Validates Second Product Name in Cart")
    public void userValidatesSecondProductNameInCart() {
        cart.validateSecondProductName(PRODUCT_NAME);
    }

    @And("User Validates Second Product Price in Cart")
    public void userValidatesSecondProductPriceInCart() {
        cart.validateSecondProductPrice(PRODUCT_PRICE);
    }

    @And("User Validates Second Product Size in Cart")
    public void userValidatesSecondProductSizeInCart() {
        cart.validateSecondProductSize(PRODUCT_SIZE);
    }
}
