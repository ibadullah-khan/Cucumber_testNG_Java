package PageObjectFactory;

import EnumFactory.AccountMenuPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class AccountMenuPageFactory extends UtilFactory{

    public AccountMenuPageFactory() throws Exception {
    }

    public void validateAccountMenuVisibility(Boolean expectedVisibility){
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try{
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Account Menu is Displayed as Expected on Header");
            }else if (!actualVisibility && !expectedVisibility){
                scenarioDef.log(Status.PASS,"Validated Account Menu is not Displayed as Expected on Header");
            }else if (actualVisibility && !expectedVisibility){
                errorMsg = "Validated Account Menu is Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }else if (!actualVisibility && expectedVisibility){
                errorMsg = "Validated Account Menu is not Displayed Unexpected on Header";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " +locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void enterUsername(String username) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_USERNAME.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,username);
            scenarioDef.log(Status.PASS,"Entered Text: "+username+" on Username Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Username Field on Account Menu");
            throw e;
        }
    }

    public void enterPassword(String password) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_PASSWORD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Text: "+password+" on Password Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Password Field on Account Menu");
            throw e;
        }
    }

    public void clickOnLoginButton() throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_LOGIN_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            jsClick(locator);
            scenarioDef.log(Status.PASS,"Clicked on Login Button on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not click on Login Button on Account Menu");
            throw e;
        }
    }

    public void validateLoginSuccess(){
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_GREET_HEADING.getValue();
        try{
            waitFactory.waitForElementToBeVisible(locator);
            waitForPageLoad();
            scenarioDef.log(Status.PASS,"User Logged In Successfully");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Logged in User");
            throw e;
        }
    }

    public void validateErrorMessageVisibilityOnEmail(boolean expectedVisibility) {
        String locator = AccountMenuPageEnum.XPATH_REQUIRED_EMAIL_FIELD_ERROR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is Displayed as Expected on Email Field on Account Menu");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is Not Displayed as Expected on Email Field on Account Menu");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Error Message is Displayed Unexpected on Email Field";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Error Message is Displayed Unexpectedly on Email Field on Account Menu";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateErrorMessageVisibilityOnPassword(boolean expectedVisibility) {
        String locator = AccountMenuPageEnum.XPATH_REQUIRED_PASSWORD_FIELD_ERROR.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is Displayed as Expected on Password Field on Account Menu");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Error Message is Not Displayed as Expected on Password Field on Account Menu");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Error Message is Displayed Unexpected on Password Field on Account Menu";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Error Message is Displayed Unexpectedly on Password Field";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatesValidationErrorMessageVisibilityOnEmail(boolean expectedVisibility) {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_USERNAME.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = !(getAttribute(locator,"validationMessage").isEmpty());
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Validation Message is Displayed as Expected on Email Field on Account Menu");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Validation Error Message is Not Displayed as Expected on Email Field on Account Menu");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Validation Error Message is Displayed Unexpected on Email Field";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Validation Error Message is Displayed Unexpectedly on Email Field on Account Menu";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clearEmailField()throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_MENU_USERNAME.getValue();
        try {
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            scenarioDef.log(Status.PASS, "Email Field is Clear on Account Menu");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Clear Email Field on on Account Menu");
            throw e;
        }
    }

    public void validateSignInPopUpVisibility(boolean expectedVisibility) {
        String locator = AccountMenuPageEnum.XPATH_SIGN_IN_POP_UP.getValue();
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisible(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Sign In Pop Up is Displayed as Expected");
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated  Sign In Pop Up is Not Displayed as Expected");
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Sign In Pop Up is Displayed Unexpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Sign In is not Displayed Unexpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickOnCreateAccountLink() throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_SIGN_UP_LINK.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Create an Account Link on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Create an Account Link on Account Menu");
            throw e;
        }
    }

    public void enterEmailAddressOnRegisterAccountMenu(String username) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_SIGN_UP_USERNAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,username);
            scenarioDef.log(Status.PASS,"Entered Text: "+username+" on Email Address Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Email Address Field on Account Menu");
            throw e;
        }
    }

    public void enterFirstNameOnRegisterAccountMenu(String firstname) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_SIGN_UP_FIRSTNAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,firstname);
            scenarioDef.log(Status.PASS,"Entered Text: "+firstname+" on First Name Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on First Name Field on Account Menu");
            throw e;
        }
    }

    public void enterLastNameOnRegisterAccountMenu(String lastname) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_SIGN_UP_LASTNAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,lastname);
            scenarioDef.log(Status.PASS,"Entered Text: "+lastname+" on Last Name Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Last Name Field on Account Menu");
            throw e;
        }
    }

    public void enterPasswordOnRegisterAccountMenu(String password) throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ACCOUNT_SIGN_UP_PASSWORD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,password);
            scenarioDef.log(Status.PASS,"Entered Text: "+password+" on Password Field on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Text on Password Field on Account Menu");
            throw e;
        }
    }

    public void clickOnCreateAccountButton() throws Exception {
        String locator = AccountMenuPageEnum.XPATH_CREATE_ACCOUNT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Clicked on Create an Account Button on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Create an Account Button on Account Menu");
            throw e;
        }
    }

    public void clickOnAddressBookOption() throws Exception {
        String locator = AccountMenuPageEnum.XPATH_ADDRESS_BOOK_OPTION.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Clicked on Payment Method Option on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Payment Method Option on Account Menu");
            throw e;
        }
    }

    public void clickOnPaymentMethodOption() throws Exception {
        String locator = AccountMenuPageEnum.XPATH_PAYMENT_METHOD_OPTION.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Clicked on Address Book Option on Account Menu");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Address Book Option on Account Menu");
            throw e;
        }
    }
}
