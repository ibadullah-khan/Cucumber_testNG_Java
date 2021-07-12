package UtilitiesFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WaitFactory {

    private WebDriver driver;

    public WaitFactory(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForPageToFinishLoading(WebDriver driver, int timeOutInMilliSeconds, int pollingTimeInMillieSeconds) {

        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofMillis(timeOutInMilliSeconds))
                .pollingEvery(Duration.ofMillis(pollingTimeInMillieSeconds))
                .ignoring(NoSuchElementException.class);

        wait.until(pageLoadCondition);
    }
}
