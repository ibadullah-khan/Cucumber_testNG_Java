package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/FeatureFiles/CheckOut.feature",
        monochrome = true,
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.shoebacca.StepsDefinitions",
        "UtilitiesFactory"})

public class CheckOutTest extends AbstractTestNGCucumberTests {


}