package com.shoebacca.StepsDefinitions;

import PageObjectFactory.HomePageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepsDef extends UtilFactory {

    protected String url;
    protected String runPropFile = propertiesLocation + "run.properties";

    HomePageFactory homePage;

    public HomePageStepsDef() throws Exception {
        homePage = new HomePageFactory();
    }

    @Given("User Setup the Web Browser")
    public void userSetupTheWebBrowser() throws Exception {
        // General Step Definitions for setting up the browsers config
        scenarioDef.log(Status.PASS,"User Setup the Web Browser");
    }

    @When("User Navigate to {string} Url")
    public void userNavigateToUrl(String urlToLoad) throws Exception {
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(urlToLoad);
        loadUrl(url);
    }

    @And("User Validate Mini Cart Icon is Visible on Header")
    public void userValidateMiniCartIconIsVisibleOnHeader() throws Exception {
        homePage.validateMiniCartIconVisibility(true);
    }

    @Then("User Clicks the Mini Cart Icon on Header")
    public void userClicksTheMiniCartIconOnHeader() throws Exception {
        homePage.clickOnMiniCartIcon();
    }

    @And("User Validate Mini Cart Counter is not Visible on Header")
    public void userValidateMiniCartCounterIsNotVisibleOnHeader() {
        homePage.validateMiniCartCounterVisibility(false);
    }
}
