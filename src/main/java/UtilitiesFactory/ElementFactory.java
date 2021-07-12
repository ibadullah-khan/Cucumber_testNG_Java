package UtilitiesFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFactory {

    WebDriver driver = BrowserFactory.getDriver();

    public WebElement getElement(String locatorType, String locatorValue) {

        WebElement element = null;
        try {
            if (locatorType.equalsIgnoreCase("id")) {
                element = driver.findElement(By.id(locatorValue));
            } else if (locatorType.equalsIgnoreCase("name")) {
                element = driver.findElement(By.name(locatorValue));
            } else if (locatorType.equalsIgnoreCase("xpath")) {
                element = driver.findElement(By.xpath(locatorValue));
            } else if (locatorType.equalsIgnoreCase("linktext")) {
                element = driver.findElement(By.linkText(locatorValue));
            } else if (locatorType.equalsIgnoreCase("partiallinktext")) {
                element = driver.findElement(By.partialLinkText(locatorValue));
            } else if (locatorType.equalsIgnoreCase("cssSelector")) {
                element = driver.findElement(By.cssSelector(locatorValue));
            }

            return element;

        } catch (Exception e) {

            throw e;
        }
    }
    public WebElement getElement(String locatorValue) {

        WebElement element = null;
        try {
            element = driver.findElement(By.xpath(locatorValue));
            return element;

        } catch (Exception e) {

            throw e;
        }
    }
}
