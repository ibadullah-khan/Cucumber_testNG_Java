package PageObjectFactory;

import EnumFactory.MiniCartPageEnum;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.UtilFactory;
import UtilitiesFactory.WaitFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class MiniCartPageFactory extends UtilFactory {

    public MiniCartPageFactory() throws Exception {
    }

    public void validateMiniCartViewVisibility(Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_VIEW.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Mini Cart View is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Mini Cart View is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void clickOnLoginLink(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_LOGIN_LINK.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Login Link on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Login Link on Mini Cart View");
            throw e;
        }
    }
}
