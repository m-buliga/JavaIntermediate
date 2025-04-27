package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTest {
    public WebDriver driver;

    @Test
    public void automationMethod() {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsField);
        alertsFrameWindowsField.click();

        WebElement browserWindowsField = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsField.click();

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        // returns all tabs open and then checks the newly opened one
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este: " + sampleHeadingElement.getText());
        driver.close();
        driver.switchTo().window(tabList.get(0));

        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        // returns all windows open and then checks the newly opened one
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        WebElement sampleHeadingWindowElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul window este: " + sampleHeadingWindowElement.getText());
        driver.close();
        driver.switchTo().window(windowList.get(0));



    }
}
