package com.shoebacca.StepsDefinitions;

import UtilitiesFactory.UtilFactory;
import com.shoebacca.Enums.CartEnumVariables;
import com.shoebacca.Enums.GlobalEnumVariables;

public class HarnessVariables extends UtilFactory {
    public HarnessVariables() throws Exception {
    }
    protected static String PRODUCT_NAME;
    protected static String PRODUCT_PRICE;
    protected static String PREVIOUS_PRODUCT_NAME;
    protected final String VALID_USERNAME = GlobalEnumVariables.VALID_LOGIN_USERNAME.getValue();
    protected final String VALID_PASSWORD = GlobalEnumVariables.VALID_LOGIN_PASSWORD.getValue();
    protected final String ITEM_HEADING=CartEnumVariables.ITEM_HEADING.getValue();
    protected final String DESCRIPTION_HEADING=CartEnumVariables.DESCRIPTION_HEADING.getValue();
    protected final String QUANTITY_HEADING=CartEnumVariables.QUANTITY_HEADING.getValue();
    protected final String ITEM_TOTAL_HEADING= CartEnumVariables.ITEM_TOTAL_HEADING.getValue();
    protected final String ITEM_CONTENT=CartEnumVariables.ITEM_CONTENT.getValue();
    protected final String DESCRIPTION_CONTENT=CartEnumVariables.DESCRIPTION_CONTENT.getValue();
    protected final String QUANTITY_CONTENT=CartEnumVariables.QUANTITY_CONTENT.getValue();
    protected final String ITEM_TOTAL_CONTENT=CartEnumVariables.ITEM_TOTAL_CONTENT.getValue();
}
