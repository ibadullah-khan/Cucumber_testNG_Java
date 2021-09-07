package com.shoebacca.StepsDefinitions;

import PageObjectFactory.AccountMenuPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccountMenuStepsDef extends HarnessVariables{

    AccountMenuPageFactory accountMenuPage;

    public AccountMenuStepsDef() throws Exception {
        accountMenuPage = new AccountMenuPageFactory();
    }

    @And("User Validates Account Menu Visibility {string}")
    public void userValidatesAccountMenuVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateAccountMenuVisibility(true);
        }else {
            accountMenuPage.validateAccountMenuVisibility(false);
        }
    }

    @Then("User Enters Valid Login Username on Account Menu")
    public void userEntersValidLoginUsernameOnAccountMenu() throws Exception {
        accountMenuPage.enterUsername(VALID_USERNAME);
    }

    @And("User Enters Valid Login Password on Account Menu")
    public void userEntersValidLoginPasswordOnAccountMenu() throws Exception {
        accountMenuPage.enterPassword(VALID_PASSWORD);
    }

    @Then("User Clicks the Login Button on Account Menu")
    public void userClicksTheLoginButtonOnAccountMenu() throws Exception {
        accountMenuPage.clickOnLoginButton();
    }

    @Then("User Validates Successful Login on Account Menu")
    public void userValidatesSuccessfulLoginOnAccountMenu() {
        accountMenuPage.validateLoginSuccess();
    }

    @Then("User Enters Invalid Login Username on Account Menu")
    public void userEntersInvalidLoginUsernameOnAccountMenu()throws Exception {
        accountMenuPage.enterUsername(INVALID_USERNAME);
    }

    @And("User Enters Invalid Login Password on Account Menu")
    public void userEntersInvalidLoginPasswordOnAccountMenu()throws Exception {
        accountMenuPage.enterPassword(INVALID_PASSWORD);
    }

    @Then("User Enters Valid Login Data Username on Account Menu")
    public void userEntersValidLoginDataUsernameOnAccountMenu() throws Exception {
        accountMenuPage.enterUsername(VALID_DATA_USERNAME);
    }

    @Then("User Validates Error Message Visibility {string} on Email Field on Account Menu")
    public void userValidatesErrorMessageVisibilityOnEmailOnAccountMenu(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateErrorMessageVisibilityOnEmail(true);
        }else {
            accountMenuPage.validateErrorMessageVisibilityOnEmail(false);
        }
    }

    @Then("User Validates Error Message Visibility {string} on Password Field on Account Menu")
    public void userValidatesErrorMessageVisibilityOnPassword(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateErrorMessageVisibilityOnPassword(true);
        }else {
            accountMenuPage.validateErrorMessageVisibilityOnPassword(false);
        }
    }

    @Then("User Enters Invalid Email Address on Account Menu")
    public void userEntersInvalidEmailAddressOnAccountMenu()throws Exception {
        accountMenuPage.enterUsername(INVALID_EMAIL_ADDRESS);
        }

    @Then("User Validates Validation Error Message Visibility {string} on Account Menu")
    public void userValidatesValidationErrorMessageVisibilityOnAccountMenu(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validatesValidationErrorMessageVisibilityOnEmail(true);
        }else {
            accountMenuPage.validatesValidationErrorMessageVisibilityOnEmail(false);
        }
    }

    @Then("User Clears the Email Field on Account Menu")
    public void userClearsTheEmailFieldOnAccountMenu()throws Exception {
        accountMenuPage.clearEmailField();
    }

    @Then("User Enters Invalid Email Address Without Domain Name on Account Menu")
    public void userEntersInvalidEmailAddressWithoutDomainNameOnAccountMenu()throws Exception {
            accountMenuPage.enterUsername(EMAIL_ADDRESS_WITHOUT_DOMAIN);
        }

    @Then("User Enters Invalid Email Address Without Recipient Name on Account Menu")
    public void userEntersInvalidEmailAddressWithoutRecipientNameOnAccountMenu()throws Exception {
        accountMenuPage.enterUsername(EMAIL_ADDRESS_WITHOUT_RECIPIENT);
    }

    @Then("User Validates Sign In Pop Up Visibility {string}")
    public void userValidatesSignInPopUpVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateSignInPopUpVisibility(true);
        }else {
            accountMenuPage.validateSignInPopUpVisibility(false);
        }
    }

    @Then("User Clicks on Create an Account Link on Account Menu")
    public void userClicksOnCreateAnAccountLinkOnAccountMenu() throws Exception {
        accountMenuPage.clickOnCreateAccountLink();
    }

    @Then("User Enters Random Email Address on Register Account Menus")
    public void userEntersRandomEmailAddressOnRegisterAccountMenus() throws Exception {
        String rndName = getRandomStrings();
        accountMenuPage.enterEmailAddressOnRegisterAccountMenu(rndName + EMAIL_ADDRESS_WITHOUT_RECIPIENT);
    }

    @Then("User Enters Random First Name on Register Account Menu")
    public void userEntersRandomFirstNameOnRegisterAccountMenu() throws Exception {
        String rndFirstName = getRandomStrings();
        accountMenuPage.enterFirstNameOnRegisterAccountMenu(rndFirstName);
    }

    @Then("User Enters Random Last Name on Register Account Menu")
    public void userEntersRandomLastNameOnRegisterAccountMenu() throws Exception {
        String rndLastName = getRandomStrings();
        accountMenuPage.enterLastNameOnRegisterAccountMenu(rndLastName);
    }

    @Then("User Enters Random Password on Register Account Menu")
    public void userEntersRandomPasswordOnRegisterAccountMenu() throws Exception {
        accountMenuPage.enterPasswordOnRegisterAccountMenu(VALID_PASSWORD);
    }

    @Then("User Clicks on Create an Account Button")
    public void userClicksOnCreateAnAccountButton() throws Exception {
        accountMenuPage.clickOnCreateAccountButton();
    }

    @Then("User Enters Valid All Login Data Username on Account Menu")
    public void userEntersValidAllLoginDataUsernameOnAccountMenu() throws Exception {
        accountMenuPage.enterUsername(VALID_ALL_USERNAME);
    }

    @Then("User Clicks on Payment Method Option")
    public void userClicksOnPaymentMethodOption() throws Exception {
        accountMenuPage.clickOnPaymentMethodOption();
    }
    @And("User Enters Valid All Login Data Password on Account Menu")
    public void userEntersValidAllLoginPasswordOnAccountMenu() throws Exception {
        accountMenuPage.enterPassword(VALID_PASSWORD);
    }

    @Then("User Clicks on Address Book Option")
    public void userClicksOnAddressBookOption() throws Exception {
        accountMenuPage.clickOnAddressBookOption();
    }
}
