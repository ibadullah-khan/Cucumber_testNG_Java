package EnumFactory;

public enum CartPageEnum {

    XPATH_ITEM_CONTAINER_HEADING_START("//li[@class='"),
    XPATH_CART_HEADING("//*[@class='cartPage-heading-1Q0']"),
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
    XPATH_PRODUCT_OLD_PRICE("//*[@class='product-pricebox-3qU']/span[@class='product-discountPrice-1b1']"),
    XPATH_PRODUCT_SAVING_PRICE("//*[@class='product-pricebox-3qU']/span[@class='product-save-3k6']"),
    XPATH_PRODUCT_SECTION("//*[@class='product-details-3HQ']"),
    XPATH_PRODUCT_IMAGE("//*[@class='product-imageContainer-2ws image-container-2jo']"),
    XPATH_PRODUCT_REMOVE_LINK("//*[@class='product-btnRemove-16L']"),
    XPATH_PRODUCT_BRAND("//*[@class='product-brand-3xv']"),
    XPATH_PRODUCT_DATE("//*[@class='product-estimatedDate-1uX']"),
    XPATH_SUB_TOTAL_AMOUNT("(//*[text()='Subtotal']//following-sibling::*[@class='priceSummary-price-2my'])[1]"),
    XPATH_REMOVE_LINK("//button[@class='product-btnRemove-16L' and contains(text(),'Remove')]"),
    XPATH_REMOVE_START("//*[@class='product-name-3mh']/*[text()='"),
    XPATH_REMOVE_END("']//ancestor::div[@class='product-details-3HQ']//button[@class='product-btnRemove-16L']"),
    XPATH_CHECKOUT_CART("//span[text()='Go to Checkout']//parent::button[not(@disabled)]"),
    XPATH_CHECKOUT_DISABLED_CART("//span[text()='Go to Checkout']//parent::button[(@disabled)]"),
    XPATH_INVALID_LOGIN_ERROR("//*[@class='main-loginError-2FL']"),
    XPATH_CART_LOGIN_LINK("//*[@class='cartPage-emptyCartBox-2Z6']//*[text()='Log in']"),
    XPATH_CART_HOME_LINK("//*[@class='cartPage-emptyCartBox-2Z6']//*[text()='Home']"),
    XPATH_ADD_TO_CART_BUTTON("//*[@id='productFullDetail']//*[@class='button-root_highPriority-3-H']"),
    XPATH_PRODUCT_TAX("//*[text()='Tax']//following-sibling::*[@class='priceSummary-price-2my']"),
    XPATH_CART_IS_EMPTY("//*[@class='cartPage-title-ISm' and text()='YOUR CART IS EMPTY']"),
    XPATH_CART_EMPTY_IMAGE("//*[@class='cartPage-emptyCartImage-30f']//img"),
    XPATH_CHANGE_SHIPPING_LINK("//*[@class='shippingSummary-btnChange-28W']"),
    XPATH_SHIPPING_METHOD_START("//*[@class='shippingRadios-radioContents-GH8']/span[text()='"),
    XPATH_SHIPPING_METHOD_END("']"),
    XPATH_SHIPPING_PRICE_START("//*[@class='shippingRadios-radioContents-GH8']/span[text()='"),
    XPATH_SHIPPING_PRICE_END("']/following-sibling::span"),
    XPATH_RELATED_PRODUCT_SECTION("//*[@id='recommended-product']//div[@class='slick-root-3PZ']"),
    XPATH_RELATED_PRODUCT_SECTION_LEFT_SLIDER("//*[@id='recommended-product']//*[contains(@class,'slick-arrow slick-prev')]"),
    XPATH_RELATED_PRODUCT_SECTION_RIGHT_SLIDER("//*[@id='recommended-product']//*[contains(@class,'slick-arrow slick-next')]"),
    XPATH_RELATED_PRODUCTS("//*[contains(@class, 'slick-slide slick-active')]"),
    XPATH_RELATED_PRODUCTS_NAME("//*[contains(@class, 'slick-slide slick-active')]//*[contains(@class, 'slick-brandName-3JU')]"),
    XPATH_RELATED_PRODUCTS_BRAND("//*[contains(@class, 'slick-slide slick-active')]//*[contains(@class, 'slick-title-3hj')]"),
    XPATH_RELATED_PRODUCTS_PRICE("//*[contains(@class, 'slick-slide slick-active')]//*[contains(@class, 'slick-priceDetail-jmn')]"),
    XPATH_SHIPPING_PRICE_SUMMARY_SECTION("//*[@class='shippingSummary-shippingBar-11G']//*[@class='priceSummary-price-2my']"),
    XPATH_SHIPPING_METHOD_SUMMARY_SECTION("//*[@class='shippingSummary-shippingBar-11G']//*[@class='priceSummary-lineItemLabel-122']"),
    XPATH_TOTAL_AMOUNT("//*[@class='priceSummary-summaryOpener-YIL']//*[@class='priceSummary-totalPrice---h priceSummary-price-2my']"),
    XPATH_PROMO_CODE_FIELD("//*[@id='couponCode']"),
    XPATH_ADD_COUPON_BUTTON("//*[@class='button-content-XZ3' and text()='Add']"),
    XPATH_DISCOUNT_LABEL("//*[@class='priceSummary-priceValues-1EF']//*[contains(text(),'Discount')]"),
    XPATH_DISCOUNT_AMOUNT("(//*[contains(text(),'Discount')]//following-sibling::*[@class='priceSummary-price-2my'])[1]"),
    XPATH_INVALID_COUPON_ERROR_MESSAGE("//*[@class='couponCode-entryFormError-22d couponCode-cartCoupon-3gg']//*[@class='message-root-35v']"),
    XPATH_CATEGORY_SECTION("//*[@class='cmsBlock-root-2sX']//*[@class='categories-block']"),
    XPATH_INDIVIDUAL_CATEGORY_START("//*[@class='categories-row']//*[text()=\""),
    XPATH_INDIVIDUAL_CATEGORY_END("\"]");

    private String cartPageVariables;

    private CartPageEnum(String cartPageVariables) {
        this.cartPageVariables = cartPageVariables;
    }

    public String getValue() {
        return this.cartPageVariables;
    }
}