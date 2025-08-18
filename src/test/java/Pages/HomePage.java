package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class HomePage extends CommonPage {


    // identificam web elements specifice pentru aceasta pagina
    @FindBy(xpath = "//h5")
    // cream metode specifce pentru aceasta pagina
    private List<WebElement> elements;

    public HomePage(WebDriver driver) {
        super(driver);
    }

   /*@FindBy(xpath = "//p[text()='Consent']")
    private WebElement consentElement;*/

    public void goToDesiredMenu(String menu) {
        WebElement element = elementsMethods.findElementFromListByText(elements, menu);
        javaScriptHelperMethods.scrollToElement(element);
        LoggerUtility.infoLog("The user scrolls down the page until the " + menu +" menu element is found.");

        elementsMethods.clickElement(element);
        LoggerUtility.infoLog("The user clicks on the menu element.");
    }
}
