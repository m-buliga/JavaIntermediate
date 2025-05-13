package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptHelperMethods javaScriptHelperMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        PageFactory.initElements(driver, this);
    }

    // identificam web elements specifice pentru aceasta pagina
    @FindBy(xpath = "//h5")

    // cream metode specifce pentru aceasta pagina
            List<WebElement> elements;

    public void goToDesiredMenu(String menu) {
        WebElement element = elementsMethods.findElementFromListByText(elements, menu);
        javaScriptHelperMethods.scrollToElement(element);
        elementsMethods.clickElement(element);
    }
}
