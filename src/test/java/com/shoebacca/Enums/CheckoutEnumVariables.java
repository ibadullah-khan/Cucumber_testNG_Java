package com.shoebacca.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum CheckoutEnumVariables {

    VALID_EMAIL_ADDRESS(""),
	VALID_DATA_EMAIL_ADDRESS(""),
    VALID_FIRSTNAME(""),
	VALID_LASTNAME(""),
	VALID_ADDRESS(""),
	VALID_PH_NO(""),
	VALID_CITY(""),
	VALID_STATE(""),
	VALID_ZIPCODE(""),
	VALID_CC_NUM(""),
	VALID_CC_EXPIRY(""),
	VALID_CC_CVV(""),
	INVALID_EMAIL_ADDRESS(""),
	EMAIL_ADDRESS_WITHOUT_DOMAIN(""),
	EMAIL_ADDRESS_WITHOUT_RECIPIENT(""),
	INVALID_PH_NO(""),
	INCOMPLETE_PH_NO(""),
	WRONG_PH_NO(""),
	INVALID_ZIPCODE(""),
	INVALID_CC_NUM(""),
	INVALID_CC_EXPIRY(""),
	INVALID_CC_CVV(""),
	CALCULATED_TAX_VALUE(""),
	VALID_PAYPAL_USERNAME(""),
	VALID_PAYPAL_PASSWORD(""),
	VALID_FIRSTNAME_BILLING(""),
	VALID_LASTNAME_BILLING(""),
	VALID_ADDRESS_BILLING(""),
	VALID_PH_NO_BILLING(""),
	VALID_CITY_BILLING(""),
	VALID_STATE_BILLING(""),
	VALID_ZIPCODE_BILLING("");

    private String checkoutVariables;

	private CheckoutEnumVariables(String checkoutVariables)
	{
		this.checkoutVariables = checkoutVariables;
	}

	public String getValue()
	{
		return this.checkoutVariables;
	}

	static {
	    try {
	    	String userDataFile = "checkout.properties";

			VALID_EMAIL_ADDRESS.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.email.address");
			VALID_DATA_EMAIL_ADDRESS.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.data.email.address");
			VALID_FIRSTNAME.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.first.name");
			VALID_LASTNAME.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.last.name");
			VALID_ADDRESS.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.address");
			VALID_PH_NO.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.ph.no");
			VALID_CITY.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.city");
			VALID_STATE.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.state");
			VALID_ZIPCODE.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.zip.code");
			VALID_CC_NUM.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.cc.number");
			VALID_CC_EXPIRY.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.cc.expiry");
			VALID_CC_CVV.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.cc.cvv");
			INVALID_CC_NUM.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.cc.number");
			INVALID_CC_EXPIRY.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.cc.expiry");
			INVALID_CC_CVV.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.cc.cvv");
			INVALID_EMAIL_ADDRESS.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.email.address");
			INVALID_ZIPCODE.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.zip.code");
			INVALID_PH_NO.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.ph.no");
			WRONG_PH_NO.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("wrong.ph.no");
			INCOMPLETE_PH_NO.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("incomplete.no");
			EMAIL_ADDRESS_WITHOUT_DOMAIN.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("no.domain.email");
			EMAIL_ADDRESS_WITHOUT_RECIPIENT.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("no.recipient.email");
			CALCULATED_TAX_VALUE.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("calculated.tax.value");
			VALID_PAYPAL_USERNAME.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.paypal.email");
			VALID_PAYPAL_PASSWORD.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.paypal.password");
			VALID_FIRSTNAME_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.first.name.billing");
			VALID_LASTNAME_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.last.name.billing");
			VALID_ADDRESS_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.address.billing");
			VALID_PH_NO_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.ph.no.billing");
			VALID_CITY_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.city.billing");
			VALID_STATE_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.state.billing");
			VALID_ZIPCODE_BILLING.checkoutVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.zip.code.billing");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
