package UtilitiesFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.IOException;

import static UtilitiesFactory.EmailReportFactory.failed;
import static UtilitiesFactory.EmailReportFactory.passed;

public class ExtentReportFactory extends UtilFactory {

    String fileName = reportLocation + "extentreport.html";

    public ExtentReportFactory() throws Exception {
    }


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("ShoeBacca Automation Test Report");
        htmlReporter.config().setEncoding("uft-8");
        htmlReporter.config().setReportName("Automation Script");
        htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

        extent.attachReporter(htmlReporter);

    }

    public void ExtentFailStep() throws IOException {
            failed++;
            scenarioDef.log(Status.FAIL,
                "<details>" + "<summary> <b> <font color=red> Cause of Failure: </b> "
                        + "</font>" + "</summary>"
                        + failureException.replaceAll(",", "<br>") + "</details>", MediaEntityBuilder.createScreenCaptureFromBase64String(
                            UtilFactory.getBase64Screenshot(BrowserFactory.getDriver(), "Screenshot")).build());
    }

    public void ExtentPassStep() throws IOException {
            passed++;
            scenarioDef.log(Status.PASS,
                "<summary> <b> <font color=green> Test Passed: </b> "
                        + "</font>" + "</summary>"
                        , MediaEntityBuilder.createScreenCaptureFromBase64String(
                            UtilFactory.getBase64Screenshot(BrowserFactory.getDriver(), "Screenshot")).build());
    }


    public void FlushReport(){
        extent.flush();
    }
}
