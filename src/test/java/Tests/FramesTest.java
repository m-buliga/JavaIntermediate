package Tests;

import ExtentUtility.ExtentUtility;
import ExtentUtility.ReportStep;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.FramesPage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;


public class FramesTest extends Hooks {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public FramesPage framesPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        framesPage = new FramesPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu.");

        commonPage.goToDesiredSubMenu("Frames");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Frames sub-menu.");

        framesPage.interactWithFrame1();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with Frame 1.");

        getDriver().switchTo().defaultContent();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "Focus switched on the original page.");

        framesPage.interactWithFrame2();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with Frame 2.");
    }

}
