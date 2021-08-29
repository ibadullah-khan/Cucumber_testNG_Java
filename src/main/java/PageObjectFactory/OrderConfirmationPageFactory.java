package PageObjectFactory;

import UtilitiesFactory.UtilFactory;
import EnumFactory.OrderConfirmationPageEnum;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class OrderConfirmationPageFactory extends UtilFactory {

    public OrderConfirmationPageFactory() throws Exception {

    }
    
    public void closeFeedbackWindow() throws Exception{
        String locator = OrderConfirmationPageEnum.XPATH_FEEDBACK_AFTER_ORDER_CLOSE_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Closed Feedback Window on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Close Button in Feedback Window on Order Confirmation Page");
            throw e;
        }
    }
    
    public void enterPasswordOnOrderConfirmation(String password) throws Exception{
        String locator = OrderConfirmationPageEnum.XPATH_PASSWORD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeVisible(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Password: "+ password +" on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Password: "+ password +" on Order Confirmation Page");
            throw e;
        }
    }
    
    public void enterConfirmPasswordOnOrderConfirmation(String password) throws Exception{
        String locator = OrderConfirmationPageEnum.XPATH_CONFIRM_PASSWORD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeVisible(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Confirm Password: "+ password +" on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Re-Password: "+ password +" on Order Confirmation Page");
            throw e;
        }
    }

    public void clickCreateAccount() throws Exception {
        
        String locator = OrderConfirmationPageEnum.XPATH_CREATE_ACCOUNT_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Create Account Button on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Create Account Button on Order Confirmation Page");
            throw e;
        }
    }

    public void validatePrintButtonVisibility(boolean expectedVisibility) {
        String locator = OrderConfirmationPageEnum.XPATH_PRINT_SLIP.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Print Button is Displayed as Expected on Checkout Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Print Button is not Displayed as Expected on Checkout Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Print Button is Displayed Unexpected on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Print Button is Displayed Unexpectedly on Checkout Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateMismatchPasswordErrorMsg(String expectedErrorMsg) {
        String locator = OrderConfirmationPageEnum.XPATH_PASSWORD_MISMATCH_ERROR_MSG.getValue();
        String actualErrorMsg;
        try{
            actualErrorMsg = getText(locator).trim();
            if (actualErrorMsg.equals(expectedErrorMsg)) {
                scenarioDef.log(Status.PASS,"Validated Mis-Match error message as Expected: "+expectedErrorMsg+" on Order Confirmation Page");
            }
            else{
                scenarioDef.log(Status.FAIL,"Could not Validate Mis-Match error message as Expected: "+expectedErrorMsg+" on Order Confirmation Page, Actual was: "+actualErrorMsg);
            }
        }
        catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Get Mis-Match error message element on Order Confirmation Page");
            throw e;
        }
    }

    public void validateAlreadyExistEmailErrorMsg(String expectedErrorMsg) {
        String locator = OrderConfirmationPageEnum.XPATH_ERROR_MSG.getValue();
        String actualErrorMsg;
        try{
            waitFactory.waitForElementToBeVisible(locator);
            actualErrorMsg = getText(locator).trim();
            if (actualErrorMsg.equals(expectedErrorMsg)) {
                scenarioDef.log(Status.PASS,"Validated Already Exist Email error message as Expected: "+expectedErrorMsg+" on Order Confirmation Page");
            }
            else{
                scenarioDef.log(Status.FAIL,"Could not Validate Already Exist Email  error message as Expected: "+expectedErrorMsg+" on Order Confirmation Page, Actual was: "+actualErrorMsg);
            }
        }
        catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Get Already Exist Email  error message element on Order Confirmation Page");
            throw e;
        }
    }
}
