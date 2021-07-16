package PageObjectFactory;

import EnumFactory.HeaderPageEnum;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.UtilFactory;
import UtilitiesFactory.WaitFactory;
import com.aventstack.extentreports.Status;

import java.io.IOException;

public class HeaderPageFactory extends UtilFactory {

    private WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    public HeaderPageFactory() throws Exception {
    }

    public HeaderPageFactory clickOnAccountIcon() throws ClassNotFoundException, IOException {
        String locator = HeaderPageEnum.XPATH_ACCOUNT_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Account Homepage Button");
            return this;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Account Icon on Header");
            throw e;
        }
    }
}
