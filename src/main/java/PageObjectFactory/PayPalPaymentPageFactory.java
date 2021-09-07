package PageObjectFactory;

import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import EnumFactory.PayPalPaymentPageEnum;

public class PayPalPaymentPageFactory extends UtilFactory {

    public PayPalPaymentPageFactory() throws Exception{

    }

    public void clickOnCancelAndReturnToShoebacca() throws Exception {
        String locator = PayPalPaymentPageEnum.XPATH_CANCEL_AND_RETURN_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Cancel and Return to Shoebacca Button on PayPal Payment Page");
            customWait(2000);
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Cancel and Return to Shoebacca Button on PayPal Payment Page");
            throw e;
        }
    }

    public void userClicksOnPayNowButton() throws Exception {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_PAY_NOW_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeVisible(locator);
            waitFactory.waitForElementToBeClickable(locator);
            jsClick(locator);
            scenarioDef.log(Status.PASS, "Clicked on Pay Now Button on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Pay Now Button on PayPal Page");
            throw e;
        }
    }

    public void userClicksOnLoginButton() {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_LOGIN_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Login Button on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Login Button on PayPal Page");
            throw e;
        }
    }

    public void userEnterPayPalPassword(String textToEnter) throws Exception {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_PASSWORD_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Password Field on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Password Field on PayPal Page");
            throw e;
        }
    }

    public void userClicksOnNextButton() {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_NEXT_BUTTON.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Next Button on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Next Button on PayPal Page");
            throw e;
        }
    }

    public void userEnterPayPalUsername(String textToEnter) throws Exception {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_EMAIL_FIELD.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator, textToEnter);
            scenarioDef.log(Status.PASS, "Entered Text: " + textToEnter + " on Username Field on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter Text on Username Field on PayPal Page");
            throw e;
        }
    }

    public void userWaitForPayLaterDetailsToLoad() {
        String locator = PayPalPaymentPageEnum.XPATH_PAYPAL_PAY_LATER_SECTION.getValue();
        try {
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS, "Successfully Waited for Final Details to Load on PayPal Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Wait for Final Details to Load on PayPal Page");
            throw e;
        }
    }
}
