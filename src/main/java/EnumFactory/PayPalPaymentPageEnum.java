package EnumFactory;

public enum PayPalPaymentPageEnum {

    XPATH_CANCEL_AND_RETURN_BUTTON("//*[@id='content']//descendant::*[@id='cancelLink']");


    private String payPalPaymentPageVariables;

    private PayPalPaymentPageEnum(String payPalPaymentPageVariables){
        this.payPalPaymentPageVariables = payPalPaymentPageVariables;
    }

    public String getValue(){
        return this.payPalPaymentPageVariables;

    }
}
