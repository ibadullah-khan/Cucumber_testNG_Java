package PageObjectFactory;

import EnumFactory.PaymentMethodPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class PaymentMethodPageFactory extends UtilFactory{

    public PaymentMethodPageFactory() throws Exception {
    }

    public String fetchDefaultCreditCard() {
        String locator = PaymentMethodPageEnum.XPATH_DEFAULT_CREDIT_CARD.getValue();
        String creditCardNumber;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            creditCardNumber = getText(locator);
            scenarioDef.log(Status.PASS, "Fetched Credit Card No: " + creditCardNumber + " from Payment Method Page");
            return creditCardNumber;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Fetch Credit Card No from Payment Method Page");
            throw e;
        }
    }
}