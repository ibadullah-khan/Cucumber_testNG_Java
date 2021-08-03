package PageObjectFactory;

import EnumFactory.CartPageEnum;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPageFactory extends UtilFactory {

    ElementFactory elementFactory = new ElementFactory();

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
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
        }
    }

    public void validateRemoveLinkVisibility(int expectedRemoveLink){

        String locator = CartPageEnum.XPATH_REMOVE_LINK.getValue();
        waitFactory.waitForElementToBeVisible(locator);
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            if (expectedRemoveLink==elements.size()) {
                scenarioDef.log(Status.PASS, "Validated "+expectedRemoveLink+" Remove Link is Displayed as Expected on Cart Page");
            }else {
                scenarioDef.log(Status.FAIL, "Validated "+expectedRemoveLink+" Remove Link is Not Displayed as Expected on Cart Page");
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Remove Link on Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }
    public void clickonRemoveLink(String expectedProductName){
        String locator = CartPageEnum.XPATH_REMOVE_START.getValue() + expectedProductName+ CartPageEnum.XPATH_REMOVE_END.getValue();try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            customWait(3000);
            scenarioDef.log(Status.PASS,"Clicked on Remove Product Link on Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Product Link on Cart Page"+expectedProductName);
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
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
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
                errorMsg = "Could not validate Product Price on Mini Cart as Expected: "+expectedValue+" , Actual Value: "+actualValue;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateProductQuantityInCounterSection(String expectedQuantity){
        String locator = CartPageEnum.XPATH_Product_QUANTITY_COUNTER.getValue();
        String errorMsg = null;
        String actualText;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).trim();
            if (actualText.contains(expectedQuantity)){
                scenarioDef.log(Status.PASS,"Validated Product Quantity on Mini Cart as Expected: "+expectedQuantity);
            }else {
                errorMsg = "Could not validate Product Price on Mini Cart as Expected: "+expectedQuantity+" , Actual Value: "+actualText;
                throw new NoSuchContextException("Actual and Expected Value Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
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
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
        }
    }
    public void validateAmount(){
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String locator2 =CartPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String errorMsg = null;
        double totalPriceOfProductSection=0;
        double totalSummaryAmount=0;
        List <WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            for(int i=0;i<elements.size();i++){
                WebElement element = elements.get(i);
                totalPriceOfProductSection = totalPriceOfProductSection + Double.parseDouble(getText(element).trim().substring(1));
            }

            totalSummaryAmount = Double.parseDouble(getText(locator2).trim().substring(1));

            if(totalSummaryAmount==totalPriceOfProductSection){
                scenarioDef.log(Status.PASS,"Validate Summary Total Amount $"+totalSummaryAmount+" is Equal to Sum of  Product Prices $"+totalPriceOfProductSection);
            }
            else{
                scenarioDef.log(Status.FAIL,"Validate Summary Total Amount $"+totalSummaryAmount+"is not Equal to Sum of  Product Prices $"+totalPriceOfProductSection);
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }
}