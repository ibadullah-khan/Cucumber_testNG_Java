package PageObjectFactory;

import EnumFactory.CartPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

public class CartPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

    public CartPageFactory() throws Exception {
    }

    public void validateItemContainerHeadingVisibility(String expectedLocator, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container have " + expectedLocator + " Heading Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container does not have " + expectedLocator + " Heading Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Item Container have " + expectedLocator + " Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Item Container does not have " + expectedLocator + " Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateItemContainerContentVisibility(String expectedLocator, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container have " + expectedLocator + " Content Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Item Container does not have " + expectedLocator + " Content Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Item Container have " + expectedLocator + " Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Item Container does not have " + expectedLocator + " Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCartItemQuantity(String expectedValue) {
        String locator = CartPageEnum.XPATH_ITEM_QUANTITY_COUNTER.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Cart has " + expectedValue + " Items Added");
            } else {
                errorMsg = "Could not validate Cart has as Expected Item Count: " + expectedValue + ", Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Cart Item Quantity Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateQuantityOfProductAdded(String expectedValue) {
        String locator = CartPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Product Quantity is " + expectedValue + " on Cart Page");
            } else {
                errorMsg = "Could not validate Product Quantity is: " + expectedValue + " on Cart Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Quantity Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateSummarySectionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Summary Section is Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Summary Section is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Summary Section is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Summary Section is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDifferentProductNoAdded(String expectedCount) {
        String locator = CartPageEnum.XPATH_PRODUCT_SECTION.getValue();
        String errorMsg = null;
        String actualCount;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualCount = String.valueOf(getSize(locator));
            if (expectedCount.equals(actualCount)) {
                scenarioDef.log(Status.PASS, "Validated " + expectedCount + " products are added as Expected on Cart");
            } else {
                errorMsg = "Could not validate " + expectedCount + " products are added as Expected on Cart, Actual: " + actualCount;
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductNameVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Name is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Name is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Name Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPriceVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Price is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Price is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Price Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductImageVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_IMAGE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Image is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Image is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Image Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateExpectedDateVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Expected Date is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Expected Date is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Expected Date is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Expected Date is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Expected Date Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductRemoveVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_REMOVE_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Remove Link is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Remove Link is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Remove Link Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductColorVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_COLOUR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Color is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Color is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Color Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductSizeVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Size is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Size is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Size Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductBrandVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Brand Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductEstDateVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Date Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateAllProductsAttributesVisibility(String expectedCount, Boolean expectedVisibility) {
        try {
            validateProductNameVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductPriceVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductImageVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductRemoveVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductColorVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductSizeVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductBrandVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductEstDateVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            scenarioDef.log(Status.PASS, "Validated All Attributes are Displayed on Cart");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate All Attributes are Displayed on Cart");
            throw e;
        }
    }

    public void clickOnProductName() {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Product Name on Cart View");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Product Name on Mini Cart View");
            throw e;
        }
    }

    public void clickOnCheckoutButton() {
        String locator = CartPageEnum.XPATH_CHECKOUT_CART_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Checkout Button on Cart View");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Checkout Button on Cart View");
            throw e;
        }

    }
    public void validateProductName(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Product Name on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Product Name on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Name Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPrice(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Product Price on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Product Price on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Price Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductSize(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Product Size on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Product Size on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Size Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductColour(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_COLOUR.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Product Colour on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Product Colour on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Colour Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductBrand(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Product Brand on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Product Brand on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Brand Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateRemoveLinkVisibility(int expectedRemoveLink) {
        String locator = CartPageEnum.XPATH_REMOVE_LINK.getValue();
        waitFactory.waitForElementToBeVisible(locator);
        String errorMsg = null;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            if (expectedRemoveLink == elements.size()) {
                scenarioDef.log(Status.PASS, "Validated " + expectedRemoveLink + " Remove Link is Displayed as Expected on Cart Page");
            } else {
                errorMsg = "Validated " + expectedRemoveLink + " Remove Link is not Displayed as Expected on Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Remove Link Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateEstimatedDeliveryDateQuantityVisibility(int expectedCount) {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        waitFactory.waitForElementToBeVisible(locator);
        String errorMsg = null;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            if (expectedCount == elements.size()) {
                scenarioDef.log(Status.PASS, "Validated " + expectedCount + " Expected Date is Displayed as Expected on Cart Page");
            } else {
                errorMsg = "Validated " + expectedCount + " Expected Date is not Displayed as Expected on Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Expected Date Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnRemoveLink(String expectedProductName) {
        String locator = CartPageEnum.XPATH_REMOVE_START.getValue() + expectedProductName + CartPageEnum.XPATH_REMOVE_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS, "Clicked on Remove Link of " + expectedProductName + " Product on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Remove Link of " + expectedProductName + " Product on Cart Page");
            throw e;
        }
    }

    public void validateSubAmount() {
        String individualAmountLocator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String totalAmountLocator = CartPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String errorMsg = null;
        double totalPriceOfProductSection = 0;
        double totalSummaryAmount = 0;
        List<WebElement> elements;
        WebElement element;
        try {
            waitFactory.waitForElementToBeClickable(individualAmountLocator);
            elements = elementFactory.getElementsList(individualAmountLocator);
            for (int i = 0; i < elements.size(); i++) {
                element = elements.get(i);
                totalPriceOfProductSection = totalPriceOfProductSection + Double.parseDouble(getText(element).trim().substring(1));
            }
            waitFactory.waitForElementToBeClickable(totalAmountLocator);
            totalSummaryAmount = Double.parseDouble(getText(totalAmountLocator).trim().substring(1));

            if (totalSummaryAmount == totalPriceOfProductSection) {
                scenarioDef.log(Status.PASS, "Validate Summary Total Amount $" + totalSummaryAmount + " is Equal to Sum of  Product Prices $" + totalPriceOfProductSection);
            } else {
                errorMsg = "Validate Summary Total Amount $" + totalSummaryAmount + "is not Equal to Sum of  Product Prices $" + totalPriceOfProductSection;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Price Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public String getTaxValue() {
        String taxvalue;
        String locator = CartPageEnum.XPATH_PRODUCT_TAX.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            taxvalue = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Tax Value: " + taxvalue + " from Cart");
            return taxvalue;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Tax Value from Cart");
            throw e;
        }
    }


    public void validateTaxValue(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_TAX.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Tax on Cart as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Tax on Cart as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Tax Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCartIsEmptySectionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CART_IS_EMPTY.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Cart Is Empty Section is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Cart Is Empty Section is Not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Cart Is Empty Section is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Cart Is Empty Section is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Cart Is Empty Section Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnChangeShippingOption() {
        String locator = CartPageEnum.XPATH_CHANGE_SHIPPING_LINK.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Change Shipping Option on Summary Section of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Change Shipping Option on Summary Section of Cart Page");
            throw e;
        }
    }

    public void clickOnShippingMethod(String expecetedShippingMethodName) {
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_START.getValue() + expecetedShippingMethodName + CartPageEnum.XPATH_SHIPPING_METHOD_END.getValue();
        String checkoutLocator = CartPageEnum.XPATH_CHECKOUT_CART_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(checkoutLocator);
            scenarioDef.log(Status.PASS, "Clicked on " + expecetedShippingMethodName + " Method on Summary Section of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click " + expecetedShippingMethodName + " Method on Summary Section of Cart Page");
            throw e;
        }
    }

    public void validateShippingMethodVisibilityOnDropDown(String expecetedShippingMethodName, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_START.getValue() + expecetedShippingMethodName + CartPageEnum.XPATH_SHIPPING_METHOD_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expecetedShippingMethodName + " Method is Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expecetedShippingMethodName + " Method is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expecetedShippingMethodName + " Method is Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expecetedShippingMethodName + " Method is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Method Element on drop down of Summary Section on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingPriceVisibilityOnDropDown(String expectedShippingMethod, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_START.getValue() + expectedShippingMethod + CartPageEnum.XPATH_SHIPPING_PRICE_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated  Shipping Price " + expectedShippingMethod + " is Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated  Shipping Price " + expectedShippingMethod + " is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated  Shipping Price " + expectedShippingMethod + " is Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated  Shipping Price " + expectedShippingMethod + " is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Price Element on drop down of Summary Section on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingPriceAmountOnDropDown(String expectedShippingMethod, String expectedShippingPrice) {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_START.getValue() + expectedShippingMethod + CartPageEnum.XPATH_SHIPPING_PRICE_END.getValue();
        String actualPrice = getText(locator).trim();
        String errorMsg = null;
        try {
            if (actualPrice.equalsIgnoreCase(expectedShippingPrice)) {
                scenarioDef.log(Status.PASS, "Validated Shipping Price " + expectedShippingPrice + " Same as Expected on Shipping Method Drop of Summary Section of Cart Page");
            } else {
                errorMsg = "Validate Shipping Price " + expectedShippingPrice + " Not Same as Expected on Shipping Method Drop of Summary Section of Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the  Shipping Price Element on Drop Down Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingPriceAmountOnSummarySection(String expectedShippingPrice) {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_SUMMARY_SECTION.getValue();
        String actualPrice = getText(locator).replace(".00", "");
        String errorMsg = null;
        try {
            if (actualPrice.equalsIgnoreCase(expectedShippingPrice)) {
                scenarioDef.log(Status.PASS, " Validated Shipping Price " + expectedShippingPrice + " Same as Expected on Summary Section of Cart Page");
            } else {
                errorMsg = "Validate Shipping Price " + expectedShippingPrice + " Not Same as Expected Same as Expected on Summary Section of Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the  Shipping Price Element Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethodNameOnSummarySection(String expectedShippingMethod) {
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeVisible(locator);
            String shippingMethod = getText(locator);
            if (shippingMethod.contains(expectedShippingMethod)) {
                scenarioDef.log(Status.PASS, " Validated Shipping Method " + expectedShippingMethod + " Same as Expected on Summary Section of Cart Page");
            } else {
                errorMsg = " Validate Shipping Method " + expectedShippingMethod + " Not Same as Expected Same as Expected on Summary Section of Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Method Element Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public double getShippingAmount() {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_SUMMARY_SECTION.getValue();
        double shippingAmount;
        if (getText(locator).equalsIgnoreCase("free")) {
            shippingAmount = 0;
        } else {
            shippingAmount = Double.parseDouble(getText(locator).trim().substring(1));
        }
        return shippingAmount;
    }

    public void validateTotalAmount() {
        String subAmountLocator = CartPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CartPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(subAmountLocator);
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().substring(1));
            double shippingAmount = getShippingAmount();
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().substring(1));
            if (totalAmount == subAmount + shippingAmount) {
                scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Summary Section of Cart Page");
            } else {
                errorMsg = "Validate Summary Total Amount $" + totalAmount + " is not Same as Expected on Summary Section of Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Price Element on Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void enterProductQuantity(String textToEnter) throws Exception {
        String locator = CartPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            removeOneSpace(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Quantity");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Value on Quantity Field");
            throw e;
        }
    }

    public void enterCouponCode(String expectedCoupon) throws Exception {
        String locator = CartPageEnum.XPATH_PROMO_CODE_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, expectedCoupon);
            scenarioDef.log(Status.PASS, "Entered Coupon " + expectedCoupon + " on Promo Code Field on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Coupon on Promo Code Field on Cart Page");
            throw e;
        }
    }

    public void clickOnAddPromoCodeButton() {
        String locator = CartPageEnum.XPATH_ADD_COUPON_BUTTON.getValue();
        String checkoutLocator = CartPageEnum.XPATH_CHECKOUT_CART_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(checkoutLocator);
            scenarioDef.log(Status.PASS, "Clicked on Add Promo Code Button on Summary Section of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add Promo Code Button on Summary Section of Cart Page");
            throw e;
        }
    }

    public void validateDiscountOptionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_DISCOUNT_LABEL.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Discount Details is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Discount Details is Not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Discount Details is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Discount Details is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateTotalAmountAfterUsingCoupon(String expectedCouponStatus) {
        String subAmountLocator = CartPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CartPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String discountLocator = CartPageEnum.XPATH_DISCOUNT_AMOUNT.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(subAmountLocator);
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().substring(1));
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().substring(1));
            if (expectedCouponStatus.equalsIgnoreCase("valid")) {
                double discountAmount = Double.parseDouble(getText(discountLocator).trim().substring(1));
                if (totalAmount == subAmount - discountAmount) {
                    scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Summary Section of Cart Page");
                } else {
                    errorMsg = "Validate Summary Total Amount $" + totalAmount + " is not Same as Expected on Summary Section of Cart Page";
                    throw new NoSuchContextException("Actual and Expected Value Differs");
                }
            } else {
                double discountAmount = 0;
                if (totalAmount == subAmount - discountAmount) {
                    scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Summary Section of Cart Page");
                } else {
                    errorMsg = "Validate Summary Total Amount $" + totalAmount + " is not Same as Expected on Summary Section of Cart Page";
                    throw new NoSuchContextException("Actual and Expected Value Differs");
                }
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Price Element on Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateErrorMsgText(String expectedErrorMsgText) {
        String locator = CartPageEnum.XPATH_INVALID_COUPON_ERROR_MESSAGE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedErrorMsgText)) {
                scenarioDef.log(Status.PASS, "Validated Error Message on Summary Section of Cart Page as Expected: " + expectedErrorMsgText);
            } else {
                errorMsg = "Could not validate Error Message on Summary Section of Cart Page as Expected: " + expectedErrorMsgText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Error Message Element on Summary Section of Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateErrorMessageVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_INVALID_LOGIN_ERROR.getValue();
        String ProductDetailslocator = CartPageEnum.XPATH_ADD_TO_CART_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeClickable(ProductDetailslocator);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is Displayed as Expected on Cart");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is not Displayed as Expected on Cart");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Account Menu is Displayed Unexpected on Cart";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Account Menu is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Error Message Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCategorySectionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CATEGORY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Category Section is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Category Section is Not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Category Section is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Category Section is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickOnCategory(String expectedCategory) {
        String locator = CartPageEnum.XPATH_INDIVIDUAL_CATEGORY_START.getValue() + expectedCategory + CartPageEnum.XPATH_INDIVIDUAL_CATEGORY_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on " + expectedCategory + " of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not on " + expectedCategory + " of Cart Page");
            throw e;
        }
    }

    public void validateDiscountedAmount() {
        String newAmountLocator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String oldAmountLocator = CartPageEnum.XPATH_PRODUCT_OLD_PRICE.getValue();
        String SavingLocator = CartPageEnum.XPATH_PRODUCT_SAVING_PRICE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(newAmountLocator);
            String newamount = getAttribute(newAmountLocator, "textContent").replaceAll("\\$", "");
            String oldamountreplace = getAttribute(oldAmountLocator, "textContent").replaceAll("\\$", "");
            oldamountreplace = oldamountreplace.replaceAll("/ea", "");
            String savingamount = getAttribute(SavingLocator, "textContent").replaceAll("Save", "");
            savingamount = savingamount.replaceAll("\\W", "");
            savingamount = savingamount.replaceAll("\\$", "");
            Float getval = Float.parseFloat(oldamountreplace) - Float.parseFloat(newamount);
            int finalVal = Math.round(getval);
            String fetchValue = savingamount;
            String expectedvalue = String.valueOf(finalVal);
            if (expectedvalue.equals(fetchValue)) {
                scenarioDef.log(Status.PASS, "Saving Price " + savingamount + " is Validated as Expected on Cart Page");
            } else {
                errorMsg = "Validate Saving Price $" + savingamount + " is not Same as Expected on Cart Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Discount Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateEmptyCartTextOnCart(String expectedValue) {
        String locator = CartPageEnum.XPATH_CART_IS_EMPTY.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator).trim();
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Cart Text is " + expectedValue + " on Cart Page");
            } else {
                errorMsg = "Could not validate Cart Text as Expected: " + expectedValue + " , Actual Value: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Text Element on Checkout");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateImageOnCart(String expectedValue) {
        String locator = CartPageEnum.XPATH_CART_EMPTY_IMAGE.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "alt");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Cart Image is " + expectedValue + " on Cart Page");
            } else {
                errorMsg = "Could not validate Cart Image is: " + expectedValue + " on Cart Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Image Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateLoginLinkVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CART_LOGIN_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Login Link is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Login Link is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Login Link is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Login Link is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateHomeLinkVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CART_HOME_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Home Link is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Home Link is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Home Link is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Home Link is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateShippingLabelVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Label is Displayed as Expected on Mini Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Label is Not Displayed as Expected on Mini Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Label is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Label is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateShippingValueVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Value is Displayed as Expected on Mini Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Value is Not Displayed as Expected on Mini Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Value is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Value is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCheckoutDisabledVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CHECKOUT_DISABLED_CART_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Checkout is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Checkout is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Checkout is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Checkout is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickOnLoginButton() {
        String locator = CartPageEnum.XPATH_CART_LOGIN_LINK.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Login Link on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Login Link on Cart Page");
            throw e;
        }
    }

    public void validateDiscountPriceVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_OLD_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Discount Amount is Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Discount Amount is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Discount Amount is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Discount Amount is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateProductSavePriceVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_SAVING_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Save Amount is Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Save Amount is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Save Amount is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Save Amount is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCartTriggered() {
        String locator = CartPageEnum.XPATH_CART_HEADING.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS, "Successfully Loaded Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Load Cart Page Successfully");
            throw e;
        }
    }

    public void validatePriceVisibility(boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Amount is Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Amount is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Amount is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Amount is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickOnHomeButton() {
        String locator = CartPageEnum.XPATH_CART_HOME_LINK.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Home Link on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Home Link on Cart Page");
            throw e;
        }
    }

    public String[] getAllEstimatedDeliveryDates() {

        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        String[] getAllEstimatedDeliveryDates;
        List<WebElement> elements;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            elements = elementFactory.getElementsList(locator);
            getAllEstimatedDeliveryDates = new String[elements.size()];
            for (int i = 0; i < elements.size(); i++) {
                getAllEstimatedDeliveryDates[i] = getText(locator).trim().replaceAll("Estimated Delivery Date: ", "");
            }
            scenarioDef.log(Status.PASS, "Fetched Estimated Delivery Dates Value: " + getAllEstimatedDeliveryDates + " from Cart");
            return getAllEstimatedDeliveryDates;
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Estimated Delivery Date Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void getAllEstimatedDeliveryDatesAndCompare(String[] getAllStandardExpectedDateValues) {

        String errorMsg = null;
        String[] getAllEstimatedDateValues;
        try {
            getAllEstimatedDateValues = getAllEstimatedDeliveryDates();
            for (int i = 0; i < getAllEstimatedDateValues.length; i++) {
                if (getAllStandardExpectedDateValues[i] != getAllEstimatedDateValues[i]) {
                    scenarioDef.log(Status.PASS, "Validated Expected Estimated Delivery Date" + getAllStandardExpectedDateValues + " and Actual Estimated Delivery Date " + getAllEstimatedDateValues + " are Displayed as Expected on Cart Page");
                }
                if (getAllStandardExpectedDateValues[i] == getAllEstimatedDateValues[i]) {
                    scenarioDef.log(Status.FAIL, "Validated Expected Estimated Delivery Date" + getAllStandardExpectedDateValues + " and Actual Estimated Delivery Date " + getAllEstimatedDateValues + " is not Displayed as Expected on Cart Page");
                }
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to Compare Expected Estimated Delivery Dates with Actual Estimated Delivery Dates on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validatePredictItemDescription(String expectedPredictInspectorMenuItem, String expectedPredictInspectorMenuItemDescription) {
        String locator = CartPageEnum.XPATH_PREDICT_INSPECTOR_ITEM_DESCRIPTION_START.getValue() + expectedPredictInspectorMenuItem + CartPageEnum.XPATH_PREDICT_INSPECTOR_ITEM_DESCRIPTION_END.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator).trim();
            if (actualValue.contains(expectedPredictInspectorMenuItemDescription)) {
                scenarioDef.log(Status.PASS, "Validated Predict Inspector Item Description Text is " + expectedPredictInspectorMenuItemDescription + " on Cart Page");
            } else {
                errorMsg = "Could not validate Predict Inspector Item Description Text is: " + expectedPredictInspectorMenuItemDescription + " on Cart Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Predict Inspector Item Description Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }

    }

    public void validatePredictInspectorSectionVisibility(boolean expectedVisibility) {

        String locator = CartPageEnum.XPATH_PREDICT_INSPECTOR_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Predict Inspector Section Displayed on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Predict Inspector Section is not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Predict Inspector Section is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Predict Inspector Section is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDateColor(String expectedDateColor) {
        String dateLocator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(dateLocator);
            String actualValue = getCSS(dateLocator, "color");
            String hex = Color.fromString(actualValue).asHex();
            if (hex.contains(expectedDateColor)) {
                scenarioDef.log(Status.PASS, "Validated Date Color is " + expectedDateColor + " on Cart");
            } else {
                errorMsg = "Could not validate Date Color is: " + expectedDateColor + " on Cart, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Date Color Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateSocialButtonColor(String expectedButtonColor) {
        String buttonLocator = CartPageEnum.XPATH_SOCIAL_MEDIA_BUTTON.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(buttonLocator);
            String actualValue = getCSS(buttonLocator, "color");
            String hex = Color.fromString(actualValue).asHex();
            if (hex.contains(expectedButtonColor)) {
                scenarioDef.log(Status.PASS, "Validated Button Color is " + expectedButtonColor + " on Cart");
            } else {
                errorMsg = "Could not validate Button Color is: " + expectedButtonColor + " on Cart, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Button Color on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void hoverOnSocialMediaButton() {

        String buttonLocator = CartPageEnum.XPATH_SOCIAL_MEDIA_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(buttonLocator);
            hover(buttonLocator);
            scenarioDef.log(Status.PASS, "Hovered on Social Button on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Hovered on Social Button on Cart Page");
        }
    }

    public String dateAfterCutOffRule(String currentDate, int currentTime, int noOfDaysToExtend,int cutOffTime) throws ParseException {
        String dateAfterCutoffRule;
        if(currentTime>cutOffTime){
            dateAfterCutoffRule=addDate(currentDate,noOfDaysToExtend);
        }else {
            dateAfterCutoffRule=addDate(currentDate,noOfDaysToExtend-1);
        }
        return dateAfterCutoffRule;
    }

    public String dateAfterHolidayRule(String startDate,String endDate,String holidays) throws ParseException {
        String splitter[];
        String tempDate;
        int counter=1;
        while (counter!=0){
            counter=0;
            while(!startDate.equals(addDate(endDate,1))){
                splitter=startDate.split("/");
                tempDate=splitter[0]+"/"+splitter[1];
                if(holidays.contains(tempDate)){
                    counter++;
                    startDate=addDate(startDate,1);
                }else{
                    startDate=addDate(startDate,1);
                }
            }
            endDate=addDate(endDate,counter);
        }
        return endDate;
    }

    public String dateAfterWeekendRule(String startDate,String endDate,int currentDay) throws ParseException {
        int noOfDays=0;
        if (currentDay==1){
            noOfDays++;
        }
        while(!startDate.equals(addDate(endDate,1))){
            startDate=addDate(startDate,1);
            currentDay++;
        }
        currentDay--;
        if(currentDay>6){
            noOfDays+=2;
        }
        return addDate(endDate,noOfDays);
    }

    public String addDate(String currentDate,int noOfDays) throws ParseException {
        String newDateAfterAddition;
        Date oldDate=new SimpleDateFormat("M/dd/yyyy").parse(currentDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(oldDate);
        cal.add(Calendar.DAY_OF_MONTH, noOfDays);
        DateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy");
        newDateAfterAddition = dateFormat.format(cal.getTime());
        return newDateAfterAddition;
    }

    public String calculateEstimateDeliveryDate(int expectedDays,int cutOffTime,String holidays) throws ParseException {
        String expectedDeliveryDate=null;
        String startDate= getCurrentDate();
        int currentDay= getCurrentDay(startDate);
        int currentTime=getCurrentTime();

        String dateAfterCutOffRule=dateAfterCutOffRule(startDate,currentTime,expectedDays,cutOffTime);
        String dateAfterHoliday=dateAfterHolidayRule(startDate,dateAfterCutOffRule,holidays);
        String dateAfterWeekend=dateAfterWeekendRule(startDate,dateAfterHoliday,currentDay);
        String dateAfterHolidays1=dateAfterHolidayRule(dateAfterHoliday,dateAfterWeekend,holidays);
        expectedDeliveryDate=dateAfterWeekendRule(dateAfterWeekend,dateAfterHolidays1,getCurrentDay(dateAfterWeekend));
        return expectedDeliveryDate;
    }

    public void validatEstimatedDeliveryDate(int expectedDays,int cutofftime,String holiday) throws ParseException {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            String expectedDelieveryDate = calculateEstimateDeliveryDate(expectedDays,cutofftime,holiday);
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (actualValue.contains(expectedDelieveryDate)) {
                scenarioDef.log(Status.PASS,  "Validated Expected Estimated Delivery Date: " + expectedDelieveryDate + " as Expected ");
            } else {
                errorMsg = "Could not validate Expected Estimated Delivery Date: " + expectedDelieveryDate + ", Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Estimated Delivery Date Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public String getShippingMethod() {
        String shippingname, shipping;
        String locator = CartPageEnum.XPATH_SHIPPING_LABEL.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            shipping = getText(locator);
            shippingname = shipping.replaceAll("Change", "");
            scenarioDef.log(Status.PASS, "Fetched Shipping Value: " + shippingname + " from Cart Page");
            return shippingname;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Shipping Value from Cart Page");
            throw e;
        }
    }

    public void validateGiftItemPopWindowVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_GIFT_ITEM_POP_UP_WINDOW.getValue();
        String checkoutbutton = CartPageEnum.XPATH_CHECKOUT_DISABLED_CART_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(checkoutbutton);
            customWait(3000);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Gift Items Popup Window is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Gift Items Popup Window is Not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Gift Items Popup Window is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Gift Items Popup Window is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickOnCloseIconOnGiftItemPopupWindow() {
        String locator = CartPageEnum.XPATH_GIFT_ITEM_POP_UP_WINDOW_CLOSE_ICON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Close Icon of Gift Item Popup Window of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Close Icon of Gift Item Popup Window Cart Page");
            throw e;
        }
    }

    public void clickOnFreeGiftLink() {
        String locator = CartPageEnum.XPATH_FREE_GIFT_LINK.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Free Gift Link on Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Free Gift Link on Cart Page");
            throw e;
        }
    }

    public void selectItem(String expectedItem) {
        String locator = CartPageEnum.XPATH_FIRST_AVAILABLE_ITEM_START.getValue() + expectedItem +CartPageEnum.XPATH_FIRST_AVAILABLE_ITEM_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Select "+expectedItem+" Item from Free Gift Popup Window");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select "+expectedItem+" Item from Free Gift Popup Window");
            throw e;
        }
    }

    public void clickOnAddToCart() {
        String locator = CartPageEnum.XPATH_GIFT_ITEM_POP_UP_WINDOW_ADD_TO_CART.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add to Cart Button of Gift Items Popup Window of Cart Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add to Cart Button of Gift Items Popup Window of Cart Page");
            throw e;
        }
    }

    public void validateFreeGiftLinkVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_FREE_GIFT_LINK.getValue();
        String giftPopupWindow = CartPageEnum.XPATH_GIFT_ITEM_POP_UP_WINDOW.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(giftPopupWindow);
            customWait(3000);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Free Gift Link Item is Displayed as Expected on Cart Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Free Gift Link Item is Not Displayed as Expected on Cart Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Free Gift Link Item is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Free Gift Link Item is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateItemHaveFreeTag(String expectedItem){
        String locator = CartPageEnum.XPATH_GIFT_ITEM_FREE_TAG_START.getValue() + expectedItem +CartPageEnum.XPATH_GIFT_ITEM_FREE_TAG_END.getValue()  ;
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.equalsIgnoreCase("Free")) {
                scenarioDef.log(Status.PASS, "Validated Free Tag is Present as Expected for Free Item: " + expectedItem);
            } else {
                errorMsg = "Could not Validated Free Tag is not Present as Expected for Free Item: " + expectedItem;
                throw new NoSuchContextException("Free Tag is not Present");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Item Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }
}