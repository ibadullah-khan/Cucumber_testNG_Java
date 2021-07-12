package UtilitiesFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();
    public static String Browser;

    @Before
    public void beforeScenario(){
        Browser = System.getProperty("browser");

        browserFactoryInstance.setDriver(Browser);
    }

    @After
    public void afterScenario(){
        BrowserFactory.getDriver().close();
    }
}
