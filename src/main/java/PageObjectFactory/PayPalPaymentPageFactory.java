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
            switchToDefaultContent();
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Cancel and Return to Shoebacca Button on PayPal Payment Page");
            throw e;
        }
    }
}
