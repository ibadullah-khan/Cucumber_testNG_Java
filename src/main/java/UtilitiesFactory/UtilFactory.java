package UtilitiesFactory;

public class UtilFactory {

    protected BrowserFactory browserFactoryInstance = BrowserFactory.getInstance();
    protected WaitFactory waitFactory = new WaitFactory(BrowserFactory.getDriver());

    private String envPropFile = "src/test/resources/Properties/environment.properties";

    protected int timeOutInMilliSeconds = Integer.valueOf(new PropertyLoaderFactory().getProperty(envPropFile).getProperty("timeOut"));
    protected int pollingTimeInMilliSeconds = Integer.valueOf(new PropertyLoaderFactory().getProperty(envPropFile).getProperty("pollingTime"));

    public UtilFactory() throws Exception {
    }

    protected void loadUrl(String url){
        browserFactoryInstance.getDriver().get(url);
        waitForPageLoad();
    }

    protected void waitForPageLoad(){
        waitFactory.waitForPageToFinishLoading(browserFactoryInstance.getDriver(),timeOutInMilliSeconds,pollingTimeInMilliSeconds);
    }
}
