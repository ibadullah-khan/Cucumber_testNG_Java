package EnumFactory;

public enum PayPalPaymentPageEnum {;


    private String payPalPaymentPageVariables;

    private PayPalPaymentPageEnum(String payPalPaymentPageVariables){
        this.payPalPaymentPageVariables = payPalPaymentPageVariables;
    }

    public String getValue(){
        return this.payPalPaymentPageVariables;

    }
}
