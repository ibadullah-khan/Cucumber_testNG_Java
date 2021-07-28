package EnumFactory;

public enum MiniCartPageEnum {

    XPATH_MINI_CART_VIEW("//*[@class='miniCart-contents_open-ubc']"),
    XPATH_MINI_CART_LOGIN_LINK("//*[@class='miniCart-loginBtn-1r9']"),
    XPATH_MINI_CART_CLOSE_ICON("//*[@class='miniCart-closeBtn-2jN']/span"),
    XPATH_PRODUCT_NAME("//*[@class='item-name-1dB']"),
    XPATH_PRODUCT_PRICE("//*[@class='item-price-2oh']"),
    XPATH_PRODUCTS_CONTAINER("//*[@class='productList-items_container-2q_']/div/div"),
    XPATH_PRODUCT_SIZE("//*[@class='item-options-1pj']"),
    XPATH_PRODUCT_COLOR("//*[@class='item-colorName-1xx']"),
    XPATH_PRODUCT_IMAGE("//*[@class='item-thumbnailContainer-1_h']"),
    XPATH_PRODUCT_REMOVE_LINK("//*[@class='item-deleteButton-2XH']"),
    XPATH_SHIPPING_LABEL("//*[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Shipping')]"),
    XPATH_TAX_LABEL("//*[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Tax')]"),
    XPATH_VIEW_CART_BUTTON("//*[@class='miniCart-footerCol-1P_']//*[@class='button-root_highPriority-3-H']"),
    XPATH_CHECKOUT_BUTTON("//*[@class='miniCart-footerCol-1P_']//*[@class='button-root_normalPriority-1xS']");

    private String miniCartPageVariables;

    private MiniCartPageEnum(String miniCartPageVariables) {
        this.miniCartPageVariables = miniCartPageVariables;
    }

    public String getValue() {
        return this.miniCartPageVariables;
    }

}
