package UtilitiesFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExtentReportFactory extends UtilFactory {

    String fileName = reportLocation + "extentreport.html";

    public ExtentReportFactory() throws Exception {
    }


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();

        ExtentSparkReporter spark = new ExtentSparkReporter(fileName);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("ShoeBacca Automation Test Report");
        spark.config().setEncoding("uft-8");
        spark.config().setReportName("Automation Script");

        extent.attachReporter(spark);

    }

    public void ExtentReportScreenshot() throws IOException {

//        var scr = ((TakesScreenshot)browserFactoryInstance.getDriver()).getScreenshotAs(OutputType.FILE);
//        Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
//        scenarioDef.fail("details");
    }


    public void FlushReport(){
        extent.flush();
    }
}
