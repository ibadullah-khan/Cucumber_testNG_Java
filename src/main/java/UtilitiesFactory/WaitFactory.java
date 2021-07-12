package UtilitiesFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitFactory {

    private final WebDriver driver;
    private ElementFactory elementFactory = new ElementFactory();

    private String envPropFile = "src/test/resources/Properties/environment.properties";

    protected int timeOutInMilliSeconds = Integer.valueOf(new PropertyLoaderFactory().getProperty(envPropFile).getProperty("timeOut"));
    protected int pollingTimeInMilliSeconds = Integer.valueOf(new PropertyLoaderFactory().getProperty(envPropFile).getProperty("pollingTime"));


    public WaitFactory(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void waitForPageToFinishLoading(WebDriver driver) {

        ExpectedCondition<Boolean> pageLoadCondition = driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofMillis(timeOutInMilliSeconds))
                .pollingEvery(Duration.ofMillis(pollingTimeInMilliSeconds))
                .ignoring(NoSuchElementException.class);

        wait.until(pageLoadCondition);
    }

    public void waitForElementToBeClickable(String locatorValue) {

        WebElement element = elementFactory.getElement(locatorValue);
        waitForElementToBeClickable(element);
    }

    public void waitForElementToBeClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(timeOutInMilliSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(String locatorValue) {

        WebElement element = elementFactory.getElement(locatorValue);
        waitForElementToBeVisible(element);
    }

    public void waitForElementToBeVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(timeOutInMilliSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void staticWait(int totalWaitTimeInMilliSeconds) {

        try {
            Thread.sleep(totalWaitTimeInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
