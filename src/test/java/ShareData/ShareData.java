package ShareData;

import ShareData.browser.BrowserFactory;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class ShareData {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void prepareBrowser() {
        driver = new BrowserFactory().getBrowserFactory();
    }

    @AfterMethod
    public void clearBrowser() {
        driver.quit();
    }
}
