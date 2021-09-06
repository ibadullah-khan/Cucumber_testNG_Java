package PageObjectFactory;

import EnumFactory.AddressBookPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.NoSuchElementException;

public class AddressBookPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

    public AddressBookPageFactory() throws Exception {
    }

    public void validateShippingAddressQuantityVisibility(String[] shippingAddress) {
        String locator = AddressBookPageEnum.XPATH_SHIPPING_ADDRESS_DETAILS.getValue();
        String errorMsg = null;
        List<WebElement> elements;
        String[] AddressBookShippingAddress;

        try {
            elements = elementFactory.getElementsList(locator);
            waitFactory.waitForElementToBeVisible(locator);
            AddressBookShippingAddress = new String[elements.size()];
            if (AddressBookShippingAddress.length == shippingAddress.length) {
                scenarioDef.log(Status.PASS, "Validated " + AddressBookShippingAddress + " Shipping Details are Displayed as Expected on Address Book");
            } else {
                errorMsg = "Validated " + AddressBookShippingAddress + " Shipping Details are not Displayed as Expected on Address Book";
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Expected Date Element on Address Book");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
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