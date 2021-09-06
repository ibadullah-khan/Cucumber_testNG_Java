package EnumFactory;

public enum PaymentMethodPageEnum {

    XPATH_DEFAULT_CREDIT_CARD("//*[@class='paymentCard-defaultBadge-1CI' and text()='Default']/following-sibling::span//i/parent::span");

    private String paymentMethodPageVariables;

    private PaymentMethodPageEnum(String paymentMethodPageVariables) {
        this.paymentMethodPageVariables = paymentMethodPageVariables;
    }

    public String getValue() {
        return this.paymentMethodPageVariables;
    }
}