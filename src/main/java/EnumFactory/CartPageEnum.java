package EnumFactory;

public enum  CartPageEnum {

    XPATH_ITEM_CONTAINER_HEADING_START("//li[@class='"),
    XPATH_ITEM_CONTAINER_HEADING_END("']"),
    XPATH_ITEM_CONTAINER_CONTENT_START("//*[@class='product-productListing-2Gh']//*[@class='"),
    XPATH_ITEM_CONTAINER_CONTENT_END("']");

    private String cartPageVariables;

    private CartPageEnum(String cartPageVariables) {
        this.cartPageVariables = cartPageVariables;
    }

    public String getValue() {
        return this.cartPageVariables;
    }
}
