package Tests;

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

        commonPage.goToDesiredSubMenu("Frames");

        framesPage.interactWithFrame1();

        // mergem cu focusul pe pagina originala
        getDriver().switchTo().defaultContent();

        framesPage.interactWithFrame2();
    }

}
