package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class CommonPage {
    protected WebDriver driver;
    protected ElementsMethods elementsMethods;
    protected JavaScriptHelperMethods javaScriptHelperMethods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='text']")
    private List<WebElement> elements;

    public void goToDesiredSubMenu(String submenu) {
        WebElement element = elementsMethods.findElementFromListByText(elements, submenu);
        javaScriptHelperMethods.scrollToElement(driver, element);
        LoggerUtility.infoLog("The user scrolls down the page until the " + submenu +" submenu element is found.");

        elementsMethods.clickElement(element);
        LoggerUtility.infoLog("The user clicks on the submenu element.");
    }
}
