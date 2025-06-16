package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;


public class AlertsTest extends Hooks {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public AlertsPage alertsPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");

        commonPage.goToDesiredSubMenu("Alerts");

        alertsPage.interactWithAlertsOk();

        alertsPage.interactWithDelayAlert();

        alertsPage.interactWithButtonsConfirmationPrompt();

        alertsPage.interactWithInputConfirmationPrompt("My name");
    }
}
