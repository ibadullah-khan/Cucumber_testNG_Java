package PageObjectFactory;

import EnumFactory.AddressBookPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class AddressBookPageFactory extends UtilFactory{

    public AddressBookPageFactory() throws Exception {
    }

    public void validateAddressSetAsDefault(String firstName) {
        String locator = AddressBookPageEnum.XPATH_DEFAULT_LABEL_START.getValue() + firstName + AddressBookPageEnum.XPATH_DEFAULT_LABEL_END.getValue();
        try{
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS,"Address Set as Default");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Address Could not Set as Default");
            throw e;
        }
    }
}