package EnumFactory;

public enum AccountMenuPageEnum {

    XPATH_ACCOUNT_MENU("//*[@class='accountMenu-root_open-1fU']");

    private String accountMenuPageVariables;

    private AccountMenuPageEnum(String accountMenuPageVariables) {
        this.accountMenuPageVariables = accountMenuPageVariables;
    }

    public String getValue() {
        return this.accountMenuPageVariables;
    }

}
