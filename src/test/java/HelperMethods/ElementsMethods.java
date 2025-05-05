package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsMethods {
    WebDriver driver;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void fillElement(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value) {
        for(int i = 0; i < elementsList.size(); i++) {
            if(elementsList.get(i).getText().equals(value)) {
                clickElement(elementsList.get(i));
            }
        }
    }
}
