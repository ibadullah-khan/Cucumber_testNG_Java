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
    ITEM_TOTAL_CONTENT("");

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
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
