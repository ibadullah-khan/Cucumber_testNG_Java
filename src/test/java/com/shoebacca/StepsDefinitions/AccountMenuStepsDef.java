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
}
