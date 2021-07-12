package PageObjectFactory;

import EnumFactory.HeaderPageEnum;
import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.UtilFactory;
import UtilitiesFactory.WaitFactory;

public class HeaderPageFactory extends UtilFactory {

    private WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    public HeaderPageFactory() throws Exception {
    }

    public HeaderPageFactory clickOnAccountIcon(){
        String locator = HeaderPageEnum.XPATH_ACCOUNT_ICON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            return this;
        }catch (Exception e){
            throw e;
        }
    }
}
