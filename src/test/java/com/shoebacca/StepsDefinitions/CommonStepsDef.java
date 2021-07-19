package com.shoebacca.StepsDefinitions;

import PageObjectFactory.HeaderPageFactory;


import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepsDef extends UtilFactory {

    protected String url;
    protected String runPropFile = propertiesLocation + "run.properties";

    HeaderPageFactory headerPage;

    public CommonStepsDef() throws Exception {
        headerPage = new HeaderPageFactory();
    }

    @Given("User Setup the Web Browser")
    public void user_Setup_the_Web_Browser() throws Exception {
        // General Step Definitions for setting up the browsers config
        scenarioDef.log(Status.PASS,"User Setup the Web Browser");
    }

    @When("User Navigate to {string} Url")
    public void user_Navigate_to_Url(String urlToLoad) throws Exception {
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(urlToLoad);
        loadUrl(url);
    }

    @And("User Click on Account Icon on Header")
    public void user_click_on_Account_Icon_on_Header() throws Exception {
        headerPage
                .clickOnAccountIcon();
    }

}
