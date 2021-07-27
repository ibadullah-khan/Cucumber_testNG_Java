package EnumFactory;

public enum MiniCartPageEnum {

    XPATH_MINI_CART_VIEW("//*[@class='miniCart-contents_open-ubc']"),
    XPATH_MINI_CART_LOGIN_LINK("//*[@class='miniCart-loginBtn-1r9']"),
    XPATH_MINI_CART_CLOSE_ICON("//*[@class='miniCart-closeBtn-2jN']/span"),
    XPATH_PRODUCT_NAME("//*[@class='item-name-1dB']"),
    XPATH_PRODUCT_PRICE("//*[@class='item-price-2oh']");

    private String miniCartPageVariables;

    private MiniCartPageEnum(String miniCartPageVariables) {
        this.miniCartPageVariables = miniCartPageVariables;
    }

    public String getValue() {
        return this.miniCartPageVariables;
    }

}
