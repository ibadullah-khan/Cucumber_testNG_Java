package EnumFactory;

public enum AccountMenuPageEnum {

    XPATH_ACCOUNT_MENU("//*[@class='accountMenu-root_open-1fU']"),
    XPATH_ACCOUNT_MENU_USERNAME("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='email']"),
    XPATH_ACCOUNT_MENU_PASSWORD("//*[@class='signIn-root-sk8']//*[@class='textInput-input-2jT' and @name='password']"),
    XPATH_ACCOUNT_MENU_LOGIN_BUTTON("//*[@class='signIn-root-sk8']//*[@class='button-root_highPriority-3-H']"),
    XPATH_REQUIRED_EMAIL_FIELD_ERROR("//*[@class='message-root_error-1YZ']/parent::*//input[@name='email']"),
    XPATH_REQUIRED_PASSWORD_FIELD_ERROR("//*[@class='message-root_error-1YZ']/parent::*//input[@name='password']"),
    XPATH_ACCOUNT_MENU_GREET_HEADING("//*[contains(text(),'Hi,')]"),
    XPATH_SIGN_IN_POP_UP("//*[@class='memberCheckout-root_open-3BF']"),
    XPATH_ACCOUNT_SIGN_UP_LINK("//*[@class='signIn-createAccount-1B3']"),
    XPATH_ACCOUNT_SIGN_UP_USERNAME_FIELD("//*[@class='accountMenu-createAccount-2iv' ]//*[@name='customer.email']"),
    XPATH_ACCOUNT_SIGN_UP_FIRSTNAME_FIELD("//*[@class='accountMenu-createAccount-2iv' ]//*[@name='customer.firstname']"),
    XPATH_ACCOUNT_SIGN_UP_LASTNAME_FIELD("//*[@class='accountMenu-createAccount-2iv' ]//*[@name='customer.lastname']"),
    XPATH_ACCOUNT_SIGN_UP_PASSWORD_FIELD("//*[@class='accountMenu-createAccount-2iv' ]//*[@name='password']"),
    XPATH_CREATE_ACCOUNT_BUTTON("//*[text()='Create an Account']"),
    XPATH_PAYMENT_METHOD_OPTION("//*[@class='accountMenuItems-accountButton-3U9' and text()='Payment Methods']"),
    XPATH_ADDRESS_BOOK_OPTION("//*[@class='accountMenuItems-accountButton-3U9' and text()='Address Book']");
//    XPATH_ADDRESS_BOOK("//*[contains(@class,'accountMenuItems-accountButton-3U9') and contains(text(),'Address')]");


    private String accountMenuPageVariables;

    private AccountMenuPageEnum(String accountMenuPageVariables) {
        this.accountMenuPageVariables = accountMenuPageVariables;
    }

    public String getValue() {
        return this.accountMenuPageVariables;
    }
}
