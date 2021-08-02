package com.shoebacca.StepsDefinitions;

import UtilitiesFactory.UtilFactory;
import com.shoebacca.Enums.CheckoutEnumVariables;
import com.shoebacca.Enums.GlobalEnumVariables;

public class HarnessVariables extends UtilFactory {
    public HarnessVariables() throws Exception {
    }
    protected static String PRODUCT_NAME;
    protected static String PRODUCT_PRICE;
    protected static String PREVIOUS_PRODUCT_NAME;
    protected final String VALID_USERNAME = GlobalEnumVariables.VALID_LOGIN_USERNAME.getValue();
    protected final String VALID_PASSWORD = GlobalEnumVariables.VALID_LOGIN_PASSWORD.getValue();
    protected final String VALID_EMAIL_ADDRESS = CheckoutEnumVariables.VALID_EMAIL_ADDRESS.getValue();
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
}
