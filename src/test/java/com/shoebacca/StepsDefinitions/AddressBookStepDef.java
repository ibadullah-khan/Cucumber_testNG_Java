package com.shoebacca.StepsDefinitions;

import PageObjectFactory.AddressBookPageFactory;
import io.cucumber.java.en.Then;

public class AddressBookStepDef extends HarnessVariables{

    AddressBookPageFactory addressBookPage;

    public AddressBookStepDef() throws Exception {
        addressBookPage = new AddressBookPageFactory();
    }

    @Then("User Validates Address Set as Default")
    public void userValidatesAddressSetAsDefault() {
        addressBookPage.validateAddressSetAsDefault(VALID_FIRSTNAME+" "+VALID_LASTNAME);
    }

    @Then("User Validates Address Set as Default in Address Book")
    public void userValidatesAddressSetAsDefaultInAddressBook() {
        addressBookPage.validateAddressSetAsDefault(RANDOM_NAME+" "+VALID_LASTNAME);
    }
}