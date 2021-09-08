package com.shoebacca.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum GlobalEnumVariables {

    VALID_LOGIN_USERNAME(""),
	VALID_LOGIN_DATA_USERNAME(""),
	VALID_LOGIN_SHIPPING_USERNAME(""),
	INVALID_LOGIN_USERNAME(""),
    VALID_LOGIN_PASSWORD(""),
	VALID_ALL_LOGIN_USERNAME(""),
	INVALID_LOGIN_PASSWORD(""),
	VALID_SOCIAL_MEDIA_USER_ID("");

    private String globalVariables;

	private GlobalEnumVariables(String globalVariables)
	{
		this.globalVariables = globalVariables;
	}

	public String getValue()
	{
		return this.globalVariables;
	}

	static {
	    try {
	    	String userDataFile = "userData.properties";

            VALID_LOGIN_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.username");
			VALID_LOGIN_DATA_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.data.username");
			VALID_LOGIN_SHIPPING_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.shipping.username");
			INVALID_LOGIN_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.username");
            VALID_LOGIN_PASSWORD.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.password");
			VALID_ALL_LOGIN_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.all.username");
			INVALID_LOGIN_PASSWORD.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("invalid.password");
			VALID_ALL_LOGIN_USERNAME.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.all.username");
			VALID_SOCIAL_MEDIA_USER_ID.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.social.media.id");

		} catch (Exception e) {

            e.printStackTrace();
        }
    }
}
