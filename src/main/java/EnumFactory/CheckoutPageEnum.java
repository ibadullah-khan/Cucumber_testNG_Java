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
    XPATH_SHIPPING_METHOD_LABEL("//span[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Shipping')]"),
    XPATH_CHECKOUT_HEADING("//*[@class='checkoutPage-heading-1gt']"),
    XPATH_SHIPPING_DETAIL_EDIT_STATE("//*[@id='js-checkoutForm']"),
    XPATH_SHIPPING_DETAIL_OPEN_STATE("//*[@class='section-contents_container-t-j']"),
    XPATH_SHIPPING_DETAIL_CLOSED_STATE("//*[@class='section-contents_container_closed-35H']"),
    XPATH_SHIPPING_DETAIL_TITLE("//*[@class='section-title-8Re' and contains(text(),'Shipping Details')]"),
    XPATH_ADD_NEW_ADDRESS("//*[text()='Add New Address']"),
    XPATH_FIRST_AND_LAST_NAME("//*[@class='card-name-1C0']"),
    XPATH_ADDRESS("(//*[@class='card-address-33x']/span)[1]"),
    XPATH_CITY_STATE_ZIPCODE("(//*[@class='card-address-33x']/span)[2]"),
    XPATH_PHONE_NO("(//*[@class='card-root-3nz']/span)[2]"),
    XPATH_EMAIL_ADDRESS("//*[@class='card-emailBundle-1IB']"),
    XPATH_SHIPPING_LOADER("//*[@class='paymentInformation-loading-3aw']"),
    XPATH_REQ_FIELD_MESSAGE_START("//*[@for='"),
    XPATH_REQ_FIELD_MESSAGE_END("']/following-sibling::p"),
    XPATH_HEADER("//*[@class='header-desktopSecondaryActions-n-W']"),
    XPATH_HEADER_LOGO("//*[@class='header-logo-2jr image-loaded-ktU']"),
    XPATH_EDIT_BUTTON("//*[@class='completedView-editButtonText-2Xe']"),
    XPATH_HEADER_ICON("//*[@class='helpTrigger-help-RY1']"),
    XPATH_PAYMENT_METHOD_FORM("//*[@class='checkoutPage-payment_information_container-3zC']/form"),
    XPATH_SHIPPING_METHOD_SELECTED_OPTION("//input[@class='radio-input-IKa' and @checked]//following-sibling::*[@class='shippingRadios-radioLabel-3S0']/span[not(@class)]"),
    XPATH_SHIPPING_DETAIL_TITLE_INACTIVE("//*[@class='checkoutPage-section_title-2GW' and contains(text(),'Shipping Details')]"),
    XPATH_PROMO_CODE_FIELD("//*[@id='couponCode']"),
    XPATH_ADD_COUPON_BUTTON("//button[@type='submit']"),
    XPATH_SUB_TOTAL_AMOUNT("//*[@class='priceSummary-lineItems-3ov']//following::span[@class='priceSummary-price-12K'][1]"),
    XPATH_DISCOUNT_AMOUNT("//*[contains(text(),'Discount')]//following::span[@class='priceSummary-price-12K']"),
    XPATH_TOTAL_AMOUNT("//div[@class='priceSummary-itemTotals-G6J']//*[@class='priceSummary-totalPrice-rZa']"),
    XPATH_INVALID_COUPON_MESSAGE("//p[text()='No such entity.']");

    private String checkoutPageVariables;

    private CheckoutPageEnum(String checkoutPageVariables) {
        this.checkoutPageVariables = checkoutPageVariables;
    }

    public String getValue() {
        return this.checkoutPageVariables;
    }
}
