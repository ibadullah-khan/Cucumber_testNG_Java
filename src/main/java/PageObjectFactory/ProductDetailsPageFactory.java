package PageObjectFactory;

import EnumFactory.CartPageEnum;
import EnumFactory.ProductDetailsPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.NoSuchContextException;

public class ProductDetailsPageFactory extends UtilFactory {
    public ProductDetailsPageFactory() throws Exception {
    }

    public void clickOnAddToCart() {
        String locator = ProductDetailsPageEnum.XPATH_ADD_TO_CART_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add to Cart Button on PDP");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add to Cart Button on PDP");
            throw e;
        }
    }

    public void clickOnAddToCartMobile() {
        String locator = ProductDetailsPageEnum.XPATH_ADD_TO_CART_BUTTON_MOBILE.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add to Cart Button on PDP");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add to Cart Button on PDP");
            throw e;
        }
    }

    public String getProductName() {
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_NAME.getValue();
        String productName;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            productName = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Product Name: " + productName + " from PDP");
            return productName;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Product Name from PDP");
            throw e;
        }
    }

    public String getProductPrice() {
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String productPrice;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            productPrice = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Product Price: " + productPrice + " from PDP");
            return productPrice;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Product Price from PDP");
            throw e;
        }
    }

    public String getProductColour() {
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_COLOUR.getValue();
        String productColour;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            productColour = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Product Colour: " + productColour + " from PDP");
            return productColour;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Product Colour from PDP");
            throw e;
        }
    }

    public String getProductSize() {
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String productSize;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            productSize = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Product Size: " + productSize + " from PDP");
            return productSize;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Product Size from PDP");
            throw e;
        }
    }

    public String getProductBrand() {
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String productBrand;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            productBrand = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Product Brand: " + productBrand + " from PDP");
            return productBrand;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Product Brand from PDP");
            throw e;
        }
    }

    public void selectFirstAvailableProductSize() {
        String locator = ProductDetailsPageEnum.XPATH_SELECT_FIRST_AVAILABLE_PRODUCT_SIZE.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add to First Available Size Button on PDP");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on First Available Size Button on PDP");
            throw e;
        }
    }

    public void validateProductNameToRelatedProduct(String productNamePdp,String productNameRp) {
        String errorMsg = null;
        try {
            if (productNamePdp.contains(productNameRp)) {
                scenarioDef.log(Status.PASS, "Validated Product Name From PDP is Similar to The Related Product Name: " + productNamePdp);
            } else {
                errorMsg = "Could not validate Expected  Product : " + productNamePdp + " , Actual Value: " + productNameRp;
                throw new NoSuchContextException("Actual and Expected Name is Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDateColor(String expectedDateColor){
        String dateLocator = ProductDetailsPageEnum.XPATH_ESTIMATED_ANDROID_DELIVERY_DATE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(dateLocator);
            String actualValue=getCSS(dateLocator,"color");
            String hex = Color.fromString(actualValue).asHex();
            if (hex.contains(expectedDateColor)) {
                scenarioDef.log(Status.PASS, "Validated Date Color is " + expectedDateColor + " on PDP");
            } else {
                errorMsg = "Could not validate Date Color is: " + expectedDateColor + " on PDP, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }
        catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Date Color PDP");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateExpectedDateVisibility(Boolean expectedVisibility) {
        String locator = ProductDetailsPageEnum.XPATH_ESTIMATED_ANDROID_DELIVERY_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Expected Date is Displayed as Expected on PDP");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Expected Date is Not Displayed as Expected on PDP");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Expected Date is Displayed Unexpected on PDP";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Expected Date is not Displayed Unexpected on PDP";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

}