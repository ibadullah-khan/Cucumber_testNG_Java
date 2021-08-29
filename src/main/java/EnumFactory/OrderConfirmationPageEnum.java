package EnumFactory;

public enum OrderConfirmationPageEnum {

    XPATH_FEEDBACK_AFTER_ORDER_CLOSE_BUTTON("//*[@id='tt-comment-capture']//*[@title='Close']"),
    XPATH_PASSWORD_FIELD("//*[@name='password']"),
    XPATH_CONFIRM_PASSWORD_FIELD("//*[@name='confirmPassword']"),
    XPATH_CREATE_ACCOUNT_BUTTON("//*[text()='Create Account']"),
    XPATH_PRINT_SLIP("//*[@class='orderConfirmationPage-printButtonWrap-PSv']//*[@class='button-root_normalPriority-1xS']//span[@class='button-content-XZ3']"),
    XPATH_ERROR_MSG("//*[@class='createAccount-error-3ml']"),
    XPATH_PASSWORD_MISMATCH_ERROR_MSG("//*[@class='message-root_error-1YZ']");

    private String orderConfirmationPageVariables;

    private OrderConfirmationPageEnum(String orderConfirmationPageVariables) {
        this.orderConfirmationPageVariables = orderConfirmationPageVariables;
    }

    public String getValue() {
        return this.orderConfirmationPageVariables;
    }
}
