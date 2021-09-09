package EnumFactory;

public enum CheckoutPageEnum {

    XPATH_EMAIL_ADDRESS_FIELD("//input[@name='email']"),
    XPATH_FIRST_NAME_FIELD("//input[@name='firstname']"),
    XPATH_LAST_NAME_FIELD("//input[@name='lastname']"),
    XPATH_ADDRESS_FIELD("//input[@name='street[0]']"),
    XPATH_CITY_FIELD("//input[@name='city']"),
    XPATH_ZIPCODE_FIELD("//input[@name='postcode']"),
    XPATH_PH_NO_FIELD("//input[@field='telephone']"),
    XPATH_SAVE_AND_CONTINUE_BUTTON("//button[(@class='button-root_highPriority-3-H' or @class='button-root_normalPriority-1xS') and not(@disabled)]//span[text()='Save & Continue']"),
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
    XPATH_CARD_LOGOS("//*[@class='creditCard-icons-7ec']"),
    XPATH_ESTIMATED_DELIVERY_DATE("//*[@class='item-estimatedDate-2Aa']"),
    XPATH_TAX_VALUE("//*[text()='Tax']//following-sibling::*[@class='priceSummary-price-12K']"),
    XPATH_SHIPPING_METHOD_START("//*[@class='shippingRadios-radioLabel-3S0']/span[text()='"),
    XPATH_SHIPPING_METHOD_END("']"),
    XPATH_SHIPPING_METHOD_SELECTED_START("//*[@class='shippingRadios-radioLabel-3S0']/span[text()='"),
    XPATH_SHIPPING_METHOD_SELECTED_END("']/parent::span/parent::label/input[@checked]"),
    XPATH_SHIPPING_METHOD_LABEL("//span[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Shipping')]"),
    XPATH_SHIPPING_METHOD_VALUE("(//span[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Shipping')]/following::span[contains(@class, 'priceSummary-price-12K')])[1]"),
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
    XPATH_SHIPPING_VALUE_SELECTED_OPTION("//input[@class='radio-input-IKa' and @checked]//following-sibling::*[@class='shippingRadios-radioLabel-3S0']/span[@class='shippingRadio-price-2Ml']"),
    XPATH_SHIPPING_DETAIL_TITLE_INACTIVE("//*[@class='checkoutPage-section_title-2GW' and contains(text(),'Shipping Details')]"),
    XPATH_SHIPPING_METHOD_SECTION("//*[@class='shippingRadios-radioRoot-33S' and not(@disabled)]"),
    XPATH_PROMO_CODE_FIELD("//*[@id='couponCode']"),
    XPATH_ADD_COUPON_BUTTON("//*[@type='submit']/span[text()='Add']"),
    XPATH_REMOVE_COUPON_BUTTON("//*[@type='submit']/span[text()='Remove']"),
    XPATH_SUB_TOTAL_AMOUNT("//*[@class='priceSummary-lineItems-3ov']//following::span[@class='priceSummary-price-12K'][1]"),
    XPATH_INVALID_COUPON_MESSAGE("//p[@class='message-root-35v']"),
    XPATH_START_PAYMENT_METHOD("//*[@class='paymentMethods-options-2KE']//*[text()='"),
    XPATH_END_PAYMENT_METHOD("']"),
    XPATH_SELECTED_PAYMENT_METHOD("//*[@class='radio-input-IKa' and @checked]"),
    XPATH_CREDIT_CARD_SECTION("//*[@class='creditCard-root-2AP']"),
    XPATH_TOTAL_COST_VALUE("//*[text()='Tax']//following-sibling::*[@class='priceSummary-itemTotals-G6J']"),
    XPATH_PRODUCT_IMAGE("//*[@class='image-image-3YO image-loaded-ktU']"),
    XPATH_PRODUCT_SIZE("//*[@class='item-options-1Di']"),
    XPATH_PRODUCT_COLOR("//*[@class='item-colorName-2wM']"),
    XPATH_PRODUCT_QUANTITY("//*[@class='item-quantity-1vq']"),
    XPATH_PRODUCT_NAME("//*[@class='item-name-2FI']"),
    XPATH_PRODUCT_BRAND_NAME("//*[@class='item-brand-1ux']"),
    XPATH_PRODUCT_ACTUAL_AMOUNT("//*[@class='item-price-2wY']"),
    XPATH_PRODUCT_ORIGINAL_AMOUNT("//*[@class='item-salePrice-1Fb']"),
    XPATH_PRODUCT_SAVE_AMOUNT("//*[@class='item-saveAmount-3UV']"),
    XPATH_PRODUCT_IMAGE_LOADER("//*[@class='checkoutPage-summaryContainer-2kD']//span[@class='icon-root-2Hz']"),
    XPATH_SUBTOTAL_TEXT("//*[@class='priceSummary-lineItemLabel-1zJ' and text()='Subtotal']"),
    XPATH_TOTAL_AMOUNT("//div[@class='priceSummary-itemTotals-G6J']//*[@class='priceSummary-totalPrice-rZa']"),
    XPATH_PAYMENT_LOADER("//*[@class='indicator-root-2nl']"),
    XPATH_DISCOUNT_AMOUNT("//*[contains(text(),'Discount')]//following::span[@class='priceSummary-price-12K']"),
    XPATH_PAYMENT_ERROR_MESSAGE("//*[@data-braintree-id='sheet-error']"),
    XPATH_PAYMENT_FORM_ERROR_MSG_START("//*[@data-braintree-id='"),
    XPATH_PAYMENT_FORM_ERROR_MSG_END("-field-error']"),
    XPATH_PAYPAL_SECTION("//*[@id='paypal-button']"),
    XPATH_PAY_WITH_PAYPAL_BUTTON("//*[@class='paypal-button-label-container']"),
    XPATH_PAYPAL_PAYMENT_IFRAME("//*[@class='zoid-component-frame zoid-visible']"),
    XPATH_ORDER_TRACKING_CHECKBOX("//*[@id='shipment_notification_subscribe']"),
    XPATH_SELECT_FROM_ADDRESS_BOOK("//*[text()='Select From Address Book']"),
    XPATH_SHIPPING_DETAIL_ADDRESS_LIST("//*[@class='addressBook-content-34e']"),
    XPATH_SIGN_UP_CHECKBOX("//*[@id='emarsys_subscriber' and @checked]"),
    XPATH_STORED_CARD_SELECTED_SECTION("//input[@class='radio-input-IKa' and @checked]//following-sibling::*[text()='Stored Cards']"),
    XPATH_CREDIT_CARD_LAST_DIGITS("//*[@class='radio-input-IKa' and @checked]//following-sibling::*//span[not(@class)]"),
    XPATH_CREDIT_CARD_EXPIRY_DATE("//div[@class='storedPaymentInformation-savedPayments-20v']//p[not(@class)]"),
    XPATH_CREDIT_CARD_LOGO("//*[@class='radio-input-IKa' and @checked]//following-sibling::*//span[@class='storedPaymentInformation-cardType-kvp storedPaymentInformation-mVisa-nVm']"),
    XPATH_SHIPPING_ADDRESS_USER("//*[@class='card-name-1C0']"),
    XPATH_SHIPPING_ADDRESS_USERNAME("(//*[@class='addressCard-defaultBadge-1w4' and contains(text(),'Default')])[1]/following-sibling::*[@class='addressCard-name-Tby']"),
    XPATH_CHANGE_SHIPPING_ADDRESS("//*[@id='change_button']//span[@class='icon-root-2Hz']"),
    XPATH_SHIPPING_DETAILS("//div[@class='addressBook-content-34e']//button"),
    XPATH_DEFAULT_SHIPPING_ADDRESS("//*[@class='shippingInformation-cardContainer-3l1']//div[@class='card-root-3nz']"),
    XPATH_SAVED_FIRST_SHIPPING_ADDRESS("//*[@class='addressCard-root_selected-XwX']//span[@class='addressCard-name-Tby']"),
    XPATH_CREDIT_CARD_EMPTY_FIELD("//*[@class='number' and not(@aria-invalid)]"),
    XPATH_EXPIRY_DATE_EMPTY_FIELD("//*[@class='expirationDate' and not(@aria-invalid)]"),
    XPATH_CVV_NUMBER_EMPTY_FIELD("//*[@class='cvv' and not(@aria-invalid)]"),
    XPATH_SET_AS_DEFAULT_FIELD("//input[@id='default_shipping' and not(@disabled)]"),
    XPATH_CREDIT_CARD_NO("//*[@class='storedPaymentInformation-creditCardDot-2mD']/parent::span"),
    XPATH_USE_SHIPPING_ADDRESS_CHECK_BOX("//*[@name='isBillingAddressSame']"),
    XPATH_SHIPPING_ADDRESSES_DROPDOWN_SECTION("//*[@class='addressBook-root_active-2ZD']"),
    XPATH_BILLING_ADDRESS_SECTION("//*[@class='creditCard-fields_root-Ott creditCard-mLoggedin-1dC']"),
    XPATH_REQ_FIELD_ERROR_MESSAGE_BILLING_SECTION_START("//*[@placeholder='"),
    XPATH_REQ_FIELD_ERROR_MESSAGE_BILLING_SECTION_END("']/parent::*/parent::*/following-sibling::p[@class='message-root_error-1YZ']"),
    XPATH_REQ_ERROR_MES_STATE_FIELD("//*[@name='region']//following-sibling::p[@class='message-root_error-1YZ']"),
    XPATH_CREDIT_CARD_TYPE_START("//*[@class='creditCard-credit_card_root-1tP']//span[contains(@class,'"),
    XPATH_CREDIT_CARD_TYPE_END("')]"),
    XPATH_FETCHING_PAYMENT_INFORMATION_LOADER("//*[@class='paymentInformation-loading-3aw']//*[@class='icon-root-2Hz']"),
    XPATH_FIRST_NAME_BILLING_FIELD("//input[@name='firstName']"),
    XPATH_LAST_NAME_BILLING_FIELD("//input[@name='lastName']"),
    XPATH_ADDRESS_BILLING_FIELD("//input[@name='street[0]']"),
    XPATH_CITY_BILLING_FIELD("//input[@name='city']"),
    XPATH_ZIPCODE_BILLING_FIELD("//input[@name='postcode']"),
    XPATH_STATE_DROPDOWN_BILLING_FIELD("//select[@name='region']"),
    XPATH_STATE_DROPDOWN_BILLING_OPTION_START("//select[@name='region']//option[text()='"),
    XPATH_STATE_DROPDOWN_BILLING_OPTION_END("']"),
    XPATH_PH_NO_BILLING_FIELD("//input[@field='phoneNumber']"),
    XPATH_ADDRESS_FROM_LIST("//div[@class='addressBook-content-34e']//span[text()='Default']"),
    XPATH_SAVE_CARD_FOR_NEXT_PAY_CHECKBOX("//*[@name='saveCardForNextPayment']");

    private String checkoutPageVariables;

    private CheckoutPageEnum(String checkoutPageVariables) {
        this.checkoutPageVariables = checkoutPageVariables;
    }

    public String getValue() {
        return this.checkoutPageVariables;
    }
}
