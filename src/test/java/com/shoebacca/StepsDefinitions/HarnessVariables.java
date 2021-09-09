package com.shoebacca.StepsDefinitions;

import UtilitiesFactory.UtilFactory;
import com.shoebacca.Enums.CheckoutEnumVariables;
import com.shoebacca.Enums.ErrorMsgEnumVariables;
import com.shoebacca.Enums.CartEnumVariables;
import com.shoebacca.Enums.GlobalEnumVariables;

public class HarnessVariables extends UtilFactory {
    public HarnessVariables() throws Exception {
    }
    protected static String PRODUCT_NAME;
    protected static String SHIPPING_METHOD_USERNAME;
    protected static String SHIPPING_METHOD;
    protected static String SHIPPING_VALUE;
    protected static String[] ALL_EXPECTED_DATE;
    protected static String[] SHIPPING_ADDRESS;
    protected static String TAX_VALUE;
    protected static String PRODUCT_PRICE;
    protected static String PRODUCT_COLOUR;
    protected static String PRODUCT_SIZE;
    protected static String PRODUCT_BRAND;
    protected static String RANDOM_NAME;
    protected static String PREVIOUS_PRODUCT_NAME;
    protected final String VALID_ALL_USERNAME = GlobalEnumVariables.VALID_ALL_LOGIN_USERNAME.getValue();
    protected final String VALID_USERNAME = GlobalEnumVariables.VALID_LOGIN_USERNAME.getValue();
    protected final String VALID_DATA_USERNAME = GlobalEnumVariables.VALID_LOGIN_DATA_USERNAME.getValue();
    protected final String VALID_SHIPPING_USERNAME = GlobalEnumVariables.VALID_LOGIN_SHIPPING_USERNAME.getValue();
    protected final String VALID_NO_CARD_USERNAME = GlobalEnumVariables.VALID_LOGIN_VALID_NO_CARD_USERNAME_USERNAME.getValue();
    protected final String INVALID_USERNAME = GlobalEnumVariables.INVALID_LOGIN_USERNAME.getValue();
    protected final String VALID_PASSWORD = GlobalEnumVariables.VALID_LOGIN_PASSWORD.getValue();
    protected final String INVALID_PASSWORD = GlobalEnumVariables.INVALID_LOGIN_PASSWORD.getValue();
    protected final String VALID_EMAIL_ADDRESS = CheckoutEnumVariables.VALID_EMAIL_ADDRESS.getValue();
    protected final String VALID_DATA_EMAIL_ADDRESS = CheckoutEnumVariables.VALID_DATA_EMAIL_ADDRESS.getValue();
    protected final String VALID_FIRSTNAME = CheckoutEnumVariables.VALID_FIRSTNAME.getValue();
    protected final String VALID_LASTNAME = CheckoutEnumVariables.VALID_LASTNAME.getValue();
    protected final String VALID_ADDRESS = CheckoutEnumVariables.VALID_ADDRESS.getValue();
    protected final String VALID_PH_NO = CheckoutEnumVariables.VALID_PH_NO.getValue();
    protected final String VALID_CITY = CheckoutEnumVariables.VALID_CITY.getValue();
    protected final String VALID_STATE = CheckoutEnumVariables.VALID_STATE.getValue();
    protected final String VALID_ZIPCODE = CheckoutEnumVariables.VALID_ZIPCODE.getValue();
    protected final String VALID_CC_NUM = CheckoutEnumVariables.VALID_CC_NUM.getValue();
    protected final String VALID_CC_EXPIRY = CheckoutEnumVariables.VALID_CC_EXPIRY.getValue();
    protected final String VALID_CC_CVV = CheckoutEnumVariables.VALID_CC_CVV.getValue();
    protected final String INVALID_CC_NUM = CheckoutEnumVariables.INVALID_CC_NUM.getValue();
    protected final String INVALID_CC_EXPIRY = CheckoutEnumVariables.INVALID_CC_EXPIRY.getValue();
    protected final String INVALID_CC_CVV = CheckoutEnumVariables.INVALID_CC_CVV.getValue();
    protected final String ITEM_HEADING = CartEnumVariables.ITEM_HEADING.getValue();
    protected final String DESCRIPTION_HEADING = CartEnumVariables.DESCRIPTION_HEADING.getValue();
    protected final String QUANTITY_HEADING = CartEnumVariables.QUANTITY_HEADING.getValue();
    protected final String ITEM_TOTAL_HEADING = CartEnumVariables.ITEM_TOTAL_HEADING.getValue();
    protected final String ITEM_CONTENT = CartEnumVariables.ITEM_CONTENT.getValue();
    protected final String DESCRIPTION_CONTENT = CartEnumVariables.DESCRIPTION_CONTENT.getValue();
    protected final String QUANTITY_CONTENT = CartEnumVariables.QUANTITY_CONTENT.getValue();
    protected final String ITEM_TOTAL_CONTENT=CartEnumVariables.ITEM_TOTAL_CONTENT.getValue();
    protected final String MISMATCH_PASSWORD_ERROR = ErrorMsgEnumVariables.MISMATCH_PASSWORD_ERROR.getValue();
    protected final String INVALID_EMAIL_ADDRESS = CheckoutEnumVariables.INVALID_EMAIL_ADDRESS.getValue();
    protected final String EMAIL_ADDRESS_WITHOUT_DOMAIN = CheckoutEnumVariables.EMAIL_ADDRESS_WITHOUT_DOMAIN.getValue();
    protected final String EMAIL_ADDRESS_WITHOUT_RECIPIENT = CheckoutEnumVariables.EMAIL_ADDRESS_WITHOUT_RECIPIENT.getValue();
    protected final String INVALID_PH_NO = CheckoutEnumVariables.INVALID_PH_NO.getValue();
    protected final String WRONG_PH_NO = CheckoutEnumVariables.WRONG_PH_NO.getValue();
    protected final String INCOMPLETE_PH_NO = CheckoutEnumVariables.INCOMPLETE_PH_NO.getValue();
    protected final String INVALID_ZIPCODE = CheckoutEnumVariables.INVALID_ZIPCODE.getValue();
    protected final String EXPECTED_HOLIDAYS = CartEnumVariables.EXPECTED_HOLIDAYS.getValue();
    protected final String EXPECTED_CUT_OFF_TIME = CartEnumVariables.EXPECTED_CUT_OFF_TIME.getValue();
    protected final String CALCULATED_TAX_VALUE = CheckoutEnumVariables.CALCULATED_TAX_VALUE.getValue();
    protected final String VALID_PAYPAL_USERNAME = CheckoutEnumVariables.VALID_PAYPAL_USERNAME.getValue();
    protected final String VALID_PAYPAL_PASSWORD = CheckoutEnumVariables.VALID_PAYPAL_PASSWORD.getValue();
    protected static String CREDIT_CARD_NO;
    protected final String VALID_FIRSTNAME_BILLING = CheckoutEnumVariables.VALID_FIRSTNAME_BILLING.getValue();
    protected final String VALID_LASTNAME_BILLING = CheckoutEnumVariables.VALID_LASTNAME_BILLING.getValue();
    protected final String VALID_ADDRESS_BILLING = CheckoutEnumVariables.VALID_ADDRESS_BILLING.getValue();
    protected final String VALID_PH_NO_BILLING = CheckoutEnumVariables.VALID_PH_NO_BILLING.getValue();
    protected final String VALID_CITY_BILLING = CheckoutEnumVariables.VALID_CITY_BILLING.getValue();
    protected final String VALID_STATE_BILLING = CheckoutEnumVariables.VALID_STATE_BILLING.getValue();
    protected final String VALID_ZIPCODE_BILLING = CheckoutEnumVariables.VALID_ZIPCODE_BILLING.getValue();
    protected final String VALID_SOCIAL_MEDIA_USER_ID = GlobalEnumVariables.VALID_SOCIAL_MEDIA_USER_ID.getValue();
}
