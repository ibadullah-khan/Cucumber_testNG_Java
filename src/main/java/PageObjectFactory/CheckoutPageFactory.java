package PageObjectFactory;

import EnumFactory.CheckoutPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
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
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on ZipCode Field on Checkout Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on ZipCode Field on Checkout Page");
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
        try{
            waitFactory.waitForElementToBeClickable(locator);
            customWait(4000);
            click(locator);
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
}