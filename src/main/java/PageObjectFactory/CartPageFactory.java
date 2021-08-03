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

    public void validateRemoveLinkTriggered(){
        String locator = CartPageEnum.XPATH_CHECKOUT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Product Remove from Cart Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Product Could not Remove from Cart Page");
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
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to get the Product Price Element on Mini Cart");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
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