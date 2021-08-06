package EnumFactory;

public enum CartPageEnum {

    XPATH_ITEM_CONTAINER_HEADING_START("//li[@class='"),
    XPATH_ITEM_CONTAINER_HEADING_END("']"),
    XPATH_ITEM_CONTAINER_CONTENT_START("//*[@class='product-productListing-2Gh']//*[@class='"),
    XPATH_ITEM_CONTAINER_CONTENT_END("']"),
    XPATH_ITEM_QUANTITY_COUNTER("//*[@class='cartPage-heading-1Q0']/span"),
    XPATH_PRODUCT_QUANTITY("//input[@class='quantity-input-1fR']"),
    XPATH_SUMMARY_SECTION("//*[@class='cartPage-summary_container-2pt']"),
    XPATH_PRODUCT_NAME("//*[@class='product-name-3mh']/a"),
    XPATH_PRODUCT_COLOUR("//*[@class='product-color-196']"),
    XPATH_PRODUCT_SIZE("//*[@class='product-variations-tXu']/dl"),
    XPATH_PRODUCT_PRICE("//*[@class='product-pricebox-3qU']/span[@class='product-price-Nq8']"),
    XPATH_PRODUCT_SECTION("//*[@class='product-details-3HQ']"),
    XPATH_PRODUCT_IMAGE("//*[@class='product-imageContainer-2ws image-container-2jo']"),
    XPATH_PRODUCT_REMOVE_LINK("//*[@class='product-btnRemove-16L']"),
    XPATH_PRODUCT_BRAND("//*[@class='product-brand-3xv']"),
    XPATH_PRODUCT_DATE("//*[@class='product-estimatedDate-1uX']"),
    XPATH_TOTAL_AMOUNT("(//*[text()='Subtotal']//following-sibling::*[@class='priceSummary-price-2my'])[1]"),
    XPATH_REMOVE_LINK("//button[@class='product-btnRemove-16L' and contains(text(),'Remove')]"),
    XPATH_REMOVE_START("//*[@class='product-name-3mh']/*[text()='"),
    XPATH_REMOVE_END("']//ancestor::div[@class='product-details-3HQ']//button[@class='product-btnRemove-16L']"),
    XPATH_CART_IS_EMPTY("//*[@class='cartPage-title-ISm' and text()='YOUR CART IS EMPTY']");

    private String cartPageVariables;

    private CartPageEnum(String cartPageVariables) {
        this.cartPageVariables = cartPageVariables;
    }

    public String getValue() {

        return this.cartPageVariables;
    }
}
