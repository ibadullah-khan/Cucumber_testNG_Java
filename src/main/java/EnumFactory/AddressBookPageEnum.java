package EnumFactory;

public enum AddressBookPageEnum {

    XPATH_DEFAULT_LABEL_START("//*[@class='addressCard-name-Tby' and text()='"),
    XPATH_DEFAULT_LABEL_END("']/preceding-sibling::span"),
    XPATH_SHIPPING_ADDRESS_DETAILS("//div[@class='addressBookPage-addressCard-sWS']");

    private String addressBookPageVariables;

    private AddressBookPageEnum(String addressBookPageVariables) {
        this.addressBookPageVariables = addressBookPageVariables;
    }

    public String getValue() {
        return this.addressBookPageVariables;
    }
}