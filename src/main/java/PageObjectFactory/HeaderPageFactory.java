package PageObjectFactory;

import EnumFactory.HeaderPageEnum;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.UtilFactory;
import UtilitiesFactory.WaitFactory;
import com.aventstack.extentreports.GherkinKeyword;

public class HeaderPageFactory extends UtilFactory {

    private WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    public HeaderPageFactory() throws Exception {
    }

    public HeaderPageFactory clickOnAccountIcon() throws ClassNotFoundException {
        String locator = HeaderPageEnum.XPATH_ACCOUNT_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            features.createNode("Clicked Account");
            return this;
        }catch (Exception e){
            features.fail("Cannot Clicked Account");
            throw e;
        }
    }
}
