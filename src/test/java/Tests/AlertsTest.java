package Tests;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class AlertsTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public AlertsMethods alertsMethods;

    @Test
    public void automationMethod () {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // definim un wait implicit pentru un interval maxim de timp
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // maximize browser
        driver.manage().window().maximize();

        elementsMethods = new ElementsMethods(driver);
        alertsMethods = new AlertsMethods(driver);

        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsField);
        elementsMethods.clickElement(alertsFrameWindowsField);

        WebElement alertsField = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementsMethods.clickElement(alertsField);

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        elementsMethods.clickElement(alertOkElement);

        // ne mutam cu focusul pe alerta
        alertsMethods.interactWithAlertsOk();

        WebElement alertDelayElement = driver.findElement(By.id("timerAlertButton"));
        elementsMethods.clickElement(alertDelayElement);

        // definim un wait explicit care asteapta dupa alerta -> schimbat cu metoda
        alertsMethods.interactWithDelayAlert();

        WebElement alertConfirmationElement = driver.findElement(By.id("confirmButton"));
        elementsMethods.clickElement(alertConfirmationElement);
        alertsMethods.interactWithButtonsConfirmationPrompt();


        WebElement alertPromptElement = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertPromptElement);
        elementsMethods.clickElement(alertPromptElement);
        alertsMethods.interactWithInputConfirmationPrompt("My name");

    }
}
