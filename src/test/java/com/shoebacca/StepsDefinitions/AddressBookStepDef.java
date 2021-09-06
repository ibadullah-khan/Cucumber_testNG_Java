package com.shoebacca.StepsDefinitions;

import PageObjectFactory.AddressBookPageFactory;
import io.cucumber.java.en.Then;

public class AddressBookStepDef extends HarnessVariables{

    AddressBookPageFactory addressBookPage;

    public AddressBookStepDef() throws Exception {
        addressBookPage = new AddressBookPageFactory();
    }

    @Then("User Validates Address Set as Default Visibility {string}")
    public void userValidatesAddressSetAsDefaultVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            addressBookPage.validateAddressSetAsDefault(VALID_FIRSTNAME+" "+VALID_LASTNAME,true);
        }else {
            addressBookPage.validateAddressSetAsDefault(VALID_FIRSTNAME+" "+VALID_LASTNAME,false);
        }
    }

    @Then("User Validates Address Set as Default in Address Book Visiblity {string}")
    public void userValidatesAddressSetAsDefaultInAddressBookVisiblity(String expectedCondition) {
        if(expectedCondition.equals("true")){
            addressBookPage.validateAddressSetAsDefault(RANDOM_NAME+" "+VALID_LASTNAME,true);
        }else {
            addressBookPage.validateAddressSetAsDefault(RANDOM_NAME+" "+VALID_LASTNAME,false);
        }
    }
}