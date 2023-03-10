package PageObjectFactory;

import EnumFactory.CheckoutPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import java.util.List;

public class CheckoutPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

    public CheckoutPageFactory() throws Exception {
    }

    public void enterEmailAddress(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Email Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Email Field on Checkout Page");
            throw e;
        }
    }

    public void enterFirstName(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_FIRST_NAME_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on First Name Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on First Name Field on Checkout Page");
            throw e;
        }
    }

    public void enterLastName(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_LAST_NAME_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Last Name Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Last Name Field on Checkout Page");
            throw e;
        }
    }

    public void enterAddress(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Address Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Address Field on Checkout Page");
            throw e;
        }
    }

    public void enterCity(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CITY_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on City Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on City Field on Checkout Page");
            throw e;
        }
    }

    public void enterZipCode(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on ZipCode Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on ZipCode Field on Checkout Page");
            throw e;
        }
    }

    public void enterPhNo(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_PH_NO_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Phone Number Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Phone Number Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardNumber(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_NUMBER_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_NO_IFRAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Credit Card Number Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Credit Card Number Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardExpiryDate(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXPIRY_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXP_IFRAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Credit Card Expiry Date Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Credit Card Expiry Date Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardCVV(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Credit Card CVV Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Credit Card CVV Field on Checkout Page");
            throw e;
        }
    }

    public void clickSaveAndContinueButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_SAVE_AND_CONTINUE_BUTTON.getValue();
        String loader = CheckoutPageEnum.XPATH_SHIPPING_LOADER.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeVisible(loader);
            scenarioDef.log(Status.PASS, "Clicked on Save and Continue Button on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not click on Save and Continue Button on Checkout Page");
            throw e;
        }
    }

    public void clickPlaceOrderButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_PLACE_ORDER_BUTTON.getValue();
        String loader = CheckoutPageEnum.XPATH_CARD_LOGOS.getValue();
        try {
            waitFactory.waitForElementToBeClickable(loader);
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Place Order Button Button on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not click on Place Order Button on Checkout Page");
            throw e;
        }
    }

    public void selectState(String stateToSelect) throws Exception {
        String locator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_FIELD.getValue();
        String optionLocator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_OPTION_START.getValue() + stateToSelect +
                CheckoutPageEnum.XPATH_STATE_DROPDOWN_OPTION_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(optionLocator);
            click(optionLocator);
            scenarioDef.log(Status.PASS, "Selected State: " + stateToSelect + " on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select State on Checkout Page");
            throw e;
        }
    }

    public String getTaxValue() {
        String locator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String taxvalue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            taxvalue = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Tax Value: " + taxvalue + " from Checkout");
            return taxvalue;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Tax Value from Checkout");
            throw e;
        }
    }

    public String getShippingUserName() {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_ADDRESS_USER.getValue();
        String shippinguser;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            shippinguser = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Shipping User: " + shippinguser + " from Checkout");
            return shippinguser;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Shipping User from Checkout");
            throw e;
        }
    }

    public void validateTaxValue(String expectedText) {
        String locator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Tax on Checkout as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Tax on Checkout as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Tax Element on Checkout");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateDateColor(String expectedDateColor) {
        String dateLocator = CheckoutPageEnum.XPATH_ESTIMATED_DELIVERY_DATE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(dateLocator);
            String actualValue = getCSS(dateLocator, "color");
            String hex = Color.fromString(actualValue).asHex();
            if (hex.contains(expectedDateColor)) {
                scenarioDef.log(Status.PASS, "Validated Date Color is " + expectedDateColor + " on Checkout");
            } else {
                errorMsg = "Could not validate Date Color is: " + expectedDateColor + " on Checkout, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Date Color Checkout");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnShippingMethod(String expecetedShippingMethodName) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_START.getValue() + expecetedShippingMethodName + CheckoutPageEnum.XPATH_SHIPPING_METHOD_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on " + expecetedShippingMethodName + " Method on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click " + expecetedShippingMethodName + " Method on Checkout Page");
            throw e;
        }
    }

    public void validateEmailAddressIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Email Address is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate Email Address is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Email Address Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateFirstNameIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_FIRST_NAME_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated First Name is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate First Name is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the First Name Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateLastNameIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_LAST_NAME_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Last Name is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate Last Name is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Last Name Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateAddressIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Address is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate Address is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Address Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCityIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_CITY_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated City is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate City is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the City Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateStateIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated State is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate State is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the State Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateZipCodeIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Zip Code is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate Zip Code is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Zip Code Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validatePhoneNoIsRetained(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_PH_NO_FIELD.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "value").replace("-", "");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Phone No is " + expectedValue + " on Checkout Page");
            } else {
                errorMsg = "Could not validate Phone No is: " + expectedValue + " on Checkout Page, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Phone No Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethodValue(String expecetedShippingMethodName, Boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_SELECTED_START.getValue() + expecetedShippingMethodName + CheckoutPageEnum.XPATH_SHIPPING_METHOD_SELECTED_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expecetedShippingMethodName + " Shipping Method is Selected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expecetedShippingMethodName + "Shipping Method is not Selected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expecetedShippingMethodName + " Shipping Method is Selected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated  Shipping Method " + expecetedShippingMethodName + "is Selected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Method Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethod(String expectedText) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_SELECTED_OPTION.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.equalsIgnoreCase(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Shipping Method on Checkout as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Shipping Method on Checkout as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethodonSummary(String expectedText) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_LABEL.getValue();
        String errorMsg = null;
        String actualText;
        try {
            customWait(4000);
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.equalsIgnoreCase(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Shipping Method on Summary Section as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Shipping Method on Summary Section as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Element on Summary Section on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingValueonSummary(String expectedText) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_VALUE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            customWait(4000);
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.equalsIgnoreCase(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Shipping Value on Summary Section as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Shipping Value on Summary Section as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Element on Summary Section on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnShippingDetailTitle() throws Exception {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_TITLE.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Shipping Detail Title on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not click on Shipping Detail Title on Checkout Page");
            throw e;
        }
    }

    public void validateShippingSectionState(String expectedState) {
        String loader = CheckoutPageEnum.XPATH_SHIPPING_LOADER.getValue();
        String locator = null;
        try {
            if (expectedState.contains("edit")) {
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_EDIT_STATE.getValue();
            } else if (expectedState.contains("open")) {
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_OPEN_STATE.getValue();
            } else if (expectedState.contains("close")) {
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_CLOSED_STATE.getValue();
            }
            waitFactory.waitForElementToBeInVisible(loader);
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS, "Validated Shipping Section is in " + expectedState + " State on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate  Shipping Section is " + expectedState + " State on Checkout Page");
            throw e;
        }
    }

    public void validatePaymentMethodState(String expectedState) {
        String locator = CheckoutPageEnum.XPATH_PAYMENT_METHOD_FORM.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedState.equals("active")) {
                scenarioDef.log(Status.PASS, "Validated Shipping Payment Method Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedState.equals("inactive")) {
                scenarioDef.log(Status.PASS, "Validated Shipping Payment Method Section is Not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedState.equals("inactive")) {
                errorMsg = "Validated Shipping Payment Method Section is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedState.equals("active")) {
                errorMsg = "Validated Payment Method Section is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateShippingMethodNameOnSummarySection(String expectedShippingMethodName) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_LABEL.getValue();
        String wait = CheckoutPageEnum.XPATH_SAVE_AND_CONTINUE_BUTTON.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeVisible(locator);
            waitFactory.waitForElementToBeClickable(wait);
            String shippingMethod = getText(locator);
            if (shippingMethod.contains(expectedShippingMethodName)) {
                scenarioDef.log(Status.PASS, " Validated Shipping Method " + expectedShippingMethodName + " Same as Expected on Summary Section of Checkout Page");
            } else {
                errorMsg = "Could not Validate Shipping Method " + expectedShippingMethodName + " Not Same as Expected on Summary Section of Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Method Element Summary Section of  Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCheckoutPageTriggered() {
        String locator = CheckoutPageEnum.XPATH_CHECKOUT_HEADING.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            customWait(2000);
            scenarioDef.log(Status.PASS, "Successfully Loaded Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Load Checkout Page Successfully");
            throw e;
        }
    }

    public void clearEmailField() throws Exception {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            scenarioDef.log(Status.PASS, "Email Field is Clear on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Clear Email Field on Checkout Page");
            throw e;
        }
    }

    public void clearZipCodeField() throws Exception {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            scenarioDef.log(Status.PASS, "Zip Code Field is Clear on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Clear Zip Code Field on Checkout Page");
            throw e;
        }
    }

    public void validateAddNewAddressOption(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_ADD_NEW_ADDRESS.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Add New Address Option is Display as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "ValidatedAdd New Address Option is not Display as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Add New Address Option is Display on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Add New Address Option is not Display on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Add New Address Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateFirstAndLastNameInShippingDetailSection(String expectedFirstAndLastName) {
        String locator = CheckoutPageEnum.XPATH_FIRST_AND_LAST_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedFirstAndLastName)) {
                scenarioDef.log(Status.PASS, "Validated First and Last Name as Expected: " + expectedFirstAndLastName);
            } else {
                errorMsg = "Could not validate First and Last Name as Expected: " + expectedFirstAndLastName + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the First and Last Name Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateAddressInShippingDetailSection(String address) {
        String locator = CheckoutPageEnum.XPATH_ADDRESS.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(address)) {
                scenarioDef.log(Status.PASS, "Validated Address as Expected: " + address);
            } else {
                errorMsg = "Could not Validate Address as Expected: " + address + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Address Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateStateCityZipCode(String expectedStateCityZipCode) {
        String locator = CheckoutPageEnum.XPATH_CITY_STATE_ZIPCODE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedStateCityZipCode)) {
                scenarioDef.log(Status.PASS, "Validated State City Zip Code as Expected: " + expectedStateCityZipCode);
            } else {
                errorMsg = "Could not Validate State City Code as Expected: " + expectedStateCityZipCode + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the State City Code Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validatePhoneNoInDetailSection(String expectedPhoneNo) {
        String locator = CheckoutPageEnum.XPATH_PHONE_NO.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim().replace("-", "");
            if (actualText.contains(expectedPhoneNo)) {
                scenarioDef.log(Status.PASS, "Validated Phone No as Expected: " + expectedPhoneNo);
            } else {
                errorMsg = "Could not Validate Phone No on as Expected: " + expectedPhoneNo + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Phone No Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateEmailAddressInDetailSection(String expectedEmail) {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedEmail)) {
                scenarioDef.log(Status.PASS, "Validated Email Address as Expected: " + expectedEmail);
            } else {
                errorMsg = "Could not Validate Email Address as Expected: " + expectedEmail + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Email Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateHeaderVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_HEADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Header is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Header is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Header is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Header is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateHeaderLogoVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_HEADER_LOGO.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Logo is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Logo is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Logo is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Logo is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateHeaderIconVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_HEADER_ICON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Help Icon is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Help Icon is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Help Icon is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Help Icon is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDefaultAddressVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_DEFAULT_SHIPPING_ADDRESS.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Default Address is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Default Address is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Default Address is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Default Address is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }


    public String[] validateShippingAddressQuantityVisibility() {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAILS.getValue();
        String errorMsg = null;
        String[] getAllShippingAddress;
        List<WebElement> elements;

        try {
            elements = elementFactory.getElementsList(locator);
            waitFactory.waitForElementToBeVisible(locator);
            getAllShippingAddress = new String[elements.size()];
            if (getAllShippingAddress.length >= 1) {
                scenarioDef.log(Status.PASS, "Validated " + getAllShippingAddress + " Shipping Details are Displayed as Expected on Checkout Page");
            } else {
                errorMsg = "Validated " + getAllShippingAddress + " Shipping Details are not Displayed as Expected on Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
            return getAllShippingAddress;
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Expected Shipping Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnEmailAddressField() {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Email Address Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Email Address Field on Checkout Page");
            throw e;
        }
    }

    public void clickChangeAddressButton() {
        String locator = CheckoutPageEnum.XPATH_CHANGE_SHIPPING_ADDRESS.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Change Shipping Method on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Change Shipping Method on Checkout Page");
            throw e;
        }
    }

    public void selectSavedAddress() {
        String locator = CheckoutPageEnum.XPATH_SAVED_FIRST_SHIPPING_ADDRESS.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Selected First Saved Address on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select First Saved Address on Checkout Page");
            throw e;
        }
    }

    public void clickOnFirstNameField() {
        String locator = CheckoutPageEnum.XPATH_FIRST_NAME_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on First Name Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on First Name Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnLastNameField() {
        String locator = CheckoutPageEnum.XPATH_LAST_NAME_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Last Name Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Last Name Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnAddressField() {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Address Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Address Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnCityField() {
        String locator = CheckoutPageEnum.XPATH_CITY_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on City Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on City Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnStateField() {
        String locator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on State Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on State Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnZipCodeField() {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Zip Code Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Zip Code Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnPhoneNoField() {
        String locator = CheckoutPageEnum.XPATH_PH_NO_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Phone No Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Phone No Field on Checkout Page");
            throw e;
        }
    }

    public void validateRequiredErrorMessageText(String expectedField, String expectedErrorMsgText) {
        String locator = CheckoutPageEnum.XPATH_REQ_FIELD_MESSAGE_START.getValue() + expectedField + CheckoutPageEnum.XPATH_REQ_FIELD_MESSAGE_END.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedErrorMsgText)) {
                scenarioDef.log(Status.PASS, "Validated Error Message on " + expectedField + " Field of Checkout Page as Expected: " + expectedErrorMsgText);
            } else {
                errorMsg = "Could not validate Error Message on " + expectedField + " Field of Checkout Page as Expected: " + expectedErrorMsgText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Error Message Element on " + expectedField + " Field of Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void enterCouponCode(String expectedCoupon) throws Exception {
        String locator = CheckoutPageEnum.XPATH_PROMO_CODE_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, expectedCoupon);
            scenarioDef.log(Status.PASS, "Entered Coupon " + expectedCoupon + " on Promo Code Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Coupon on Promo Code Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnEditButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_EDIT_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Edit Button Text on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Edit Button Text on Checkout Page");
            throw e;
        }
    }

    public void validateInactiveShippingDetailsSection() {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_TITLE_INACTIVE.getValue();
        try {
            waitFactory.waitForElementToBeVisible(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Successfully Loaded Shipping Section on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Load Shipping Section on Checkout Page");
            throw e;
        }
    }

    public void clickOnAddPromoCodeButton() {
        String locator = CheckoutPageEnum.XPATH_ADD_COUPON_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add Promo Code Button on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add Promo Code Button on Checkout Page");
            throw e;
        }
    }

    public void clickOnRemovePromoCodeButton() {
        String locator = CheckoutPageEnum.XPATH_REMOVE_COUPON_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Remove Promo Code Button on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Remove Promo Code Button on Checkout Page");
            throw e;
        }
    }

    public void validateErrorMsgText(String expectedErrorMsgText) {
        String locator = CheckoutPageEnum.XPATH_INVALID_COUPON_MESSAGE.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedErrorMsgText)) {
                scenarioDef.log(Status.PASS, "Validated Error Message on Checkout Page as Expected: " + expectedErrorMsgText);
            } else {
                errorMsg = "Could not validate Error Message on Checkout Page as Expected: " + expectedErrorMsgText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Error Message Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clearPromoCode() throws Exception {
        String locator = CheckoutPageEnum.XPATH_PROMO_CODE_FIELD.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            scenarioDef.log(Status.PASS, "Cleared Add Promo Code Field on Checkout Page ");
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to clear Add Promo Code Field on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingAddressName(String expectedText) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_ADDRESS_USERNAME.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Shipping User on Checkout as Expected: " + expectedText);
            } else {
                errorMsg = "Could not validate Shipping User on Checkout as Expected: " + expectedText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping User Element on Checkout");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateTotalAmountAfterUsingBlankCoupon() {
        String subAmountLocator = CheckoutPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CheckoutPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String taxAmountLocator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(totalAmountLocator);
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().replace("$", ""));
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().replace("$", ""));
            double taxAmount = Double.parseDouble(getText(taxAmountLocator).trim().replace("$", ""));
            if (totalAmount == subAmount + taxAmount) {
                scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Checkout Page");
            } else {
                errorMsg = "Validate Total Amount $" + totalAmount + " is not Same as Expected on Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Price Element on Summary Section of Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateDiscountedAmount() {
        String subAmountLocator = CheckoutPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CheckoutPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String taxAmountLocator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String discountAmountLocator = CheckoutPageEnum.XPATH_DISCOUNT_AMOUNT.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(discountAmountLocator);
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().replace("$", ""));
            double taxAmount = Double.parseDouble(getText(taxAmountLocator).trim().replace("$", ""));
            double discAmount = Double.parseDouble(getText(discountAmountLocator).trim().replace("-$", ""));
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().replace("$", ""));
            double actualValue = subAmount + taxAmount;
            double checkDisc = actualValue - totalAmount;
            String discValue = String.format("%.2f", checkDisc);
            String promoCode = String.format("%.2f", discAmount);
            if (discValue.equals(promoCode)) {
                scenarioDef.log(Status.PASS, "Discount Price $" + discValue + " is Validated as Expected on Checkout Page");
            } else {
                errorMsg = "Validate Discount Price $" + discValue + " is not Same on Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Discount Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clickOnPaymentMethod(String expectedPaymentOption) {
        String locator = CheckoutPageEnum.XPATH_START_PAYMENT_METHOD.getValue() + expectedPaymentOption + CheckoutPageEnum.XPATH_END_PAYMENT_METHOD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on " + expectedPaymentOption + " Payment Method on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click " + expectedPaymentOption + " Payment Method on Checkout Page");
            throw e;
        }
    }

    public void validateTotalAmountAfterRemovingPromoCode() {
        String subAmountLocator = CheckoutPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CheckoutPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String taxAmountLocator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(totalAmountLocator);
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().replace("$", ""));
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().replace("$", ""));
            double taxAmount = Double.parseDouble(getText(taxAmountLocator).trim().replace("$", ""));
            if (totalAmount == subAmount + taxAmount) {
                scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Checkout Page");
            } else {
                errorMsg = "Validate Total Amount $" + totalAmount + " is not Same as Expected on Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Price Element on Summary Section of Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateOnlyOnePaymentSelected() {
        String locator = CheckoutPageEnum.XPATH_SELECTED_PAYMENT_METHOD.getValue();
        String errorMsg = null;
        List<WebElement> elements;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            elements = elementFactory.getElementsList(locator);
            if (elements.size() == 1) {
                scenarioDef.log(Status.PASS, "Validate Only One Payment Method is Selected on Checkout Page");
            } else {
                errorMsg = "Validate More Than One Payment Method is Selected on Checkout Page";
                throw new NoSuchContextException("More Than One Payment Method Selected");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Payment Method Element on Summary Section of Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCreditCardSectionVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_SECTION.getValue();
        String loader = CheckoutPageEnum.XPATH_SHIPPING_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Credit Card Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Credit Card Section is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Credit Card Section is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Credit Card Section is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatesSubtotalPriceVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SUBTOTAL_TEXT.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Subtotal is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Subtotal is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Subtotal is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Subtotal is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatesTaxValueVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Tax Value is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Tax Value is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Tax Value is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Tax Value is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatesTotalAmountValueVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_TOTAL_COST_VALUE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Total Cost Value is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Total Cost Value is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Total Cost Value is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Total Cost Value is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateProductImageVisibility(Boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_IMAGE.getValue();
        String loader = CheckoutPageEnum.XPATH_PRODUCT_IMAGE_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Image Visibility is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Image Visibility is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Image Visibility is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Image Visibility is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }

    }

    public void validateProductSizeVisibility(Boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Size is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Size is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Size is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Size is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateProductColorVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_COLOR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Color is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Color is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Color is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Color is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateEstimatedDeliveryDateVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_ESTIMATED_DELIVERY_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Estimated Delivery is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Estimated Delivery is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Estimated Delivery is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Estimated Delivery is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateProductQuantityVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Quantity is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Quantity is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Quantity is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Quantity is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void ValidatesProductsNameVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Name is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Name is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Name is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Name is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void ValidatesBrandNameVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_BRAND_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Brand Name is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Product Brand Name is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Product Brand Name is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Product Brand Name is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void ValidatesActualAmountVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_ACTUAL_AMOUNT.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Actual Amount is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Actual Amount is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Actual Amount is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Actual Amount is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void ValidatesOriginalAmountVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_ORIGINAL_AMOUNT.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Original Amount is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Original Amount is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Original Amount is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Original Amount is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void ValidatesSaveAmountVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PRODUCT_SAVE_AMOUNT.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Save Amount is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Save Amount is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Save Amount is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Save Amount is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePaymentErrorMessageVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PAYMENT_ERROR_MESSAGE.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Payment Method Error is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Payment Method Error is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Payment Method Error is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Payment Method Error is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePaymentMethodFormErrorMsg(String expectedText, String errorField) {
        String locator = CheckoutPageEnum.XPATH_PAYMENT_FORM_ERROR_MSG_START.getValue() + errorField + CheckoutPageEnum.XPATH_PAYMENT_FORM_ERROR_MSG_END.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)) {
                scenarioDef.log(Status.PASS, "Validated Payment Form Error Message as Expected: " + expectedText + " on field: " + errorField);
            } else {
                errorMsg = "Could not validate Payment Form Error Message as Expected: " + expectedText + " on field: " + errorField + " Actual was: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Payment Form Error Message on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public String getShippingMethod() {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_SELECTED_OPTION.getValue();
        String shippingmethod = null;
        try {
            shippingmethod = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Shipping Method: " + shippingmethod + " from Checkout");
            return shippingmethod;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Shipping Method from Checkout");
            throw e;
        }
    }

    public String getShippingValue() {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_VALUE_SELECTED_OPTION.getValue();
        String shippingvalue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            shippingvalue = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Shipping Value: " + shippingvalue + " from Checkout");
            return shippingvalue;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Shipping Value from Checkout");
            throw e;
        }
    }

    public void validatePayPalSectionVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_PAYPAL_SECTION.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated PayPal Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated PayPal Section is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated PayPal Section is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated PayPal Section is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickPayWithPayPalButton() throws Exception {

        String iframeLocator = CheckoutPageEnum.XPATH_PAYPAL_PAYMENT_IFRAME.getValue();
        String locator = CheckoutPageEnum.XPATH_PAY_WITH_PAYPAL_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeVisible(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            jsClick(locator);
            customWait(2000);
            scenarioDef.log(Status.PASS, "Clicked on Pay with PayPal Button on Checkout Page");

        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Pay with PayPal Button on Checkout Page");
            throw e;
        }
    }

    public void validateEnteredPhoneNo(String expectedPhoneNo) {
        String locator = CheckoutPageEnum.XPATH_PH_NO_FIELD.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getAttribute(locator, "value").trim().replace("-", "");
            if (actualText != expectedPhoneNo) {
                scenarioDef.log(Status.PASS, "Validated Phone No as Expected: " + expectedPhoneNo);
            } else {
                errorMsg = "Could not Validate Phone No on as Expected: " + expectedPhoneNo + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Phone No Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateOrderTrackingCheckBoxVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_ORDER_TRACKING_CHECKBOX.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Order Tracking Email Checkbox is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Order Tracking Email Checkbox is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Order Tracking Email Checkbox is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Order Tracking Email Checkbox is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickAddNewAddressButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_ADD_NEW_ADDRESS.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add new Address Button on Checkout Page");

        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add new Address Button on Checkout Page");
            throw e;
        }
    }

    public void validateShippingDetailFormVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_EDIT_STATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Detail Form is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Detail Form  is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Detail Form  is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Detail Form  is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateShippingDetailAddressListVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_ADDRESS_LIST.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Detail Address List is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Detail Address List is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Detail Address List is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Detail Address List is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void selectFromAddressBookButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_SELECT_FROM_ADDRESS_BOOK.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Select From Address Book Button on Checkout Page");

        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Select From Address Book Button on Checkout Page");
            throw e;
        }
    }

    public void validateOrderTrackingEmailCheckedOrUnchecked(String expectedValue) {
        String locator = CheckoutPageEnum.XPATH_ORDER_TRACKING_CHECKBOX.getValue();
        String errorMsg = null;
        String actualValue;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator, "type");
            if (actualValue.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Order Tracking Email Checkbox Can be Checked or Unchecked");
            } else {
                errorMsg = "Could not Validated Order Tracking Email Checkbox Can be Checked or Unchecked";
                throw new NoSuchContextException("Actual and Expected Type Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Order Tracking Email Checkbox Element on Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateSignUpCheckBoxAndByDefaultVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SIGN_UP_CHECKBOX.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Sign Up Checkbox is Displayed and Checked by Default as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "ValidatedSign Up Checkbox is not Displayed and not Checked by Default as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Sign Up Checkbox is not Displayed and not Checked by Default Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Sign Up Checkbox is Displayed and Checked by Default Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateDefaultShippingMethod(String expectedDefault) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_SELECTED_OPTION.getValue();
        String errorMsg = null;
        String actual;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actual = getAttribute(locator, "textContent");
            if (expectedDefault.equalsIgnoreCase(actual)) {
                scenarioDef.log(Status.PASS, "Validated Expected Default Shipping Method as : " + expectedDefault);
            } else {
                errorMsg = "Could not Validate Expected Default Shipping Method as: " + expectedDefault + " Actual was: " + actual;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }

        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Could not Validate Expected Default Shipping Method on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateActiveShippingMethodSectionVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Method Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Method Section is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Method Section is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Method Section is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateStoredCardSectionVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_STORED_CARD_SELECTED_SECTION.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String locatorBtn = CheckoutPageEnum.XPATH_PLACE_ORDER_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            waitFactory.waitForElementToBeVisible(locatorBtn);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Stored Card Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Stored Card Section is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Stored Card Section is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Stored Card Section is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCardExpiryVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXPIRY_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Expiry Date is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Expiry Date is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Expiry Date is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Expiry Date is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickSetAsDefaultField() {
        String locator = CheckoutPageEnum.XPATH_SET_AS_DEFAULT_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Set As Default Address on Checkout Page");

        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Set As Default Address on Checkout Page");
            throw e;
        }
    }

    public void validateSetAsDefaultFieldVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SET_AS_DEFAULT_FIELD.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Set As Default Field is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Header is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Set As Default Field is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Header is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCardLogoVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_LOGO.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Logo is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Logo is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Logo is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Logo is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCardLastDigitsVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_LAST_DIGITS.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Last Digits are Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Last Digits are not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Last Digits are not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Last Digits are Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCreditCard(String expectedCreditCardNo) {

        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_NO.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (expectedCreditCardNo.contains(actualText)) {
                scenarioDef.log(Status.PASS, "Validated By Default Credit Card as Expected: " + expectedCreditCardNo);
            } else {
                errorMsg = "Could not Validate By Default Credit Card as Expected: " + expectedCreditCardNo + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Credit Card Element on Mini Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateCreditCardFieldEmpty() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_EMPTY_FIELD.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_NO_IFRAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            switchToIframe(iframeLocator);
            actualVisibility = isVisible(locator);
            switchToDefaultContent();
            if (actualVisibility) {
                scenarioDef.log(Status.PASS, "Validated Credit Card Number Field is Empty");
            } else {
                errorMsg = "Validated Credit Card Number Field is not Empty";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateExpiryDateFieldEmpty() throws Exception {
        String locator = CheckoutPageEnum.XPATH_EXPIRY_DATE_EMPTY_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXP_IFRAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            switchToIframe(iframeLocator);
            actualVisibility = isVisible(locator);
            switchToDefaultContent();
            if (actualVisibility) {
                scenarioDef.log(Status.PASS, "Validated Credit Card Expiry Date Field is Empty");
            } else {
                errorMsg = "Validated Credit Card Expiry Date Field is not Empty";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCVVNumberFieldEmpty() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CVV_NUMBER_EMPTY_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            switchToIframe(iframeLocator);
            actualVisibility = isVisible(locator);
            switchToDefaultContent();
            if (actualVisibility) {
                scenarioDef.log(Status.PASS, "Validated Credit Card CVV Number Field is Empty");
            } else {
                errorMsg = "Validated Credit Card CVV Number Field is not Empty";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clearCreditCardExpiryDate() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXPIRY_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXP_IFRAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Cleared Text from Credit Card Expiry Date Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not clear Text from Credit Card Expiry Date Field on Checkout Page");
            throw e;
        }
    }

    public void clickOnUseShippingAddressForBillingCheckBox() {
        String locator = CheckoutPageEnum.XPATH_USE_SHIPPING_ADDRESS_CHECK_BOX.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Use Shipping Address Checkbox on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not click on Use Shipping Address Checkbox on Checkout Page");
            throw e;
        }
    }

    public void validateShippingAddressVisibilityOnDropdown(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_ADDRESSES_DROPDOWN_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Addresses is Displayed on Dropdown as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Addresses is not Displayed on Dropdown as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Shipping Addresses is Displayed on Dropdown Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Shipping Addresses is not Displayed on Dropdown Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateNewAddressFormSectionVisibility(boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_BILLING_ADDRESS_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated New Address Section is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated New Address Section is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated New Address Section is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated New Address Section is not Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateRequiredErrorMessageTextOnBillingSection(String expectedField, String expectedErrorMsgText) {
        String locator;
        if (expectedField.equalsIgnoreCase("region")) {
            locator = CheckoutPageEnum.XPATH_REQ_ERROR_MES_STATE_FIELD.getValue();
        } else {
            locator = CheckoutPageEnum.XPATH_REQ_FIELD_ERROR_MESSAGE_BILLING_SECTION_START.getValue() + expectedField + CheckoutPageEnum.XPATH_REQ_FIELD_ERROR_MESSAGE_BILLING_SECTION_END.getValue();
        }
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedErrorMsgText)) {
                scenarioDef.log(Status.PASS, "Validated Error Message on " + expectedField + " Field on Billing Section of Checkout Page as Expected: " + expectedErrorMsgText);
            } else {
                errorMsg = "Could not validate Error Message on " + expectedField + " Field on Billing Section of Checkout Page as Expected: " + expectedErrorMsgText + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Error Message Element on " + expectedField + " Field on Billing Section of Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingAddressField(boolean expectedSelection) {
        String locator = CheckoutPageEnum.XPATH_USE_SHIPPING_ADDRESS_CHECK_BOX.getValue();
        String errorMsg = null;
        Boolean actualSelection;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualSelection = isSelected(locator);
            if (actualSelection && expectedSelection) {
                scenarioDef.log(Status.PASS, "Validated Shipping Address Checkbox is Selected on Checkout Page");
            } else if (!actualSelection && !expectedSelection) {
                scenarioDef.log(Status.PASS, "Validated Shipping Address Checkbox is not Selected on Checkout Page");
            } else if (actualSelection && !expectedSelection) {
                errorMsg = "Validated Shipping Address Checkbox Selection Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Selection was Unexpected for Element: " + locator);
            } else if (!actualSelection && expectedSelection) {
                errorMsg = "Validated Shipping Address Checkbox Selection Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Selection was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateCreditCardTypeVisibility(String expectedCreditCard, boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_TYPE_START.getValue() + expectedCreditCard + CheckoutPageEnum.XPATH_CREDIT_CARD_TYPE_END.getValue();
        String paymentInformationLoader = CheckoutPageEnum.XPATH_FETCHING_PAYMENT_INFORMATION_LOADER.getValue();
        String paymentLoader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(paymentInformationLoader);
            waitFactory.waitForElementToBeInVisible(paymentLoader);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedCreditCard + " Credit Type is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedCreditCard + " Credit Type is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedCreditCard + " Credit Type is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedCreditCard + " Credit Type is not Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateAppliedCouponValue(String couponValue) {
        String locator = CheckoutPageEnum.XPATH_PROMO_CODE_FIELD.getValue();
        String errorMsg = null;
        String actualText;
        try {
            waitFactory.waitForElementToBeVisible(locator);
            actualText = getAttribute(locator, "placeholder");
            if (actualText.contains(couponValue)) {
                scenarioDef.log(Status.PASS, "Validated Coupon Value on Checkout Page as Expected: " + couponValue);
            } else {
                errorMsg = "Could not Validate Coupon Value on Checkout Page as Expected: " + couponValue + " , Actual Value: " + actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Coupon Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void enterFirstNameForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_FIRST_NAME_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on First Name Field For Billing on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on First Name For Billing Field on Checkout Page");
            throw e;
        }
    }

    public void enterLastNameForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_LAST_NAME_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Last Name For Billing Field on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Last Name For Billing Field on Checkout Page");
            throw e;
        }
    }

    public void enterPhNoForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_PH_NO_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Phone Number Field For Billing on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Phone Number Field For Billing on Checkout Page");
            throw e;
        }
    }

    public void enterAddressForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Address Field For Billing on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Address Field For Billing on Checkout Page");
            throw e;
        }
    }

    public void enterCityForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CITY_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on City Field For Billing on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on City Field For Billing on Checkout Page");
            throw e;
        }
    }

    public void enterZipCodeForBilling(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_BILLING_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on ZipCode Field For Billing on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on ZipCode Field For Billing on Checkout Page");
            throw e;
        }
    }

    public void selectStateForBilling(String stateToSelect) throws Exception {
        String locator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_BILLING_FIELD.getValue();
        String optionLocator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_BILLING_OPTION_START.getValue() + stateToSelect +
                CheckoutPageEnum.XPATH_STATE_DROPDOWN_BILLING_OPTION_END.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(optionLocator);
            click(optionLocator);
            scenarioDef.log(Status.PASS, "Selected State: " + stateToSelect + " For Billing  on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select For Billing State on Checkout Page");
            throw e;
        }
    }

    public void clickStoredAddress() throws Exception {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_FROM_LIST.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Stored Shipping Address in Payment Section");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not click on Stored Shipping Address in Payment Section");
            throw e;
        }
    }

    public void validateFourDigitCVVNotEntered() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_FIELD.getValue();
        String iframe = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        String errorMsg = null;
        String actualText;
        try {
            switchToIframe(iframe);
            waitFactory.waitForElementToBeVisible(locator);
            actualText = getAttribute(locator,"maxlength");
            switchToDefaultContent();
            if (actualText.contains("4")) {
                errorMsg = "Could Not Validate as Four Digit CVV Number is Entered";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
            else {
                scenarioDef.log(Status.PASS, "Validated that Unable to Enter 4 Digit CVV");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get Credit Card CVV Field on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void clearCreditCardNumber() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_NUMBER_FIELD.getValue();
        String iframe = CheckoutPageEnum.XPATH_CREDIT_CARD_NO_IFRAME.getValue();
        try {
            switchToIframe(iframe);
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Credit Card Field is Clear on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Clear Credit Card Field on Checkout Page");
            throw e;
        }
    }

    public void clearCreditCardCVVNumber() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_FIELD.getValue();
        String iframe = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        try {
            switchToIframe(iframe);
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS, "Credit Card CVV Field is Clear on Checkout Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Clear Credit Card CVV Field on Checkout Page");
            throw e;
        }
    }

    public void validateFourDigitCVVEntered() throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_FIELD.getValue();
        String iframe = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        String errorMsg = null;
        String actualText;
        try {
            switchToIframe(iframe);
            waitFactory.waitForElementToBeVisible(locator);
            actualText = getAttribute(locator,"maxlength");
            switchToDefaultContent();
            if (actualText.contains("4")) {
                scenarioDef.log(Status.PASS, "Validated that Four Digit CVV is Entered");
            }
            else {
                errorMsg = "Could Not Validate as Four Digit CVV Number is Entered";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get Credit Card CVV Field on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateSaveCardForNextPayVisibility(Boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_SAVE_CARD_FOR_NEXT_PAY_CHECKBOX.getValue();
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String locatorBtn = CheckoutPageEnum.XPATH_PLACE_ORDER_BUTTON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            waitFactory.waitForElementToBeInVisible(loader);
            waitFactory.waitForElementToBeVisible(locatorBtn);
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Save Card For Next Payment Checkbox is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Save Card For Next Payment Checkbox is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Save Card For Next Payment Checkbox is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Save Card For Next Payment Checkbox is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePaymentSelected(String expectedPaymentMethod, boolean expectedSelection) {
        String locator = CheckoutPageEnum.XPATH_SELECTED_PAYMENT_FIELD_START.getValue() + expectedPaymentMethod + CheckoutPageEnum.XPATH_SELECTED_PAYMENT_FIELD_END.getValue();
        String errorMsg = null;
        Boolean actualSelection;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualSelection = isSelected(locator);
                if (actualSelection && expectedSelection) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedPaymentMethod + " Payment Method is Selected as Expected on Checkout Page"); }
                else if (!actualSelection && !expectedSelection) {
                    scenarioDef.log(Status.PASS, "Validated " + expectedPaymentMethod + " Payment Method is not Selected as Expected on Checkout Page"); }
                else if (actualSelection && !expectedSelection) {
                     errorMsg = "Validated " + expectedPaymentMethod + " Payment Method is Selected Unexpected on Checkout Page";
                     throw new NoSuchElementException("Element Selection was Unexpected for Element: " + locator); }
                else if (!actualSelection && expectedSelection) {
                    errorMsg = "Validated " + expectedPaymentMethod + " Payment Method is not Selected Unexpectedly on Checkout Page";
                    throw new NoSuchElementException("Element Selection was Unexpected for Element: " + locator);
        }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePaymentMethodOptionVisibility(String expectedPaymentMethod, boolean expectedVisibility) {
        String locator = CheckoutPageEnum.XPATH_START_PAYMENT_METHOD.getValue() + expectedPaymentMethod + CheckoutPageEnum.XPATH_END_PAYMENT_METHOD.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedPaymentMethod+" Method is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expectedPaymentMethod+" Method is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated "+expectedPaymentMethod+" Method is not Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated "+expectedPaymentMethod+" Method is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void waitForPaymentMethodToLoad() {
        String loader = CheckoutPageEnum.XPATH_PAYMENT_LOADER.getValue();
        String errorMsg = null;
        try{
            waitFactory.waitForElementToBeVisible(loader);
            waitFactory.waitForElementToBeInVisible(loader);
            scenarioDef.log(Status.PASS, "Succesfully Waited for Payment Methods to load on Checkout Page");
        }
        catch (Exception e) {
            errorMsg="Unable to Wait for Payment Methods to Load on Checkout Page";
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}