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

    public void validateDifferentProductNoAdded(String expectedCount) {
        String locator = CartPageEnum.XPATH_PRODUCT_SECTION.getValue();
        String errorMsg = null;
        String actualCount;
        try {
            waitFactory.waitForElementToBeClickable(locator);
            actualCount = String.valueOf(getSize(locator));
            if (expectedCount.equals(actualCount)) {
                scenarioDef.log(Status.PASS, "Validated " + expectedCount + " products are added as Expected on Cart");
            } else {
                errorMsg = "Could not validate " + expectedCount + " products are added as Expected on Cart, Actual: " + actualCount;
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Section Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductNameVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Name is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Name is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Name is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Name Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductPriceVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Price is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Price is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Price is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Price Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductImageVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_IMAGE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Image is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Image is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Image is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Image Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductRemoveVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_REMOVE_LINK.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Remove Link is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Remove Link is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Remove Link is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Remove Link Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductColorVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_COLOUR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Color is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Color is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Color is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Color Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductSizeVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_SIZE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Size is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Size is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Size is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Size Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductBrandVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_BRAND.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Brand is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Brand is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Brand Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateProductEstDateVisibility(int expectedProductNo, Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_PRODUCT_DATE.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        List<WebElement> elements;
        try {
            elements = elementFactory.getElementsList(locator);
            actualVisibility = expectedProductNo == elements.size();
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Displayed as Expected on Cart View");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated " + expectedProductNo + " Product Date is Not Displayed as Expected on Cart View");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated " + expectedProductNo + " Product Date is not Displayed Unexpected on Cart View";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the Product Date Element on Cart");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void validateAllProductsAttributesVisibility(String expectedCount, Boolean expectedVisibility) {
        try {
            validateProductNameVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductPriceVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductImageVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductRemoveVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductColorVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductSizeVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductBrandVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            validateProductEstDateVisibility(Integer.parseInt(expectedCount), expectedVisibility);
            scenarioDef.log(Status.PASS, "Validated All Attributes are Displayed on Cart");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate All Attributes are Displayed on Cart");
            throw e;
        }
    }

    public void clickOnProductName(){
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Product Name on Cart View");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Product Name on Mini Cart View");
            throw e;
        }
    }

    public void validateProductName(String expectedText) {
        String locator = CartPageEnum.XPATH_PRODUCT_NAME.getValue();
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

    public void validateRemoveLinkVisibility(int expectedRemoveLink){

        String locator = CartPageEnum.XPATH_REMOVE_LINK.getValue();
        waitFactory.waitForElementToBeVisible(locator);
        String errorMsg = null;
        List<WebElement> elements;
        try{
            elements = elementFactory.getElementsList(locator);
            if (expectedRemoveLink==elements.size()) {
                scenarioDef.log(Status.PASS, "Validated "+expectedRemoveLink+" Remove Link is Displayed as Expected on Cart Page");
            }else {
                scenarioDef.log(Status.FAIL, "Validated "+expectedRemoveLink+" Remove Link is not Displayed as Expected on Cart Page");
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

    public void clickOnRemoveLink(String expectedProductName){
        String locator = CartPageEnum.XPATH_REMOVE_START.getValue() + expectedProductName+ CartPageEnum.XPATH_REMOVE_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            customWait(3000);
            scenarioDef.log(Status.PASS,"Clicked on Remove Link of "+expectedProductName+ " Product on Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Remove Link of "+expectedProductName+" Product on Cart Page");
            throw e;
        }
    }

    public void validateSubAmount(){
        String individualAmountLocator = CartPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String totalAmountLocator =CartPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String errorMsg = null;
        double totalPriceOfProductSection=0;
        double totalSummaryAmount=0;
        List <WebElement> elements;
        WebElement element;
        try{
            elements = elementFactory.getElementsList(individualAmountLocator);
            for(int i=0;i<elements.size();i++){
                element = elements.get(i);
                totalPriceOfProductSection = totalPriceOfProductSection + Double.parseDouble(getText(element).trim().substring(1));
            }

            totalSummaryAmount = Double.parseDouble(getText(totalAmountLocator).trim().substring(1));

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

    public void validateCartIsEmptySectionVisibility(Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_CART_IS_EMPTY.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Cart Is Empty Section is Displayed as Expected on Cart Page");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated Cart Is Empty Section is Not Displayed as Expected on Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Cart Is Empty Section is Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Cart Is Empty Section is not Displayed Unexpected on Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }
    public void clickOnChangeShippingOption(){
        String locator = CartPageEnum.XPATH_CHANGE_SHIPPING_LINK.getValue() ;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            customWait(3000);
            scenarioDef.log(Status.PASS,"Clicked on Change Shipping Option on Summary Section of Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Change Shipping Option on Summary Section of Cart Page");
            throw e;
        }
    }

    public void clickOnShippingMethod(String expecetedShippingMethodName){
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_START.getValue() + expecetedShippingMethodName+ CartPageEnum.XPATH_SHIPPING_METHOD_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            customWait(3000);
            scenarioDef.log(Status.PASS,"Clicked on "+expecetedShippingMethodName+ " Method on Summary Section of Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click "+expecetedShippingMethodName+ " Method on Summary Section of Cart Page");
            throw e;
        }
    }

    public void getPrice(String expecetedShippingMethodName){
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_START.getValue() + expecetedShippingMethodName+ CartPageEnum.XPATH_SHIPPING_PRICE_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            getText(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+getText(locator)+ "Method on Summary Section of Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click "+getText(locator)+ " Method on Summary Section of Cart Page");
            throw e;
        }
    }

    public void validateShippingMethodVisibilityOnDropDown(String expecetedShippingMethodName,Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_START.getValue() + expecetedShippingMethodName+ CartPageEnum.XPATH_SHIPPING_METHOD_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated "+expecetedShippingMethodName +" Method is Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated "+expecetedShippingMethodName +" Method is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated "+expecetedShippingMethodName +" Method is Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated "+expecetedShippingMethodName +" Method is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateShippingPriceVisibilityOnDropDown(String expectedShippingMethod,Boolean expectedVisibility) {
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_START.getValue() + expectedShippingMethod+ CartPageEnum.XPATH_SHIPPING_PRICE_END.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated  Shipping Price "+expectedShippingMethod +" is Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            }else if(!actualVisibility&& !expectedVisibility){
                scenarioDef.log(Status.PASS, "Validated  Shipping Price "+expectedShippingMethod+" is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated  Shipping Price "+expectedShippingMethod +" is Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated  Shipping Price "+expectedShippingMethod+" is not Displayed on Shipping Method Drop Down of Summary Section of Cart Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateShippingPriceAmountOnDropDown(String expectedShippingMethod,String expectedShippingPrice){
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_START.getValue() + expectedShippingMethod+ CartPageEnum.XPATH_SHIPPING_PRICE_END.getValue();
        String actualPrice = getText(locator).trim();
        String errorMsg =null;

        try{
            if(actualPrice.equalsIgnoreCase(expectedShippingPrice)){
                scenarioDef.log(Status.PASS,"Validated Shipping Price "+expectedShippingPrice+" Same as Expected on Shipping Method Drop of Summary Section of Cart Page");
            }
            else{
                scenarioDef.log(Status.FAIL,"Validate Shipping Price "+expectedShippingPrice+" Not Same as Expected on Shipping Method Drop of Summary Section of Cart Page");
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the  Shipping Price Element on Drop Down Summary Section of  Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingPriceAmountOnSummarySection(String expectedShippingPrice){
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_SUMMARY_SECTION.getValue();
        String actualPrice = getText(locator).replace(".00","");
        String errorMsg =null;
        try{
            if(actualPrice.equalsIgnoreCase(expectedShippingPrice)){
                scenarioDef.log(Status.PASS," Validated Shipping Price "+expectedShippingPrice+" Same as Expected on Summary Section of Cart Page");
            }
            else{
                scenarioDef.log(Status.FAIL,actualPrice+"Validate Shipping Price "+expectedShippingPrice+"Not Same as Expected Same as Expected on Summary Section of Cart Page");
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the  Shipping Price Element Summary Section of  Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }

    public void validateShippingMethodNameOnSummarySection(String expectedShippingMethod){
        String locator = CartPageEnum.XPATH_SHIPPING_METHOD_SUMMARY_SECTION.getValue();
        String shippingMethod = getText(locator);
        String errorMsg =null;
        try{
            if(shippingMethod.contains(expectedShippingMethod)){
                scenarioDef.log(Status.PASS," Validated Shipping Method "+expectedShippingMethod+" Same as Expected on Summary Section of Cart Page");
            }
            else{
                scenarioDef.log(Status.FAIL," Validate Shipping Method "+expectedShippingMethod+" Not Same as Expected Same as Expected on Summary Section of Cart Page");
            }
        }catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the  Shipping Method Element Summary Section of  Cart Page");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
    }
    public double getShippingAmount(){
        String locator = CartPageEnum.XPATH_SHIPPING_PRICE_SUMMARY_SECTION.getValue();
        double shippingAmount;
        if(getText(locator).equalsIgnoreCase("free")){
            shippingAmount=0;
        }
        else{
            shippingAmount= Double.parseDouble(getText(locator).trim().substring(1));
        }
        return shippingAmount;
    }

    public void validateTotalAmount() {

        String subAmountLocator = CartPageEnum.XPATH_SUB_TOTAL_AMOUNT.getValue();
        String totalAmountLocator = CartPageEnum.XPATH_TOTAL_AMOUNT.getValue();
        String errorMsg = null;

        try {
            double subAmount = Double.parseDouble(getText(subAmountLocator).trim().substring(1));
            double shippingAmount = getShippingAmount();
            double totalAmount = Double.parseDouble(getText(totalAmountLocator).trim().substring(1));
            if (totalAmount == subAmount + shippingAmount) {
                scenarioDef.log(Status.PASS, "Validate Total Amount $" + totalAmount + " is Same as Expected on Summary Section of Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, "Validate Summary Total Amount $" + totalAmount + " is not Same as Expected on Summary Section of Cart Page");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if (errorMsg == null) {
                scenarioDef.log(Status.FAIL, "Unable to get the  Price Element on Summary Section of  Cart Page");
            } else {
                scenarioDef.log(Status.FAIL, errorMsg);
            }
            throw e;
        }
    }

    public void enterProductQuantity(String textToEnter)throws Exception {
        String locator = CartPageEnum.XPATH_PRODUCT_QUANTITY.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            removeOneSpace(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered Text: "+textToEnter+" on Quantity");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Value on Quantity Field");
            throw e;
        }
    }
}