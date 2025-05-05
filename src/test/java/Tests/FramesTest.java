package Tests;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;

    @Test
    public void automationMethod() {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        elementsMethods = new ElementsMethods(driver);

        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindowsField);
        elementsMethods.clickElement(alertsFrameWindowsField);

        WebElement framesField = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementsMethods.clickElement(framesField);

        WebElement frame1Field = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1Field);
        WebElement sampleFrameHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este: " + sampleFrameHeadingElement.getText());

        // mergem cu focusul pe pagina originala
        driver.switchTo().defaultContent();

        WebElement frame2Field = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2Field);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
    }
}
