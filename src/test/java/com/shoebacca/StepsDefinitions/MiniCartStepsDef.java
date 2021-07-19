package com.shoebacca.StepsDefinitions;

import PageObjectFactory.MiniCartPageFactory;
import io.cucumber.java.en.And;

public class MiniCartStepsDef {

    MiniCartPageFactory miniCartPage;

    public MiniCartStepsDef() throws Exception {
        miniCartPage = new MiniCartPageFactory();
    }

    @And("User Validate Mini Cart View is Visible")
    public void user_validate_mini_cart_view_is_visible() throws Exception {
        miniCartPage.validateMiniCartViewVisibility(true);
    }
}
