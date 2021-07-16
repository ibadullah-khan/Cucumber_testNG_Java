package Runner;

import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.ExtentReportFactory;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

import static UtilitiesFactory.UtilFactory.features;
import static UtilitiesFactory.UtilFactory.scenarioDef;


public class TestRunnerListener implements ITestListener {

    ExtentReportFactory extentReport = new ExtentReportFactory();
    private final BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();
    public static String Browser;

    public TestRunnerListener() throws Exception {
        extentReport.ExtentReport();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Browser = getParameterValue("browser");
        browserFactoryInstance.setDriver(Browser);
        scenarioDef = features.createNode("My Scenario File");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        try{
            extentReport.ExtentPassStep();
            BrowserFactory.getDriver().close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try{
            extentReport.ExtentFailStep();
            BrowserFactory.getDriver().close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        features = extentReport.extent.createTest(Feature.class, iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReport.FlushReport();
    }

    public String getParameterValue(String key){
        return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(key);
    }
}