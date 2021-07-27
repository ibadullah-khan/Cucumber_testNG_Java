package PageObjectFactory;

import EnumFactory.ProductDetailsPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

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
}
