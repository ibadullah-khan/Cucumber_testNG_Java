package EnumFactory;

public enum CartPageEnum {

    XPATH_CHECKOUT_BUTTON("//*[@class='cartPage-summary_container-2pt']"),
    XPATH_PRODUCT_PRICE("//*[@class='product-price-Nq8']"),
    XPATH_TOTAL_AMOUNT("(//*[@class='priceSummary-priceValues-1EF']//*[@class='priceSummary-price-2my'])[1]"),
    XPATH_Product_QUANTITY_COUNTER("//h1[@class='cartPage-heading-1Q0']//span"),
    XPATH_REMOVE_LINK("//button[@class='product-btnRemove-16L' and contains(text(),'Remove')]"),
    XPATH_REMOVE_START("//*[@class='product-name-3mh']/*[text()='"),
    XPATH_REMOVE_END("']//ancestor::div[@class='product-details-3HQ']//button[@class='product-btnRemove-16L']");
    private String CartPageVariables;

    private CartPageEnum(String miniCartPageVariables) {
        this.CartPageVariables = miniCartPageVariables;
    }

    public String getValue() {
        return this.CartPageVariables;
    }

}