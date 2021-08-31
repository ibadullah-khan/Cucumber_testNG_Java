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

@Then("User Validates Shipping Address Quantity on Address Book")
public void userValidatesShippingAddressQuantityOnAddressBook() {
    addressbookPage.validateShippingAddressQuantityVisibility();
}
}
