package EnumFactory;

public enum AccountMenuPageEnum {

    XPATH_ACCOUNT_MENU("//*[@class='accountMenu-root_open-1fU']"),
    XPATH_ACCOUNT_MENU_USERNAME("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='email']"),
    XPATH_ACCOUNT_MENU_PASSWORD("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='password']"),
    XPATH_ACCOUNT_MENU_LOGIN_BUTTON("//*[@class='signIn-root-sk8']//*[@class='button-root_highPriority-3-H']"),
    XPATH_REQUIRED_FIELD_ERROR("//*[@class='signIn-root-sk8']//*[@class='button-root_highPriority-3-H']"),
    XPATH_ACCOUNT_MENU_GREET_HEADING("//*[contains(text(),'Hi,')]");

    private String accountMenuPageVariables;

    private AccountMenuPageEnum(String accountMenuPageVariables) {
        this.accountMenuPageVariables = accountMenuPageVariables;
    }

    public String getValue() {
        return this.accountMenuPageVariables;
    }
}
