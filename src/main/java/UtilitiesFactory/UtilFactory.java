package UtilitiesFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UtilFactory {

    private ElementFactory elementFactory = new ElementFactory();
    protected WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());
    private static String envPropFile = "environment.properties";
    private static String screenshotFolder;
    public static String reportLocation;

    static {
        try {
            screenshotFolder = new PropertyLoaderFactory().getPropertyFile(envPropFile).getProperty("screenshot.folder");
            reportLocation = new PropertyLoaderFactory().getPropertyFile(envPropFile).getProperty("extent.report.folder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //For Reporting

    public ExtentReports extent;

    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public static String failureException;

    public UtilFactory() throws Exception {
    }

    protected void loadUrl(String url){
        try{
            BrowserFactory.getDriver().manage().deleteAllCookies();
            BrowserFactory.getDriver().get(url);
            waitForPageLoad();
            scenarioDef.log(Status.PASS,"Initiated the browser session");
        }catch (Exception e){
            scenarioDef.log(Status.FAIL,"Could not initiate the browser session");
            throw e;
        }
    }

    protected void validateURL(String expectedUrl){
        waitForPageLoad();
        String errorMsg = null;
        try{
            String actualURL=BrowserFactory.getDriver().getCurrentUrl();

            if (actualURL.contains(expectedUrl)){
                scenarioDef.log(Status.PASS,"Validated Url as Expected Url: "+expectedUrl);
            }else {
                errorMsg = "Could not Validate Url as Expected Url: "+expectedUrl+" , Actual Url: "+actualURL;
                throw new NoSuchContextException("Actual and Expected Url Differs");
            }
        }catch (Exception e){
            failureException = e.toString();
            if (errorMsg == null){
                scenarioDef.log(Status.FAIL,"Unable to Load the Url");
            }else {
                scenarioDef.log(Status.FAIL,errorMsg);
            }
            throw e;
        }
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
    protected void clearField(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        clearField(element);
    }
    protected void clearField(WebElement element) throws Exception
    {
        element.clear();
    }

    protected void removeOneSpace(String locatorValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        removeOneSpace(element);
    }

    protected void removeOneSpace(WebElement element) throws Exception
    {
        element.sendKeys(Keys.BACK_SPACE);
    }

    protected void enterString(String locatorValue, String fieldValue) throws Exception
    {
        WebElement element = elementFactory.getElement(locatorValue);
        enterString(element,fieldValue);
    }

    protected void enterString(WebElement element, String fieldValue) throws Exception
    {
        element.sendKeys(fieldValue);
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

    protected Boolean isVisible(String locatorValue)
    {
        int size = elementFactory.getElementList(locatorValue);
        if(size > 0 ){
            return true;
        }
        else {
            return false;
        }
    }

    protected int getSize(String locatorValue){
        return elementFactory.getElementList(locatorValue);
    }

    protected Boolean isScrollable(String locatorValue)
    {
        Boolean isScrollable = getAttribute(locatorValue,"style").contains("scroll");
        if(isScrollable){
            return true;
        }
        else {
            return false;
        }
    }
    protected String getCSS(String locatorValue,String attributeValue){
        WebElement element = elementFactory.getElement(locatorValue);
        return getCSSAttribute(element,attributeValue);
    }

    protected String getCSSAttribute(WebElement element,String attributeValue)
    {
        return element.getCssValue(attributeValue);
    }


    protected String getAttribute(String locatorValue,String attributeValue)
    {
        WebElement element = elementFactory.getElement(locatorValue);
        return getAttribute(element,attributeValue);
    }

    protected String getAttribute(WebElement element,String attributeValue)
    {
        return element.getAttribute(attributeValue);
    }

    protected String getText(String locatorValue)
    {
        return getText(elementFactory.getElement(locatorValue));
    }

    protected String getText(WebElement element)
    {
        return element.getText();
    }

    protected void waitForPageLoad(){
        waitFactory.waitForPageToFinishLoading(BrowserFactory.getDriver());
    }
    protected void customWait(int waitTime){
        waitFactory.staticWait(waitTime);
    }

    public static String getBase64Screenshot(WebDriver driver, String screenshotName) throws IOException {

        String Base64StringofScreenshot="";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd__HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String dest = screenshotFolder + "/" +dtf.format(now)+  screenshotName + ".png";

        File destination = new File(dest);
        FileUtils.copyFile(source, destination);

        byte[] fileContent = FileUtils.readFileToByteArray(source);
        Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
        return Base64StringofScreenshot;
    }

    protected void clearSession(){
        try{
            WebDriver driver = BrowserFactory.getDriver();
            driver.manage().deleteAllCookies();
            ((WebStorage)driver).getSessionStorage().clear();
            ((WebStorage)driver).getLocalStorage().clear();
            customWait(3000);
            scenarioDef.log(Status.PASS,"Successfully Clear Browser Session");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Unable to Clear Browser Session");
            throw e;
        }
    }

    protected void refreshPage(){
        try{
            BrowserFactory.getDriver().navigate().refresh();
            waitForPageLoad();
            customWait(3000);
            scenarioDef.log(Status.PASS,"Successfully Refresh Browser Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Unable to Refresh Browser Page");
            throw e;
        }
    }

    protected void navigateToBackPage(){
        try{
            BrowserFactory.getDriver().navigate().back();
            waitForPageLoad();
            customWait(3000);
            scenarioDef.log(Status.PASS,"Successfully Navigate to Back Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Unable to Navigate to Back Page");
            throw e;
        }
    }

    protected void openNewTab () {

        BrowserFactory.getDriver().switchTo().newWindow(WindowType.TAB);
    }

    protected void switchesNewTab () {
        WebDriver driver = BrowserFactory.getDriver();
        String[] tabs = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(tabs[1]);
    }
    protected void switchToParentTab () {
        WebDriver driver = BrowserFactory.getDriver();
        String[] tabs = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(tabs[0]);
    }

    protected void closeOldTab() {
        WebDriver driver = BrowserFactory.getDriver();
        String[] tabs = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(tabs[0]);
        driver.close();
        driver.switchTo().window(tabs[1]);
    }

    protected String getRandomStrings() {
        String rndName = RandomStringUtils.randomAlphabetic(6).toLowerCase();
        return rndName;
    }
    protected String getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("M/dd/yyyy");
        format.setTimeZone(TimeZone.getTimeZone("CST"));
        String date = format.format(new Date());
        return date;
    }

    protected int getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        format.setTimeZone(TimeZone.getTimeZone("CST"));
        String time = format.format(new Date()).replace(":","");
        return Integer.parseInt(time);
    }

    protected int getCurrentDay(String currentDate) throws ParseException {
        Date oldDate=new SimpleDateFormat("M/dd/yyyy").parse(currentDate);
        Calendar c = Calendar.getInstance();
        c.setTime(oldDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }
}
