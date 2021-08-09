package EnumFactory;

public enum CheckoutPageEnum {

    XPATH_EMAIL_ADDRESS_FIELD("//input[@name='email']"),
    XPATH_FIRST_NAME_FIELD("//input[@name='firstname']"),
    XPATH_LAST_NAME_FIELD("//input[@name='lastname']"),
    XPATH_ADDRESS_FIELD("//input[@name='street[0]']"),
    XPATH_CITY_FIELD("//input[@name='city']"),
    XPATH_ZIPCODE_FIELD("//input[@name='postcode']"),
    XPATH_PH_NO_FIELD("//input[@field='telephone']"),
    XPATH_SAVE_AND_CONTINUE_BUTTON("//span[text()='Save & Continue']"),
    XPATH_STATE_DROPDOWN_FIELD("//select[@name='region']"),
    XPATH_STATE_DROPDOWN_OPTION_START("//select[@name='region']//option[text()='"),
    XPATH_STATE_DROPDOWN_OPTION_END("']"),
    XPATH_CREDIT_CARD_NO_IFRAME("//iframe[@id='braintree-hosted-field-number']"),
    XPATH_CREDIT_CARD_EXP_IFRAME("//iframe[@id='braintree-hosted-field-expirationDate']"),
    XPATH_CREDIT_CARD_CVV_IFRAME("//iframe[@id='braintree-hosted-field-cvv']"),
    XPATH_CREDIT_CARD_NUMBER_FIELD("//input[@id='credit-card-number']"),
    XPATH_CREDIT_CARD_EXPIRY_FIELD("//input[@id='expiration']"),
    XPATH_CREDIT_CARD_CVV_FIELD("//input[@id='cvv']"),
    XPATH_PLACE_ORDER_BUTTON("//span[text()='Place Order']"),
    XPATH_TAX_VALUE("//*[text()='Tax']//following-sibling::*[@class='priceSummary-price-12K']");


    private String checkoutPageVariables;

    private CheckoutPageEnum(String checkoutPageVariables) {
        this.checkoutPageVariables = checkoutPageVariables;
    }

    public String getValue() {
        return this.checkoutPageVariables;
    }

}
