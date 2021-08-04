package EnumFactory;

public enum CartPageEnum {

    XPATH_ITEM_CONTAINER_HEADING_START("//li[@class='"),
    XPATH_ITEM_CONTAINER_HEADING_END("']"),
    XPATH_ITEM_CONTAINER_CONTENT_START("//*[@class='product-productListing-2Gh']//*[@class='"),
    XPATH_ITEM_CONTAINER_CONTENT_END("']"),
    XPATH_ITEM_QUANTITY_COUNTER("//*[@class='cartPage-heading-1Q0']/span"),
    XPATH_PRODUCT_QUANTITY("//input[@class='quantity-input-1fR']"),
    XPATH_SUMMARY_SECTION("//*[@class='cartPage-summary_container-2pt']"),
    XPATH_PRODUCT_PRICE("//*[@class='product-price-Nq8']"),
    XPATH_TOTAL_AMOUNT("(//*[@class='priceSummary-priceValues-1EF']//*[@class='priceSummary-price-2my'])[1]"),
    XPATH_REMOVE_LINK("//button[@class='product-btnRemove-16L' and contains(text(),'Remove')]"),
    XPATH_REMOVE_START("//*[@class='product-name-3mh']/*[text()='"),
    XPATH_REMOVE_END("']//ancestor::div[@class='product-details-3HQ']//button[@class='product-btnRemove-16L']");

    private String cartPageVariables;

    private CartPageEnum(String cartPageVariables) {
        this.cartPageVariables = cartPageVariables;
    }

    public String getValue() {
        return this.cartPageVariables;
    }
}