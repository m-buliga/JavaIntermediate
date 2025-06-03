package ShareData;

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
    public void  prepareBrowser() {

        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);

        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get(configurationNode.driverConfigNode.url);

        // definim un wait implicit pentru un interval maxim de timp
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // maximize browser
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void clearBrowser() {
        driver.quit();
    }
}
