package EnumFactory;

public enum CartEnum {
    XPATH_PRODUCT_NAME("//*[@class='product-name-3mh']"),
    XPATH_SECOND_PRODUCT_NAME("(//*[@class='product-name-3mh'])[2]"),
    XPATH_PRODUCT_COLOUR("//*[@class='product-color-196']"),
    XPATH_PRODUCT_SIZE("//*[@class='product-variations-tXu']/dl"),
    XPATH_SECOND_PRODUCT_SIZE("(//*[@class='product-variations-tXu']/dl)[2]"),
    XPATH_SECOND_PRODUCT_PRICE("//*[@class='product-productListing-2Gh'][2]//span[@class='product-price-Nq8']"),
    XPATH_PRODUCT_PRICE("//*[@class='product-pricebox-3qU']/span");


    private String CartPageVariables;

    private CartEnum(String CartPageVariables) {
        this.CartPageVariables = CartPageVariables;
    }

    public String getValue() {
        return this.CartPageVariables;
    }
}
