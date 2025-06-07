package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public WebElement waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(element));

        // Get and optionally log the coordinates
        Point location = clickable.getLocation();
        int x = location.getX();
        int y = location.getY();

        System.out.println("Element coordinates: X=" + x + ", Y=" + y);

        return clickable;
    }

}
