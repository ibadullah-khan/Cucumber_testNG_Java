package UtilitiesFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilFactory {

    private ElementFactory elementFactory = new ElementFactory();
    protected BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();
    protected WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    //For Reporting

    public ExtentReports extent;
    public static ExtentTest scenarioDef;
    public static ExtentTest features;

    public static String reportLocation = "target/executionReports/";

    public UtilFactory() throws Exception {
    }

    protected void loadUrl(String url){
        browserFactoryInstance.getDriver().get(url);
        waitForPageLoad();
    }

    protected void click(String locator){
        WebElement element = elementFactory.getElement(locator);
        click(element);
    }

    protected void click(WebElement element){
        try
        {
            element.click();
        } catch (Exception e)
        {
            throw e;
        }
    }

    protected void jsClick(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        jsClick(element);
    }

    protected void jsClick(WebElement element) throws Exception
    {
        JavascriptExecutor executor = (JavascriptExecutor) BrowserFactory.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    protected void hover(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        hover(element);
    }

    protected void hover(WebElement element) throws Exception
    {
        Actions action = new Actions(BrowserFactory.getDriver());
        action.moveToElement(element).perform();
    }

    protected void jsHover(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        jsHover(element);
    }

    protected void jsHover(WebElement element) throws Exception
    {
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        ((JavascriptExecutor)BrowserFactory.getDriver()).executeScript(mouseOverScript, element);
    }

    protected void switchToIframe(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        switchToIframe(element);
    }

    protected void switchToIframe(WebElement element) throws Exception
    {
        BrowserFactory.getDriver().switchTo().frame(element);
    }

    protected void switchToDefaultContent() throws Exception
    {
        BrowserFactory.getDriver().switchTo().defaultContent();
    }

    protected void scrollToElement(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        scrollToElement(element);
    }

    protected void scrollToElement(WebElement element) throws Exception
    {
        JavascriptExecutor js = (JavascriptExecutor) BrowserFactory.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void scrollByPixels(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) BrowserFactory.getDriver();
        js.executeScript("window.scrollBy("+x+","+y+")");
    }

    protected void scrollToTop()
    {
        JavascriptExecutor js = (JavascriptExecutor) BrowserFactory.getDriver();
        js.executeScript("window.scrollTo(0, 0)");
    }

    protected void scrollDownToBottom()
    {
        JavascriptExecutor js = (JavascriptExecutor) BrowserFactory.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    protected void waitForPageLoad(){
        waitFactory.waitForPageToFinishLoading(browserFactoryInstance.getDriver());
    }
    protected void customWait(int waitTime){
        waitFactory.staticWait(waitTime);
    }
}
