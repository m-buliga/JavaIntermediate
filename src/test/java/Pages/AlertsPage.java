package Pages;

import HelperMethods.JavaScriptHelperMethods;
import Logger.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;


public class AlertsPage extends CommonPage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertOkElement;

    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayElement;

    @FindBy(id = "confirmButton")
    private WebElement alertConfirmationElement;

    @FindBy(id = "promtButton")
    private WebElement alertPromptElement;


    public void interactWithAlertsOk() {
        elementsMethods.waitForVisibilityOfElement(alertOkElement);
        elementsMethods.clickElement(alertOkElement);
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
        LoggerUtility.infoLog("The user clicked OK button on 1st alert.");
    }

    public void fluentAlertsWait() {
        boolean ci = Boolean.parseBoolean(System.getProperty("ciCd","false"));
        long timeout = ci ? 20 : 10;
        long poll    = ci ? 1  : 2;

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(poll))
                .ignoring(NoAlertPresentException.class);

        wait.until(ExpectedConditions.alertIsPresent());
    }


    public void interactWithDelayAlert() {
        JavaScriptHelperMethods.removeBannersIfPresent(driver);

        elementsMethods.waitForVisibilityOfElement(alertDelayElement);
        LoggerUtility.infoLog("Delayed alert button is clickable.");
        elementsMethods.clickElement(alertDelayElement);
        LoggerUtility.infoLog("Clicking delayed alert button, waiting for alert...");
        fluentAlertsWait();
        LoggerUtility.infoLog("Alert appeared, proceeding to accept.");
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
        LoggerUtility.infoLog("The user clicked OK button on delayed alert.");
    }

    public void interactWithButtonsConfirmationPrompt() {
        javaScriptHelperMethods.scrollToElement(driver, alertConfirmationElement);
        elementsMethods.clickElement(alertConfirmationElement);
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
        LoggerUtility.infoLog("The user clicked Cancel button on confirm box alert.");
    }

    public void interactWithInputConfirmationPrompt(String value) {
        javaScriptHelperMethods.scrollToElement(driver, alertPromptElement);
        elementsMethods.clickElement(alertPromptElement);
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
        LoggerUtility.infoLog("The user input a value and clicked OK button on prompt box alert.");
    }
}