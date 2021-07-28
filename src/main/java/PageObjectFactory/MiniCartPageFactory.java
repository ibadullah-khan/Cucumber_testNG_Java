package PageObjectFactory;

import EnumFactory.MiniCartPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
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

    public void validateLoginLinkVisibility(Boolean expectedVisibility){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_LOGIN_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Login Link is Displayed as Expected on Mini Cart View");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Login Link is not Displayed as Expected on Mini Cart View");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Login Link is Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Login Link is not Displayed Unexpected on Mini Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void clickOnCloseIcon(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_CLOSE_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Close Icon on Mini Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Close Icon on Mini Cart View");
            throw e;
        }
    }

    public void validateMiniCartTriggered(){
        String locator = MiniCartPageEnum.XPATH_MINI_CART_VIEW.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Product Successfully Triggered Mini Cart");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Product Could not Successfully Trigger Mini Cart");
            throw e;
        }
    }

    public void validateProductName(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Name on Mini Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Product Name on Mini Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Name Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPrice(String expectedText){
        String locator = MiniCartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Product Price on Mini Cart as Expected: "+expectedText);
            }else {
                errorMsg = "Could not validate Product Price on Mini Cart as Expected: "+expectedText+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateMiniCartScrollability(Boolean expectedCondition){
        String locator = MiniCartPageEnum.XPATH_PRODUCTS_CONTAINER.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualCondition = isScrollable(locator);
            if (actualCondition && expectedCondition){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is Scrollable as Expected");
            }else if (!actualCondition && !expectedCondition){
                scenarioDef.log(Status.PASS,"Validated Mini Cart View is not Scrollable as Expected");
            }else if (actualCondition && !expectedCondition){
                errorMsg = "Validated Mini Cart View is Scrollable Unexpected";
                throw new NoSuchElementException("Element Scrollable was Unexpected for Element: " +locator);
            }else if (!actualCondition && expectedCondition){
                errorMsg = "Validated Mini Cart View is not Scrollable Unexpected";
                throw new NoSuchElementException("Element Scrollable was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }
}
