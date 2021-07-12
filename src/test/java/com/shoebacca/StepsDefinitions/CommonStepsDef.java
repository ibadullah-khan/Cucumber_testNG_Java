package com.shoebacca.StepsDefinitions;

import PageObjectFactory.HeaderPageFactory;


import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonStepsDef extends UtilFactory {

    protected String url;
    protected String propFile = "src/test/resources/Properties/run.properties";

    HeaderPageFactory headerPage;

    public CommonStepsDef() throws Exception {
        headerPage = new HeaderPageFactory();
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

    @And("User Click on Account Icon on Header")
    public void user_click_on_Account_Icon_on_Header() throws Exception {
        headerPage
                .clickOnAccountIcon();
    }

}
