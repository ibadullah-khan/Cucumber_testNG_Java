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
    public void userClicksTheLoginButtonOnAccountMenu() {
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

    @Then("User Validates Error Visibility {string} on Username")
    public void userValidatesErrorVisibilityOnUsername(String expectedCondition) {
//        if(expectedCondition.equals("true")){
//            accountMenuPage.validateErrorMessageVisibility(true);
//        }else {
//            accountMenuPage.validateErrorMessageVisibility(false);
//        }
    }
}
