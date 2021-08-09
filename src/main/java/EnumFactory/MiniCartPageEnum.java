package EnumFactory;

public enum MiniCartPageEnum {

    XPATH_MINI_CART_VIEW("//*[@class='miniCart-contents_open-ubc']"),
    XPATH_MINI_CART_LOGIN_LINK("//*[@class='miniCart-loginBtn-1r9']"),
    XPATH_MINI_CART_CLOSE_ICON("//*[@class='miniCart-closeBtn-2jN']/span"),
    XPATH_PRODUCT_NAME("//*[@class='item-name-1dB']"),
    XPATH_PRODUCT_PRICE("//*[@class='item-price-2oh']"),
    XPATH_PRODUCTS_CONTAINER("//*[@class='productList-items_container-2q_']/div/div"),
    XPATH_TAX_LABEL("//*[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Tax')]"),
    XPATH_GUEST_CHECKOUT_BUTTON("(//*[@class='checkoutProcess-body-2hF']//button[@class='guestCheckout']//span[@class='button-content-XZ3'])[2]"),
    XPATH_PRODUCT_SIZE("//*[@class='item-root-18B']//*[@class='item-options-1pj']"),
    XPATH_PRODUCT_COLOR("//*[@class='item-colorName-1xx']"),
    XPATH_PRODUCT_IMAGE("//*[@class='item-thumbnailContainer-1_h']"),
    XPATH_PRODUCT_REMOVE_LINK("//*[@class='item-deleteButton-2XH']"),
    XPATH_SHIPPING_LABEL("//*[@class='priceSummary-lineItemLabel-1zJ' and contains(text(),'Shipping')]"),
    XPATH_VIEW_CART_BUTTON("//*[@class='miniCart-footerCol-1P_']//*[@class='button-root_highPriority-3-H']"),
    XPATH_CHECKOUT_BUTTON("//*[@class='miniCart-footerCol-1P_']//*[@class='button-root_normalPriority-1xS']"),
    XPATH_PRODUCT_SECTION("//*[@class='item-root-18B']"),
    XPATH_PRODUCT_BRAND("//*[@class='item-brandName-1JN']"),
    XPATH_EDIT_BUTTON("//*[@class='miniCart-contents_open-ubc']//*[contains(text(),'Edit')]"),
    XPATH_PRODUCT_COUNT_TEXT("//*[@class='miniCart-quantity-2K5']"),
    XPATH_PRODUCT_TAX("//*[text()='Tax']//following-sibling::*[@class='priceSummary-price-12K']");


    private String miniCartPageVariables;

    private MiniCartPageEnum(String miniCartPageVariables) {
        this.miniCartPageVariables = miniCartPageVariables;
    }

    public String getValue() {
        return this.miniCartPageVariables;
    }

}
