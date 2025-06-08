package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import ObjectData.WebTableObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablePage;
import PropertyUtility.PropertyUtility;
import ShareData.ShareData;
import org.testng.annotations.Test;


public class WebTableTest extends ShareData {

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

        commonPage.goToDesiredSubMenu("Web Tables");

        webTablePage.openRegistrationForm();

        webTablePage.fillInAllDetails(webTableObject);

        webTablePage.submitRegistrationForm();
    }

}
