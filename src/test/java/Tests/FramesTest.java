package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FramesTest extends ShareData {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Frames");

        WebElement frame1Field = getDriver().findElement(By.id("frame1"));
        getDriver().switchTo().frame(frame1Field);
        WebElement sampleFrameHeadingElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este: " + sampleFrameHeadingElement.getText());

        // mergem cu focusul pe pagina originala
        getDriver().switchTo().defaultContent();

        WebElement frame2Field = getDriver().findElement(By.id("frame2"));
        getDriver().switchTo().frame(frame2Field);

        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0, 200)");
    }
}
