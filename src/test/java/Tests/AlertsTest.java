package Tests;

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

        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsField);
        alertsFrameWindowsField.click();

        WebElement alertsField = driver.findElement(By.xpath("//span[text()='Alerts']"));
        alertsField.click();

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        alertOkElement.click();

        // ne mutam cu focusul pe alerta
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();

        WebElement alertDelayElement = driver.findElement(By.id("timerAlertButton"));
        alertDelayElement.click();

        // definim un wait explicit care asteapta dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();

        WebElement alertConfirmationElement = driver.findElement(By.id("confirmButton"));
        alertConfirmationElement.click();
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();

        WebElement alertPromptElement = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertPromptElement);
        alertPromptElement.click();
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys("My name");
        alertPrompt.accept();

    }
}
