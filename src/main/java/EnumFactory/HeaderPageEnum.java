package EnumFactory;

public enum HeaderPageEnum {

    XPATH_ACCOUNT_ICON("//*[@class='accountTrigger-trigger-1tg']");

    private String headerPageVariables;

    private HeaderPageEnum(String headerPageVariables) {
        this.headerPageVariables = headerPageVariables;
    }

    public String getValue() {
        return this.headerPageVariables;
    }

}
