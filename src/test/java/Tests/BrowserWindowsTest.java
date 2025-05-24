package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.BrowserWindowPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;


public class BrowserWindowsTest extends ShareData {

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

        commonPage.goToDesiredSubMenu("Browser Windows");

        browserWindowPage.interactWithTabs();

        browserWindowPage.interactWithWindow();
    }
}
