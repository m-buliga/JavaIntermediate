package Tests;

import ExtentUtility.ExtentUtility;
import ExtentUtility.ReportStep;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import ObjectData.WebTableObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablePage;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
import org.testng.annotations.Test;


public class WebTableTest extends Hooks {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public WebTablePage webTablePage;
    public PropertyUtility propertyUtility;
    public WebTableObject webTableObject;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        propertyUtility = new PropertyUtility("WebTableTest");
        webTablePage = new WebTablePage(getDriver());
        webTableObject = new WebTableObject(propertyUtility.getData());

        homePage.goToDesiredMenu("Elements");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Elements menu.");

        commonPage.goToDesiredSubMenu("Web Tables");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Web Tables sub-menu.");

        webTablePage.openRegistrationForm();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user opened the registration form.");

        webTablePage.fillInAllDetails(webTableObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user filled in the registration form info.");

        webTablePage.submitRegistrationForm();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user submitted the registration form.");
    }

}
