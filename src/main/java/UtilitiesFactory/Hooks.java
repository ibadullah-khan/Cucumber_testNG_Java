package UtilitiesFactory;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static UtilitiesFactory.UtilFactory.features;
import static UtilitiesFactory.UtilFactory.scenarioDef;

public class Hooks {

    private final BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();

    @Before
    public void beforeTest(Scenario scenario) {
        scenarioDef = features.createNode(scenario.getName());
        browserFactoryInstance.setDriver(browserFactoryInstance.getBrowser());
    }
}
