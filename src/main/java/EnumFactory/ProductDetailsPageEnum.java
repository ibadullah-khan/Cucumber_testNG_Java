package EnumFactory;

public enum ProductDetailsPageEnum {

    XPATH_ADD_TO_CART_BUTTON("//*[@id='productFullDetail']//*[@class='button-root_highPriority-3-H']"),
    XPATH_PRODUCT_NAME("//*[@id='productFullDetail']//*[@class='productFullDetail-productName-2Ax']"),
    XPATH_PRODUCT_PRICE("//*[@id='productFullDetail']//*[@class='productFullDetail-price-hNW']");
    private String pdpVariables;

    private ProductDetailsPageEnum(String pdpVariables) {
        this.pdpVariables = pdpVariables;
    }

    public String getValue() {
        return this.pdpVariables;
    }
}
