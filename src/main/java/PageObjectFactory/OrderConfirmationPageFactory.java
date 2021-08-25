package PageObjectFactory;

import UtilitiesFactory.UtilFactory;
import EnumFactory.OrderConfirmationPageEnum;
import com.aventstack.extentreports.Status;

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
            scenarioDef.log(Status.PASS,"Entered Password"+ password +" on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Password on Order Confirmation Page");
            throw e;
        }
    }
    
    public void reEnterPasswordOnOrderConfirmation(String password) throws Exception{
        String locator = OrderConfirmationPageEnum.XPATH_CONFIRM_PASSWORD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeVisible(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Re-Password"+ password +" on Order Confirmation Page");
        }
        catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Re-Password on Order Confirmation Page");
            throw e;
        }
    }

    public void clickCreateAccount() throws Exception {
        
        String locator = OrderConfirmationPageEnum.XPATH_CREATE_ACCOUNT_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeVisible(locator);
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

    public void validateMismatchPasswordErrorMsg(String expectedErrorMsg) {
        String locator = OrderConfirmationPageEnum.XPATH_PASSWORD_MISMATCH_ERROR_MSG.getValue();
        String actualErrorMsg;
        try{
            actualErrorMsg = getText(locator).trim();
            if (actualErrorMsg.equals(expectedErrorMsg)) {
                scenarioDef.log(Status.PASS,"Validated error message equals to expected error message on Order Confirmation Page");
            }
            else{
                scenarioDef.log(Status.FAIL,"Could not Validate error message equals to expected error message on Order Confirmation Page");
            }
        }
        catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate error message equals to expected error message on Order Confirmation Page");
            throw e;
        }
    }
}
