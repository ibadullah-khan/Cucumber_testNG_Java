package PageObjectFactory;

import EnumFactory.ProductDetailsPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.testng.Assert;

public class ProductDetailsPageFactory extends UtilFactory {
    public ProductDetailsPageFactory() throws Exception {
    }

    public void clickOnAddToCart(){
        String locator = ProductDetailsPageEnum.XPATH_ADD_TO_CART_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add to Cart Button on PDP");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add to Cart Button on PDP");
            throw e;
        }
    }

    public String getProductName(){
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_NAME.getValue();
        String productName;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            productName = getText(locator);
            scenarioDef.log(Status.PASS,"Fetched Product Name: "+ productName +" from PDP");
            return productName;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Product Name from PDP");
            throw e;
        }
    }

    public String getProductPrice(){
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_PRICE.getValue();
        String productPrice;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            productPrice = getText(locator);
            scenarioDef.log(Status.PASS,"Fetched Product Price: "+ productPrice +" from PDP");
            return productPrice;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Product Price from PDP");
            throw e;
        }
    }
// //*[@class='item-name-1dB']
    public String assertProductName(){
        String locator = ProductDetailsPageEnum.XPATH_PRODUCT_NAME.getValue();
        String productName;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            productName = getText(locator);
            Assert.assertEquals("Edge II Duffle Bag",productName);
            scenarioDef.log(Status.PASS,"Fetched Product Name: "+ productName +" from PDP");
            return productName;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Product Name from PDP");
            throw e;
        }
    }
}
