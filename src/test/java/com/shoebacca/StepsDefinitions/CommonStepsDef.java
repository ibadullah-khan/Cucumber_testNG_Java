package com.shoebacca.StepsDefinitions;

import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonStepsDef extends UtilFactory {

    protected String url;
    protected String propFile = "src/test/resources/Properties/configure.properties";

    public CommonStepsDef() throws Exception {
    }

    @Given("User Setup the Web Browser")
    public void user_Setup_the_Web_Browser() throws Exception {
        // General Step Definitions for setting up the browsers config

    }

    @When("User Navigate to {string} Url")
    public void user_Navigate_to_Url(String urlToLoad) throws Exception {
        url = new PropertyLoaderFactory().getProperty(propFile).getProperty(urlToLoad);
        loadUrl(url);
    }

}
