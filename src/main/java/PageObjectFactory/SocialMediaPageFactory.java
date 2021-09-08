package PageObjectFactory;

import EnumFactory.SocialMediaPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class SocialMediaPageFactory extends UtilFactory {

    public SocialMediaPageFactory() throws Exception {
    }

    public void enterSocialMediaUserID(String username) throws Exception {
        String locator = SocialMediaPageEnum.XPATH_ID_INPUT_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,username);
            scenarioDef.log(Status.PASS,"Entered UserID: "+username+" on Username Field on Facebook Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter UserID "+username+"on Username Field on Facebook Page");
            throw e;
        }
    }

    public void enterSocialMediaPassword(String password) throws Exception {
        String locator = SocialMediaPageEnum.XPATH_PASSWORD_INPUT_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Password: "+password+" on Password Field on Facebook Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Password "+password+" on Password Field on Facebook Page");
            throw e;
        }
    }

    public void clickOnLoginButton() {
        String locator = SocialMediaPageEnum.XPATH_LOGIN_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Login Button on Facebook Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Login Button on Facebook Page");
        }
    }
}