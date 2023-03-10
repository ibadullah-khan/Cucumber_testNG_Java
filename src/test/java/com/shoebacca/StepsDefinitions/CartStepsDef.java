package com.shoebacca.StepsDefinitions;

import PageObjectFactory.CartPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepsDef extends HarnessVariables{

    protected String runPropFile = "run.properties";
    protected String cartPropFile = "cartData.properties";

    CartPageFactory cartPage;

    public CartStepsDef() throws Exception {
        cartPage = new CartPageFactory();
    }

    @And("User Validates Item Heading on Item Container Visibility {string}")
    public void userValidatesItemHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(ITEM_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(ITEM_HEADING,false);
        }
    }

    @And("User Validates Description Heading on Item Container Visibility {string}")
    public void userValidatesDescriptionHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(DESCRIPTION_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(DESCRIPTION_HEADING,false);
        }
    }

    @And("User Validates Quantity Heading on Item Container Visibility {string}")
    public void userValidatesQuantityHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(QUANTITY_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(QUANTITY_HEADING,false);
        }
    }

    @And("User Validates Item Total Heading on Item Container Visibility {string}")
    public void userValidatesItemTotalHeadingOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerHeadingVisibility(ITEM_TOTAL_HEADING,true);
        }else {
            cartPage.validateItemContainerHeadingVisibility(ITEM_TOTAL_HEADING,false);
        }
    }

    @And("User Validates Item Content on Item Container Visibility {string}")
    public void userValidatesItemContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(ITEM_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(ITEM_CONTENT,false);
        }
    }

    @And("User Validates Description Content on Item Container Visibility {string}")
    public void userValidatesDescriptionContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(DESCRIPTION_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(DESCRIPTION_CONTENT,false);
        }
    }

    @And("User Validates Quantity Content on Item Container Visibility {string}")
    public void userValidatesQuantityContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(QUANTITY_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(QUANTITY_CONTENT,false);
        }
    }

    @And("User Validates Item Total Content on Item Container Visibility {string}")
    public void userValidatesItemTotalContentOnItemContainerVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateItemContainerContentVisibility(ITEM_TOTAL_CONTENT,true);
        }else {
            cartPage.validateItemContainerContentVisibility(ITEM_TOTAL_CONTENT,false);
        }
    }

    @And("User Validates {string} Quantity is Displayed on Quantity Text Field")
    public void userValidatesQuantityIsDisplayedOnQuantityTextField(String expectedValue) {
        cartPage.validateQuantityOfProductAdded(expectedValue);
    }

    @And("User Validates Cart Items Quantity {string} on Cart Page")
    public void userValidatesCartItemsQuantityOnCartPage(String expectedValue) {
        cartPage.validateCartItemQuantity(expectedValue);
    }

    @Then("User Validates Summary Section Visibility {string}")
    public void userValidatesSummarySectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateSummarySectionVisibility(true);
        }else {
            cartPage.validateSummarySectionVisibility(false);
        }
    }
    @Then("User Click on Remove Link on {string} Product on Cart Page")
    public void userClickOnRemoveLinkOnProductOnCartPage(String productName) throws Exception {
        String removeProductName = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(productName);
        cartPage.clickOnRemoveLink(removeProductName);
    }

    @Then("User Validates Price Between Product Item Section and Account Detail Section")
    public void userValidatesPriceBetweenProductItemSectionAndAccountDetailSection() {
        cartPage.validateSubAmount();
    }

    @Then("User Validates Cart Page Has {string} Remove Product Link")
    public void userValidatesCartPageHasRemoveProductLink(String expectedRemoveLink) {
        cartPage.validateRemoveLinkVisibility((Integer.parseInt(expectedRemoveLink)));
    }

    @Then("User Validates {string} Products have Been Added to Cart")
    public void userValidatesProductsHaveBeenAddedToCart(String expectedCount) {
        cartPage.validateDifferentProductNoAdded(expectedCount);
    }

    @Then("User Validates Product Name in Cart Page")
    public void userValidatesProductNameInCartPage() {
        cartPage.validateProductName(PRODUCT_NAME);
    }

    @Then("User Validates Cart Has {string} Product's Attributes Visibility {string}")
    public void userValidatesCartHasProductSAttributesVisibility(String expectedNumber, String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateAllProductsAttributesVisibility(expectedNumber,true);
        }else {
            cartPage.validateAllProductsAttributesVisibility(expectedNumber,false);
        }
    }

    @And("User Click on Product Name on Cart Page")
    public void userClickOnProductNameOnCartPage() {
        cartPage.clickOnProductName();
    }

    @Then("User Clicks Checkout Button on Cart View")
    public void userClicksCheckoutButtonOnCartView() {
        cartPage.clickOnCheckoutButton();
    }

    @Then("User Fetches Tax Value on Cart")
    public void userFetchesTaxValueOnCart() {
        TAX_VALUE=cartPage.getTaxValue();
    }

    @Then("User Validates Tax Value from Cart")
    public void userValidatesTaxValueFromCart() {
        cartPage.validateTaxValue(TAX_VALUE);
    }

    @Then("User Validates Your Cart is Empty Section Visibility {string}")
    public void userValidatesYourCartIsEmptySectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateCartIsEmptySectionVisibility(true);
        }else {
            cartPage.validateCartIsEmptySectionVisibility(false);
        }
    }

    @And("User Enters {string} on Quantity Text Field on Cart")
    public void userEntersOnQuantityTextFieldOnCart(String quantityValue) throws Exception {
        cartPage.enterProductQuantity(quantityValue);
    }

    @Then("User Clicks on Change Shipping Option of Cart Page")
    public void userClicksOnChangeShippingOptionofCartPage() {
        cartPage.clickOnChangeShippingOption();
    }

    @Then("User Clicks on {string} Shipping Method on Dropdown of Cart Page")
    public void userClicksOnShippingMethod(String shippingMethod) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        cartPage.clickOnShippingMethod(shippingMethodName);
    }

    @Then("User Validates {string} Shipping Method Visibility {string} on Dropdown of Cart Page")
    public void userValidatesMethodVisibilityOnDropdownofCartPage(String shippingMethod, String expectedCondition) throws Exception {
        String shippingMethodName = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        if(expectedCondition.equals("true")){
            cartPage.validateShippingMethodVisibilityOnDropDown(shippingMethodName,true);
        }else {
            cartPage.validateShippingMethodVisibilityOnDropDown(shippingMethodName,false);
        }
    }

    @Then("User Validates {string} Shipping Price Visibility {string} on Dropdown of Cart Page")
    public void userValidatesShippingPriceVisibilityOnDropdownofCartPage(String shippingMethod, String expectedCondition) throws Exception {
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        if(expectedCondition.equals("true")){
            cartPage.validateShippingPriceVisibilityOnDropDown(shippingMethodName,true);
        }else {
            cartPage.validateShippingPriceVisibilityOnDropDown(shippingMethodName,false);
        }
    }

    @Then("User Validates total Amount on Summary Section of Cart Page")
    public void userValidatesTotalAmountOnSummarySectionOfCartPage() {
        cartPage.validateTotalAmount();
    }

    @Then("User Validates {string} Method Price {string} on Dropdown of Cart Page")
    public void userValidatesShippingPriceAmountOnDropdownofCartPage(String shippingMethod, String shippingPrice) throws Exception {
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        String shippingPriceValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingPrice);
        cartPage.validateShippingPriceAmountOnDropDown(shippingMethodName,shippingPriceValue);

    }

    @Then("User Validates {string} Shipping Price on Summary Section of Cart Page")
    public void userValidatesShippingPriceOnSummarySectionOfCartPage(String shippingPrice) throws Exception{
        String shippingPriceValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingPrice);
        cartPage.validateShippingPriceAmountOnSummarySection(shippingPriceValue);
    }

    @Then("User Validates {string} Shipping Method Name on Summary Section of Cart Page")
    public void userValidatesShippingMethodNameOnSummarySectionOfCartPage(String shippingMethod) throws Exception{
        String shippingMethodName= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(shippingMethod);
        cartPage.validateShippingMethodNameOnSummarySection(shippingMethodName);
    }

    @Then("User Validates Tax Value {string} on Cart Page")
    public void userValidatesTaxValueOnCartPage(String taxValue) throws Exception {
        String productTaxValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(taxValue);
        cartPage.validateTaxValue(productTaxValue);
    }

    @Then("User Validates Product Price in Cart")
    public void userValidatesProductPriceInCart() {
        cartPage.validateProductPrice(PRODUCT_PRICE);
    }

    @Then("User Validates Product Size in Cart")
    public void userValidatesProductSizeInCart() {
        cartPage.validateProductSize(PRODUCT_SIZE);
    }

    @Then("User Validates Product Colour in Cart")
    public void userValidatesProductColourInCart() {
        cartPage.validateProductColour(PRODUCT_COLOUR);
    }

    @Then("User Validates Product Brand in Cart")
    public void userValidatesProductBrandInCart() {
        cartPage.validateProductBrand(PRODUCT_BRAND);
    }

    @Then("User Validates Product Image Visibility on Cart {string}")
    public void userValidatesProductImageVisibilityOnCart(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateProductImageVisibility(1,true);
        }else {
            cartPage.validateProductImageVisibility(1,false);
        }
    }

    @Then("User Validates Expected Date Visibility on Cart {string}")
    public void userValidatesExpectedDateVisibilityOnCart(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateExpectedDateVisibility(1,true);
        }else {
            cartPage.validateExpectedDateVisibility(1,false);
        }
    }

    @Then("User Enter {string} in Promo Code on Cart Page")
    public void userEnterInPromoCodeOnCartPage(String coupon)throws Exception {
        String couponValue= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(coupon);
        cartPage.enterCouponCode(couponValue);
    }

    @Then("User Clicks on Add Promo Code Button")
    public void userClicksOnAddPromoCodeButton() {
        cartPage.clickOnAddPromoCodeButton();
    }

    @Then("User Validates Discount Details Visibility {string} on Summary Section of Cart Page")
    public void userValidatesDiscountDetailVisibilityOnSummarySectionOfCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateDiscountOptionVisibility(true);
        }else {
            cartPage.validateDiscountOptionVisibility(false);
        }
    }

    @Then("User Validates Total Amount using {string} Coupon")
    public void userValidatesTotalAmountUsingCoupon(String couponStatus) {
        cartPage.validateTotalAmountAfterUsingCoupon(couponStatus);
    }

    @Then("User Validated {string} Coupon Error Message Text")
    public void userValidatedCouponErrorMessageText(String errorMsgText) throws Exception {
        String expectedErrorMsgText= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(errorMsgText);
        cartPage.validateErrorMsgText(expectedErrorMsgText);
    }

    @Then("User Validates UnSuccessful Login Error Visibility {string} on Cart Page")
    public void userValidatesUnSuccessfulLoginErrorVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateErrorMessageVisibility(true);
        }else {
            cartPage.validateErrorMessageVisibility(false);
        }
    }

    @Then("User Validates Category Section Visibility {string}")
    public void userValidatesCategorySectionVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateCategorySectionVisibility(true);
        }else {
            cartPage.validateCategorySectionVisibility(false);
        }
    }

    @Then("User Clicks on {string} Category")
    public void userClicksOnCategory(String categoryName)  throws Exception {
        String expectedCategory= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(categoryName);
        cartPage.clickOnCategory(expectedCategory);
    }

    @And("User Validates {string} Displayed on Cart Page")
    public void userValidatesDisplayedOnCartPage(String expectedValue)throws Exception {
        String expectedErrorMsgText= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(expectedValue);
        cartPage.validateEmptyCartTextOnCart(expectedErrorMsgText);
    }

    @And("User Validates {string} Image on Cart Page")
    public void userValidatesImageOnCartPage(String expectedValue)throws Exception {
        String expectedErrorMsgText= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(expectedValue);
        cartPage.validateImageOnCart(expectedErrorMsgText);
    }

    @And("User Validates Login Link Visibility on Cart Page {string}")
    public void userValidatesLoginLinkVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateLoginLinkVisibility(true);
        }else {
            cartPage.validateLoginLinkVisibility(false);
        }
    }

    @Then("User Clicks on Login Button")
    public void userClicksonLoginButton() {
        cartPage.clickOnLoginButton();
    }

    @Then("User Validates Discounted Amount on Cart Page")
    public void userValidatesDiscountedAmountOnCartPage() {
        cartPage.validateDiscountedAmount();
    }

    @And("User Validates Product Discount Price Visibility {string} on Cart Page")
    public void userValidatesProductDiscountPriceVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateDiscountPriceVisibility(true);
        }else {
            cartPage.validateDiscountPriceVisibility(false);
        }
    }

    @And("User Validates Product Save Price Visibility {string} on Cart Page")
    public void userValidatesProductSavePriceVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateProductSavePriceVisibility(true);
        }else {
            cartPage.validateProductSavePriceVisibility(false);
        }
    }

    @And("User Validates Successful Loaded Cart Page")
    public void userValidatesSuccessfulLoadedCartPage() {
        cartPage.validateCartTriggered();
    }

    @Then("User Validates Product Price Visibility {string} on Cart Page")
    public void userValidatesProductPriceVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validatePriceVisibility(true);
        }else {
            cartPage.validatePriceVisibility(false);
        }
    }

    @And("User Validates Home Link Visibility on Cart Page {string}")
    public void userValidatesHomeLinkVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateHomeLinkVisibility(true);
        }else {
            cartPage.validateHomeLinkVisibility(false);
        }
    }

    @Then("User Clicks on Home Button on Cart Page")
    public void userClicksOnHomeButtonOnCartPage() {
        cartPage.clickOnHomeButton();
    }

    @Then("User Verify Predict Inspector Section Visibility {string}")
    public void userVerifyPredictInspectorSectionVisibility(String expectedCondition) {

        if(expectedCondition.equals("true")){
            cartPage.validatePredictInspectorSectionVisibility(true);
        }else {
            cartPage.validatePredictInspectorSectionVisibility(false);
        }
    }

    @Then("User Verify that on {string} Column {string} Description is Display")
    public void userVerifyThatOnColumnDescriptionIsDisplay(String PredictInspectorMenuItem, String PredictInspectorMenuItemDescription) throws Exception {
        String expectedPredictInspectorMenuItem= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(PredictInspectorMenuItem);
        String expectedPredictInspectorMenuItemDescription= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(PredictInspectorMenuItemDescription);
        cartPage.validatePredictItemDescription(expectedPredictInspectorMenuItem,expectedPredictInspectorMenuItemDescription);

    }

    @Then("User Validates Checkout Button Disabled Visibility {string}")
    public void userValidatesCheckoutButtonDisabledVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateCheckoutDisabledVisibility(true);
        }else {
            cartPage.validateCheckoutDisabledVisibility(false);
        }
    }

    @Then("User Validates Shipping Label Visibility on Cart Page {string}")
    public void userValidatesShippingLabelVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateShippingLabelVisibility(true);
        }else {
            cartPage.validateShippingLabelVisibility(false);
        }
    }

    @Then("User Validates Shipping Value Visibility on Cart Page {string}")
    public void userValidatesShippingValueVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateShippingValueVisibility(true);
        }else {
            cartPage.validateShippingValueVisibility(false);
        }
    }

    @Then("User Validates {string} Estimated Delivery Date Color on Cart Page")
    public void userValidatesDateColorOnCart(String expectedValue) throws Exception {
        String expectedDateColor= new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(expectedValue);
        cartPage.validateDateColor(expectedDateColor);
    }

    @Then("User Fetches And Compare Estimated Delivery Date on Cart Page")
    public void userFetchesAndCompareEstimatedDateOnCartPage() {
        cartPage.getAllEstimatedDeliveryDatesAndCompare(ALL_EXPECTED_DATE);
    }

    @Then("User Fetches All Estimated Delivery Dates on Cart Page")
    public void userFetchesAllEstimatedDeliveryDatesOnCartPage() {
    ALL_EXPECTED_DATE=cartPage.getAllEstimatedDeliveryDates();
    }

    @Then("User Validates Cart Page Has {string} Estimated Date on Cart Page")
    public void userValidatesCartPageHasExpectedDate(String expectedDate) {
        cartPage.validateEstimatedDeliveryDateQuantityVisibility((Integer.parseInt(expectedDate)));
    }

    @Then("User Hovers Mouse To Social Button")
    public void userHoversMouseToSocialButton() {
        cartPage.hoverOnSocialMediaButton();
    }

    @Then("User Validates {string} Social Button Color on Cart Page")
    public void userValidatesSocialButtonColorOnCartPage(String expectedValue) throws Exception {
        String socialButtonColor = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(expectedValue);
        cartPage.validateSocialButtonColor(socialButtonColor);
    }

    @Then("User Validates Estimated Delivery Date with respect to {string}")
    public void userValidatesEstimatedDeliveryDateWithRespectTo(String days) throws Exception {
        String expectedDays = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(days);
        cartPage.validatEstimatedDeliveryDate(Integer.parseInt(expectedDays),Integer.parseInt(EXPECTED_CUT_OFF_TIME),EXPECTED_HOLIDAYS);
    }

    @Then("User Fetches Shipping Method on Cart Page")
    public void userFetchesShippingMethodOnCartPage() {
        SHIPPING_METHOD=cartPage.getShippingMethod();
    }

    @Then("User Validates Gift Items Pop Up Window Visibility {string}")
    public void userValidatesGiftItemsPopUpWindowVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateGiftItemPopWindowVisibility(true);
        }else {
            cartPage.validateGiftItemPopWindowVisibility(false);
        }
    }

    @Then("User Clicks on Close Icon on Gift Items Pop Up Window")
    public void userClicksOnCloseIconOnGiftItemsPopUpWindow() {
        cartPage.clickOnCloseIconOnGiftItemPopupWindow();
    }

    @Then("User Clicks on Free Gift Link on Cart Page")
    public void userClicksOnFreeGiftLinkOnCartPage() {
        cartPage.clickOnFreeGiftLink();
    }

    @Then("User Clicks Add to Cart Button on Gift Items Pop Up Window")
    public void userClicksAddToCartButtonOnGiftItemsPopUpWindow() {
        cartPage.clickOnAddToCart();
    }

    @Then("User Validates Free Gift Link Visibility {string} on Cart Page")
    public void userValidatesFreeGiftLinkVisibilityOnCartPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            cartPage.validateFreeGiftLinkVisibility(true);
        }else {
            cartPage.validateFreeGiftLinkVisibility(false);
        }
    }

    @Then("User Select {string} from Gift Items Pop Up Window")
    public void userSelectFromGiftItemsPopUpWindow(String item) throws Exception {
        String expectedItem = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(item);
        cartPage.selectItem(expectedItem);
    }

    @Then("Validates that Selected {string} Have Free Tag")
    public void validatesThatSelectedHaveFreeTag(String item) throws Exception {
        String expectedItem = new PropertyLoaderFactory().getPropertyFile(cartPropFile).getProperty(item);
        cartPage.validateItemHaveFreeTag(expectedItem);
    }
}