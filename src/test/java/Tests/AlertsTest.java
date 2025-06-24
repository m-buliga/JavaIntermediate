package Tests;

import ExtentUtility.ExtentUtility;
import ExtentUtility.ReportStep;
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
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu.");

        commonPage.goToDesiredSubMenu("Alerts");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts sub-menu.");

        alertsPage.interactWithAlertsOk();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user clicked OK button on 1st alert.");

        alertsPage.interactWithDelayAlert();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user clicked OK button on delayed alert.");

        alertsPage.interactWithButtonsConfirmationPrompt();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user dismissed the alert by clicking Cancel button.");

        alertsPage.interactWithInputConfirmationPrompt("My name");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user input a value and clicked OK button on prompt box alert.");
    }
}
