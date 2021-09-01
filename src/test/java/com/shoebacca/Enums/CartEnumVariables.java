package com.shoebacca.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum CartEnumVariables {

    ITEM_HEADING(""),
    DESCRIPTION_HEADING(""),
    QUANTITY_HEADING(""),
    ITEM_TOTAL_HEADING(""),
    ITEM_CONTENT(""),
    DESCRIPTION_CONTENT(""),
    QUANTITY_CONTENT(""),
    ITEM_TOTAL_CONTENT(""),
	EXPECTED_HOLIDAYS(""),
	EXPECTED_CUT_OFF_TIME("");

    private String cartVariables;

	private CartEnumVariables(String cartVariables)
	{
		this.cartVariables = cartVariables;
	}

	public String getValue()
	{
		return this.cartVariables;
	}

	static {
	    try {
	    	String userDataFile = "cartData.properties";

			ITEM_HEADING.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("item.heading");
			DESCRIPTION_HEADING.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("description.heading");
			QUANTITY_HEADING.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("quantity.heading");
			ITEM_TOTAL_HEADING.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("item.total.heading");
			ITEM_CONTENT.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("item.content");
			DESCRIPTION_CONTENT.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("description.content");
			QUANTITY_CONTENT.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("quantity.content");
			ITEM_TOTAL_CONTENT.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("item.total.content");
			EXPECTED_HOLIDAYS.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("shopping.holidays");
			EXPECTED_CUT_OFF_TIME.cartVariables = new PropertyLoaderFactory().getPropertyFile(userDataFile).getProperty("shipping.cutofftime");
	    } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
