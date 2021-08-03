package PageObjectFactory;

import EnumFactory.CartPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

public class CartPageFactory extends UtilFactory {

    public CartPageFactory() throws Exception {
    }

    public void validateItemContainerHeadingVisibility(String expectedLocator,Boolean expectedVisibility){
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_HEADING_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Item Container have "+expectedLocator+" Heading Displayed on Cart Page");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Item Container does not have "+expectedLocator+" Heading Displayed as Expected on Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Item Container have "+expectedLocator+" Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Item Container does not have "+expectedLocator+" Heading Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateItemContainerContentVisibility(String expectedLocator,Boolean expectedVisibility){
        String locator = CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_START.getValue()
                + expectedLocator + CartPageEnum.XPATH_ITEM_CONTAINER_CONTENT_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Item Container have "+expectedLocator+" Content Displayed on Cart Page");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Item Container does not have "+expectedLocator+" Content Displayed as Expected on Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Item Container have "+expectedLocator+" Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Item Container does not have "+expectedLocator+" Content Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateCartItemQuantity(String expectedValue){
        String locator = CartPageEnum.XPATH_ITEM_QUANTITY_COUNTER.getValue();
        String errorMsg = null;
        String actualValue;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (actualValue.contains(expectedValue)){
                scenarioDef.log(Status.PASS,"Validated Cart has "+expectedValue+" Items Added");
            }else{
                errorMsg = "Could not validate Cart has as Expected Item Count: "+expectedValue+", Actual Value is: "+actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateQuantityOfProductAdded(String expectedValue){
        String locator = CartPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        String errorMsg = null;
        String actualValue;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getAttribute(locator,"value");
            if (actualValue.contains(expectedValue)){
                scenarioDef.log(Status.PASS,"Validated Product Quantity is "+expectedValue+" on Cart Page");
            }else{
                errorMsg = "Could not validate Product Quantity is: "+expectedValue+" on Cart Page, Actual Value is: "+actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateSummarySectionVisibility(Boolean expectedVisibility){
        String locator = CartPageEnum.XPATH_SUMMARY_SECTION.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Summary Section is Displayed on Cart Page");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Summary Section is not Displayed as Expected on Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Summary Section is Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Summary Section is not Displayed Unexpectedly on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }
}
