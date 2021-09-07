package EnumFactory;

public enum PayPalPaymentPageEnum {

    XPATH_CANCEL_AND_RETURN_BUTTON("//*[@id='content']//descendant::*[@id='cancelLink']"),
    XPATH_PAYPAL_EMAIL_FIELD("//*[@id='email']"),
    XPATH_PAYPAL_PASSWORD_FIELD("//*[@id='password']"),
    XPATH_PAYPAL_NEXT_BUTTON("//*[@id='btnNext']"),
    XPATH_PAYPAL_LOGIN_BUTTON("//*[@id='btnLogin']"),
    XPATH_PAYPAL_PAY_NOW_BUTTON("//*[@id='payment-submit-btn']"),
    XPATH_PAYPAL_PAY_LATER_SECTION("//*[@id='pay-later']");

    private String payPalPaymentPageVariables;

    private PayPalPaymentPageEnum(String payPalPaymentPageVariables){
        this.payPalPaymentPageVariables = payPalPaymentPageVariables;
    }

    public String getValue(){
        return this.payPalPaymentPageVariables;

    }
}
