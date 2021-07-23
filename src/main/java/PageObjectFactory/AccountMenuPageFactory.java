package PageObjectFactory;

import EnumFactory.AccountMenuPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class AccountMenuPageFactory extends UtilFactory{

    public AccountMenuPageFactory() throws Exception {
    }

    public void validateAccountMenuVisibility(Boolean expectedVisibility){
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Account Menu is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Account Menu is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Account Menu is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Account Menu is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

}
