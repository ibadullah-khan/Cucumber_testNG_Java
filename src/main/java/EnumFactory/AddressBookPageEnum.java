package EnumFactory;

public enum AddressBookPageEnum {

    XPATH_SHIPPING_ADDRESS_DETAILS("//div[@class='addressBookPage-addressCard-sWS']");

    private String addressbookPageVariables;

    private AddressBookPageEnum(String addressbookPageVariables) {
        this.addressbookPageVariables = addressbookPageVariables;
    }

    public String getValue() {
        return this.addressbookPageVariables;
    }

}
