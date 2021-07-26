package com.shoebacca.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum GlobalEnumVariables {

    VALID_LOGIN_USERNAME(""),
    VALID_LOGIN_PASSWORD("");

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
            VALID_LOGIN_PASSWORD.globalVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("valid.password");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
