package PageObjectFactory;

import EnumFactory.HomePageEnum;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.UtilFactory;
import UtilitiesFactory.WaitFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class HomePageFactory extends UtilFactory {

    private WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    public HomePageFactory() throws Exception {
    }

    public void clickOnAccountIcon(){
        String locator = HomePageEnum.XPATH_ACCOUNT_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Account Icon on Header");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Account Icon on Header");
            throw e;
        }
    }

    public void clickOnAddressBook(){
        String locator = HomePageEnum.XPATH_ADDRESS_BOOK.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Address Book on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Address Book on Account Menu");
            throw e;
        }
    }

    public void validateMiniCartIconVisibility(Boolean expectedVisibility){
        String locator = HomePageEnum.XPATH_MINI_CART_ICON.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart Icon is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart Icon is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Mini Cart Icon is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Mini Cart Icon is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void clickOnMiniCartIcon(){
        String locator = HomePageEnum.XPATH_MINI_CART_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Mini Cart Icon on Header");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Mini Cart Icon on Header");
            throw e;
        }
    }

    public void validateMiniCartCounterVisibility(Boolean expectedVisibility){
        String locator = HomePageEnum.XPATH_MINI_CART_COUNTER.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart Counter is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Mini Cart Counter is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Mini Cart Counter is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Mini Cart Counter is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateMiniCartCounterValue(String expectedValue){
        String locator = HomePageEnum.XPATH_MINI_CART_COUNTER.getValue();
        String errorMsg = null;
        String actualValue;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator).trim();
            if (actualValue.contains(expectedValue)){
                scenarioDef.log(Status.PASS,"Validated Mini Cart Counter Value as Expected: "+expectedValue+" on Header");
            } else{
                errorMsg = "Could not validate Mini Cart Counter Value as Expected: "+expectedValue+" on Header, Actual Value: "+actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Mini Cart Counter Element on Header");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }
}
