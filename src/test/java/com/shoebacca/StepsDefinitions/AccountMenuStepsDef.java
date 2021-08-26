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

    @Then("User Validates Checkout Process Pop Up Visibility {string}")
    public void userValidatesCheckoutProcessPopUpVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateCheckoutProcessPopUpVisibility(true);
        }else {
            accountMenuPage.validateCheckoutProcessPopUpVisibility(false);
        }
    }

    @Then("User Validates Sign In Pop Up Visibility {string}")
    public void userValidatesSignInPopUpVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            accountMenuPage.validateSignInPopUpVisibility(true);
        }else {
            accountMenuPage.validateSignInPopUpVisibility(false);
        }
    }
}
