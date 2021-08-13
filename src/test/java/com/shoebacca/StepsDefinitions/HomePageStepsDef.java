package com.shoebacca.StepsDefinitions;

import PageObjectFactory.HomePageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepsDef extends HarnessVariables {

    protected String url;
    protected String runPropFile = "run.properties";

    HomePageFactory homePage;

    public HomePageStepsDef() throws Exception {
        homePage = new HomePageFactory();
    }

    @Given("User Setups the Web Browser")
    public void userSetupTheWebBrowser() throws Exception {
        // General Step Definitions for setting up the browsers config
        scenarioDef.log(Status.PASS,"User Setup the Web Browser");
    }

    @When("User Navigates to {string} Url")
    public void userNavigateToUrl(String urlToLoad) throws Exception {
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(urlToLoad);
        loadUrl(url);
    }

    @And("User Validates Mini Cart Icon Visibility on Header {string}")
    public void userValidatesMiniCartIconVisibilityOnHeader(String expectedCondition) {
        if(expectedCondition.equals("true")){
            homePage.validateMiniCartIconVisibility(true);
        }else {
            homePage.validateMiniCartIconVisibility(false);
        }
    }

    @Then("User Clicks the Mini Cart Icon on Header")
    public void userClicksTheMiniCartIconOnHeader() throws Exception {
        homePage.clickOnMiniCartIcon();
    }

    @And("User Validates Mini Cart Counter Visibility on Header {string}")
    public void userValidatesMiniCartCounterVisibilityOnHeader(String expectedCondition) {
        if(expectedCondition.equals("true")){
            homePage.validateMiniCartCounterVisibility(true);
        }else {
            homePage.validateMiniCartCounterVisibility(false);
        }
    }

    @And("User Clicks the Account Icon on Header")
    public void userClicksTheAccountIconOnHeader() {
        homePage.clickOnAccountIcon();
    }

    @Then("User Validates Mini Cart Counter Value as {string}")
    public void userValidatesMiniCartCounterValueAs(String count) {
        homePage.validateMiniCartCounterValue(count);
    }

    @Then("User Should Redirect Toward {string} Page")
    public void userShouldRedirectTowardPage(String Page) throws Exception {
        String expectedUrl = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(Page);
        validateURL(expectedUrl);
    }

    @And("User Clears the Session")
    public void userClearsTheSession() {
        clearSession();
    }

    @Then("User Refresh the Page")
    public void userRefreshThePage() {
        refreshPage();
    }

    @Then("User Navigate to Back Page")
    public void userNavigateToBackPage() {
        navigateToBackPage();
    }

    @Then("User Opens New Tab And Closes Previous Tab")
    public void userOpensNewTab() {
        openNewTab();
    }
}