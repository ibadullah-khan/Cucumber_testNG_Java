package Runner_Config;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/FeatureFiles",
        glue = {"src/test/java/StepsDefinitions"},
        dryRun = true,
        strict = true,
        monochrome = true )

public class Runner{


}