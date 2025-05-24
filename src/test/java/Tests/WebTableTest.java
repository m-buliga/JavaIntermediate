package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablePage;
import ShareData.ShareData;
import org.testng.annotations.Test;


public class WebTableTest extends ShareData {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public WebTablePage webTablePage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablePage = new WebTablePage(getDriver());

        homePage.goToDesiredMenu("Elements");

        commonPage.goToDesiredSubMenu("Web Tables");

        webTablePage.openRegistrationForm();

        webTablePage.fillInAllDetails("Kate", "Smith", "ksmith@gmail.com", "20", "2500", "Testing");

        webTablePage.submitRegistrationForm();
    }

}
