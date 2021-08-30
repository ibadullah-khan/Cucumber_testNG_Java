package PageObjectFactory;

import EnumFactory.AddressBookPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class AddressBookPageFactory extends UtilFactory {

    public AddressBookPageFactory() throws Exception {
    }

    public void validateSavedAddressVisibility(boolean expectedVisibility) {
        String locator = AddressBookPageEnum.XPATH_SAVED_SHIPPING_ADDRESS.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Saved Addresses are Displayed as Expected on Address Book");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Saved Addresses are not Displayed as Expected on Address Book");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Saved Addresses are Displayed Unexpected on Address Book";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Saved Addresses are Displayed Unexpectedly on Address Book";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
