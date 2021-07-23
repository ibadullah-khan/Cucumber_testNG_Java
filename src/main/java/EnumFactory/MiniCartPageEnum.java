package EnumFactory;

public enum MiniCartPageEnum {

    XPATH_MINI_CART_VIEW("//*[@class='miniCart-contents_open-ubc']"),
    XPATH_MINI_CART_LOGIN_LINK("//*[@class='miniCart-loginBtn-1r9']");

    private String miniCartPageVariables;

    private MiniCartPageEnum(String miniCartPageVariables) {
        this.miniCartPageVariables = miniCartPageVariables;
    }

    public String getValue() {
        return this.miniCartPageVariables;
    }

}
