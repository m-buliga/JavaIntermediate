package Tests;

import ExtentUtility.ExtentUtility;
import ExtentUtility.ReportStep;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.BrowserWindowPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;


public class BrowserWindowsTest extends Hooks {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public BrowserWindowPage browserWindowPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        browserWindowPage = new BrowserWindowPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu.");

        commonPage.goToDesiredSubMenu("Browser Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Browser Windows sub-menu.");

        browserWindowPage.interactWithTabs();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user opened a new tab.");

        browserWindowPage.interactWithWindow();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user opened a new window.");
    }
}
