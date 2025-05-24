package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTest extends ShareData {

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
        commonPage.goToDesiredSubMenu("Browser Windows");

        WebElement newTabButton = getDriver().findElement(By.id("tabButton"));
        newTabButton.click();

        // returns all tabs open and then checks the newly opened one
        List<String> tabList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabList.get(1));
        WebElement sampleHeadingElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este: " + sampleHeadingElement.getText());
        getDriver().close();
        getDriver().switchTo().window(tabList.get(0));

        WebElement newWindowButton = getDriver().findElement(By.id("windowButton"));
        newWindowButton.click();

        // returns all windows open and then checks the newly opened one
        List<String> windowList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowList.get(1));
        WebElement sampleHeadingWindowElement = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul window este: " + sampleHeadingWindowElement.getText());
        getDriver().close();
        getDriver().switchTo().window(windowList.get(0));


    }
}
