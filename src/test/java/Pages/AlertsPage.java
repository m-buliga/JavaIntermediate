package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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

    private void removeBannersIfPresent() {
        try {
            ((JavascriptExecutor) driver).executeScript(
                    "const a=document.querySelector('#fixedban'); if(a) a.remove();" +
                            "const f=document.querySelector('footer'); if(f) f.remove();" +
                            "const c=document.querySelector('.fc-consent-root'); if(c) c.remove();"
            );
        } catch (Exception ignored) {}
    }



    public void interactWithAlertsOk() {
        elementsMethods.waitForVisibilityOfElement(alertOkElement);
        elementsMethods.clickElement(alertOkElement);
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
        LoggerUtility.infoLog("The user clicked OK button on 1st alert.");
    }

    public void fluentAlertsWait() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoAlertPresentException.class);

        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert() {
        removeBannersIfPresent();

        elementsMethods.waitForVisibilityOfElement(alertDelayElement);
        LoggerUtility.infoLog("Butonul click pt delayed alert e vizibil");
        elementsMethods.clickElement(alertDelayElement);
        LoggerUtility.infoLog("Butonul click pt delayed alert a fost clicked");
        fluentAlertsWait();
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