package PageObjectFactory;

import EnumFactory.CartPageEnum;
import EnumFactory.MiniCartPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MiniCartPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

    public MiniCartPageFactory() throws Exception {
    }

    public void validateMiniCartViewVisibility(Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_VIEW.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Mini Cart View is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Mini Cart View is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void clickOnLoginLink(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_LOGIN_LINK.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Login Link on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Login Link on Mini Cart View");
            throw e;
        }
    }

    public void validateLoginLinkVisibility(Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_LOGIN_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Login Link is Displayed as Expected on Mini Cart View");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Login Link is not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Login Link is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Login Link is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void clickOnCloseIcon(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_CLOSE_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Close Icon on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Close Icon on Mini Cart View");
            throw e;
        }
    }

    public void validateMiniCartTriggered(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_VIEW.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Product Successfully Triggered Mini Cart");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Product Could not Successfully Trigger Mini Cart");
            throw e;
        }
    }

    public void validateProductName(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Name on Mini Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Product Name on Mini Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Name Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateInvalidProductName(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (!actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Name on Mini Cart is not Present as Expected: "+expectedText+" , Actual Value: "+actualText);
            }else {
                errorMsg = "Could not validate Product Name on Mini Cart as Product Name is Unexpectedly Same: "+expectedText;
                throw new NoSuchContextException("Actual and Expected Value do not Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Name Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPrice(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Price on Mini Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Product Price on Mini Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateCloseButtonVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_MINI_CART_CLOSE_ICON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Close Button is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Close Button is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Close Button is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Close Button is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }

    }

    public void validateEditQuantityVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_EDIT_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Edit Button is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Edit Button is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Edit Button is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Edit Button is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }

    }

    public void validateMiniCartScrollability(Boolean expectedCondition){
        String locator = MiniCartPageEnum.XPATH_PRODUCTS_CONTAINER.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualCondition = isScrollable(locator);
            if (actualCondition && expectedCondition){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is Scrollable as Expected");
            }else if (!actualCondition && !expectedCondition){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is not Scrollable as Expected");
            }else if (actualCondition && !expectedCondition){
                errorMsg = "Validated Mini Cart View is Scrollable Unexpected";
                throw new NoSuchElementException("Element Scrollable was Unexpected for Element: " +locator);
            }else if (!actualCondition && expectedCondition){
                errorMsg = "Validated Mini Cart View is not Scrollable Unexpected";
                throw new NoSuchElementException("Element Scrollable was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Scroll Element on Mini Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductSizeVisibility(int expectedProductNo,Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Size is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Size is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Size is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Size is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Size Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void clickOnGuestCheckoutButton() {
        String locator = MiniCartPageEnum.XPATH_GUEST_CHECKOUT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Guest Checkout Button on Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Guest Checkout Button on Cart View");
            throw e;
        }
    }

    public void validateTaxLabelVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_TAX_LABEL.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Tax Label is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Tax Label is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Tax Label is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Tax Label is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }

        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateProductBrandVisibility(int expectedProductNo,Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Brand is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Brand is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Brand is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Brand is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Brand Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductImageVisibility(int expectedProductNo,Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_IMAGE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Image is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Image is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Image is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Image is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Image Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductColorVisibility(int expectedProductNo,Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_COLOR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Color is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Color is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Color is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Color is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Color Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductRemoveVisibility(int expectedProductNo,Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_REMOVE_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Remove Link is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Remove Link is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Remove Link is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Remove Link is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Remove Link Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingLabelVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_SHIPPING_LABEL.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Label is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Shipping Label is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Shipping Label is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Shipping Label is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateViewCartButtonVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_VIEW_CART_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated View Cart Button is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated View Cart Button is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated View Cart Button is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated View Cart Button is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateCheckoutButtonVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_CHECKOUT_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Checkout Button is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Checkout Button is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Checkout Button is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Checkout Button is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateProductNoAdded(String expectedCount) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_SECTION.getValue();
        String errorMsg = null;
        String actualCount;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualCount = String.valueOf(getSize(locator));
            if (expectedCount.equals(actualCount)) {
                scenarioDef.log(Status.PASS, "Validated "+expectedCount+" products are added as Expected on Mini Cart");
            }else {
                errorMsg = "Could not validate "+expectedCount+" products are added as Expected on Mini Cart, Actual: "+actualCount;
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Section Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductNameVisibility(int expectedProductNo,Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Name is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Name is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Name is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Name is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Name Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPriceVisibility(int expectedProductNo,Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo==elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Price is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expectedProductNo+" Product Price is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Price is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expectedProductNo+" Product Price is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateAllProductsAttributesVisibility(String expectedCount,Boolean expectedVisibility) {
        try{
            validateProductNameVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductPriceVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductImageVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductRemoveVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductColorVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductSizeVisibility(Integer.parseInt(expectedCount),expectedVisibility);
            validateProductBrandVisibility(Integer.parseInt(expectedCount),expectedVisibility);
           scenarioDef.log(Status.PASS, "Validated All Attributes are Displayed on Mini Cart");
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate All Attributes are Displayed on Mini Cart");
            throw e;
        }
    }

    public void clickOnViewCartButton(){
        String locator = MiniCartPageEnum.XPATH_VIEW_CART_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on View Cart Button on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on View Cart Button on Mini Cart View");
            throw e;
        }
    }

    public void clickOnCheckoutButton() {
        String locator = MiniCartPageEnum.XPATH_CHECKOUT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Checkout Button on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Checkout Button on Mini Cart View");
            throw e;
        }

    }

    public void clickOnProductRemoveLink(){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_REMOVE_LINK.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Remove Link on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Remove Link on Mini Cart View");
            throw e;
        }
    }

    public void validateProductSectionVisibility(Boolean expectedVisibility) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Section is Displayed as Expected on Mini Cart View");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Product Section is Not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Product Section is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Product Section is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateProductCountText(String expectedText) {
        String locator = MiniCartPageEnum.XPATH_PRODUCT_COUNT_TEXT.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Count on Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Product Count on Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Count Element on Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void clickOnMemberCheckoutButton() {
        String locator = MiniCartPageEnum.XPATH_MEMBER_CHECKOUT.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Member Checkout Button on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Member Checkout Button on Mini Cart View");
            throw e;
        }
    }

    public void validateTaxValue(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_TAX.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Tax on Mini Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Tax on Mini Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Tax Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void clickOnViewCartButtonMobile() {
        String locator = MiniCartPageEnum.XPATH_VIEW_CART_MOBILE.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on View Cart Button on Cart View for Mobile");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on View Cart on Cart View for Mobile");
            throw e;
        }

    }

}
