package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        elementsMethods.waitForVisibilityOfElement(alertOkElement, 15);
        elementsMethods.clickElement(alertOkElement);
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
        LoggerUtility.infoLog("The user clicked OK button on 1st alert.");
    }

    public void explicitAlertsWait() {
        // definim un wait explicit care asteapta dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert() {
        elementsMethods.waitForVisibilityOfElement(alertDelayElement, 10);
        elementsMethods.clickElement(alertDelayElement);
        explicitAlertsWait();
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
        LoggerUtility.infoLog("The user clicked OK button on delayed alert.");
    }

    public void interactWithButtonsConfirmationPrompt() {
        javaScriptHelperMethods.scrollToElement(alertConfirmationElement);
        elementsMethods.clickElement(alertConfirmationElement);
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
        LoggerUtility.infoLog("The user clicked Cancel button on confirm box alert.");
    }

    public void interactWithInputConfirmationPrompt(String value) {
        javaScriptHelperMethods.scrollToElement(alertPromptElement);
        elementsMethods.clickElement(alertPromptElement);
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
        LoggerUtility.infoLog("The user input a value and clicked OK button on prompt box alert.");
    }
}