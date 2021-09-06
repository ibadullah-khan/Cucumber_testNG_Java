package PageObjectFactory;

import EnumFactory.AddressBookPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class AddressBookPageFactory extends UtilFactory{

    public AddressBookPageFactory() throws Exception {
    }

    public void validateAddressSetAsDefault(String firstName,Boolean expectedVisibility) {
        String locator = AddressBookPageEnum.XPATH_DEFAULT_LABEL_START.getValue() + firstName + AddressBookPageEnum.XPATH_DEFAULT_LABEL_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;

        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Address Set as Default are Displayed as Expected on Address Book Page");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Address Set as Default are not Displayed as Expected on Address Book Page");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Address Set as Default are not Displayed Unexpected on Address Book Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Address Set as Default are Displayed Unexpectedly on Address Book Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}