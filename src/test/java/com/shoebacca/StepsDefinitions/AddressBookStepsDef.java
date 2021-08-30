package com.shoebacca.StepsDefinitions;

import PageObjectFactory.AddressBookPageFactory;
import PageObjectFactory.CheckoutPageFactory;
import PageObjectFactory.HomePageFactory;
import io.cucumber.java.en.Then;

public class AddressBookStepsDef extends HarnessVariables{

    AddressBookPageFactory addressbookPage;

    public AddressBookStepsDef() throws Exception {
        addressbookPage = new AddressBookPageFactory();
    }

    @Then("User Validates Saved Addresses Visibility on Address Book Page {string}")
    public void userValidatesSavedAddressesVisibilityOnAddressBookPageString(String expectedCondition) {
        if(expectedCondition.equals("true")){
            addressbookPage.validateSavedAddressVisibility(true);
        }else {
            addressbookPage.validateSavedAddressVisibility(false);
        }
    }
}
