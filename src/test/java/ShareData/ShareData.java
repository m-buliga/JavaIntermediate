package ShareData;

import Logger.LoggerUtility;
import ShareData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;


public class ShareData {

    public WebDriver getDriver() {
        return DriverManager.get();
    }

    public void prepareBrowser() {
        WebDriver driver = new BrowserFactory().getBrowserFactory();
        DriverManager.set(driver);
        LoggerUtility.infoLog("The browser was successfully opened.");
    }

    public void clearBrowser() {
        DriverManager.quit();
        LoggerUtility.infoLog("The browser was successfully closed.");
    }
}
