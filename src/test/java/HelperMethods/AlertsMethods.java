package HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMethods {
    WebDriver driver;

    public AlertsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void interactWithAlertsOk() {
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void explicitAlertsWait() {
        // definim un wait explicit care asteapta dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert() {
        explicitAlertsWait();
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
    }

    public void interactWithButtonsConfirmationPrompt() {
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
    }

    public void interactWithInputConfirmationPrompt(String value) {
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
    }


}
