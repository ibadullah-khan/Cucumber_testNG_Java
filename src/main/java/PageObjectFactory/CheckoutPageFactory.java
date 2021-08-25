package PageObjectFactory;

import EnumFactory.AccountMenuPageEnum;
import EnumFactory.CheckoutPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.Color;

public class CheckoutPageFactory extends UtilFactory {

    public CheckoutPageFactory() throws Exception {
    }

    public void enterEmailAddress(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Email Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Email Field on Checkout Page");
            throw e;
        }
    }

    public void enterFirstName(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_FIRST_NAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on First Name Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on First Name Field on Checkout Page");
            throw e;
        }
    }

    public void enterLastName(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_LAST_NAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Last Name Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Last Name Field on Checkout Page");
            throw e;
        }
    }

    public void enterAddress(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ADDRESS_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Address Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Address Field on Checkout Page");
            throw e;
        }
    }

    public void enterCity(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CITY_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on City Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on City Field on Checkout Page");
            throw e;
        }
    }

    public void enterZipCode(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_ZIPCODE_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on ZipCode Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on ZipCode Field on Checkout Page");
            throw e;
        }
    }

    public void enterPhNo(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_PH_NO_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Phone Number Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Phone Number Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardNumber(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_NUMBER_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_NO_IFRAME.getValue();
        try{
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Credit Card Number Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Credit Card Number Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardExpiryDate(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXPIRY_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_EXP_IFRAME.getValue();
        try{
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Credit Card Expiry Date Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Credit Card Expiry Date Field on Checkout Page");
            throw e;
        }
    }

    public void enterCreditCardCVV(String textToEnter) throws Exception {
        String locator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_FIELD.getValue();
        String iframeLocator = CheckoutPageEnum.XPATH_CREDIT_CARD_CVV_IFRAME.getValue();
        try{
            waitFactory.waitForElementToBeClickable(iframeLocator);
            switchToIframe(iframeLocator);
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            switchToDefaultContent();
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Credit Card CVV Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Credit Card CVV Field on Checkout Page");
            throw e;
        }
    }

    public void clickSaveAndContinueButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_SAVE_AND_CONTINUE_BUTTON.getValue();
        String loader = CheckoutPageEnum.XPATH_SHIPPING_LOADER.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            customWait(4000);
            click(locator);
            waitFactory.waitForElementToBeVisible(loader);
            scenarioDef.log(Status.PASS,"Clicked on Save and Continue Button on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Save and Continue Button on Checkout Page");
            throw e;
        }
    }

    public void clickPlaceOrderButton() throws Exception {
        String locator = CheckoutPageEnum.XPATH_PLACE_ORDER_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Place Order Button Button on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Place Order Button on Checkout Page");
            throw e;
        }
    }

    public void selectState(String stateToSelect) throws Exception {
        String locator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_FIELD.getValue();
        String optionLocator = CheckoutPageEnum.XPATH_STATE_DROPDOWN_OPTION_START.getValue() + stateToSelect +
                CheckoutPageEnum.XPATH_STATE_DROPDOWN_OPTION_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(optionLocator);
            click(optionLocator);
            scenarioDef.log(Status.PASS,"Selected State: "+stateToSelect+" on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select State on Checkout Page");
            throw e;
        }
    }

    public String getTaxValue(){
        String locator = CheckoutPageEnum.XPATH_TAX_VALUE.getValue();
        String taxvalue;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            taxvalue = getText(locator);
            scenarioDef.log(Status.PASS,"Fetched Tax Value: "+ taxvalue +" from Checkout");
            return taxvalue;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Tax Value from Checkout");
            throw e;
        }
    }

    public void validateTaxValue(String expectedText){
        String locator = CheckoutPageEnum. XPATH_TAX_VALUE.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Tax on Checkout as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Tax on Checkout as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Tax Element on Checkout");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateDateColor(String expectedDateColor){
        String dateLocator = CheckoutPageEnum.XPATH_ESTIMATED_DELIVERY_DATE.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeClickable(dateLocator);
            String actualValue=getCSS(dateLocator,"color");
            String hex = Color.fromString(actualValue).asHex();
            if (hex.contains(expectedDateColor)) {
                scenarioDef.log(Status.PASS, "Validated Date Color is " + expectedDateColor + " on Checkout");
            } else {
                errorMsg = "Could not validate Date Color is: " + expectedDateColor + " on Checkout, Actual Value is: " + actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }
        catch (Exception e){
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
            actualValue = getAttribute(locator, "value").replace("-","");
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

    public void validateShippingMethodValue(String expecetedShippingMethodName,Boolean expectedVisibility) {
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

    public void clickOnShippingDetailTitle() throws Exception {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_TITLE.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Shipping Detail Title on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Shipping Detail Title on Checkout Page");
            throw e;
        }
    }

    public void validateShippingSectionState(String expectedState) {
        String loader = CheckoutPageEnum.XPATH_SHIPPING_LOADER.getValue();
        String locator =null;
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            if(expectedState.contains("edit")){
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_EDIT_STATE.getValue();
            } else if (expectedState.contains("open")){
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_OPEN_STATE.getValue();
            }else if (expectedState.contains("close")){
                locator = CheckoutPageEnum.XPATH_SHIPPING_DETAIL_CLOSED_STATE.getValue();
            }
            waitFactory.waitForElementToBeInVisible(loader);
            actualVisibility = isVisible(locator);
            if (actualVisibility) {
                scenarioDef.log(Status.PASS, "Validated Shipping Section is in "+expectedState+" State on Checkout Page");
            } else {
                errorMsg = "Validated  Shipping Section is not "+expectedState+" State on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Section State Element on Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethodNameOnSummarySection(String expectedShippingMethodName) {
        String locator = CheckoutPageEnum.XPATH_SHIPPING_METHOD_LABEL.getValue();
        String errorMsg = null;
        try {
            waitFactory.waitForElementToBeVisible(locator);
            String shippingMethod = getText(locator);
            if (shippingMethod.contains(expectedShippingMethodName)) {
                scenarioDef.log(Status.PASS, " Validated Shipping Method " + expectedShippingMethodName + " Same as Expected on Summary Section of Checkout Page");
            } else {
                errorMsg = "Could not Validate Shipping Method " + expectedShippingMethodName + " Not Same as Expected Same as Expected on Summary Section of Checkout Page";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Shipping Method Element Summary Section of  Checkout Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
        }
    }

    public void validateCheckoutPageTriggered() {
        String locator = CheckoutPageEnum.XPATH_CHECKOUT_HEADING.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
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

    public void validateFirstAndLastNameInShippingDetailSection(String expectedFirstAndLastName){
        String locator = CheckoutPageEnum.XPATH_FIRST_AND_LAST_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedFirstAndLastName)){
                scenarioDef.log(Status.PASS,"Validated First and Last Name as Expected: "+expectedFirstAndLastName);
            }else {
                errorMsg = "Could not validate First and Last Name as Expected: "+expectedFirstAndLastName+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the First and Last Name Element on Checkout Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateAddressInShippingDetailSection(String address){
        String locator = CheckoutPageEnum.XPATH_ADDRESS.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(address)){
                scenarioDef.log(Status.PASS,"Validated Address as Expected: "+address);
            }else {
                errorMsg = "Could not Validate Address as Expected: "+address+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Address Element on Checkout Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateStateCityZipCode(String expectedStateCityZipCode){
        String locator = CheckoutPageEnum.XPATH_CITY_STATE_ZIPCODE.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedStateCityZipCode)){
                scenarioDef.log(Status.PASS,"Validated State City Zip Code as Expected: "+expectedStateCityZipCode);
            }else {
                errorMsg = "Could not Validate State City Code as Expected: "+expectedStateCityZipCode+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the State City Code Element on Checkout Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validatePhoneNoInDetailSection(String expectedPhoneNo){
        String locator = CheckoutPageEnum.XPATH_PHONE_NO.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim().replace("-","");
            if (actualText.contains(expectedPhoneNo)){
                scenarioDef.log(Status.PASS,"Validated Phone No as Expected: "+expectedPhoneNo);
            }else {
                errorMsg = "Could not Validate Phone No on as Expected: "+expectedPhoneNo+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Phone No Element on Checkout Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateEmailAddressInDetailSection(String expectedEmail){
        String locator = CheckoutPageEnum.XPATH_EMAIL_ADDRESS.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedEmail)){
                scenarioDef.log(Status.PASS,"Validated Email Address as Expected: "+expectedEmail);
            }else {
                errorMsg = "Could not Validate Email Address as Expected: "+expectedEmail+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Email Element on Checkout Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
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
}