package EnumFactory;

public enum HomePageEnum {

    XPATH_ACCOUNT_ICON("//*[@class='accountTrigger-trigger-1tg']"),
    XPATH_MINI_CART_ICON("//*[@class='icon-cart cartTrigger-cartIcon-oTF']");

    private String homePageVariables;

    private HomePageEnum(String homePageVariables) {
        this.homePageVariables = homePageVariables;
    }

    public String getValue() {
        return this.homePageVariables;
    }

}
