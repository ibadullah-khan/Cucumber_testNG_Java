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
    XPATH_ESTIMATED_DELIVERY_DATE("//*[@class='item-estimatedDate-2Aa']"),
    XPATH_TAX_VALUE("//*[text()='Tax']//following-sibling::*[@class='priceSummary-price-12K']"),
    XPATH_SHIPPING_METHOD_START("//*[@class='shippingRadios-radioLabel-3S0']/span[text()='"),
    XPATH_SHIPPING_METHOD_END("']"),
    XPATH_SHIPPING_METHOD_SELECTED_START("//*[@class='shippingRadios-radioLabel-3S0']/span[text()='"),
    XPATH_SHIPPING_METHOD_SELECTED_END("']/parent::span/parent::label/input[@checked]"),
    XPATH_SHIPPING_DETAIl_EDIT_STATE("//*[@id='js-checkoutForm']"),
    XPATH_SHIPPING_DETAIl_OPEN_STATE("//*[@class='section-contents_container-t-j']"),
    XPATH_SHIPPING_DETAIl_CLOSED_STATE("//*[@class='section-contents_container_closed-35H']"),
    XPATH_SHIPPING_DETAIl_TITLE("//*[@class='section-title-8Re' and contains(text(),'Shipping Details')]"),
    XPATH_SHIPPING_LOADER("//*[@class='paymentInformation-loading-3aw']");

    private String checkoutPageVariables;

    private CheckoutPageEnum(String checkoutPageVariables) {
        this.checkoutPageVariables = checkoutPageVariables;
    }

    public String getValue() {
        return this.checkoutPageVariables;
    }
}
