package Tests;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class AlertsTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public AlertsMethods alertsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {
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
        javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Alerts");

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        elementsMethods.clickElement(alertOkElement);

        // ne mutam cu focusul pe alerta
        alertsMethods.interactWithAlertsOk();

        WebElement alertDelayElement = driver.findElement(By.id("timerAlertButton"));
        elementsMethods.clickElement(alertDelayElement);

        // definim un wait explicit care asteapta dupa alerta -> schimbat cu metoda
        alertsMethods.interactWithDelayAlert();

        WebElement alertConfirmationElement = driver.findElement(By.id("confirmButton"));
        javaScriptHelperMethods.scrollToElement(alertConfirmationElement);
        elementsMethods.clickElement(alertConfirmationElement);
        alertsMethods.interactWithButtonsConfirmationPrompt();


        WebElement alertPromptElement = driver.findElement(By.id("promtButton"));
        javaScriptHelperMethods.scrollToElement(alertPromptElement);
        elementsMethods.clickElement(alertPromptElement);
        alertsMethods.interactWithInputConfirmationPrompt("My name");

    }
}
