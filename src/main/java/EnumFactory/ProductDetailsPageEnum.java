package EnumFactory;

public enum ProductDetailsPageEnum {

    XPATH_ADD_TO_CART_BUTTON("//*[@id='productFullDetail']//*[@class='button-root_highPriority-3-H']"),
    XPATH_ADD_TO_CART_BUTTON_MOBILE("//*[@class='productFullDetail-productDetailFixedCol-3kb productFullDetail-cartActions-Uw6']//*[@class='button-root_highPriority-3-H']"),
    XPATH_PRODUCT_NAME("//*[@id='productFullDetail']//*[@class='productFullDetail-productName-2Ax']"),
    XPATH_PRODUCT_COLOUR("//*[@id='productFullDetail']//*[@class='productFullDetail-colorSwatchName-2by']"),
    XPATH_PRODUCT_SIZE("//*[@class='tile-root_selected-1uw']/span"),
    XPATH_PRODUCT_BRAND("//*[@id='productFullDetail']//*[@class='productFullDetail-brandName-38D']"),
    XPATH_SELECT_FIRST_AVAILABLE_PRODUCT_SIZE("//span[text()='select size']/parent::*/following-sibling::*//button[not(@disabled)]"),
    XPATH_ESTIMATED_DELIVERY_DATE("//*[@id='productFullDetail']//*[@class='productFullDetail-delievryMessage-Cl1']/span"),
    XPATH_ESTIMATED_DELIVERY_DATE_MOBILE("//*[@class='productFullDetail-delievryMessage-Cl1']/span"),
    XPATH_PRODUCT_PRICE("//*[@id='productFullDetail']//*[@class='productFullDetail-price-hNW']");

    private String pdpVariables;

    private ProductDetailsPageEnum(String pdpVariables) {
        this.pdpVariables = pdpVariables;
    }

    public String getValue() {
        return this.pdpVariables;
    }
}
