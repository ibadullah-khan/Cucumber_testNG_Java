package com.shoebacca.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum ErrorMsgEnumVariables {

    MISMATCH_PASSWORD_ERROR("");

    private String errorMsgVariables;

	private ErrorMsgEnumVariables(String errorMsgVariables)
	{
		this.errorMsgVariables = errorMsgVariables;
	}

	public String getValue()
	{
		return this.errorMsgVariables;
	}

	static {
	    try {
	    	String userDataFile = "errorMsg.properties";

			MISMATCH_PASSWORD_ERROR.errorMsgVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("oc.password.mismatch");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
