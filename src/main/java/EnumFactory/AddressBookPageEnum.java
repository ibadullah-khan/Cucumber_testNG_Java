package EnumFactory;

public enum AddressBookPageEnum {

    XPATH_SAVED_SHIPPING_ADDRESS("//*[@class='addressBookPage-content-29g']");

    private String addressbookPageVariables;

    private AddressBookPageEnum(String addressbookPageVariables) {
        this.addressbookPageVariables = addressbookPageVariables;
    }

    public String getValue() {
        return this.addressbookPageVariables;
    }

}
