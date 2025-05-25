package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelperMethods {
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    public JavaScriptHelperMethods(WebDriver driver) {
        this.driver = driver;
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public void scrollToElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollBy(int x, int y) {
        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }
}
