package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class BrowserWindowPage extends CommonPage {

    public BrowserWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingElement;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingWindowElement;


    public void interactWithTabs() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newTabButton));

        elementsMethods.clickElement(newTabButton);
        // returns all tabs open and then checks the newly opened one
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        System.out.println("Textul din noul tab este: " + sampleHeadingElement.getText());
        driver.close();
        driver.switchTo().window(tabList.get(0));
        LoggerUtility.infoLog("The user opened a new tab.");
    }

    public void interactWithWindow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newWindowButton));

        javaScriptHelperMethods.scrollToElement(driver, newWindowButton);
        elementsMethods.clickElement(newWindowButton);

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        System.out.println("Textul din noul window este: " + sampleHeadingWindowElement.getText());
        driver.close();
        driver.switchTo().window(windowList.get(0));
        LoggerUtility.infoLog("The user opened a new window.");
    }

}
