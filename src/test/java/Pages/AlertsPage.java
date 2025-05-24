package Pages;

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
        elementsMethods.clickElement(alertOkElement);
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void explicitAlertsWait() {
        // definim un wait explicit care asteapta dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert() {
        elementsMethods.clickElement(alertDelayElement);
        explicitAlertsWait();
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
    }

    public void interactWithButtonsConfirmationPrompt() {
        javaScriptHelperMethods.scrollToElement(alertConfirmationElement);
        elementsMethods.clickElement(alertConfirmationElement);
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
    }

    public void interactWithInputConfirmationPrompt(String value) {
        javaScriptHelperMethods.scrollToElement(alertPromptElement);
        elementsMethods.clickElement(alertPromptElement);
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
    }
}