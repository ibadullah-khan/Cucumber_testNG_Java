package Runner;

import UtilitiesFactory.BrowserFactory;
import UtilitiesFactory.ExtentReportFactory;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static UtilitiesFactory.UtilFactory.features;

/**
 * Created by Karthik on 21/09/2019.
 */

public class TestRunnerListener implements ITestListener {

    ExtentReportFactory extentReport = new ExtentReportFactory();
    private final BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();
    public static String Browser;

    public TestRunnerListener() throws Exception {
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        features = extentReport.extent.createTest(Feature.class, iTestResult.getName());
        System.setProperty("browser","chrome");
        Browser = System.getProperty("browser");
        browserFactoryInstance.setDriver(Browser);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        BrowserFactory.getDriver().close();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On test failure");

        try{
            extentReport.ExtentReportScreenshot();
            BrowserFactory.getDriver().close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        extentReport.ExtentReport();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("On finish");
        extentReport.FlushReport();
    }
}