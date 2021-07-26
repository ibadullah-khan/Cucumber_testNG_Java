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

    @And("User Validates Mini Cart Icon is Visible on Header")
    public void userValidateMiniCartIconIsVisibleOnHeader() throws Exception {
        homePage.validateMiniCartIconVisibility(true);
    }

    @Then("User Clicks the Mini Cart Icon on Header")
    public void userClicksTheMiniCartIconOnHeader() throws Exception {
        homePage.clickOnMiniCartIcon();
    }

    @And("User Validates Mini Cart Counter is not Visible on Header")
    public void userValidateMiniCartCounterIsNotVisibleOnHeader() {
        homePage.validateMiniCartCounterVisibility(false);
    }

    @And("User Clicks the Account Icon on Header")
    public void userClicksTheAccountIconOnHeader() {
        homePage.clickOnAccountIcon();
    }
}
