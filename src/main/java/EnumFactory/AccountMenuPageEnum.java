package EnumFactory;

public enum AccountMenuPageEnum {

    XPATH_ACCOUNT_MENU("//*[@class='accountMenu-root_open-1fU']"),
    XPATH_ACCOUNT_MENU_USERNAME("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='email']"),
    XPATH_ACCOUNT_MENU_PASSWORD("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='password']"),
    XPATH_ACCOUNT_MENU_LOGIN_BUTTON("//*[@class='signIn-root-sk8']//*[@class='button-root_highPriority-3-H']"),
    XPATH_REQUIRED_EMAIL_FIELD_ERROR("//*[@class='message-root_error-1YZ']/parent::*//input[@name='email']"),
    XPATH_REQUIRED_PASSWORD_FIELD_ERROR("//*[@class='message-root_error-1YZ']/parent::*//input[@name='password']"),
    XPATH_ACCOUNT_MENU_GREET_HEADING("//*[contains(text(),'Hi,')]"),
    XPATH_ACCOUNT_MENU_MY_PROFILE_BUTTON("//button[@class='accountMenuItems-accountButton-3U9' and text()='My Profile']"),
    XPATH_CHANGE_EMAIL_FIELD("//input[@class='checkbox-input-1lb' and @name='changeEmail']"),
    XPATH_SIGN_IN_POP_UP("//*[@class='memberCheckout-root_open-3BF']");

    private String accountMenuPageVariables;

    private AccountMenuPageEnum(String accountMenuPageVariables) {
        this.accountMenuPageVariables = accountMenuPageVariables;
    }

    public String getValue() {
        return this.accountMenuPageVariables;
    }
}
